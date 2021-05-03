package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example6;
/**
 * <p>Description:继承内部类
 *   InheritInner只对内部类进行了扩展，没有扩展外部类。但在需要创建一个构建器的时候，
     默认对象已经没有意义，我们不能只是传递封装对象的一个句柄。此外，必须在构建器中采用下述语法：
     enclosingClassHandle.super();
     它提供了必要的句柄，以便程序正确编译
 </p>
 *
 * @author kly
 * @Date 2018/1/21 15:33
 * @see
 */
public class InheritInner extends WithInner.Inner {
    //! InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
