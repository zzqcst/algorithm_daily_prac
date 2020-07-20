package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// 👍 29 👎 0

public class TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        if (s==null||s.length()==0) return s;
        int spaceCnt =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceCnt++;
            }
        }
        char[] chars = new char[s.length()+spaceCnt*2];
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') {
                chars[j++]='%';
                chars[j++]='2';
                chars[j++]='0';
            }else {
                chars[j++]=s.charAt(i);
            }
        }
        return new String(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
