package com.kly.ants.Pattern.decorator.example1;

/**
 * <p>Description: </p>
 *  装饰器类Decorator
 * @author kly
 * @Date 2018/4/21 21:12
 * @see
 */
public class DataSourceDecorator implements  DataSource{
    private DataSource wrapper;

    public DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }

    public void test() {
        System.out.println("test");
    }
}
