package com.kly.ants.thread.producer;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/5/9 18:46
 */
public class ConditionTest {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition notfull = lock.newCondition();
    private static Condition notEmpty = lock.newCondition();
    private static Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
    private static final int maxNum = 10;


    static class producer implements Runnable{

        @Override
        public void run() {
            lock.lock();
            try {
                while(queue.size() == maxNum) {  //表示队列已经满了
                    notEmpty.await();
                }
                int product = new Random().nextInt();
                queue.add(product);
                System.out.println(Thread.currentThread().getName() + "-producer:" + product);
                notfull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }finally {
                lock.unlock();
            }
        }
    }

    static class consume implements  Runnable{

        @Override
        public void run() {
            lock.lock();
            try{
                while(0 == queue.size()) {
                    notfull.await();
                }

                int element = queue.poll();
                System.out.println(Thread.currentThread().getName() + "-consume:" + element);
                notEmpty.signalAll();
            }catch(InterruptedException e){

            }finally{
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) {

        for(int i=0;i<20 ;i++) {
            Thread prodcuer = new Thread(new producer()) {};
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            prodcuer.start();
        }

        for(int i=0;i<20 ;i++) {
            Thread consume = new Thread(new consume()) {};
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            consume.start();
        }

    }
}
