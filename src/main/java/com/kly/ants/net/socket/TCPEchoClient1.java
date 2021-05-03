package com.kly.ants.net.socket;

import java.io.*;
import java.net.Socket;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/20 11:53
 */
public class TCPEchoClient1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 9001);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

//        Thread.sleep(10000);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(out,true);

        String input ;
        while(null!= (input = buf.readLine())) {
            pw.println(input);
        }

        //客户端接收服务器端的数据，这块还不行
        BufferedReader bufServer = new BufferedReader(new InputStreamReader(in));
        String serverInfo;
        while(null!= (serverInfo = bufServer.readLine())) {
            System.out.println(serverInfo);
        }

        pw.close();
        buf.close();
        out.close();
        socket.close();
    }

}
