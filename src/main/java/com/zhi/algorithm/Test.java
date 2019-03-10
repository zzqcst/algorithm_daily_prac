package com.zhi.algorithm;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            Map<Integer, Integer> map = new HashMap<>();
            //给a,b排序
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
                map.put(a[i], b[i]);
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                b[i] = map.get(a[i]);
            }

            int[] maxfromi = new int[n];
            maxfromi[n - 1] = b[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (b[i] > maxfromi[i + 1]) {
                    maxfromi[i] = b[i];
                } else {
                    maxfromi[i] = maxfromi[i + 1];
                }
            }

            int[] avaliIndex = new int[n];
            for (int i = 0; i < n; i++) {
                boolean can = false;
                int j = 1;
                if (i != 0) {
                    j = avaliIndex[i - 1];
                }
                for (; j < n && j > 0; j++) {
                    if (a[j] - a[i] >= d) {
                        avaliIndex[i] = j;
                        can = true;
                        break;
                    }
                }
                if (!can) {
                    avaliIndex[i] = -1;
                }
            }

            int max = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (avaliIndex[i] != -1) {
                    sum = b[i] + maxfromi[avaliIndex[i]];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
//        while (scanner.hasNext()) {
//            String s = scanner.nextLine();
//            s = s.toLowerCase();
//            char[] chars = s.toCharArray();
//            HashMap<Character, Integer> firstoccur = new HashMap<>();
//            List<Character> list = new ArrayList<>();
//            for (int i = 0; i < chars.length; i++) {
//                if (chars[i] > 'z' || chars[i] < 'a') {
//                    continue;
//                }
//                if (!firstoccur.containsKey(chars[i])) {
//                    firstoccur.put(chars[i], i);
//                    list.add(chars[i]);
//                } else if (firstoccur.get(chars[i]) + 1 < chars.length) {//如果字母不是第一次出现，判断是否大于第一次出现位置后一个字母
//                    if (chars[i] > chars[firstoccur.get(chars[i]) + 1]) {//如果大于第一次出现位置后的字母，则保留当前位置，移除第一次的位置
//                        list.remove((Character) chars[i]);
//                        list.add(chars[i]);
//                    }
//                }
//            }
//            if (list.isEmpty()) {
//                System.out.println(" ");
//            } else {
//                System.out.println(list.get(0));
//            }
//        }
//        while (scanner.hasNextInt()) {
//            int n = scanner.nextInt();//数组长度
//            int[] a = new int[n];
//            int[] b = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = scanner.nextInt();
//            }
//            for (int i = 0; i < n; i++) {
//                b[i] = scanner.nextInt();
//            }
//
//            Arrays.sort(a);
//            Arrays.sort(b);
//            int sum=0;
//            for (int i = 0; i < n; i++) {
//                sum += a[i] * b[n - i - 1];
//            }
//            System.out.println(sum);
//        }
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
