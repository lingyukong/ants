package com.kly.ants.thinking_in_java.polymorphism_7.inner_class.example8;

/**
 * <p>Description: </p>
 *
 * @author kly
 * @Date 2018/1/21 16:33
 * @see
 */
public class Controller {
    private EventSet es = new EventSet();
    public void addEvent(Event c) { es.add(c); }
    public void run() {
        Event e;
        while((e = es.getNext()) != null) {
            if(e.ready()) {
                e.action();
                System.out.println(e.description());
                es.removeCurrent();
            }
        }
    }
}
