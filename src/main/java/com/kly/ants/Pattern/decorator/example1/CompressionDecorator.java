package com.kly.ants.Pattern.decorator.example1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * <p>Description: </p>
 *  ConcreteDecorator2
 * @author kly
 * @Date 2018/4/22 11:36
 * @see
 */
public class CompressionDecorator extends DataSourceDecorator {
    private int comlevel = 6;

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("CompressionDecorator writeData");
        super.writeData(compressData(data));
    }

    @Override
    public String readData() {
        System.out.println("CompressionDecorator readData");
        return decompress(super.readData());
    }

    /**
     *
     * 压缩数据
     * @param StringData
     * @return
     */
    public String compressData(String StringData) {
        byte[] data= StringData.getBytes();
        try{
            /**
             * 创建一个新的 byte 数组输出流，它具有指定大小的缓冲区容量（以字节为单位)
             * 此类实现了一个输出流，其中的数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString(String charsetName) 获取数据
             */
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            /**
             * DeflaterOutputStream 此类为使用 "deflate" 压缩格式压缩数据实现输出流过滤器
             */
            DeflaterOutputStream dos = new DeflaterOutputStream(bout,new Deflater(comlevel));
            dos.write(data);
            dos.close();
            bout.close();
            String result = Base64.getEncoder().encodeToString(bout.toByteArray());
            System.out.println("compressData-----------------" + result);
            return result;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decompress(String StringData) {
        byte[] data = Base64.getDecoder().decode(StringData.getBytes());
        try{
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream out = new ByteArrayOutputStream(512);
            int b;
            while((b = iin.read()) != -1) {
                out.write(b);
            }

            in.close();
            iin.close();
            out.close();
            String result = new String(out.toByteArray());
            System.out.println("decompress result=" + result);
            return result;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        decompress("eJzzS8xNBQADngGC");
    }
}
