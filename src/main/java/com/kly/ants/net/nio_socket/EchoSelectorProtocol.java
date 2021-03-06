package com.kly.ants.net.nio_socket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/24 17:35
 */
public class EchoSelectorProtocol implements TCPProtocol {
    private int bufSize; //size of I/O buffer

    public EchoSelectorProtocol(int bufSize) {
        this.bufSize = bufSize;
    }

    @Override
    public void handleAccept(SelectionKey key) throws IOException {
        SocketChannel sc = ((ServerSocketChannel) key.channel()).accept();
        sc.configureBlocking(false);
        sc.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(bufSize));
    }


    @Override
    public void handleRead(SelectionKey key) throws IOException {
        SocketChannel sc = (SocketChannel) key.channel();
        ByteBuffer buf = (ByteBuffer) key.attachment();
        long bytesRead = sc.read(buf);
        if(bytesRead == -1) {
            sc.close();
        }else if(bytesRead > 0) {
            key.interestOps(SelectionKey.OP_READ | SelectionKey.OP_WRITE);
        }
    }

    @Override
    public void handleWrite(SelectionKey key) throws IOException {
        ByteBuffer buf = (ByteBuffer) key.attachment();
        buf.flip();
        SocketChannel sc =  (SocketChannel) key.channel();
        sc.write(buf);
        if(!buf.hasRemaining()) {
            key.interestOps(SelectionKey.OP_READ);
        }
        buf.compact();
    }
}
