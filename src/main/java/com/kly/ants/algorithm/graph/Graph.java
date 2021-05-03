package com.kly.ants.algorithm.graph;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * Company:changyou
 *   图的邻接表  表示法
 *     前提是：假设知道顶点之间的关联关系
 *   0 -> 1 2 3
 *   1 -> 2
 *   2 -> 1 3
 *   3 -> 0
 *
 * @author konglingyu
 * @Date 2021/1/12 17:39
 */
public class Graph {
    private int size;
    private Vertex[] vertex;
    private LinkedList<Integer>[] adj;  //创建LinkedList类型的数组，有多少个顶点，就需要创建多少个LinkedList,adj是邻接单词的缩写


    //创建内部类 表示顶点信息
    public static class Vertex {
        int data;

        Vertex(int data) {
            this.data = data;
        }
    }


    Graph(int size){
        this.size = size;
        vertex = new Vertex[size];
        adj = new LinkedList[size]; //有多少个顶点就创建多少个链表
        for(int i=0;i<size;i++) {
            vertex[i] = new Vertex(i);
            adj[i] = new LinkedList<>();
        }
    }

    /**
     * 广度优先遍历（BFS） stat是指数组的位置
     * @param graph
     * @param start
     */
    public static void bfs(Graph graph,int start){
        boolean[] visited = new boolean[graph.size];
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(start);
        while(!queue.isEmpty()){
            int front = queue.poll();
            if(visited[front]) {
                continue;
            }
            System.out.println(graph.vertex[front].data);
            visited[front] = true;
            for(int index:graph.adj[front]) {
                queue.offer(index);
            }
        }
    }


    /**
     * 深度优先遍历
     * @param graph
     * @param start
     * @param visited
     */
    public static void dfs(Graph graph, int start, boolean[] visited) {
        System.out.println(graph.vertex[start].data);
        visited[start] = true;
        for(int index : graph.adj[start]){
            if(!visited[index]){
                dfs(graph, index, visited);
            }
        }
    }




    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.adj[0].add(1);

        graph.adj[1].add(0);


        graph.adj[2].add(1);



//        graph.adj[4].add(2);
//        graph.adj[4].add(5);
//
//        graph.adj[5].add(2);
//        graph.adj[5].add(4);
//        graph.adj[5].add(8);
//
//        graph.adj[6].add(3);
//        graph.adj[6].add(7);
//        graph.adj[6].add(8);
//
//        graph.adj[7].add(3);
//        graph.adj[7].add(6);
//
//        graph.adj[8].add(5);
//        graph.adj[8].add(6);

        System.out.println("图的广度优先遍历");
        bfs(graph, 1);

    }

}
