package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example8;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 16:31
 * @see
 */
abstract public class Event {
    private long evtTime;
    public Event(long eventTime) {
        evtTime = eventTime;
    }
    public boolean ready() {
        return System.currentTimeMillis() >= evtTime;
    }
    abstract public void action();
    abstract public String description();
}
