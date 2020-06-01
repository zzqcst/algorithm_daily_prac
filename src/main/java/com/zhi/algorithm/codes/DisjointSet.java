package com.zhi.algorithm.codes;

/**
 * 并查集
 * <p>
 * 并查集由一个整数型的数组和两个函数构成。数组pre[]记录了每个点的前导点是什么，函数find是查找，函数join是合并。
 */
public class DisjointSet {
    private int[] pre;
    private int[] rank;

    public DisjointSet(int n) {
        pre = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
            rank[i] = 1;
        }
    }

    public void init(int[] pre) {
        this.pre = pre;
    }

    public int find_pre(int x) {
        if (pre[x] == x) {
            return x;
        }
        return pre[x] = find_pre(pre[x]);//路径压缩
    }

    boolean is_same(int x, int y) {
        return find_pre(x) == find_pre(y);
    }

    void join(int x, int y) {
        int rootx, rooty;
        rootx = find_pre(x);
        rooty = find_pre(y);
        if (rootx == rooty) {
            return;
        }
        if (rank[rootx] > rank[rooty]) {//rootx的深度大于rooty的深度，将rootx设为rooty的根节点，可以降低树的高度
            pre[rooty] = rootx;
        } else {
            if (rank[rootx] == rank[rooty]) {
                rank[rooty]++;
            }
            pre[rootx] = rooty;
        }
    }


}
