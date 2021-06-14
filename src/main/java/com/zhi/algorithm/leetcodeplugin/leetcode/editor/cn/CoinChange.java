package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。 
//
// 你可以认为每种硬币的数量是无限的。 
//
// 
//
// 示例 1： 
//
// 
//输入：coins = [1, 2, 5], amount = 11
//输出：3 
//解释：11 = 5 + 5 + 1 
//
// 示例 2： 
//
// 
//输入：coins = [2], amount = 3
//输出：-1 
//
// 示例 3： 
//
// 
//输入：coins = [1], amount = 0
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：coins = [1], amount = 1
//输出：1
// 
//
// 示例 5： 
//
// 
//输入：coins = [1], amount = 2
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= coins.length <= 12 
// 1 <= coins[i] <= 231 - 1 
// 0 <= amount <= 104 
// 
// Related Topics 动态规划 
// 👍 1311 👎 0

import java.util.Arrays;

public class CoinChange{
  public static void main(String[] args) {
       Solution solution = new CoinChange().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
      public int coinChange(int[] coins, int amount) {
          if (amount == 0 || coins.length <= 0) {
              return 0;
          }
          int[] dp = new int[amount + 1];//dp[i]表示金额为i时，需要的硬币数
          Arrays.fill(dp, amount + 1);
          Arrays.sort(coins);
          for (int i = 1; i <= amount; i++) {
              for (int j = 0; j < coins.length; j++) {
                  if (i - coins[j] == 0) {
                      dp[i] = 1;
                  } else if (i - coins[j] > 0) {
                      // dp[i]有两种实现的方式，
                      // 一种是包含当前的coins[i],那么剩余钱就是 i-coins[i],这种操作要兑换的硬币数是 dp[i-coins[j]] + 1
                      // 另一种就是不包含，要兑换的硬币数是dp[i]
                      dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);//不要coin[j]和选了coins[j]中硬币数最少的
                  }
              }
          }
          return dp[amount] == amount+1 ? -1 : dp[amount];
      }
  }
//leetcode submit region end(Prohibit modification and deletion)

}