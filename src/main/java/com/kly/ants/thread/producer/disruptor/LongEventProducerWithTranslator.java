package com.kly.ants.thread.producer.disruptor;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/5/9 20:59
 */
public class LongEventProducerWithTranslator {
    private final RingBuffer<LongEvent> ringBuffer;

    public LongEventProducerWithTranslator(RingBuffer<LongEvent> ringBuffer)
    {
        this.ringBuffer = ringBuffer;
    }

    private static final EventTranslatorOneArg<LongEvent, ByteBuffer> TRANSLATOR =
            new EventTranslatorOneArg<LongEvent, ByteBuffer>()
            {
                public void translateTo(LongEvent event, long sequence, ByteBuffer bb)
                {
                    event.setValue(bb.getLong(0));
                    System.out.println("producer:"+Thread.currentThread().getName()+" Event: value=" + bb.getLong(0)+
                            ",sequence="+event);
                }
            };

    public void product(ByteBuffer bb)
    {
        ringBuffer.publishEvent(TRANSLATOR, bb);
    }
}
