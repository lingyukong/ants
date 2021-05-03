package com.kly.ants.algorithm.stack;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/23 11:03
 */
public class LinkedIsCycle {

    public static boolean isCycle(Node head){
        Node p1= head;
        Node p2 = head;
        while(p1.next != null && p2.next!=null) {
            p1 = p1.next;
            p2 = p2.next.next;

            if(p1 == p2) {

                return true;
            }
        }
        return false;
    }


    public static int cycleLength(Node head){
        int firstlength = 0;
        int secondlength = 0;
        int times = 0;
        Node p1= head;
        Node p2 = head;
        boolean first = true;
        while(p1.next != null && p2.next!=null) {
            times++;
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2) {
                if(!first) {//第二次相遇
                    secondlength = times;
                    return secondlength - firstlength;
                }
                firstlength = times;
                first = false;
            }
        }
        return 0;
    }

    private static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data= data;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(3);
        Node node3 = new Node(7);
        Node node4 = new Node(2);
        Node node5 = new Node(6);
        Node node6 = new Node(8);
        Node node7 = new Node(1);

        node1.next =node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node5.next = node6;
        node6.next = node7;
        node7.next = node4;

        System.out.println(isCycle(node1));
        System.out.println(cycleLength(node1));

    }
}
