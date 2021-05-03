package com.kly.ants.thinking_in_java.polymorphism_7.example5;

/**
 * <p>Description:
 * 设计构建器时一个特别有效的规则是：用尽可能简单的方法使对象进入就绪状态；如果可能，避免调
   用任何方法，在构建器内唯一能够安全调用的是在基础类中具有final 属性的那些方法（也适用于private
   方法，它们自动具有final 属性）
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:30
 * @see
 */
abstract public class Glyph {
    abstract void draw();
    Glyph() {
        System.out.println("Glyph() before draw()");
        //会有错误输出：RoundGlyph.draw(), radius = 0.此种错误程序不会报错，如果一旦生产环境运行，很难发现
        //在采取其他任何操作之前，为对象分配的存储空间初始化成二进制零
        draw();
        System.out.println("Glyph() after draw()");
    }
}
