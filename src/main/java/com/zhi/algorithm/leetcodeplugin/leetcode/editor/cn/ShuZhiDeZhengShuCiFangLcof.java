package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数
//问题。 
//
// 
//
// 示例 1: 
//
// 输入: 2.00000, 10
//输出: 1024.00000
// 
//
// 示例 2: 
//
// 输入: 2.10000, 3
//输出: 9.26100
// 
//
// 示例 3: 
//
// 输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25 
//
// 
//
// 说明: 
//
// 
// -100.0 < x < 100.0 
// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。 
// 
//
// 注意：本题与主站 50 题相同：https://leetcode-cn.com/problems/powx-n/ 
// Related Topics 递归 
// 👍 58 👎 0

/**
 * @author zhi
 */
public class ShuZhiDeZhengShuCiFangLcof {
    public static void main(String[] args) {
        Solution solution = new ShuZhiDeZhengShuCiFangLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double base, int exponent) {
            if (base == 0 && exponent < 0) {
                return 0;
            }
            if (exponent < 0) {
                if (exponent == Integer.MIN_VALUE) {
                    return 1 / powerwithzex(base, Integer.MAX_VALUE) * 1 / base;
                }
                return 1 / powerwithzex(base, -exponent);
            }
            return powerwithzex(base, exponent);
        }

        private double powerwithzex(double base, int exponent) {
            if (exponent == 0) {
                return 1;
            }
            if (exponent == 1) {
                return base;
            }
            //a^n = {a^(n/2) * a^(n/2) n为偶数时；a^[(n-1）/2] * a^[(n-1）/2])*a n位奇数时}
            double res = powerwithzex(base, exponent >> 1);
            res *= res;
            if ((exponent & 1) == 1) {
                res *= base;
            }
            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}