package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。 
//
// 示例 1： 
//
// 输入: s = "leetcode"
//输出: false 
// 
//
// 示例 2： 
//
// 输入: s = "abc"
//输出: true
// 
//
// 限制： 
// 
// 0 <= len(s) <= 100 
// 如果你不使用额外的数据结构，会很加分。 
// 
// Related Topics 数组 
// 👍 101 👎 0

public class IsUniqueLcci {
    public static void main(String[] args) {
        Solution solution = new IsUniqueLcci().new Solution();
        System.out.println('a' - 'Z');
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isUnique(String s) {
            int mark = 0;
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'A';
                int offset = 1 << index;
                if ((mark & offset) != 0) {
                    return false;
                }
                mark |= offset;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}