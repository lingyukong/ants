package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description:
 * 工厂用户并不关心他们使用的是哪个具体的工厂直到他们通过抽象接口与工厂和产品工作的时候。
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:48
 * @see
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
