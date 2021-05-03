package com.kly.ants.Pattern.abstractfactory;

/**
 * <p>Title: mytest.Pattern.abstractfactory-</p>
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 10:32
 * @see
 */
public class ConcreteFactoryXianDai implements AbstractFactory {
    public AbstractProductEngine getProductEngine() {
        return new ConcreteProductXianDaiEngine();
    }

    public AbstractProductSteeringWheel getProductSteeringWheel() {
        return new ConcreteProductXianDaiSteeringWheel();
    }
}
