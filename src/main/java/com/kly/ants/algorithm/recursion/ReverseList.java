package com.kly.ants.algorithm.recursion;


import com.kly.ants.algorithm.recursion.bo.Node;

/**
 * Description:
 * Company:changyou
 *  反转单链表，这个还有问题 带研究
 * @author konglingyu
 * @Date 2020/1/3 9:20
 */
public class ReverseList {

    public static Node reverseList(Node node) {
        //当链表为空节点 或者链表只有一个节点的时候，不能进行反转
        if (node == null || node.next == null) {
            return node;
        }
        // 改变 1，2节点的指向。
        // 通过 head.next获取节点2
        Node t1  = node.next;
        // 让 2 的 next 指向 2
        t1.next = node;
        // 1 的 next 指向 null.
        node.next = null;
        return reverseList(node.next);
    }
}
