package com.kly.ants.Pattern.singleton;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/15 9:05
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(5000); //为了看出并发情况下出现的问题
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        class TestThread implements Runnable{

            @Override
            public void run() {
                try {
                    LazySingleton lazySingleton =  LazySingleton.getInstance();
                    System.out.println(lazySingleton.hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for(int i=0;i<10;i++) {
            Thread thread = new Thread(new TestThread());
            thread.start();
        }
    }


}

