package com.kly.ants.net.socket.support_thread;

import java.io.*;
import java.net.Socket;
import java.util.logging.Logger;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/21 17:18
 */
public class EchoProtocol implements Runnable {
    private Socket socket;
    private Logger logger;

    public EchoProtocol(Socket socket, Logger logger) {
        this.logger = logger;
        this.socket = socket;
    }

    @Override
    public void run() {
        handleEchoClient(socket, logger);
    }

    public static void handleEchoClient(Socket socket, Logger loggger) {
        InputStream in = null;
        OutputStream out = null;
        BufferedReader buf = null;
        PrintWriter pw = null;
        try {
            in = socket.getInputStream();
            out = socket.getOutputStream();

            buf = new BufferedReader(new InputStreamReader(in));
            pw = new PrintWriter(out, true);
            String msg;
            StringBuffer totalMsg = new StringBuffer();
            while (null != (msg = buf.readLine())) {
                pw.println("I accept " + msg);
                totalMsg.append(msg);
                System.out.println(msg);
            }
            loggger.info("client:" + socket.getRemoteSocketAddress() + ",msg=" + totalMsg);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                buf.close();
                pw.close();
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
