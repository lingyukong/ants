package com.kly.ants.Pattern.proxy.dynamic;



import com.kly.ants.Pattern.proxy.IStudentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/1/28 20:47
 */
public class StudentInvocationHandler implements InvocationHandler {
    private IStudentService studentService;

    public StudentInvocationHandler(IStudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"方法调用前");
        method.invoke(studentService,args);
        System.out.println(method.getName() +"方法调用后");
        return null;
    }
}
