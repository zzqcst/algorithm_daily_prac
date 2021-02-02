package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 
//
// 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
//输出: 2 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/ 
//
// 
// Related Topics 位运算 分治算法 
// 👍 59 👎 0

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhi
 */
public class ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof().new Solution();
        solution.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] array) {
            int x = 0, votes = 0, count = 0;
            for (int i : array) {
                if (votes == 0) {
                    x = i;
                }
                votes += x == i ? 1 : -1;
            }
            int half = array.length / 2;
            for (int i : array) {
                if (i == x) count++;
                if (count > half) {
                    return x;
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}