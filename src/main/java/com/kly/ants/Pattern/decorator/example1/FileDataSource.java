package com.kly.ants.Pattern.decorator.example1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

/**
 * <p>Description: </p>
 *  具体构件ConcreteComponent
 *  在被装饰器装饰之前抽象组件的具体形态
 * @author kly
 * @Date 2018/4/21 20:57
 * @see
 */
public class FileDataSource implements DataSource{
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        System.out.println("FileDataSource writeData");
        File file = new File(name);
        try{
            OutputStream out = new FileOutputStream(file);
            /**
             * 第一个参数：要写入的字节
             * 第二个参数：从第几个偏移量字节开始
             * 第三个参数：要写入的字节数
             * JVM内部的String，Char都是用unicode存储(没有任何编码)
             * String.getBytes()
             * //按JVM默认编码转成字节流。linux，如果LANG=en_US，就是iso8859-1，如果是windows就是UTF-8
             */
            out.write(data.getBytes(),0,data.length());
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String readData() {
        System.out.println("FileDataSource readData");
        char[] buff = null;
        File file  = new File(name);
        try{
            FileReader reader = new FileReader(file);
            buff = new char[(int)file.length()];
            /**
             * 将字符读入字符数组
             */
            reader.read(buff);
        }catch(Exception e) {
            e.printStackTrace();
        }
        String result = new String(buff);
        System.out.println("FileDataSource  readData=" + result);
        return new String(buff);
    }
}
