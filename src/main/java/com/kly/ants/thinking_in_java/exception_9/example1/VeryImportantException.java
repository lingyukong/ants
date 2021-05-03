package com.kly.ants.thinking_in_java.exception_9.example1;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/6 17:11
 * @see
 */
public class VeryImportantException extends Exception {
    public String toString() {
        System.out.println("VeryImportantException to String");
        return "A very important exception!";
    }
}
