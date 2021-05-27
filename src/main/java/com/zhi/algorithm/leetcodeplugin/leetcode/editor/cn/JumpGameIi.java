package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个非负整数数组，你最初位于数组的第一个位置。 
//
// 数组中的每个元素代表你在该位置可以跳跃的最大长度。 
//
// 你的目标是使用最少的跳跃次数到达数组的最后一个位置。 
//
// 假设你总是可以到达数组的最后一个位置。 
//
// 
//
// 示例 1: 
//
// 
//输入: [2,3,1,1,4]
//输出: 2
//解释: 跳到最后一个位置的最小跳跃数是 2。
//     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
// 
//
// 示例 2: 
//
// 
//输入: [2,3,0,1,4]
//输出: 2
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 1000 
// 0 <= nums[i] <= 105 
// 
// Related Topics 贪心算法 数组 
// 👍 989 👎 0

public class JumpGameIi {
    public static void main(String[] args) {
        Solution solution = new JumpGameIi().new Solution();
        solution.jump(new int[]{2, 1, 1, 1, 4});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int jump(int[] nums) {
            int end = 0;
            int maxPos = 0;
            int step = 0;
            //最后一步不用管
            for (int i = 0; i < nums.length - 1; i++) {
                //从当前位置起跳，能到达的最大位置
                maxPos = Math.max(maxPos, nums[i] + i);
                //到达上一跳最大位置后，可以得出上一个位置到当前位置之间的某个位置，下一跳能达到的最大位置
                if (i == end) {
                    end = maxPos;
                    step++;
                }
            }
            return step;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}