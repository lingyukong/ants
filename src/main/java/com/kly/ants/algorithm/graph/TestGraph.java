package com.kly.ants.algorithm.graph;



import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/3/4 15:26
 */
public class TestGraph {

    private int size;
    private Vertex[] vertex;
    private LinkedList<Integer>[] adj;


    public TestGraph(int size) {
        this.size =size;
        vertex = new Vertex[size];
        adj = new LinkedList[size];
        for(int i=0;i<size;i++) {
            vertex[i] = new Vertex(i);
            adj[i] = new LinkedList<>();
        }

    }

    private static class Vertex{
        int data;
        public Vertex(int data){
            this.data = data;
        }
    }

    public static void bfs(TestGraph graph,int start){
        boolean[] visited = new boolean[graph.size];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        while(!queue.isEmpty()) {
            int front = queue.poll();
            if(visited[front]){
                continue;
            }
            System.out.println(front);
            visited[front] = true;
            for(int index : graph.adj[front]){
                queue.offer(index);
            }
        }
    }

    public static void dfs(TestGraph graph,int start,boolean[] visited){
        System.out.println(graph.vertex[start].data);
        visited[start] = true;
        for(int index : graph.adj[start]) {
            if(!visited[index]) {
                dfs(graph,index,visited);
            }
        }

    }
}
