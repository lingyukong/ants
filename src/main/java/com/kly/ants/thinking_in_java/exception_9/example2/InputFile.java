package com.kly.ants.thinking_in_java.exception_9.example2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/4/6 17:25
 * @see
 */
public class InputFile {
    private BufferedReader in;

    InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            // Other code that might throw exceptions
        } catch (FileNotFoundException e) {
            System.out.println(
                    "Could not open " + fname);
            // Wasn't open, so don't close it
            throw e;
        } catch (Exception e) {
            // All other exceptions must close it
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println(
                        "in.close() unsuccessful");
            }
            throw e;
        } finally {
            // Don't close it here!!!
        }
    }

    String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            System.out.println(
                    "readLine() unsuccessful");
            s = "failed";
        }
        return s;
    }

    void cleanup() {
        try {
            in.close();
        } catch (IOException e2) {
            System.out.println(
                    "in.close() unsuccessful");
        }
    }
}
