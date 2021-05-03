package com.kly.ants.Pattern.factory.example2;

/**
 * <p>Description: Concrete creator:具体工厂
 * HtmlDialog will produce HTML buttons.
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/10 9:41
 * @see
 */
public class HtmlDialog extends Dialog {

    public Button createButton() {
        return new HtmlButton();
    }
}
