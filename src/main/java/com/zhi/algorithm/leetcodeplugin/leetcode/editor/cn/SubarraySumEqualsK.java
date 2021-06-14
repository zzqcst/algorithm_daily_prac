package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。 
//
// 示例 1 : 
//
// 
//输入:nums = [1,1,1], k = 2
//输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
// 
//
// 说明 : 
//
// 
// 数组的长度为 [1, 20,000]。 
// 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。 
// 
// Related Topics 数组 哈希表 
// 👍 946 👎 0

public class SubarraySumEqualsK{
  public static void main(String[] args) {
       Solution solution = new SubarraySumEqualsK().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
  public class Solution {
      public int subarraySum(int[] nums, int k) {
          int count = 0;
          for (int start = 0; start < nums.length; ++start) {
              int sum = 0;
              for (int end = start; end >= 0; --end) {
                  sum += nums[end];
                  if (sum == k) {
                      count++;
                  }
              }
          }
          return count;
      }
  }

//leetcode submit region end(Prohibit modification and deletion)

}