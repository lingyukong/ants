package com.kly.ants.Pattern.abstractfactory;

/**
 * <p>Title: mytest.Pattern.abstractfactory-</p>
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 10:36
 * @see
 */
public class ConcreteFactoryDaZhong implements AbstractFactory {
    public AbstractProductEngine getProductEngine() {
        return new ConcreteProductDaZhongEngine();
    }

    public AbstractProductSteeringWheel getProductSteeringWheel() {
        return new ConcretePrdocutDaZhongSteeringWheel();
    }
}
