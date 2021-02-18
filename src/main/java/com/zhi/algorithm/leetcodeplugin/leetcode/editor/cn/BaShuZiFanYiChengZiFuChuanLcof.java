package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可
//能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。 
//
// 
//
// 示例 1: 
//
// 输入: 12258
//输出: 5
//解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi" 
//
// 
//
// 提示： 
//
// 
// 0 <= num < 231 
// 
// 👍 183 👎 0

public class BaShuZiFanYiChengZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();
        solution.translateNum(25);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int cnt = 0;

        public int translateNum(int num) {
            if (num < 10) return 1;
            String numStr = String.valueOf(num);
            countLetters(numStr, 0);
            return cnt;
        }

        private void countLetters(String numStr, int index) {
            if (index == numStr.length()) {
                cnt++;
                return;
            }
            countLetters(numStr, index + 1);
            if (index + 2 <= numStr.length()) {
                int letter = Integer.parseInt(numStr.substring(index, index + 2));
                if (letter <= 25 && letter >= 10) {
                    countLetters(numStr, index + 2);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}