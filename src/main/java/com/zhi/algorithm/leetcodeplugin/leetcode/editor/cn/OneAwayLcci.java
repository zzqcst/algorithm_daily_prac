package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。 
//
// 
//
// 示例 1: 
//
// 输入: 
//first = "pale"
//second = "ple"
//输出: True 
//
// 
//
// 示例 2: 
//
// 输入: 
//first = "pales"
//second = "pal"
//输出: False
// 
// Related Topics 字符串 动态规划 
// 👍 65 👎 0

/**
 * @author zhi
 */
public class OneAwayLcci {
    public static void main(String[] args) {
        Solution solution = new OneAwayLcci().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean oneEditAway(String first, String second) {
            if (first.length() < second.length()) {
                String tmp = first;
                first = second;
                second = tmp;
            }
            if (first.length() - second.length() > 1) {
                return false;
            }
            if (second.length() == 0) {
                return true;
            }
            if (first.length() == second.length()) {
                int diffCnt = 0;
                for (int i = 0; i < first.length(); i++) {
                    if (first.charAt(i) != second.charAt(i)) {
                        diffCnt++;
                    }
                }
                if (diffCnt > 1) {
                    return false;
                }
            } else {
                int i = 0, j = 0;
                while (i < first.length() && j < second.length()) {
                    if (first.charAt(i) != second.charAt(j)) {
                        j--;
                    }
                    i++;
                    j++;
                }
                return j == second.length();
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}