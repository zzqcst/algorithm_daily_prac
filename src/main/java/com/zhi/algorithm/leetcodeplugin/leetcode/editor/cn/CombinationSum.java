package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1： 
//
// 输入：candidates = [2,3,6,7], target = 7,
//所求解集为：
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2： 
//
// 输入：candidates = [2,3,5], target = 8,
//所求解集为：
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都是独一无二的。 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯算法 
// 👍 1364 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            Arrays.sort(candidates);
            getSum(candidates, target, 0, res, new ArrayList<Integer>());
            return res;
        }

        private void getSum(int[] candidates, int target, int start, List<List<Integer>> res, ArrayList<Integer> temp) {
            if (target == 0) {
                res.add(new ArrayList<>(temp));
                return;
            }
            //以数组不同位置数字开始遍历
            //例如1,2,3,3,4,5,6  target:6
            //从第一个数字开始，每次下一个数字只能是自身及自身之后的数
            //遍历添加的顺序举例
            //[1,1,1,1,1,1]
            //[1,1,1,1,1,2]
            //[1,1,1,1,1,3]...
            for (int i = start; i < candidates.length; i++) {
                //剪枝，和当前数字相加大于目标值
                if (candidates[i] > target) {
                    return;
                }
                temp.add(candidates[i]);
                //下一层继续从当前数字往后找
                getSum(candidates, target - candidates[i], i, res, temp);
                //该层当前数字遍历完后，换下一个继续找
                temp.remove(temp.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}