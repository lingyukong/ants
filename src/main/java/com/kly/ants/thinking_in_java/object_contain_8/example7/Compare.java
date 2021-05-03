package com.kly.ants.thinking_in_java.object_contain_8.example7;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  将那些“要发生变化的东西”封装在内
 * @author kly
 * @Date 2018/2/28 10:11
 * @see
 */
public interface Compare {

    boolean lessThan(Object lhs, Object rhs);
    boolean lessThanOrEqual(Object lhs, Object rhs);
}
