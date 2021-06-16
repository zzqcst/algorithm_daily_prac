package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 1083 👎 0

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        int[] nums = new int[]{1, 2, 3, 0, 4};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            //j指向0位置
            int i=0,j=0;
            for (int num : nums) {
                //不等于0时，i,j都移动，等于0时，i向前移动，此时j停在0所在位置
                //i再次移动后，指向不为0，则交换i,j, 此时i,j向前移动，j依然指向0
                if (nums[i] != 0) {
                    nums[j] = (nums[i] + nums[j]) - (nums[i] = nums[j]);
                    i++;
                    j++;
                    continue;
                }
                i++;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}