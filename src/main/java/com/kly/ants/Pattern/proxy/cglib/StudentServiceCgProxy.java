package com.kly.ants.Pattern.proxy.cglib;



import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/13 14:31
 */
public class StudentServiceCgProxy implements MethodInterceptor {
    private Object target;

    public StudentServiceCgProxy(Object target){
        this.target = target;
    }

    /**
     * 获得一个代理类
     * @return
     */
    public Object getProxyInstance(){
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是cglib代理--增强功能");
        method.invoke(target,objects);
        return null;
    }
}
