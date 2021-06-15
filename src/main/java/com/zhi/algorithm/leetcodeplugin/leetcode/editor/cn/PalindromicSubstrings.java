package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。 
//
// 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。 
//
// 
//
// 示例 1： 
//
// 输入："abc"
//输出：3
//解释：三个回文子串: "a", "b", "c"
// 
//
// 示例 2： 
//
// 输入："aaa"
//输出：6
//解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa" 
//
// 
//
// 提示： 
//
// 
// 输入的字符串长度不会超过 1000 。 
// 
// Related Topics 字符串 动态规划 
// 👍 605 👎 0

import com.zhi.algorithm.codes.LeetCode;

/**
 * @author zhi
 */
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Solution solution = new PalindromicSubstrings().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSubstrings(String s) {
            // 中心扩展法
            int ans = 0;
            for (int center = 0; center < 2 * s.length() - 1; center++) {
                // left和right指针和中心点的关系是？
                // 首先是left，有一个很明显的2倍关系的存在，其次是right，可能和left指向同一个（偶数时），也可能往后移动一个（奇数）
                // 大致的关系出来了，可以选择带两个特殊例子进去看看是否满足。
                int left = center / 2;
                int right = left + center % 2;

                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    ans++;
                    left--;
                    right++;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}