package com.kly.ants.algorithm.tree.binarytree;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/1/5 14:14
 */
public class BinaryTreeByRecursion {


    /**
     * 定义一个二叉树，包含node根节点及左右子树
     */
    private static class TreeNode {
        public Integer node ;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int node) {
            this.node = node;
        }
    }

    public static TreeNode createBinaryTree(LinkedList list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = (Integer)list.removeFirst();
        //这步的判空比较重要，是递归的结束条件
        if(data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }


    /**
     * 前序遍历，根节点，左子树，右子树
     * @param node
     */
    public static void preOrderTraversal(TreeNode node) {
        if(node == null) {
            return ;
        }
        System.out.print(node.node + ",");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    /**
     * 中序遍历 左子树，根节点，右子树
     * @param node
     */
    public static void inOrderTraversal(TreeNode node){
        if(node == null) {
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.print(node.node + ",");
        inOrderTraversal(node.rightChild);
    }


    /**
     * 广度优先遍历，顺序遍历
     * @param node
     */
    public static void levelOrderTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        while(!queue.isEmpty()) {
            TreeNode data = queue.poll();
            System.out.print(data.node + ",");
            if(null != data.leftChild) {
                queue.offer(data.leftChild);
            }
            if(null != data.rightChild){
                queue.offer(data.rightChild);
            }
        }
    }





    public static void postOrderTraversal(TreeNode node) {
        if(node == null) {
            return ;
        }
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.println(node.node);
    }





    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{3,2,9,null,null,10,null,null,8,null,4,}));
        TreeNode treeNode = createBinaryTree(inputList);
        preOrderTraversal(treeNode);
        System.out.println();
//        inOrderTraversal(treeNode);
        levelOrderTraversal(treeNode);
//        System.out.println("-------------------------------------------");
//        inOrderTraversal(treeNode);
    }
}
