package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。 
//
// 
//
// 示例 1: 
//
// 输入: [10,2]
//输出: "102" 
//
// 示例 2: 
//
// 输入: [3,30,34,5,9]
//输出: "3033459" 
//
// 
//
// 提示: 
//
// 
// 0 < nums.length <= 100 
// 
//
// 说明: 
//
// 
// 输出结果可能非常大，所以你需要返回一个字符串而不是整数 
// 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0 
// 
// Related Topics 排序 
// 👍 156 👎 0

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class BaShuZuPaiChengZuiXiaoDeShuLcof {
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();
        System.out.println(solution.minNumber(new int[]{128,12}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minNumber(int[] nums) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    String a = o1 + "" + o2;
                    String b = o2 + "" + o1;
                    if (a.compareTo(b) > 0) {
                        return 1;
                    }
                    return -1;
                }
            });
            for (int num : nums) {
                queue.offer(num);
            }
            StringBuilder bs = new StringBuilder();
            while (!queue.isEmpty()) {
                bs.append(queue.poll());
            }
            return bs.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}