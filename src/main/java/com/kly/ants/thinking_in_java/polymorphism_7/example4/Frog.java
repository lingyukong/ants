package com.kly.ants.thinking_in_java.polymorphism_7.example4;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/22 11:15
 * @see
 */
public class Frog extends Amphibian {
    Frog() {
        System.out.println("Frog()");
    }
    protected void finalize() {
        System.out.println("Frog finalize");
        if(DoBaseFinalization.flag)
            try {
                super.finalize();
            } catch(Throwable t) {}
    }
    public static void main(String[] args) {
        if(args.length != 0 &&
                args[0].equals("finalize"))
            DoBaseFinalization.flag = true;
        else
            System.out.println("not finalizing bases");
        new Frog(); // Instantly becomes garbage
        System.out.println("bye!");
        // Must do this to guarantee that all
        // finalizers will be called:
        //该方法仅为测试使用，已过时。 该方法具有固有的不安全性。它可能对正在使用的对象调用终结方法，而其他线程同时正在操作这些对象，从而导致不正确的行为或死锁。
        System.runFinalizersOnExit(true);
    }
}
