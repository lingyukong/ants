package com.kly.ants.thread.producer.disruptor;


import com.lmax.disruptor.EventHandler;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/5/9 20:41
 */
public class LongEventHandler implements EventHandler<LongEvent> {


    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        System.out.println("consumer:"+Thread.currentThread().getName()+" Event: value=" + longEvent.getValue()+
                ",sequence="+longEvent);
    }
}
