package com.kly.ants.Pattern.factory;

/**
 * 抽象工厂角色，是工厂模式的核心，是与应用逻辑无关的，也可以使用抽象类扮演
 * 它仅仅负责给出具体工厂必须实现的接口，而不负责哪一个产品类被实例化这种细节，
 * 这使得工厂方法模式可以允许系统在不修改工厂角色的情况下引进新产品，完全符合“开-闭”原则
 */
public interface Factory {

    /**
     * createProduct 是一个工厂方法
     * @return
     */
    public Product createProduct();
}
