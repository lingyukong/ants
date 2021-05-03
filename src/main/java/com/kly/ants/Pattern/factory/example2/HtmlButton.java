package com.kly.ants.Pattern.factory.example2;

/**
 * <p>Description:  Concrete product：具体产品</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/10 9:33
 * @see
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
