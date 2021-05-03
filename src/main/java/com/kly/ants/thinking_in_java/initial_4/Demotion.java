package com.kly.ants.thinking_in_java.initial_4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/15 17:45
 * @see
 */
public class Demotion {
    public void f1(char x) { System.out.println("f1(char):" + x);}
    public void f1(byte x) { System.out.println("f1(byte):" + x);}
    public void f1(short x) {System.out.println("f1(short):" + x);}
    public void f1(int x) {System.out.println("f1(int):" + x);}
    public void f1(long x) {System.out.println("f1(long):" + x);}
    public void f1(float x) {System.out.println("f1(float):" + x);}
    public void f1(double x) {System.out.println("f1(double):" + x);}

    public void f2(char x) { System.out.println("f2(char):" + x);}
    public void f2(byte x) { System.out.println("f2(byte):" + x);}
    public void f2(short x) {System.out.println("f2(short):" + x);}
    public void f2(int x) {System.out.println("f2(int):" + x);}
    public void f2(long x) {System.out.println("f2(long):" + x);}
    public void f2(float x) {System.out.println("f2(float):" + x);}

    public void f3(char x) { System.out.println("f3(char):" + x);}
    public void f3(byte x) { System.out.println("f3(byte):" + x);}
    public void f3(short x) {System.out.println("f3(short):" + x);}
    public void f3(int x) {System.out.println("f3(int):" + x);}
    public void f3(long x) {System.out.println("f3(long):" + x);}

    public void f4(char x) { System.out.println("f4(char):" + x);}
    public void f4(byte x) { System.out.println("f4(byte):" + x);}
    public void f4(short x) {System.out.println("f4(short):" + x);}
    public void f4(int x) {System.out.println("f4(int):" + x);}

    public void f5(char x) { System.out.println("f5(char):" + x);}
    public void f5(byte x) { System.out.println("f5(byte):" + x);}
    public void f5(short x) {System.out.println("f5(short):" + x);}

    public void f6(char x) { System.out.println("f6(char):" + x);}
    public void f6(byte x) { System.out.println("f6(byte):" + x);}

    public void f7(char x) { System.out.println("f7(char):" + x);}

    public void testDouble() {
        double x = 1;
        System.out.println("double2 argument:");
        f1(x);f2((float)x);f3((long)x);f4((int)x);
        f5((short)x);f6((byte)x);f7((char)x);
    }

    public static void main(String[] args) {
        Demotion pr = new Demotion();
        pr.testDouble();
    }
}
