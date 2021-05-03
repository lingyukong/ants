package com.kly.ants.thinking_in_java.object_contain_8.newcollections.example2;



import com.kly.ants.thinking_in_java.object_contain_8.newcollections.example1.Collection1;

import java.util.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  Iterator:
 *              hasNext() :如果仍有元素可以迭代，则返回 tru
 *              next() :返回迭代的下一个元素
 *              remove() :从迭代器指向的 collection 中移除迭代器返回的最后一个元素
 *              （单一方向遍历。）
 *  ListIterator: (与Iterator不同，他可以对列表进行增加)
 *    列表迭代器，允许程序员按任一方向遍历列表、迭代期间修改列表，并获得迭代器在列表中的当前位置。ListIterator 没有当前元素；它的光标位置 始终位于调用 previous() 所返回的元素和调用 next() 所返回的元素之间
 *               add(E e) :将指定的元素插入列表
 *               remove(): 删除当前游标所指向的元素
 *               set(E e) ：重新设置当前游标所指向的元素值
 *  List 也会生成一个ListIterator（列表迭代器），利用它可在一个列表里朝两个方向遍历，同时插入和删除位于列表中部的元素（同样地，只建议对 LinkedList这样做）
 *
 *
 *  ArrayList：  由一个数组后推得到的 List。作为一个常规用途的对象容器使用，用于替换原先的Vector。允
                许我们快速访问元素，但在从列表中部插入和删除元素时，速度却嫌稍慢。一般只应该用ListIterator对一
                个ArrayList 进行向前和向后遍历，不要用它删除和插入元素；与 LinkedList相比，它的效率要低许多

     LinkedList ：提供优化的顺序访问性能，同时可以高效率地在列表中部进行插入和删除操作，但在进行随机访问时，速度却相当慢，此时应换用 ArrayList
 * @author kly
 * @Date 2018/3/1 15:23
 * @see
 */
public class List1 {
    static boolean b;
    static Object o;
    static int i;
    static Iterator it;
    static ListIterator lit;

    // Wrap Collection1.fill() for convenience:
    public static List fill(List a) {
        return (List) Collection1.fill(a);
    }
    // You can use an Iterator, just as with a
    // Collection, but you can also use random
    // access with get():
    public static void print(List a) {
        for(int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println();
    }

    public static void print(ListIterator a) {
       while (a.hasNext()) {
           System.out.print(a.next() + " ");
       }
        System.out.println();

    }

    /**
     * 每个列表都能做的事情
     * @param a
     */
    public static void basicTest(List a) {
        a.add(1, "x"); // 在此列表中指定的位置插入指定的元素
        print(a);
        a.add("x"); // 将指定元素添加到此列表的结尾
        print(a);
        // Add a collection:
        a.addAll(fill(new ArrayList())); // 添加指定 collection 中的所有元素到此列表的结尾，顺序是指定 collection 的迭代器返回这些元素的顺序
        print(a);
        a.addAll(3, fill(new ArrayList())); // 将指定 collection 中的所有元素从指定位置开始插入此列表
        print(a);
        b = a.contains("1"); // Is it in there?
        System.out.println("a.contains(\"1\"):" + b);
        // Is the entire collection in there?
        b = a.containsAll(fill(new ArrayList()));
        System.out.println("a.containsAll:" + b);


        o = a.get(1); // Get object at location 1
        System.out.println("a.get(1):" + o);
        i = a.indexOf("1"); // 返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1
        System.out.println("a.indexOf(\"1\"):"+i);

        b = a.isEmpty(); // Any elements inside?
        System.out.println("a.isEmpty:" + b);

        it = a.iterator(); // Ordinary Iterator
        lit = a.listIterator(); // 返回此列表元素的列表迭代器（按适当顺序）
        lit = a.listIterator(3); // 返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始

        System.out.println("iterator start");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("iterator end");


        i = a.lastIndexOf("1"); //返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1
        System.out.println(" a.lastIndexOf(\"1\"):" + i);

        a.remove(1); // 移除列表中指定位置的元素（可选操作）
        print(a);
        a.remove("3"); // 从此列表中移除第一次出现的指定元素（如果存在）（可选操作）
        print(a);

        a.set(1, "y"); // Set location 1 to "y"
        print(a);
        a.retainAll(fill(new ArrayList())); // 仅在列表中保留指定 collection 中所包含的元素（可选操作）
        print(a);
        // Remove everything that's in the argument:
        a.removeAll(fill(new ArrayList()));//从列表中移除指定 collection 中包含的其所有元素（可选操作）
        print(a);
        i = a.size(); // How big is it?
        a.clear(); // Remove all elements
    }

    /**
     * 通过一个迭代器遍历
     * @param a
     * @param type
     */
    public static void iterMotion(List a,String type) {
        ListIterator it = a.listIterator();
        b = it.hasNext(); //以正向遍历列表时，如果列表迭代器有多个元素，则返回 true（换句话说，如果 next 返回一个元素而不是抛出异常，则返回 true）
        b = it.hasPrevious(); //如果以逆向遍历列表，列表迭代器有多个元素，则返回 true
        o = it.next();
        i = it.nextIndex();
        o = it.previous(); //返回列表中的前一个元素
        i = it.previousIndex();
    }

    /**
     * 通过迭代器改变某些东西
     * @param a
     */
    public static void iterManipulation(List a) {
        ListIterator it = a.listIterator();
        it.add("47"); //将指定的元素插入列表
        Object o = it.next();
        it.set("47"); //用指定元素替换 next 或 previous 返回的最后一个元素
        it.remove();
    }

    /**
     * 体验列表处理的效果
     * @param a
     */
    public static void testVisual(List a) {
        print(a);
        List b = new ArrayList();
        fill(b);
        System.out.print("b = ");
        print(b);
        a.addAll(b);
        a.addAll(fill(new ArrayList()));
        print(a);
        // Shrink the list by removing all the
        // elements beyond the first 1/2 of the list
        System.out.println(a.size());
        System.out.println(a.size()/2);
        print(a);
        // Insert, remove, and replace elements
        // using a ListIterator:
        ListIterator x = a.listIterator(a.size()/2);
        x.add("one");
        print(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        print(a);
        // Traverse the list backwards:
        x = a.listIterator(a.size());
        while(x.hasPrevious())
            System.out.print(x.previous() + " ");
        System.out.println();
        System.out.println("testVisual finished");
    }

    /**
     *  只有LinkedList才能做的事情
     */
    public static void testLinkedList() {
        LinkedList ll = new LinkedList();
        Collection1.fill(ll, 5);
        print(ll);
        // Treat it like a stack, pushing:
        ll.addFirst("one"); //将指定元素插入此列表的开头
        ll.addFirst("two");
        print(ll);
        // Like "peeking" at the top of a stack:
        System.out.println(ll.getFirst());
        // Like popping a stack:
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        // Treat it like a queue, pulling elements
        // off the tail end:
        System.out.println(ll.removeLast());
        // With the above operations, it's a dequeue!
        print(ll);
    }
    public static void main(String args[]) {
        // Make and fill a new list each time:
//        basicTest(fill(new LinkedList()));
        basicTest(fill(new ArrayList()));
//        iterMotion(fill(new LinkedList()) ,"LinkedList");
//        iterMotion(fill(new ArrayList()),"ArrayList");
        iterManipulation(fill(new LinkedList()));
//        iterManipulation(fill(new ArrayList()));
//        testVisual(fill(new LinkedList()));
//        testLinkedList();
    }
}
