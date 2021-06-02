package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 回溯算法 
// 👍 1369 👎 0

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            findAll(nums, 0, new ArrayList<Integer>(), res);
            return res;
        }

        private void findAll(int[] nums, int count, List<Integer> level, List<List<Integer>> res) {
            if (count == nums.length) {
                res.add(new ArrayList<>(level));
                return;
            }
            for (int num : nums) {
                if (!level.contains(num)) {
                    level.add(num);
                    findAll(nums, count + 1, level, res);
                    level.remove(level.size() - 1);
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}