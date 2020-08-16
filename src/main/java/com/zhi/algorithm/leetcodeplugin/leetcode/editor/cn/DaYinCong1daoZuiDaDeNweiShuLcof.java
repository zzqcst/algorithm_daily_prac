package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。 
//
// 示例 1: 
//
// 输入: n = 1
//输出: [1,2,3,4,5,6,7,8,9]
// 
//
// 
//
// 说明： 
//
// 
// 用返回一个整数列表来代替打印 
// n 为正整数 
// 
// Related Topics 数学 
// 👍 44 👎 0

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhi
 */
public class DaYinCong1daoZuiDaDeNweiShuLcof {
    public static void main(String[] args) {
        Solution solution = new DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] printNumbers(int n) {
            int max = (int) (Math.pow(10, n) - 1);
            int[] res = new int[max];
            for (int i = 1; i <= max; i++) {
                res[i - 1] = i;
            }
            return res;
        }

        private void doPrintNumbers(char[] num, int index, int n, List<Integer> list) {
            if (index == n) {
                list.add(Integer.valueOf(String.valueOf(num)));
                return;
            }
            for (int i = 0; i < 10; i++) {
                num[index] = (char) ('0' + i);
                doPrintNumbers(num, index + 1, n, list);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}