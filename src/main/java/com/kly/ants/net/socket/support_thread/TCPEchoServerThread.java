package com.kly.ants.net.socket.support_thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/21 17:45
 */
public class TCPEchoServerThread {
    private static Logger logger = Logger.getLogger("practice");
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9002);
        while(true) {
            Socket socket = serverSocket.accept();
            Thread thread = new Thread(new EchoProtocol(socket,logger));
            thread.start();
            logger.info("Created and startd Thread" + thread.getName());
        }

    }
}
