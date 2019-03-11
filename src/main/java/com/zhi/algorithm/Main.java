package com.zhi.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});
    }

    /**
     * 回文子串的个数
     *
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        boolean[][] dp = new boolean[len][len];
        int count = 0;
        for (int i = len - 2; i >= 0; i--) {
            dp[i][i] = true;
            count++;
            for (int j = i + 1; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i < 3) || dp[i + 1][j - 1]);
                if (dp[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 最长重复子序列
     * c[i][j]表示A中第i个元素之前和B中j个元素之前的子序列公共长度
     *
     * @param A
     * @param B
     * @return
     */
    public int findLength(int[] A, int[] B) {
        int l1 = A.length;
        int l2 = B.length;
        if (l1 == 0 || l2 == 0) {
            return 0;
        }
        int[][] c = new int[l1][l2];
        int max = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (A[i] == B[j]) {
                    if (i == 0 || j == 0) {
                        c[i][j] = 1;
                    } else
                        c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Math.max(j == 0 ? 0 : c[i][j - 1], i == 0 ? 0 : c[i - 1][j]);
                }
                if (c[i][j] > max) {
                    max = c[i][j];
                }
            }
        }
        return max;
    }

    /**
     * 最长回文子串
     * 输入: "babad"
     * 输出: "bab"
     * 注意: "aba" 也是一个有效答案。
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 0) {
            return s;
        }
        boolean[][] dp = new boolean[len][len];
        int left = 0;
        int right = 0;
        for (int i = len - 2; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i < 3) || dp[i + 1][j - 1]);
                if (dp[i][j] && (j - i > right - left)) {
                    right = j;
                    left = i;
                }
            }
        }
        return s.substring(left, right + 1);

    }

    private static void second() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();//要买的可乐总数
            int m = in.nextInt();//小美要喝的可乐数
            int k = in.nextInt();//小团要喝的可乐数
            int[][] kuaile = new int[k][2];//k种可乐对各自的快乐程度
            int temp1 = 0;
            int index1 = 0;
            int temp2 = 0;
            int index2 = 0;
            for (int i = 0; i < k; i++) {
                kuaile[i][0] = in.nextInt();
                if (kuaile[i][0] > temp1) {
                    temp1 = kuaile[i][0];
                    index1 = i;
                }
                kuaile[i][1] = in.nextInt();
                if (kuaile[i][1] > temp2) {
                    temp2 = kuaile[i][1];
                    index2 = i;
                }
            }
            //找到使小美快乐程度最大的可乐种类，买m瓶，
            if (m > n / 2) {//小美喝的多
                for (int i = 0; i < k; i++) {
                    if (i == index1) {
                        System.out.print(n + " ");
                    } else System.out.print(0 + " ");
                }
            } else {
                for (int i = 0; i < k; i++) {
                    if (i == index2) {
                        System.out.print(n + " ");
                    } else System.out.print(0 + " ");
                }
            }
        }
    }

    private static void codeMFirst() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] prices = new int[n][2];//价格，是否满减
            int[][] manjian = new int[m][2];//满多少，减多少
            float total = 0f;
            float tj_total = 0f;
            float tj_yh = 0f;
            for (int i = 0; i < n; i++) { //接受价格和满减信息
                prices[i][0] = in.nextInt();
                prices[i][1] = in.nextInt();
                total += prices[i][0];
                tj_yh += prices[i][1] * 0.2 * prices[i][0];
            }
            tj_total = total - tj_yh;
            for (int i = 0; i < m; i++) {//接受满多少，减多少
                manjian[i][0] = in.nextInt();
                manjian[i][1] = in.nextInt();
            }

            float mj_total = total;
            for (int i = m - 1; i >= 0; i--) {
                if (total >= manjian[i][0]) { //找到满足的满减最大金额
                    if (total - manjian[i][1] < mj_total)
                        mj_total = total - manjian[i][1];
                }
            }
            if (tj_total <= mj_total && m != 0) {
                System.out.printf("%.2f\n", tj_total);
            } else {
                System.out.printf("%.2f\n", mj_total);
            }
        }
    }
}
