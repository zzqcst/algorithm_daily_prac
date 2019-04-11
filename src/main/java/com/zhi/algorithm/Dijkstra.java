package com.zhi.algorithm;

import java.util.Scanner;

public class Dijkstra {
    /**
     * @param v     起始点
     * @param graph 图
     */
    public void dijkstra(int v, Graph graph) {
        int[] dist = new int[graph.nodeNum];
        int[] visited = new int[graph.nodeNum];
        for (int i = 0; i < graph.nodeNum; i++) {//起始点到其它各点的初始距离
            dist[i] = graph.mMatrix[v][i];
        }
        visited[v] = 1;
        for (int i = 0; i < graph.nodeNum; i++) {
            int min = Integer.MAX_VALUE, temp = 0;
            for (int j = 0; j < graph.nodeNum; j++) {//每次找到距离起始点最近的一个顶点
                if (visited[j] != 1 && dist[j] < min) {
                    min = dist[j];
                    temp = j;
                }
            }
            visited[temp] = 1;
            for (int j = 0; j < graph.nodeNum; j++) {//比较由此点到其它点的距离
                if (graph.mMatrix[temp][j] + dist[temp] < dist[j]) {
                    dist[j] = graph.mMatrix[temp][j] + dist[temp];
                }
            }
        }
        System.out.printf("%d到各点的最短距离：\n", v);
        for (int i = 0; i < graph.nodeNum; i++) {
            System.out.printf("%d->%d:%d\n", v, i, dist[i]);
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
        System.out.println("输入边的信息：(i j weight)");
        for (int i = 0; i < graph.edgeNum; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.mMatrix[u][v] = w;
        }
        System.out.println("输入起始点：");
        int start = scanner.nextInt();
        graph.mMatrix[start][start] = 0;
        Dijkstra dij = new Dijkstra();
        dij.dijkstra(start, graph);
    }
}

class Graph {
    int edgeNum;
    int nodeNum;
    int[][] mMatrix;
}
