package com.kly.ants.thinking_in_java.object_contain_8.newcollections.example3;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/3/9 11:10
 * @see
 */
public class MyType implements  Comparable{
    private int i;
    public MyType(int n) {
        System.out.println("构造器：" + n);
        i = n;
    }

    //只有要把类置入一个HashSet 的前提下，才有必要使用hashCode()
    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + "";
    }

    public boolean equals (Object o) {
        return (o instanceof  MyType) && (i == ((MyType) o).i);
    }
    @Override
    public int compareTo(Object o) {
        int i2= ((MyType)o).i;
        return (i2<i)? -1 : (i2==i? 0:1);
//        return 1;
    }
}
