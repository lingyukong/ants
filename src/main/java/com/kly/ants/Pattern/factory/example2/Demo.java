package com.kly.ants.Pattern.factory.example2;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/10 9:44
 * @see
 */
public class Demo {
    private static Dialog dialog;
    static void configure(){
        if (System.getProperty("os.name").contains("Windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public static void main(String[] args){
        configure();
        dialog.renderWindow();
    }
}
