package com.kly.ants.Pattern.decorator.example1;

/**
 * <p>Description: </p>
 *  CompressionDecorator 持有EncryptionDecorator对象的引用，
 *  EncryptionDecorator 持有FileDataSource具体构建的（本尊）对象的引用
 *  这种链式的引用模式 让装饰器看起来就像LinkedList
 *  装饰模式又常被称为包裹模式，每一层都会增加一个功能
 *
 * @author kly
 * @Date 2018/4/22 14:21
 * @see
 */
public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        //定一个装饰器类，这样可以调用装饰器里新增的方法
        DataSourceDecorator encoded =  new CompressionDecorator(
                                            new EncryptionDecorator(
                                                    new FileDataSource("OutputDemo.txt")
                                            ));
        encoded.writeData(salaryRecords);
//        encoded.test();
        DataSource plain = new FileDataSource("OutputDemo.txt");


        System.out.println("Input------------------");
        System.out.println(salaryRecords);
        System.out.println("encoded-----------------");
        System.out.println(plain.readData());
        System.out.println("Decoded-----------------");
        System.out.println(encoded.readData());


    }
}
