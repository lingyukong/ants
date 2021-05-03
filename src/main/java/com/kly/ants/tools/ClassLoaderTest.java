package com.kly.ants.tools;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/4/27 16:21
 */
public class ClassLoaderTest {

    public void sayHello(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        System.out.println("currentloader:" + loader);
//        System.out.println("parentloader:" + loader.getParent());
//        System.out.println("grandParentloader:" + loader.getParent().getParent());


        Class clas = loader.loadClass("tools.TestMethod");
//        Class clas = Class.forName("tools.TestMethod");


        Constructor constructor = clas.getConstructor();
        constructor.setAccessible(true);
        TestMethod classLoaderTest = (TestMethod) constructor.newInstance();
        classLoaderTest.sayHello("kly1");
        Method method = clas.getDeclaredMethod("sayHello",String.class);


        method.invoke(classLoaderTest,"hello world");
    }
}
