package com.kly.ants.tools;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/24 9:47
 * @see
 */
public class CharTest {
    public static void main(String[] args) {
        char aChar = 'a';
        System.out.println(aChar);
        char enterChar = '\n';
        System.out.println(enterChar);
        char ch = '\u9999';
        System.out.println(ch);
        for (byte temp : (ch + "").getBytes()) {
            System.out.println(temp);
        }

        char zhong='中';
        System.out.println(zhong);
        int zongValue = zhong;
        System.out.println(zongValue);

        char temp1= 100;
        System.out.println(temp1);

        char temp2 = '1';
        System.out.println(temp2);

        char temp3 = 5656;
        System.out.println("temp3=" + temp3);

    }
}
