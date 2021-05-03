package com.kly.ants.Pattern.simplefactory;

/**
 * 此类是工厂方法创建对象的父类
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
