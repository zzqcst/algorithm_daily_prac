package com.zhi.algorithm;

import java.util.Scanner;

import com.zhi.algorithm.JZofferPrac.TreeNode;

public class Main {
    public static void main(String[] args) {

    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int[] in, int lstart, int lend, int rstart, int rend) {
        if (lstart > lend || rstart > rend) {
            return null;
        }
        TreeNode root = new TreeNode(pre[lstart]);//前序遍历第一个是根节点
        int count = 0;//表示左子树节点数量
        int i = rstart;
        for (; i <= rend; i++) {//遍历中序遍历
            if (in[i] == pre[lstart]) {//中序遍历中，根节点之前的是左子树，之后的是右子树
                count = i - rstart;
                break;
            }
        }
        //推导出左右子树各自的前序遍历和中序遍历
        root.left = reConstructBinaryTree(pre, in, lstart + 1, lstart + count, rstart, i - 1);
        root.right = reConstructBinaryTree(pre, in, lstart + count + 1, lend, i + 1, rend);
        return root;
    }

    /**
     * 分糖果
     *
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return -1;
        }
        int[] L = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            L[i] = 1;
        }
        for (int i = 1; i <= ratings.length; i++) {
            if (i == ratings.length) {
                if (ratings[0] > ratings[ratings.length - 1] && L[0] <= L[ratings.length - 1]) {
                    L[0] = L[ratings.length - 1] + 1;
                }
                break;
            }
            if (ratings[i] > ratings[i - 1]
                    && L[i] <= L[i - 1]) {
                L[i] = L[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i == ratings.length - 1) {
                if (ratings[ratings.length - 1] > ratings[0]
                        && L[ratings.length - 1] <= L[0]) {
                    L[ratings.length - 1] = L[0] + 1;
                }
                continue;
            }
            if (ratings[i] > ratings[i + 1]
                    && L[i] <= L[i + 1]) {
                L[i] = L[i + 1] + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < L.length; i++) {
            sum += L[i];
        }
        return sum;
    }

    private static void zjtd2() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                String a = scanner.next();
                //去除三个
                StringBuilder sbuilder = new StringBuilder();
                char last = ' ';
                int count = 0;
                for (int j = 0; j < a.length(); j++) {
                    if (last == a.charAt(j)) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if (count < 2) {
                        sbuilder.append(a.charAt(j));
                        last = a.charAt(j);
                    }
                }
                last = ' ';
                count = 0;
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < sbuilder.length(); j++) {
                    if (last == sbuilder.charAt(j)) {
                        count++;
                    } else if (count == 1) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if (count < 3) {
                        stringBuilder.append(sbuilder.charAt(j));
                        last = sbuilder.charAt(j);
                    }
                }
                System.out.println(stringBuilder.toString());
            }
        }
    }

    private static void zjtd1() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int rest = 1024 - n;//需要找的零钱
            int count = 0;//硬币数
            count += rest / 64;
            rest = rest - rest / 64 * 64;
            count += rest / 16;
            rest = rest - rest / 16 * 16;
            count += rest / 4;
            rest = rest - rest / 4 * 4;
            count += rest;
            System.out.println(count);
        }
    }

    /**
     * 找到两个数组的中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (((len1 + len2) & 1) == 0) {//长度偶数
            int mid = (len1 + len2 - 1) / 2;
            int i = 0, j = 0;
            int index = 0;
            int count = 0;
            while (i < len1 && j < len2) {
                if (nums1[i] < nums2[j]) {
                    if (index == mid) {
                        count += nums1[i];
                    }
                    if (index == mid + 1) {
                        count += nums1[i];
                        return count / 2.0;
                    }
                    i++;
                } else {
                    if (index == mid) {
                        count += nums2[j];
                    }
                    if (index == mid + 1) {
                        count += nums2[j];
                        return count / 2.0;
                    }
                    j++;
                }
                index++;
            }
            if (index <= mid || index <= mid + 1) {
                while (i < len1) {
                    if (index == mid) {
                        count += nums1[i];
                    }
                    if (index == mid + 1) {
                        count += nums1[i];
                    }
                    i++;
                    index++;
                }
                while (j < len2) {
                    if (index == mid) {
                        count += nums2[j];
                    }
                    if (index == mid + 1) {
                        count += nums2[j];
                    }
                    j++;
                    index++;
                }
            }
            return count / 2.0;
        } else {//长度奇数
            int mid = (len1 + len2 - 1) / 2;
            int i = 0, j = 0;
            int index = 0;
            while (i < len1 && j < len2) {
                if (nums1[i] < nums2[j]) {
                    if (index == mid) {
                        return nums1[i];
                    }
                    i++;
                } else {
                    if (index == mid) {
                        return nums2[j];
                    }
                    j++;
                }
                index++;
            }
            if (index <= mid) {
                while (i < len1) {
                    if (index == mid) {
                        return nums1[i];
                    }
                    i++;
                    index++;
                }
                while (j < len2) {
                    if (index == mid) {
                        return nums2[j];
                    }
                    j++;
                    index++;
                }
            }

        }
        return 0;
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
        boolean[][] dp = new boolean[len][len];//dp[i][j]：i到j是否是回文子串
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
