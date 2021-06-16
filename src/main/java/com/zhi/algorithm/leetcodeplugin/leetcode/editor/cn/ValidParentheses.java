package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2453 👎 0

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack1 = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((c == ')' || c == '}' || c == ']') && stack1.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack1.peek() == '(') {
                    stack1.pop();
                    continue;
                }
                if (c == '}' && stack1.peek() == '{') {
                    stack1.pop();
                    continue;
                }
                if (c == ']' && stack1.peek() == '[') {
                    stack1.pop();
                    continue;
                }
                stack1.push(c);
            }
            return stack1.isEmpty();
        }
//        private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
//            put('{','}'); put('[',']'); put('(',')'); put('?','?');
//        }};
//        public boolean isValid(String s) {
//            if(s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
//            LinkedList<Character> stack = new LinkedList<Character>() {{ add('?'); }};
//            for(Character c : s.toCharArray()){
//                if(map.containsKey(c)) stack.addLast(c);
//                else if(map.get(stack.removeLast()) != c) return false;
//            }
//            return stack.size() == 1;
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}