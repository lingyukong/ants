package com.kly.ants.net.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:
 * Company:changyou
 *  此示例为单线程，一次只能处理一个客户端的请求，一个客户端结束 才会处理第二个
 * @author konglingyu
 * @Date 2020/2/20 11:39
 */
public class TCPEchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9001);
        while (true) {
            //accept 是一个阻塞方法，一直等到客户端有连接过来
            Socket socket = serverSocket.accept();
            System.out.println("client info" + socket.getRemoteSocketAddress());
            System.out.println("server info" + socket.getLocalAddress() + "--" + socket.getLocalPort());



            //接收客户端发出来的信息
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            BufferedReader buf = new BufferedReader(new InputStreamReader(in,"UTF-8"));

            PrintWriter pw = new PrintWriter(out,true);

            String info;
            while((info = buf.readLine()) != null) {
                if("bye".equals(info)) {
                    break;
                }
                System.out.println(info);
            }
            pw.println("I accept your information");


//             此部分为错误示范，我弄了挺长时间，接收不到数据，原因是我已经把这一行取出来了
            //但是我没有保存，还又继续读取，就一行数据 所以读取的为null
//            while (null != buf.readLine()) {
//                System.out.println(buf.readLine());
//            }

            pw.close();
            buf.close();
            in.close();
            out.close();

            socket.close();
        }


    }
}
