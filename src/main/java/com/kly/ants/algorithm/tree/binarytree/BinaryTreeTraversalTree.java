package com.kly.ants.algorithm.tree.binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/12 9:59
 */
public class BinaryTreeTraversalTree {
    private static class TreeNode{
        public Integer data;
        public TreeNode leftChild;
        public TreeNode rightChild;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static void preOrderTraversal(TreeNode node) {
        if(null == node) {
            return;
        }
        System.out.print(node.data + ",");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }


    public static void levelTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(node == null) {
            return;
        }
        queue.offer(node);
        while(!queue.isEmpty()) {
            TreeNode nodeTemp = queue.remove();
            System.out.print(nodeTemp.data+",");
            if(null != nodeTemp.leftChild) {
                queue.add(nodeTemp.leftChild);
            }
            if(null != nodeTemp.rightChild) {
                queue.add(nodeTemp.rightChild);
            }
        }
    }

    public static TreeNode createBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if(null == list || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if(null != data) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList(Arrays.asList(new Integer[]{3,2,9,null,null,10,null,null,8,null,4}));
        TreeNode node = createBinaryTree(list);
        preOrderTraversal(node);
        System.out.println();
        levelTraversal(node);
    }

}
