package com.kly.ants.Pattern.factory;

/**
 * 实现了抽象工厂的具体类，是与应用密切相关的逻辑
 */
public class ConcreteFactoryA1 implements Factory {


    public Product createProduct() {
        return new ConcreteProductA1();
    }
}
