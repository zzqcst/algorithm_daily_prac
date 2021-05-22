package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c +
// d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
//
// 注意：答案中不可以包含重复的四元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,0,-1,0,-2,2], target = 0
//输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [], target = 0
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 200 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// 
// Related Topics 数组 哈希表 双指针 
// 👍 857 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhi
 */
public class FourSum {
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            int len = nums.length;
            if (nums == null || nums.length < 4)
                return ans;
            Arrays.sort(nums);
            for (int i = 0; i < len - 3; i++) {
                if (i != 0 && nums[i] == nums[i - 1])
                    continue;
                if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
                    break;
                if (nums[i] + nums[len - 1] + nums[len - 2] + nums[len - 3] < target)
                    continue;
                for (int j = i + 1; j < len - 2; j++) {
                    if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
                        break;
                    if (j != i + 1 && nums[j] == nums[j - 1] || nums[i] + nums[j] + nums[len - 1] + nums[len - 2] < target)
                        continue;
                    int left = j + 1;
                    int right = len - 1;
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (left != j + 1 && nums[left] == nums[left - 1] || sum < target) {
                            left++;
                        } else if (right != len - 1 && nums[right] == nums[right + 1] || sum > target) {
                            right--;
                        } else {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            left++;
                            right--;
                        }
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}