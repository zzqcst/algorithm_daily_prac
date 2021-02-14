package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，
//等等。 
//
// 请写一个函数，求任意第n位对应的数字。 
//
// 
//
// 示例 1： 
//
// 输入：n = 3
//输出：3
// 
//
// 示例 2： 
//
// 输入：n = 11
//输出：0 
//
// 
//
// 限制： 
//
// 
// 0 <= n < 2^31 
// 
//
// 注意：本题与主站 400 题相同：https://leetcode-cn.com/problems/nth-digit/ 
// Related Topics 数学 
// 👍 85 👎 0

public class ShuZiXuLieZhongMouYiWeiDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ShuZiXuLieZhongMouYiWeiDeShuZiLcof().new Solution();
        System.out.println(solution.findNthDigit(10));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findNthDigit(int n) {
            long num = n;

            long size = 1;
            long max = 9;
            //不用考虑0的情况，各个区间内下标从1开始
            while (n > 0) {
                //判断不在当前位数内
                if (num - max * size > 0) {
                    num = num - max * size;
                    size++;
                    max = max * 10;
                } else {
                    long count = num / size;
                    //从左往右第几个数字，从1开始
                    long left = num % size;
                    if (left == 0) {
                        //left为0，表示上一个数的最后一位
                        int actualNumber = (int) (Math.pow(10, size - 1) + count-1);
                        return actualNumber % 10;
                    } else {
                        int actualNumber = (int) (Math.pow(10, size - 1) + count);
                        int rightRemove = (int) Math.pow(10, (size - left));
                        //除以10取整，表示右移一位，right表示需要右移多少位，将目标数字放到个位，最后除以10取余得到个位，即目标数字
                        return actualNumber / rightRemove % 10;
                    }
                }
            }

            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}