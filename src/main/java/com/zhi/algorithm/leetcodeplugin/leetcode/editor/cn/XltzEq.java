package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 本题中，将空字符串定义为有效的 回文串 。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串 
//
// 示例 2: 
//
// 
//输入: s = "race a car"
//输出: false
//解释："raceacar" 不是回文串 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
//
// 
//
// 
// 注意：本题与主站 125 题相同： https://leetcode-cn.com/problems/valid-palindrome/ 
//
// Related Topics 双指针 字符串 👍 70 👎 0

public class XltzEq {
    public static void main(String[] args) {
        Solution solution = new XltzEq().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0) {
                return true;
            }
            s = s.toLowerCase();
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (!isDigitOrLetter(s.charAt(i))) {
                    i++;
                    continue;
                }
                if (!isDigitOrLetter(s.charAt(j))) {
                    j--;
                    continue;
                }

                if (isDigitOrLetter(s.charAt(i)) && isDigitOrLetter(s.charAt(j))) {
                    if (s.charAt(i) == s.charAt(j)) {
                        i++;
                        j--;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }

        boolean isDigitOrLetter(char c) {
            return c >= '0' && c <= '9' || isLetter(c);
        }

        boolean isLetter(char c) {
            return c >= 'a' && c <= 'z' || (c >= 'A' && c <= 'Z');
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}