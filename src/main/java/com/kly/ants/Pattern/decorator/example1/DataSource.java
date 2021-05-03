package com.kly.ants.Pattern.decorator.example1;

/**
 * <p>Description: </p>
 *  抽象组件Component
 * @author kly
 * @Date 2018/4/21 20:55
 * @see
 */
public interface DataSource {

    void writeData(String data);

    String readData();
}
