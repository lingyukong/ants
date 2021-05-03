package com.kly.ants.Pattern.factory;

/**
 * 此类是工厂模式创建产品的父类，也常常用抽象类扮演
 * 抽象产品
 */
public interface Product {
    /**
     * 产品的生产
     */
    void produce();

    /**
     * 产品的过期
     */
    void expired();
}
