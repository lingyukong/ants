package com.kly.ants.thinking_in_java.object_contain_8.example5;

/**
 * <p>Description:
 *   重写根类的hashCode 和 equals 方法
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/25 15:58
 * @see
 */
public class Groundhog2 {
    int ghNumber;
    Groundhog2(int n) {
        ghNumber = n;
    }

    public int hashCode () {
        return ghNumber;
    }

    public boolean equals(Object o) {
        return (o instanceof  Groundhog2) && (ghNumber == ((Groundhog2)o).ghNumber);
    }

}
