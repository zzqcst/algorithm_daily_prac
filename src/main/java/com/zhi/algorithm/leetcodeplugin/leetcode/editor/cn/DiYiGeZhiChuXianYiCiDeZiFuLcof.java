package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表 
// 👍 72 👎 0

import java.util.HashMap;
import java.util.Map;

public class DiYiGeZhiChuXianYiCiDeZiFuLcof {
    public static void main(String[] args) {
        Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            Map<Character, Integer> map = new HashMap<>();
            char c = ' ';
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (map.get(c) == 1) {
                    return c;
                }
            }
            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}