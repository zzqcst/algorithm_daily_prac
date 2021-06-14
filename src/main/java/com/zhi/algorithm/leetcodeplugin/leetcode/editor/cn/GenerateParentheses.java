package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
//
// 1 <= n <= 8 
// 
// Related Topics 字符串 回溯算法 
// 👍 1796 👎 0

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        solution.generateParenthesis(3);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            //左括号右括号各有n个
            gen("", res, n, n);
            return res;
        }

        public void gen(String s, List<String> res, int left, int right) {
            //匹配了左括号才能匹配右括号，即left总比right先减1
            if (left > right) {
                return;
            }
            if (left > 0) {
                gen(s + "(", res, left - 1, right);
            }
            if (right > 0) {
                gen(s + ")", res, left, right - 1);
            }
            if (left == 0 && right == 0) {
                res.add(s);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}