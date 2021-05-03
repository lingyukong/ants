package com.kly.ants.Pattern.factory;

/**
 * 模拟应用类
 * 应用类不用关心产品A和产品B是如何创建的，只需要调用工厂方法去实现
 */
public class Client {
    private static Factory factory;

    static void configure() {
        if (System.getProperty("os.name").contains("Windows")) {
            factory = new ConcreteFactoryA1();
        } else {
            factory = new ConcreteFactoryA2();
        }
    }

    public static void main(String[] args) {
        configure();
        Product product = factory.createProduct();
        product.produce();
    }
}
