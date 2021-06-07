package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。 
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[[],[0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// nums 中的所有元素 互不相同 
// 
// Related Topics 位运算 数组 回溯算法 
// 👍 1208 👎 0

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            backTrack(0, new ArrayList<Integer>(), nums, res);
            return res;
        }

        private void backTrack(int index, List<Integer> lists, int[] nums, List<List<Integer>> res) {
            if (index == nums.length) {
                res.add(new ArrayList<>(lists));
                return;
            }
            //分为添加当前数字，和不添加当前数字的情况
            lists.add(nums[index]);
            backTrack(index + 1, lists, nums, res);
            lists.remove(lists.size() - 1);
            backTrack(index + 1, lists, nums, res);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}