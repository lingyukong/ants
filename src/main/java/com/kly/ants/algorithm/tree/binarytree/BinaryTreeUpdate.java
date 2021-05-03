package com.kly.ants.algorithm.tree.binarytree;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * Company:changyou
     *请实现一个函数实现蛇形打印二叉树，即第一行从左到右的顺序打印，第二行从右到左顺序打印，第三行从左到右…….
     *        10
     *    6      13
     * 3   8   11  16
     * ....
     * 上图二叉树打印结果为
     * 10
     * 13 6
     * 3 8 11 16
     * ....
 * @author konglingyu
 * @Date 2021/3/5 15:12
 */
public class BinaryTreeUpdate {

    public static class TreeNode{
        public int data;
        public TreeNode leftChild;
        public TreeNode rightChild;

        public TreeNode (int data){
            this.data = data;
        }
    }

    public static void levleTraversalUpdate(TreeNode node) throws Exception {
        System.out.println();
        boolean isInversal = false;
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        if(null == node){
            return;
        }
        deque.offer(node);
        while(!deque.isEmpty()){
            TreeNode nodeT = null;
            int nodeSize = deque.size();
            if(isInversal){
                for(int i =0; i<nodeSize;i++){
                    nodeT = deque.pollLast();
                    System.out.print(nodeT.data + ",");
                    if(null != nodeT.rightChild){
                        deque.offerFirst(nodeT.rightChild);
                    }
                    if(null!= nodeT.leftChild){
                        deque.offerFirst(nodeT.leftChild);
                    }
                    isInversal = false;
                }
            }else {
                for(int i =0; i<nodeSize;i++){
                    nodeT = deque.pollFirst();
                    System.out.print(nodeT.data + ",");
                    if(null != nodeT.leftChild){
                        deque.offer(nodeT.leftChild);
                    }
                    if(null != nodeT.rightChild){
                        deque.offer(nodeT.rightChild);
                    }
                    isInversal = true;
                }
            }
        }
    }




    public static void levelTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(node == null) {
            return;
        }
        queue.offer(node);
        while(!queue.isEmpty()) {
            TreeNode nodeTemp = queue.poll();
            System.out.print(nodeTemp.data+",");
            if(null != nodeTemp.leftChild) {
                queue.add(nodeTemp.leftChild);
            }
            if(null != nodeTemp.rightChild) {
                queue.add(nodeTemp.rightChild);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        TreeNode node = new TreeNode(10);
        TreeNode n11 = new TreeNode(6);
        TreeNode n12 = new TreeNode(13);
        TreeNode n21 = new TreeNode(3);
        TreeNode n22 = new TreeNode(8);
        TreeNode n31 = new TreeNode(11);
        TreeNode n32 = new TreeNode(16);
        node.leftChild = n11;
        node.rightChild = n12;
        n11.leftChild = n21;
        n11.rightChild = n22;
        n12.leftChild = n31;
        n12.rightChild = n32;

        levelTraversal(node);
        levleTraversalUpdate(node);
    }



}
