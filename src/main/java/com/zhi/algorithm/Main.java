package com.zhi.algorithm;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.movingCount(0, 2, 2));
    }

    int res = 0;

    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        move(0, 0, threshold, rows, cols, visited);
        return res;
    }

    public void move(int i, int j, int threshold, int rows, int cols, boolean[][] visited) {
        if (i < 0 || j >= cols || i >= rows || j < 0 || visited[i][j]) {
            return;
        }
        if (can(i, j, threshold)) {
            res++;
            visited[i][j] = true;
            move(i + 1, j, threshold, rows, cols, visited);
            move(i - 1, j, threshold, rows, cols, visited);
            move(i, j - 1, threshold, rows, cols, visited);
            move(i, j + 1, threshold, rows, cols, visited);
        }
    }

    public boolean can(int i, int j, int threshold) {
        int res = 0;
        while (i > 0) {
            res += i % 10;
            i /= 10;
        }
        while (j > 0) {
            res += j % 10;
            j /= 10;
        }
        return res <= threshold;
    }
}