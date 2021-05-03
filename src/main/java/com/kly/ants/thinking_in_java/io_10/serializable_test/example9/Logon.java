package com.kly.ants.thinking_in_java.io_10.serializable_test.example9;

import java.io.*;
import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  transient 关键字只能伴随Serializable使用。
 * @author kly
 * @Date 2018/4/18 15:27
 * @see
 */
public class Logon implements Serializable {
    private Date date = new Date();
    private String userName;
    //transient （临时）逐个字段地关闭序列化，它的意思是“不要麻烦你（指自动机制）保存或恢复它了——我会自己处理的”
    private transient String password;


    /**
     * Serializable 序列化的时候不会调用构造器
     * @param userName
     * @param password
     */
    Logon (String userName,String password) {
        System.out.println("logon constructor-------------------------------------------------------------");
        this.userName = userName;
        this.password = password;
    }

    public String toString() {
        String pwd = (password == null) ? "(n/a)":  password;
        return "username=" + userName + ";Date=" + date + ";pwd=" + pwd;
    }

    public static void main(String[] args) {
        Logon login = new Logon("Hulk","myLittlePony");
        System.out.println("logon login=" + login);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Logon.out"));
            out.writeObject(login);
            out.flush();
            out.close();

            //delay
            int seconds = 2;
            long t = System.currentTimeMillis() + seconds*1000;
            while (System.currentTimeMillis() < t) {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
                System.out.println("Recovering object at \""+ new Date() );
                login = (Logon)in.readObject();
                System.out.println("logon login=" + login);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
