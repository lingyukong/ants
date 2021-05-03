package com.kly.ants.algorithm.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/12/25 16:39
 */
public class TestTreeNode {


    //定义一棵树
    private static class TreeNode {
        public Integer data;
        public TreeNode leftChild;
        public TreeNode rightChild;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }


    //层序遍历
    public void LevelTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode childNode = queue.poll();
            System.out.println(childNode.data);
            if (null != childNode.leftChild) {
                queue.offer(node.leftChild);
            }
            if(null != childNode.rightChild) {
                queue.offer(node.rightChild);
            }
        }

    }
}
