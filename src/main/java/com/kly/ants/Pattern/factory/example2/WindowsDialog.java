package com.kly.ants.Pattern.factory.example2;

/**
 * <p>Description:One more concrete creator:另一个具体工厂
 * Windows Dialog will produce Windows buttons.
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/10 9:43
 * @see
 */
public class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}
