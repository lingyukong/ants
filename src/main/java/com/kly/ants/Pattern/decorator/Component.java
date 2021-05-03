package com.kly.ants.Pattern.decorator;

/**
 * <p>Description: </p>
 *  装饰模式又称为包裹模式，
 *  抽象构件
 *  尽量保证Component作为一个“轻”类，
 *  这个类的责任是为了各个ConcreteComponent 提供一个共同的接口，因此它着重在于提供接口而不是存储数据
 *  所以Component可以干脆是一个接口，但是在实际工作中可以是一个抽象类或者具体的类。此时注意不要把太多的逻辑和状态放在Component里
 *
 *  装饰模式的用意是在不改变接口的前提下，增强对象的性能
 * @author kly
 * @Date 2018/4/21 10:47
 * @see
 */
public interface Component {
    /**
     * 商业方法
     */
    public void sampleOperation();
}
