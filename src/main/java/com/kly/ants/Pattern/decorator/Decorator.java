package com.kly.ants.Pattern.decorator;

/**
 * <p>Description: </p>
 *  装饰类
 * @author kly
 * @Date 2018/4/21 10:51
 * @see
 */
public class Decorator implements Component {
    Component component;

    public Decorator() {

    }

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {

        /**
         * 将实现的方法委派给父类，并不是单纯的委派，而是有功能的增强
         */
        component.sampleOperation();
    }
}
