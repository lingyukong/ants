package com.kly.ants.Pattern.decorator.example1;

import java.util.Base64;

/**
 * <p>Description: </p>
 *  ConcreteDecorator1
 * @author kly
 * @Date 2018/4/21 21:23
 * @see
 */
public class EncryptionDecorator extends DataSourceDecorator {


    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("EncryptionDecorator writeData");
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }


    public String encode(String data) {
        byte[] result = data.getBytes();
        for(int i=0;i<result.length;i++) {
            result[i] += (byte)1; //encode的算法是将字节往后挪了一位
        }
        /**
         *  Base64并不是一种用于安全领域的加密解密算法
         *  Base64是一种很常见的编码规范，其作用是将二进制序列转换为人类可读的ASCII字符序列，
         *  常用在需用通过文本协议（比如HTTP和SMTP）来传输二进制数据的情况下
         *
         *  在官方文档中找不到这个类的说明，所以不建议使用，sun公司可能会随时删除或者更新
         */
        return Base64.getEncoder().encodeToString(result);
    }

    public String decode(String data) {
        System.out.println("EncryptionDecorator decode");
        byte[] result = Base64.getDecoder().decode(data);
        for (int i=0;i<result.length;i++) {
            result[i] -= (byte)1;
        }
        String res = new String(result);
        System.out.println("decode result=" + res);
        return res;
    }

}
