package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description: 这是Button的一个具体产品类</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:41
 * @see
 */
public class WindowsButton implements Button {

    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
