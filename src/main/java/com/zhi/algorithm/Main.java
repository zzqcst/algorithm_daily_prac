package com.zhi.algorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int V = in.nextInt();
        int[] p = new int[N + 1];
        int[] w = new int[N + 1];
        int[] dp = new int[V + 1];//dp[i]背包容量为i时最大价值, dp[i]=max(dp[i],dp[i-w[i]]+p[i]) 不装第i个，和装第i个的最大值
        for (int i = 1; i <= N; i++) {
            w[i] = in.nextInt();  //需容量
            p[i] = in.nextInt();  //需价格
        }

        for (int i = 1; i <= N; i++) {
            for (int j = V; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + p[i]);//不选,选
            }
        }
        System.out.println(dp[V]);
    }
}