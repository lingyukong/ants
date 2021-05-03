package com.kly.ants.Pattern.factory.example2;

/**
 * <p>Description: Base creator：抽象工厂</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/10 9:37
 * @see
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific
     * button objects.
     */
    public abstract Button createButton();
}
