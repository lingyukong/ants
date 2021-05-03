package com.kly.ants.Pattern.decorator;

/**
 * <p>Description: </p>
 *  具体装饰类
 *  如果只有一个ConcreteDecorator类，那么没有必要单独建立一个Decorator类，可以把Decorator和ConcreteDecorator（扮演双重角色）合并成一个类，
 *  但如果ConcreteDecorator类的数据大于3，则有必要使用一个具体的Decorator类 来区分抽象和具体的责任了
 * @author kly
 * @Date 2018/4/21 11:10
 * @see
 */
public class ConcreteDecorator extends  Decorator{

    public void sampleOperation() {
        super.sampleOperation();
    }
}
