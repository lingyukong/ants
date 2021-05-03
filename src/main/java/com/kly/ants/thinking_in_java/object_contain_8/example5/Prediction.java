package com.kly.ants.thinking_in_java.object_contain_8.example5;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/25 15:49
 * @see
 */
public class Prediction {

    boolean shadow = Math.random() > 0.5;
    public String toString() {
        if(shadow)
            return "Six more weeks of Winter!";
        else
            return "Early Spring!";
    }
}
