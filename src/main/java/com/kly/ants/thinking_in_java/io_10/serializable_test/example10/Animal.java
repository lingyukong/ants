package com.kly.ants.thinking_in_java.io_10.serializable_test.example10;

import java.io.Serializable;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/4/19 9:35
 * @see
 */
public class Animal implements Serializable {
    public String name;
    public House preferredHouse;

    public Animal(String n,House h) {
       this.name = n;
       this.preferredHouse = h;
    }

    public String toString() {
        return name + ":" + super.toString() + ":" + preferredHouse + "\n";
    }

}
