package com.kly.ants.algorithm.tree.binarytree;



import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/1/9 18:01
 */
public class BinaryTreeByStack {

    private static class TreeNode{
        Integer data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode (Integer data) {
            this.data = data;
        }
    }

    /**
     * 构建二叉树
     */
    public static TreeNode createBinaryTree(LinkedList list) {
        TreeNode node  = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = (Integer) list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

    /**
     * 前序遍历
     * @param node
     */
    public static void preOrderTraveralWithStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (node == null) {
            return;
        }
        TreeNode treeNode = node;
        while(treeNode != null || !stack.isEmpty()) {
            while(treeNode != null) {
                System.out.print(treeNode.data+",");
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }

            // 要进行回溯
            if(!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.rightChild;
            }

        }
    }

    /**
     * 中序遍历
     */
    public static void inOrderTraversalWithStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (node == null) {
            return ;
        }
        TreeNode treeNode = node;
        while(treeNode != null || !stack.isEmpty()) {
            while(treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }
            // 要进行回溯
            if(!stack.isEmpty()) {
                treeNode = stack.pop();
                System.out.print(treeNode.data + ",");
//                System.out.println("testtest" + treeNode.data);
                treeNode = treeNode.rightChild;
            }

        }

    }

    /**
     * 后序遍历
     */
    public static void postOrderTraversalWithStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> stackPop = new Stack<TreeNode>();

        if (node == null) {
            return;
        }
        TreeNode treeNode = node;
        //两者之一表示遍历还没有结束，应该继续遍历
        while(treeNode!=null || !stack.isEmpty()) {
            while(treeNode != null) {
                stack.push(treeNode);
                stackPop.push(treeNode);
                treeNode = treeNode.rightChild;
            }
            if(!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.leftChild;
            }
        }

        while (stackPop.size() > 0) {
            System.out.print(stackPop.pop().data + ",");
        }
    }


    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{3,2,9,null,null,10,null,null,8,null,4,}));
        TreeNode treeNode = createBinaryTree(inputList);
        preOrderTraveralWithStack(treeNode);
        System.out.println();
        inOrderTraversalWithStack(treeNode);
        System.out.println();
        postOrderTraversalWithStack(treeNode);
    }
}
