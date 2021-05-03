package com.kly.ants.Pattern.proxy.cglib;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/13 15:11
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        StudentService ss = new StudentService();
        //获取到代理对象，并且将目标对象传递给代理对象
        StudentService ssProxy = (StudentService) new StudentServiceCgProxy(ss).getProxyInstance();
        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        ssProxy.insertStudent();
    }
}
