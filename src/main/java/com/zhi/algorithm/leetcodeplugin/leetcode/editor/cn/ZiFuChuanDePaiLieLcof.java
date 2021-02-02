package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个字符串，打印出该字符串中字符的所有排列。 
//
// 
//
// 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。 
//
// 
//
// 示例: 
//
// 输入：s = "abc"
//输出：["abc","acb","bac","bca","cab","cba"]
// 
//
// 
//
// 限制： 
//
// 1 <= s 的长度 <= 8 
// Related Topics 回溯算法 
// 👍 90 👎 0

import java.util.*;

/**
 * @author zhi
 */
public class ZiFuChuanDePaiLieLcof {
    public static void main(String[] args) {
        Solution solution = new ZiFuChuanDePaiLieLcof().new Solution();
        String[] dkjphedies = solution.permutation("dkjphedy");

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] permutation(String s) {
            int length = s.length();
            if (length == 0) {
                return new String[0];
            }
            Set<String> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                boolean[] visited = new boolean[length];
                visited[i] = true;
                char[] tmp = new char[length];
                tmp[0] = s.charAt(i);
                getRes(tmp, visited, 1, length, set, s);
            }
            String[] res = new String[set.size()];
            Iterator<String> iterator = set.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                res[i++] = iterator.next();
            }
            return res;
        }

        private void getRes(char[] tmp, boolean[] visited, int index, int length, Set<String> set, String s) {
            if (index == length) {
                set.add(new String(tmp));
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                if (visited[i]) continue;
                tmp[index] = s.charAt(i);
                visited[i] = true;
                getRes(tmp, visited, index + 1, length, set, s);
                visited[i] = false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}