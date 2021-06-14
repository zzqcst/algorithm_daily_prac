package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。 
//
// 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。 
//
// 你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,4,2,2]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,1,3,4,2]
//输出：3
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,1]
//输出：1
// 
//
// 示例 4： 
//
// 
//输入：nums = [1,1,2]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 105 
// nums.length == n + 1 
// 1 <= nums[i] <= n 
// nums 中 只有一个整数 出现 两次或多次 ，其余整数均只出现 一次 
// 
//
// 
//
// 进阶： 
//
// 
// 如何证明 nums 中至少存在一个重复的数字? 
// 你可以设计一个线性级时间复杂度 O(n) 的解决方案吗？ 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 1242 👎 0

public class FindTheDuplicateNumber{
  public static void main(String[] args) {
       Solution solution = new FindTheDuplicateNumber().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
      public int findDuplicate(int[] nums) {
          //等同判断是否有环
          //慢指针走一步slow=slow.next 相当于本题slow = nums[slow]
          //快指针走两步fast=fast.next.next, 相当于fast = nums[fast];fast=nums[fast]=>fast = nums[nums[fast]]
          int slow = nums[0];
          int fast = nums[nums[0]];
          while(slow != fast){
              slow = nums[slow];
              fast = nums[nums[fast]];
          }

          slow = 0;
          while(slow != fast){
              slow = nums[slow];
              fast = nums[fast];
          }
          return slow;
      }
}
//leetcode submit region end(Prohibit modification and deletion)

}