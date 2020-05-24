package com.zhi.algorithm;


import java.util.Scanner;

public class Main {

    //美丽的项链
    //https://www.nowcoder.com/questionTerminal/e7e0230b12de4239a7f547a01d731522?source=relative
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int n = scanner.nextInt();
//            int m = scanner.nextInt();
//            Node[] nodes = new Node[n];
//            for (int i = 0; i < n; i++) {
//                int start = scanner.nextInt();
//                int end = scanner.nextInt();
//                nodes[i] = new Node(start, end);
//            }
//            long[][] dp = new long[n + 1][m + 1];
////            初始化，只有一种宝珠选择的情况
//            for (int i = nodes[0].start; i <= nodes[0].end; i++) {
//                dp[1][i] = 1;
//            }
//            for (int i = 2; i <= n; i++) {
//                for (int j = 1; j <= m; j++) {
////                    选择该宝珠，可以从最小数量变化到最大数量
//                    for (int k = nodes[i - 1].start; k <= nodes[i - 1].end && j - k >= 0; k++) {
//                        dp[i][j] += dp[i - 1][j - k];
//                    }
//                }
//            }
//            System.out.println(dp[n][m]);
//        }
//    }
//
//    private static class Node {
//        int start, end;
//
//        public Node(int start, int end) {
//            this.start = start;
//            this.end = end;
//        }
//    }
}