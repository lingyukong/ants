package com.kly.ants.Pattern.simplefactory;

/**
 * 具体产品B
 */
public class ConcreteProductB implements Product {

    public void produce() {
        System.out.println("添加B产品的实现逻辑");
    }

    public void expired() {
        System.out.println("添加B产品的实现逻辑");
    }
}
