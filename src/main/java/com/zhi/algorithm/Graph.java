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
     * 迪杰斯特拉算法
     *
     * @param graph 0表示自己，Integer.MAX_VALUE表示两点不可达
     * @param start 起始点
     * @return 起始点到其余各点最近距离
     */
    public static int[] dijkstra(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        visited[start] = true;
        int[] dis = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dis[i] = graph[start][i];
        }
        while (true) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            //先找能直接到达的最近的点
            for (int i = 0; i < dis.length; i++) {
                if (!visited[i]) {
                    if (dis[i] < min) {
                        index = i;
                        min = dis[i];
                    }
                }
            }
            if (index == -1) break;
            visited[index] = true;
            //以能直接到的最近的点为跳板，求往其它点的最小距离
            for (int i = 0; i < graph.length; i++) {
                if (graph[index][i] != Integer.MAX_VALUE) {
                    dis[i] = dis[i] < (min + graph[index][i]) ? dis[i] : min + graph[index][i];
                }
            }
        }
        return dis;
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
        int[][] matrix = new int[graph.nodeNum][graph.nodeNum];
        for (int i = 0; i < graph.nodeNum; i++) {
            for (int j = 0; j < graph.nodeNum; j++) {
                if (i != j)
                    matrix[i][j] = Integer.MAX_VALUE;
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
                matrix[u][v] = w;
                matrix[v][u] = w;
            }
        } else {
            System.out.println("输入边的信息：(i j)");
            for (int i = 0; i < graph.edgeNum; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                matrix[u][v] = 1;
                matrix[v][u] = 1;
            }
        }

        System.out.println("bfs遍历，输入起点");
        graph.bfs(scanner.nextInt());

    }
}
