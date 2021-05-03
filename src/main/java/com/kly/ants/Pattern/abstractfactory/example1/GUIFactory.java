package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description:
 * 抽象工厂知道所有的（抽象）产品类型
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:45
 * @see
 */
public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckBox();

}
