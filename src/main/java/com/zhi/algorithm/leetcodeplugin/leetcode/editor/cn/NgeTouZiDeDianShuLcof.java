package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。 
//
// 
//
// 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
// 
//
// 示例 2: 
//
// 输入: 2
//输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0
//.05556,0.02778] 
//
// 
//
// 限制： 
//
// 1 <= n <= 11 
// 👍 170 👎 0

public class NgeTouZiDeDianShuLcof {
    public static void main(String[] args) {
        Solution solution = new NgeTouZiDeDianShuLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double[] dicesProbability(int n) {
            double[][] dp = new double[n + 1][6 * n + 1];
            for (int i = 1; i <= 6; i++) {
                dp[1][i] = (double) 1 / 6;
            }
            for (int i = 2; i <= n; i++) {
                //i个骰子和最小为i，j从i开始；最大和为6*i
                for (int j = i; j <= 6 * i; j++) {
                    for (int k = 1; k <= 6; k++) {
                        if (j <= k) {
                            continue;
                        }
                        //一个骰子点数为k的概率乘以其它骰子点数和为j-k的概率，所以k不能大于等于j
                        dp[i][j] += dp[1][k] * dp[i - 1][j - k];
                    }
                }
            }
            //投掷 n 个骰子，那么就会有 n 个面朝上，这 n 个朝上的面的点数之和 s 的最大值是 6n，最小值是 n。
            //故投掷 n 个骰子，s 一共有 6n - n + 1 个可能的值（所以题目所要我们返回的浮点数组的大小就是 n * 6 - n + 1。
            double[] res = new double[5 * n + 1];
            int id = n;
            for (int i = 0; i < res.length; i++) {
                res[i] = dp[n][id++];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}