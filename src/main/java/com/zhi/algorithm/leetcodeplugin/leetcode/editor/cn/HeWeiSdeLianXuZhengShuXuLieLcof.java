package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// 👍 215 👎 0

import java.util.ArrayList;
import java.util.List;

public class HeWeiSdeLianXuZhengShuXuLieLcof {
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
        solution.findContinuousSequence(1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] findContinuousSequence(int target) {
            int small = 1, big = 2;
            int mid = target / 2;
            int sum = small + big;
            List<List<Integer>> res = new ArrayList<>();
            while (small <= mid) {
                if (sum == target) {
                    res.add(getOneAns(small, big));
                }
                while (sum > target && small <= mid) {
                    sum -= small;
                    small++;
                    if (sum == target) {
                        res.add(getOneAns(small, big));
                    }
                }
                big++;
                sum += big;
            }
            int[][] ans = new int[res.size()][];
            for (int i = 0; i < res.size(); i++) {
                int[] temp = new int[res.get(i).size()];
                for (int j = 0; j < res.get(i).size(); j++) {
                    temp[j] = res.get(i).get(j);
                }
                ans[i] = temp;
            }
            return ans;
        }

        private List<Integer> getOneAns(int small, int big) {
            List<Integer> list = new ArrayList<>();
            for (int i = small; i <= big; i++) {
                list.add(i);
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}