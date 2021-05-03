package com.kly.ants.Pattern.singleton.test;



/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/16 8:07
 */
public class LazySingleton {
    private static LazySingleton instance ;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() throws Exception {
        if (null == instance) {
            Thread.sleep(5000);
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        class TestThread implements Runnable{

            @Override
            public void run() {
                LazySingleton lazySingleton= null;
                try {
                    lazySingleton = LazySingleton.getInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+ ":" + lazySingleton);
            }


        }
        for (int i=0;i<10;i++) {
            Thread thread = new Thread(new TestThread());
            thread.start();
        }

    }
}
