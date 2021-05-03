package com.kly.ants.Pattern.factory;

public class ConcreteProductA2 implements Product {

    public void produce() {
        System.out.println("B产品生产处理");
    }

    public void expired() {
        System.out.println("B产品过期处理");
    }
}
