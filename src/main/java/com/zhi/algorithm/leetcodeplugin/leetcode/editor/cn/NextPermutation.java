package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。 
//
// 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。 
//
// 必须 原地 修改，只允许使用额外常数空间。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,1]
//输出：[1,2,3]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,1,5]
//输出：[1,5,1]
// 
//
// 示例 4： 
//
// 
//输入：nums = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 100 
// 
// Related Topics 数组 
// 👍 1129 👎 0
//https://leetcode-cn.com/problems/next-permutation/solution/xia-yi-ge-pai-lie-by-leetcode-solution/
public class NextPermutation{
  public static void main(String[] args) {
       Solution solution = new NextPermutation().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
      public void nextPermutation(int[] nums) {
          int i = nums.length - 2;
          //从后往前寻找较小数，第一个顺序对(i,i+1)，满足nums[i]<nums[i+1],此时i+1...n是下降序列
          while (i >= 0 && nums[i] >= nums[i + 1]) {
              i--;
          }
          if (i >= 0) {
              int j = nums.length - 1;
              //从后向前寻找较大数，由于i+1...n是下降序列，第一个大于nums[i]的是较大数
              while (j >= 0 && nums[i] >= nums[j]) {
                  j--;
              }
              //交换两个数
              swap(nums, i, j);
          }
          //把i位置之后的变为升序，由于i+1...n是下降序列，直接双指针交换
          reverse(nums, i + 1);
      }

      public void swap(int[] nums, int i, int j) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
      }

      public void reverse(int[] nums, int start) {
          int left = start, right = nums.length - 1;
          while (left < right) {
              swap(nums, left, right);
              left++;
              right--;
          }
      }

}
//leetcode submit region end(Prohibit modification and deletion)

}