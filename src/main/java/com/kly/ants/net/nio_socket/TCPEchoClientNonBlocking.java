package com.kly.ants.net.nio_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/22 17:24
 */
public class TCPEchoClientNonBlocking {
    public static void main(String[] args) throws IOException {
        byte[] argument = args[0].getBytes();
        //同socket不同、不是new的方式
        SocketChannel sc = SocketChannel.open();
        //设置为非阻塞模式
        sc.configureBlocking(false);
        //连接服务器端，连接成功返回true，否则false
        boolean succcess = sc.connect(new InetSocketAddress("127.0.0.1", 9100));
        if (!succcess) {
            //询问服务器端是否已经连接 连接返回true，否则返回false，处于忙等状态，一直询问 很浪费系统资源
            while (!sc.finishConnect()) {
                System.out.println(".");
            }
        }

        //ByteBuffer的两种创建方式
        ByteBuffer writeBuf = ByteBuffer.wrap(argument);
        ByteBuffer readBuf = ByteBuffer.allocate(argument.length);

        int totalBytesRcvd = 0;
        int bytesRcvd;

        while (totalBytesRcvd < argument.length) {
            if (writeBuf.hasRemaining()) {
                sc.write(writeBuf);
            }
            if ((bytesRcvd = sc.read(readBuf)) == -1) {
                throw new SocketException("Connection closed");
            }

            totalBytesRcvd += bytesRcvd;
            System.out.println(".");
        }

        System.out.println("Received:" + new String(readBuf.array(), 0, totalBytesRcvd));
        sc.close();

    }
}
