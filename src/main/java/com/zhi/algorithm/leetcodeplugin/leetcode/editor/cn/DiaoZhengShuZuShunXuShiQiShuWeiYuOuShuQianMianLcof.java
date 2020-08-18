package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 
//
// 
//
// 示例： 
//
// 输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50000 
// 1 <= nums[i] <= 10000 
// 
// 👍 40 👎 0

/**
 * @author zhi
 */
public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        solution.exchange(new int[]{1, 2, 3, 5});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //奇数和偶数的相对位置可以改变，双指针
        public int[] exchange(int[] nums) {
            int i = 0;
            int j = nums.length - 1;
            while (i < j) {
                while (i < j && (nums[i] & 1) == 1) {
                    i++;
                }
                while (i < j && (nums[j] & 1) == 0) {
                    j--;
                }
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}