package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description:
 *  每个具体的工厂都继承了抽象工厂并负责创建某一个产品族的产品
 *  本类的具体工厂负责创建windows产品族的产品
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:47
 * @see
 */
public class WindowsFactory implements GUIFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
