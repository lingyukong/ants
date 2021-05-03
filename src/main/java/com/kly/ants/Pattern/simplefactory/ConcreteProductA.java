package com.kly.ants.Pattern.simplefactory;

/**
 * 具体产品A
 */
public class ConcreteProductA implements Product {


    public void produce() {
        System.out.println("添加A产品的实现逻辑");
    }

    public void expired() {
        System.out.println("添加A产品的实现逻辑");
    }
}
