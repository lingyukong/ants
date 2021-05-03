package com.kly.ants.thinking_in_java.object_contain_8.example5;

import java.util.Hashtable;

/**
 * <p>Description:
 * 问题在于Groundhog 是从通用的 Object 根类继承的（若当初未指定基础类，则所有类最终都是从Object 继承的）。事实上是用Object 的 hashCode()方法生成每个对象的散
   列码，而且默认情况下只使用它的对象的地址。所以，Groundhog(3)的第一个实例并不会产生与Groundhog(3)第二个实例相等的散列码，而我们用第二个实例进行检索

     当散列表试图判断我们的键是否等于表内的某个键时，就会用到equals()这个方法。
     同样地，默认的Object.equals()只是简单地比较对象地址，所以一个 Groundhog(3)并不等于另一个Groundhog(3)
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/25 15:50
 * @see
 */
public class SpringDetector {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        for (int i=0;i<10;i++) {
            ht.put(new Groundhog(i),new Prediction());
        }
        System.out.println("ht = " + ht + "\n");
        Groundhog gh = new Groundhog(3);
        System.out.println(
                "Looking up prediction for groundhog #3:"+gh);
        if(ht.containsKey(gh)) { //检索不存在
            System.out.println((Prediction)ht.get(gh));
        }
    }
}
