package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example3;

/**
 * <p>Description: 内部类可以从封装类访问方法与字段，就象已经拥有了它们一样</p>
 *
 * @author kly
 * @Date 2018/1/21 11:15
 * @see
 */
public class Sequence {
    private Object[] o;
    private int next = 0;
    public Sequence(int size) {
        o = new Object[size];
    }
    public void add(Object x) {
        if(next < o.length) {
            o[next] = x;
            next++;
        }
    }
    private class SSelector implements Selector {
        int i = 0;
        public boolean end() {
            return i == o.length;
        }
        public Object current() {
            return o[i];
        }
        public void next() {
            if(i < o.length) i++;
        }
    }
    public Selector getSelector() {
        return new SSelector();
    }
    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for(int i = 0; i < 10; i++)
            s.add(Integer.toString(i));
        Selector sl = s.getSelector();
        while(!sl.end()) {
            System.out.println((String)sl.current());
            sl.next();
        }
    }
}
