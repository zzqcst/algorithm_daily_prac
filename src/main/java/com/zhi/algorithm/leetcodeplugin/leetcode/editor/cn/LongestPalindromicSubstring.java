package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 
// 👍 3271 👎 0

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        solution.longestPalindrome("babad");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int max = 0;

        int start = 0, end = 0;

        public String longestPalindrome(String s) {
            for (int i = 0; i < s.length(); i++) {
                getLen(s, i, i);
                getLen(s, i, i + 1);
            }
            return s.substring(start, end + 1);
        }

        private void getLen(String s, int i, int j) {
            if (i < 0 || j >= s.length()) {
                return;
            }
            if (s.charAt(i) == s.charAt(j)) {
                if (j - i > max) {
                    start = i;
                    end = j;
                    max = j - i;
                }
                getLen(s, i - 1, j + 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}