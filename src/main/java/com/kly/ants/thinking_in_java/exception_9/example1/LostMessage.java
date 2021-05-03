package com.kly.ants.thinking_in_java.exception_9.example1;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/6 17:15
 * @see
 */
public class LostMessage {
    void f() throws VeryImportantException {
        System.out.println("VeryImportantException");
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args)
            throws Exception {
        LostMessage lm = new LostMessage();
        try {
            lm.f(); //不会打印VeryImportantException异常，因为异常没有被catch住，而是throws 扔出去了
        } finally {
            lm.dispose();
        }
    }
}
