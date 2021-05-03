package com.kly.ants.Pattern.proxy.dynamic;


import com.kly.ants.Pattern.proxy.IStudentService;
import com.kly.ants.Pattern.proxy.StudentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/1/28 20:50
 */
public class Client {
    public static void main(String[] args) {
        IStudentService studentService = new StudentService();
        InvocationHandler studentInvocationHandler = new StudentInvocationHandler(studentService);
        System.out.println("getClass().getClassLoader():" + studentService.getClass().getClassLoader());
        System.out.println("getClass().getInterfaces():" + Arrays.toString(studentService.getClass().getInterfaces()));
        IStudentService studentServiceProxy = (IStudentService) Proxy.newProxyInstance(studentService.getClass().getClassLoader(), studentService.getClass().getInterfaces(), studentInvocationHandler);
        System.out.println(studentServiceProxy.getClass());
        studentServiceProxy.insertStudent();
        studentServiceProxy.deleteStudent();
    }
}
