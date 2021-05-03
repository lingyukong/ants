package com.kly.ants.thinking_in_java.thread_14.example5;

/**
 * <p>Description:
 * 1:如果是一个 Daemon（守护线程） 线程，那么它创建的任何线程也会自动具备Daemon属性
 * 2:“Daemon”线程的作用是在程序的运行期间于后台提供一种“常规”服务，但它并不属于程序的一个基本部分,
 * 因此，一旦所有非 Daemon线程（用户线程）完成，程序也会中止运行
 *
 * 在守护线程中不应该做一些IO操作，如读取文件，访问数据库等，因为无法预知这些操作是否被完整的执行
 *
 *
 * JVM垃圾回收机制采用的就是守护线程
 * </p>
 *
 * @author kly
 * @Date 2018/1/28 14:57
 * @see
 */
public class Daemon extends Thread {
    private static final int SIZE = 10;
    private Thread[] t = new Thread[SIZE];
    public Daemon() {
        setDaemon(true); //在start之前设置为守护线程
        start();
    }

    public void run() {
        for (int i=0;i<SIZE;i++) {
            t[i] = new DaemonSpawn(i); //在守护线程里创建的线程也是守护线程
        }
        for (int i=0;i<SIZE;i++) {
            System.out.println(
                    "t[" + i + "].isDaemon() = "
                            + t[i].isDaemon());
        }

        while(true) {
            yield();
        }

    }
}
