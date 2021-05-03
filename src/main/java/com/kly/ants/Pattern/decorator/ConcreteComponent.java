package com.kly.ants.Pattern.decorator;

/**
 * <p>Description: </p>
 * 如果只有一个ConcreteComponent类，没有抽象的Component，那么装饰器类可直接继承ConcreteComponent
 * @author kly
 * @Date 2018/4/21 10:59
 * @see
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {

    }
    @Override
    public void sampleOperation() {
       //write your code
    }
}
