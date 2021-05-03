package com.kly.ants.Pattern.abstractfactory;

/**
 * <p>Title: mytest.Pattern.abstractfactory-</p>
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 10:31
 * @see
 */
public interface AbstractFactory {

    public AbstractProductEngine getProductEngine();
    public AbstractProductSteeringWheel getProductSteeringWheel();
}
