package com.kly.ants.Pattern.proxy;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/1/28 20:44
 */
public class Client {
    public static void main(String[] args) {
        IStudentService studentServiceProxy = new StudentServiceProxy(new StudentService());
        studentServiceProxy.insertStudent();
        studentServiceProxy.deleteStudent();
    }
}
