package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。 
//
// 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,0,2,1,1,0]
//输出：[0,0,1,1,2,2]
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,0,1]
//输出：[0,1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[0]
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
// n == nums.length 
// 1 <= n <= 300 
// nums[i] 为 0、1 或 2 
// 
//
// 
//
// 进阶： 
//
// 
// 你可以不使用代码库中的排序函数来解决这道题吗？ 
// 你能想出一个仅使用常数空间的一趟扫描算法吗？ 
// 
// Related Topics 排序 数组 双指针 
// 👍 906 👎 0

public class SortColors {
    public static void main(String[] args) {
        Solution solution = new SortColors().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void sortColors(int[] nums) {
            int head = 0, tail = nums.length - 1;
            int temp = 0;
            for (int i = 0; i <= tail; i++) {
                //发现2，就交换到尾部，用while是因为后面元素还没遍历到，交换过来的可能还是2
                while (i < tail && nums[i] == 2) {
                    temp = nums[i];
                    nums[i] = nums[tail];
                    nums[tail] = temp;
                    tail--;
                }
                //发现1，交换到头部,用if时因为是从头部遍历过来的，之前的0已经换到头部了
                if (nums[i] == 0) {
                    temp = nums[i];
                    nums[i] = nums[head];
                    nums[head] = temp;
                    head++;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}