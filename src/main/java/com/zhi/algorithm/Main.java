package com.zhi.algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }

    /**
     * 输入: "babad"
     * 输出: "bab"
     * 注意: "aba" 也是一个有效答案。
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        return null;

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
