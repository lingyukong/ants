package com.kly.ants.net.http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Description:
 * Company:changyou
 *  构建http请求方式1
 * @author konglingyu
 * @Date 2021/1/15 15:43
 */
public class HttpConnect1 {
    public static String httpPost(String urlStr,String postData) throws IOException {
        URL url = new URL(urlStr);
        System.out.println(url.getHost() + "---" + url.getPort() + "---" + url.getQuery());

        /*
        * 返回一个URLConnection实例，该实例表示到URL引用的远程对象的连接
        * Returns a URLConnection instance that represents a connection to the remote object referred to by the URL
        * */
        URLConnection uConnection= url.openConnection();
        HttpURLConnection connection = (HttpURLConnection) uConnection;


        /**
         * setRequestProperty:
         * Sets the general request property. If a property with the key already exists, overwrite its value with the new value
         *  ("accept", "*//*")
            ("connection", "Keep-Alive");
            ("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            ("Content-Type", "application/json;charset=utf-8");

            setDoOutput:
                Set the DoOutput flag to true if you intend to use the URL connection for output
                default ： false
         * */
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Length", String.valueOf(postData.getBytes("UTF-8").length));
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");


        /**
         * 对这个链接来说，输入参数是一个输出流，所以获取outputStream
         * 流用完一定要关闭，否则数据不能进行输出
         */
        OutputStream outStream = connection.getOutputStream();
        PrintWriter pw = new PrintWriter(outStream);
        pw.write(postData);
        pw.close();

        /**
         * 获取连接的输入流，拿到查询结果
         */
        StringBuffer response = new StringBuffer();
        if (connection.getResponseCode() == 200) {
            InputStream ins = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
            String line ;
            while((line = reader.readLine()) != null ) {
                response.append(line);
            }
            reader.close();
        }

        connection.disconnect();
        return response.toString();
    }

    public static void main(String[] args) throws Exception {
        String url = "http://10.127.10.170:8080/CharacterDataQuery/TLActor/query.ncdo";
        String postData = "method=cnMaster&cnMaster=730362321";
        System.out.println(HttpConnect1.httpPost(url, postData));
    }
}
