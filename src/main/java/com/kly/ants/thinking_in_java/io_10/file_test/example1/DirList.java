package com.kly.ants.thinking_in_java.io_10.file_test.example1;

import java.io.File;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  过滤文件名测试方法
 * @author kly
 * @Date 2018/4/10 18:12
 * @see
 */
public class DirList {

    public static void main(String[] args) {
        try{
             File path = new File(File.separator + "F:" + File.separator);
             String[] list;
             if (args.length == 0) {
                 list = path.list();
             } else {
                 list = path.list(new DirFilter(args[0]));
             }
             for (String temp : list) {
                 System.out.println(temp);
             }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
