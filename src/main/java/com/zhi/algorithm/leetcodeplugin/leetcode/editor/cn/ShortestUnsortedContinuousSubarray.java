package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。 
//
// 请你找出符合题意的 最短 子数组，并输出它的长度。 
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：nums = [2,6,4,8,10,9,15]
//输出：5
//解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4]
//输出：0
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//
// 进阶：你可以设计一个时间复杂度为 O(n) 的解决方案吗？ 
// 
// 
// Related Topics 数组 
// 👍 549 👎 0

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        Solution solution = new ShortestUnsortedContinuousSubarray().new Solution();
        System.out.println(solution.findUnsortedSubarray(new int[]{1, 2, 3, 4}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            //找到不满足顺序的区间，左边刚出现降序的位置，和右边刚出现降序的位置
            //例如[2,6,4,8,10,9,15]，左边的4是刚出现降序的位置，右边的10是刚出现降序的位置
            //用flag标记，表示从这个位置开始，找这个区间内的最大值和最小值
            //然后从左边开始，找到第一个比最小值大的数，这个位置就是左边界
            //从右边开始，找到第一个比最大值小的数，这个位置就是右边界
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            boolean flag = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1])
                    flag = true;
                if (flag)
                    min = Math.min(min, nums[i]);
            }
            flag = false;
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] > nums[i + 1])
                    flag = true;
                if (flag)
                    max = Math.max(max, nums[i]);
            }
            int l, r;
            for (l = 0; l < nums.length; l++) {
                if (min < nums[l])
                    break;
            }
            for (r = nums.length - 1; r >= 0; r--) {
                if (max > nums[r])
                    break;
            }
            //例如[1,2,3,4]的情况，最终r=-1,l=nums.length，这种情况返回0
            return r - l < 0 ? 0 : r - l + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}