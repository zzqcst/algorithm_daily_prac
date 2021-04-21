package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics 数组 双指针 
// 👍 3221 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhi
 */
public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int target = -nums[i];

                int j = i + 1, k = nums.length - 1;
                while (j < k) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        j++;
                        continue;
                    }
                    if (nums[j] + nums[k] < target) {
                        j++;
                        continue;
                    } else if (nums[j] + nums[k] > target) {
                        k--;
                        continue;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                    j++;

                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}