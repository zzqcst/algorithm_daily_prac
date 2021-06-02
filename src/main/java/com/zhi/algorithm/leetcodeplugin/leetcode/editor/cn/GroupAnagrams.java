package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串 
// 👍 749 👎 0

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new GroupAnagrams().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            //key是字母和次数的序列，例如aabcb,key为a2b2c
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                int[] count = new int[26];
                for (int i = 0; i < str.length(); i++) {
                    count[str.charAt(i) - 'a']++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    sb.append((char) (i + 'a')).append(count[i]);
                }
                List<String> each = map.getOrDefault(sb.toString(), new ArrayList<>());
                each.add(str);
                map.put(sb.toString(), each);
            }
            return new ArrayList<>(map.values());
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}