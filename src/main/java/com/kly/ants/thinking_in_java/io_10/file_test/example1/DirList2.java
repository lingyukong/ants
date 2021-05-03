package com.kly.ants.thinking_in_java.io_10.file_test.example1;

import java.io.File;
import java.io.FilenameFilter;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  用内部类优化test1
 * @author kly
 * @Date 2018/4/11 9:57
 * @see
 */
public class DirList2 {


    public static FilenameFilter filter(final String fna) {
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
               String f = new File(name).getName();
               return f.indexOf(fna) != -1;
            }
        };
    }

    public static void main(String[] args) {
        try {
               File f = new File(File.separator + "F:" + File.separator);
               String[] list;
               if (args.length == 0) {
                   list = f.list();
               } else {
                   list = f.list(filter(args[0]));
               }
               for (String temp : list) {
                   System.out.println(temp);
               }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
