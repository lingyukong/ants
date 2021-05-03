package com.kly.ants.net.socket.support_thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/21 21:50
 */
public class TCPEchoServerThreadPool {
    private  static Logger logger = Logger.getLogger("practise");
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9003);
        ExecutorService pools = Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(1);
        while(true){
            Socket socket = serverSocket.accept();
            pools.execute(new EchoProtocol(socket,logger));
        }

    }
}
