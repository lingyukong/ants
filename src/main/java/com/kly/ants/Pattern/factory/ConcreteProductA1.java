package com.kly.ants.Pattern.factory;

/**
 * 实现了抽象产品的具体类
 * 工厂方法模式所创建的每个对象都是某个具体产品角色的实例
 */
public class ConcreteProductA1 implements Product {

    public void produce() {
        System.out.println("A产品生产处理");
    }

    public void expired() {
        System.out.println("A产品过期处理");
    }
}
