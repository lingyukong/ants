package com.kly.ants.thinking_in_java.io_10.inputstream_test;

import java.io.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/12 14:38
 * @see
 */
public class OutFile extends DataOutputStream {
    public OutFile(String filename)
            throws IOException {
        super(new BufferedOutputStream(new FileOutputStream(filename)));
    }
    public OutFile(File file)
            throws IOException {
        this(file.getPath());
    }
}
