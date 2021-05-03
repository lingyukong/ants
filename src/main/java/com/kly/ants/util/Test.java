package com.kly.ants.util;

import java.io.*;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/3/23 22:42
 */
public class Test {
    public static String A;

    static {
        synchronized (Test.class){
            try {
                A.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    public void test() throws IOException {


        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Object copyObj = (Object) ois.readObject();

        } catch (
                Exception e) {
// TODO: handle exception e.printStackTrace();

        } finally {
//关闭流 try {
            bos.close();
            oos.close();
            bis.close();
            ois.close();
        }
    }



    public static void main(String[] args) throws FileNotFoundException {
        InputStream in;
        BufferedInputStream bis = new BufferedInputStream(new DataInputStream(new FileInputStream("E://test.txt")));
        Runtime.getRuntime();

    }
    }


