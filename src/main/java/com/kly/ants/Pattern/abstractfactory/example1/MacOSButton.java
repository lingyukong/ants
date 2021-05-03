package com.kly.ants.Pattern.abstractfactory.example1;

/**
 * <p>Title: mytest.Pattern.abstractfactory.example1-</p>
 * <p>Description: Button的一个具体产品类</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/9 16:40
 * @see
 */
public class MacOSButton implements Button {

    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
