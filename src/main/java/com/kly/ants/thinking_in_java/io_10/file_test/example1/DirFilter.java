package com.kly.ants.thinking_in_java.io_10.file_test.example1;

import java.io.File;
import java.io.FilenameFilter;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  实现此接口的类实例可用于过滤器文件名
 * @author kly
 * @Date 2018/4/10 18:16
 * @see
 */
public class DirFilter implements FilenameFilter {
    private String dfile;

    public DirFilter(String dfile) {
        this.dfile = dfile;
    }

    @Override
    public boolean accept(File dir, String name) {
        String f = new File(name).getName();
        return f.indexOf(dfile) != -1;
    }
}
