package com.kly.ants.Pattern.proxy.cglib;

/**
 * Description:
 * Company:changyou
 *  cglib 被代理对象，不用实现接口
 * @author konglingyu
 * @Date 2021/4/13 14:29
 */
public class StudentService {

    public void insertStudent() {
        System.out.println("添加学生 我不需要实现接口");
    }

    public void deleteStudent() {
        System.out.println("删除学生 我不需要实现接接口");
    }
}
