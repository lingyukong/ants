package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description:
 *  Application选择工厂的类型并且在运行的时候创建它（通常是在初始化的时候），依据配置或者环境变量
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:50
 * @see
 */
public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory =  new WindowsFactory();
            app =  new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
