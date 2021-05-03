package com.kly.ants.Pattern.simplefactory;

/**
 * 工厂角色
 * 负责生产产品
 * 简单模式（静态工厂模式）的核心类，这个类含有必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例
 * 客户端可以直接免除直接创建产品对象的责任，而仅仅负责消费产品，通过这种方式，实现了对责任的分隔
 * 缺点：如果接纳新的产品会修改这个工厂角色的源代码，所以该模式只在有限的程度上支持“开-闭”原则
 */
public class SimpleFactory {

    /**
     * 直接调用该方法进行产品的创建
     * @param sort
     * @return Product
     */
    public static Product createProduct(String sort) {
        if (sort.equals("A")) {
            return new ConcreteProductA();
        } else if (sort.equals("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}
