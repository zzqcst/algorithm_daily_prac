package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
// Related Topics 哈希表 字符串 
// 👍 46 👎 0

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhi
 */
public class PalindromePermutationLcci {
    public static void main(String[] args) {
        Solution solution = new PalindromePermutationLcci().new Solution();
        solution.canPermutePalindrome("AaBb//a");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPermutePalindrome(String s) {
            long high = 0;
            long low = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > 63) {
                    high ^= 1L << (s.charAt(i) - 64);
                } else {
                    low ^= 1L << s.charAt(i);
                }
            }
            return Long.bitCount(high) + Long.bitCount(low) <= 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}