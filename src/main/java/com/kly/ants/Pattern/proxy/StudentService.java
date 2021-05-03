package com.kly.ants.Pattern.proxy;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/1/28 20:30
 */
public class StudentService implements IStudentService{

    @Override
    public void insertStudent() {
        System.out.println("添加学生");
    }

    @Override
    public void deleteStudent() {
        System.out.println("删除学生");
    }
}
