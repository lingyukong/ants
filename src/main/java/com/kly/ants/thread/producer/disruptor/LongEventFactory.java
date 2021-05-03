package com.kly.ants.thread.producer.disruptor;


import com.lmax.disruptor.EventFactory;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/5/9 20:40
 */
public class LongEventFactory implements EventFactory {

    @Override
    public Object newInstance() {
        return new LongEvent();
    }
}
