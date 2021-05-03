package com.kly.ants.thinking_in_java.create_class_6.example1;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/28 13:53
 * @see
 */
public class TestClass {

    public static void main(String[] args) {

        //类.class,不做类的初始化工作,返回Class的对象
        Class<TestClassType> testClassType = TestClassType.class;
        System.out.println("TestClassType=" + testClassType) ;

//        CLass.forName("包名+类名"),装入类,并做类的静态初始化，返回Class的对象
        try {
            Class testClassType1 =  Class.forName("thinking_in_java.create_class_6.example1.TestClassType");
            System.out.println("testClassType1=" + testClassType1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//
        //测试new Class().getClass(),正常new 类的初始化顺序，getClass()获取运行时真正所指的对象
        TestClassType testClassType2 = new TestClassType();
        System.out.println("testClassType2=" + testClassType2.getClass());


    }
}
