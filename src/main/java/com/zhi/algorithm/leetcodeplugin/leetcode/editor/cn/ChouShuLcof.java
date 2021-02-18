package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。 
//
// 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//
// 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/ 
// Related Topics 数学 
// 👍 116 👎 0

public class ChouShuLcof {
    public static void main(String[] args) {
        Solution solution = new ChouShuLcof().new Solution();
        solution.nthUglyNumber(10);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int nthUglyNumber(int n) {
            int[] uglyNums = new int[n];
            uglyNums[0] = 1;
            int currIndex = 1;
            int pre2 = 0, pre3 = 0, pre5 = 0;
            while (currIndex < n) {
                int min = Math.min(Math.min(uglyNums[pre2] * 2, uglyNums[pre3] * 3), uglyNums[pre5] * 5);
                uglyNums[currIndex] = min;
                while (uglyNums[pre2] * 2 <= uglyNums[currIndex]) {
                    pre2++;
                }
                while (uglyNums[pre3] * 3 <= uglyNums[currIndex]) {
                    pre3++;
                }
                while (uglyNums[pre5] * 5 <= uglyNums[currIndex]) {
                    pre5++;
                }
                currIndex++;
            }
            return uglyNums[n - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}