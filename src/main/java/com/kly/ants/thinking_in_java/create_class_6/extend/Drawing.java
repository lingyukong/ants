package com.kly.ants.thinking_in_java.create_class_6.extend;

/**
 * <p>Description: 基础类会在衍生类访问它之前得到正确的初始化</p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/18 14:20
 * @see
 */
public class Drawing extends Art {
    Drawing (){
        System.out.println("create drawing");
    }
    Drawing (int i){
        System.out.println("create drawing");
    }
}
