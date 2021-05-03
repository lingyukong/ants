package com.kly.ants.Pattern.proxy;

/**
 * Description:
 * Company:changyou
 *  静态代理  通过代理类
 * @author konglingyu
 * @Date 2021/1/28 20:31
 */
public class StudentServiceProxy implements IStudentService{
    IStudentService studentService;

    public StudentServiceProxy(IStudentService studentService) {
        this.studentService = studentService;
    }

    //
    @Override
    public void insertStudent() {
        System.out.println("新增学生添加额外功能");
        studentService.insertStudent();
    }

    @Override
    public void deleteStudent() {
        System.out.println("删除学生添加额外功能");
        studentService.deleteStudent();
    }
}
