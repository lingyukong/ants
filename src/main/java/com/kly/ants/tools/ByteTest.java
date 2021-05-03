package com.kly.ants.tools;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/24 11:03
 * @see
 */
public class ByteTest {
    public static void main(String[] args) {
        //获取Unicode编码：
        char c = '人';
        String unicode = Integer.toHexString(c);//自动类型转换由低->高
        System.out.println(unicode);


        /**
         * 根据UTF-8编码解释成字节
         */
        byte[] result = "人".getBytes();
        System.out.println(new String(result));
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
            result[i] += (byte)1;
        }
        System.out.println(new String(result));
    }
}
