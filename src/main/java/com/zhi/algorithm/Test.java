package com.zhi.algorithm;

import java.util.*;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = 0, m = 0;
//        while (scanner.hasNextInt()) {
//            n = scanner.nextInt();
//            m = scanner.nextInt();
//            int count = 0;
//            count = m / n;//最大面额数量
//            System.out.println(count + 1);
//        }
//        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();//总询问次数
//        while (q-- != 0) {
//            int l = scanner.nextInt();
//            int r = scanner.nextInt();
//            int len = r - l + 1;
//            if ((len & 1) == 0) {//偶数个数字
//                if ((r & 1) == 0) {//右端数字为偶数
//                    System.out.println(len / 2);
//                } else {
//                    System.out.println(-len / 2);
//                }
//            } else {
//                if ((r & 1) == 0) {//右端数字为偶数
//                    System.out.println(-len / 2 + r);
//                } else {
//                    System.out.println(len / 2 - r);
//                }
//            }
//        }

        /**
         * 把气球序列逐个放入队列当中，并记录当前队列中每种颜色出现的次数，并维护当前队列中颜色的总数。
         * 当队首的气球颜色数量大于1的时候，就应该出队。当队列中颜色的总数为m的时候，我们就更新答案为队列的长度，
         * 整个过程中队列长度最小值即为答案
         */
//        Scanner scanner = new Scanner(System.in);
//        int n = 0, m = 0;
//        n = scanner.nextInt();//开了n枪
//        m = scanner.nextInt();//m中颜色
//        while (scanner.hasNextInt()) {
//            Queue<Integer> queue = new LinkedList<>();
//            int res = Integer.MAX_VALUE;
//            int[] colors = new int[m + 1];
//            int colorcount = 0;//出现的颜色总数
//            for (int i = 1; i <= n; i++) {
//                int curcolor = scanner.nextInt();
//                queue.offer(curcolor);
//                colors[curcolor]++;
//                if (colors[curcolor] == 1) {//说明这个颜色第一次出现
//                    colorcount++;
//                }
//                while (colors[queue.peek()] > 1 || queue.peek() == 0) {
//                    colors[queue.peek()]--;
//                    if (colors[queue.peek()] == 0) {
//                        colorcount--;
//                    }
//                    queue.poll();
//                }
//                if (colorcount == m) {
//                    if (queue.size() < res) {
//                        res = queue.size();
//                    }
//                }
//            }
//            if (res != Integer.MAX_VALUE) {
//                System.out.println(res);
//            } else {
//                System.out.println(-1);
//            }
//            queue.clear();
//        }
        System.out.println(solve(3, 2));
    }

    /**
     * 动态规划，dp[i][j]为当前i张卡片，小Q得分为j的方案数
     * 转移方程：dp[i][j] = 2 * dp[i - 1][j]+dp[i - 1][j - 1]
     *
     * @param n
     * @param score
     * @return
     */
    public static int solve(int n, int score) {
        int m = (int) (1E9 + 7);
        int[][] dp = new int[n + 1][score + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= score; j++) {
                dp[i][j] = 2 * dp[i - 1][j];
                if (j > 0) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
        return dp[n][score];
    }

}
