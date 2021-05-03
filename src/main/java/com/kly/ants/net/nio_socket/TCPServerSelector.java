package com.kly.ants.net.nio_socket;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/24 17:23
 */
public class TCPServerSelector {
    private static final int BUFSIZE = 256;
    private static final int TIMEOUT = 3000;

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            throw new IllegalArgumentException("need port");
        }

        //创建一个选择器
        Selector selector = Selector.open();
        for (String arg : args) {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            System.out.println("本机地址：" + ssc.getLocalAddress());
//            ssc.socket().bind(new InetSocketAddress(Integer.parseInt(arg)));
            //1.7开始直接支持bind方法了
            ssc.bind(new InetSocketAddress(Integer.parseInt(arg)));

            ssc.configureBlocking(false);
            //这个选择器selector 对accept事件感兴趣，要监听是否有客户端连接过来
            ssc.register(selector, SelectionKey.OP_ACCEPT);
        }
        TCPProtocol protocol = new EchoSelectorProtocol(BUFSIZE);
        while(true) {
            if(selector.select(TIMEOUT) == 0) {
                System.out.println(".");
                continue;
            }
            Iterator keyInter = selector.selectedKeys().iterator();
            while(keyInter.hasNext()) {
                SelectionKey key = (SelectionKey) keyInter.next();
                if(key.isAcceptable()) {
                    protocol.handleAccept(key);
                }
                if(key.isReadable()) {
                    protocol.handleRead(key);
                }
                if(key.isValid() && key.isWritable()) {
                    protocol.handleWrite(key);
                }
                keyInter.remove();
            }
        }

    }
}
