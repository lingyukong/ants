package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description: CheckBox的一个具体产品类</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:43
 * @see
 */
public class WindowsCheckBox implements CheckBox {

    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
