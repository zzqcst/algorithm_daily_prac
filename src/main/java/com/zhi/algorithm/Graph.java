package com.zhi.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
    int edgeNum;
    int nodeNum;
    int[][] mMatrix;

    /**
     * 迪杰斯特拉 单源最短路径
     *
     * @param start 起始点,从0开始的序号
     */
    public void dijkstra(int start) {
        this.mMatrix[start][start] = 0;
        int[] dist = new int[this.nodeNum];
        int[] visited = new int[this.nodeNum];
        for (int i = 0; i < this.nodeNum; i++) {//起始点到其它各点的初始距离
            dist[i] = this.mMatrix[start][i];
        }
        visited[start] = 1;
        for (int i = 0; i < this.nodeNum - 1; i++) {
            int min = Integer.MAX_VALUE, temp = 0;

            for (int j = 0; j < this.nodeNum; j++) {//每次找到距离起始点最近的一个顶点
                if (visited[j] != 1 && dist[j] < min) {
                    min = dist[j];
                    temp = j;
                }
            }
            visited[temp] = 1;
            for (int j = 0; j < this.nodeNum; j++) {//比较经由此点到其它点的距离
                if (this.mMatrix[temp][j] + dist[temp] < dist[j]) {
                    dist[j] = this.mMatrix[temp][j] + dist[temp];
                }
            }
        }
        System.out.printf("%d到各点的最短距离：\n", start);
        for (int i = 0; i < this.nodeNum; i++) {
            System.out.printf("%d->%d:%d\n", start, i, dist[i]);
        }
    }

    /**
     * 深度优先遍历
     *
     * @param start 起点
     */
    public void dfs(int start) {
        boolean[] visited = new boolean[this.nodeNum];
        dfs_core(start, visited);
    }

    private void dfs_core(int node, boolean[] visited) {
        if (visited[node]) {
            return;
        }
        System.out.println(node);
        visited[node] = true;
        for (int i = 0; i < this.nodeNum; i++) {
            if (!visited[i] && this.mMatrix[node][i] != 99999) {
                dfs_core(i, visited);
            }
        }
    }

    /**
     * 广度优先遍历
     *
     * @param start 起点
     */
    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[this.nodeNum];
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited[node]) {
                System.out.println(node);
            }
            visited[node] = true;
            for (int i = 0; i < this.nodeNum; i++) {
                if (!visited[i] && this.mMatrix[node][i] != 99999) {
                    System.out.println(i);
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入顶点数和边数：");
        Graph graph = new Graph();
        graph.nodeNum = scanner.nextInt();
        graph.edgeNum = scanner.nextInt();
        graph.mMatrix = new int[graph.nodeNum][graph.nodeNum];
        for (int i = 0; i < graph.nodeNum; i++) {
            for (int j = 0; j < graph.nodeNum; j++) {
                graph.mMatrix[i][j] = 99999;
            }
        }
        System.out.println("是否带权? 0/1");
        int we = scanner.nextInt();
        if (we == 1) {
            System.out.println("输入边的信息：(i j weight)");
            for (int i = 0; i < graph.edgeNum; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                graph.mMatrix[u][v] = w;
                graph.mMatrix[v][u] = w;
            }
        } else {
            System.out.println("输入边的信息：(i j)");
            for (int i = 0; i < graph.edgeNum; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                graph.mMatrix[u][v] = 1;
                graph.mMatrix[v][u] = 1;
            }
        }

//        System.out.println("输入起始点：");
//        int start = scanner.nextInt();
//        graph.dijkstra(start);

//        System.out.println("dfs遍历，输入起点");
//
//        graph.dfs(scanner.nextInt());
        System.out.println("bfs遍历，输入起点");
        graph.bfs(scanner.nextInt());

    }
}
