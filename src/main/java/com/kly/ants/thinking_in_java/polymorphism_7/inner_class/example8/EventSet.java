package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example8;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 16:32
 * @see
 */
public class EventSet {
    private Event[] events = new Event[100];
    private int index = 0;
    private int next = 0;
    public void add(Event e) {
        if(index >= events.length)
            return; // (In real life, throw exception)
        events[index++] = e;
    }
    public Event getNext() {
        boolean looped = false;
        int start = next;
        do {
            next = (next + 1) % events.length;
// See if it has looped to the beginning:
            if(start == next) looped = true;
// If it loops past start, the list
// is empty:
            if((next == (start + 1) % events.length)
                    && looped)
                return null;
        } while(events[next] == null);
          return events[next];
    }
    public void removeCurrent() {
        events[next] = null;
    }
}
