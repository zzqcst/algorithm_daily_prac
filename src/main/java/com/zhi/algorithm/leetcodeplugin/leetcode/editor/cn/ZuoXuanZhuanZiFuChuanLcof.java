package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数
//将返回左旋转两位得到的结果"cdefgab"。 
//
// 
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
//输出: "cdefgab"
// 
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6
//输出: "umghlrlose"
// 
//
// 
//
// 限制： 
//
// 
// 1 <= k < s.length <= 10000 
// 
// Related Topics 字符串 
// 👍 82 👎 0

public class ZuoXuanZhuanZiFuChuanLcof{
  public static void main(String[] args) {
       Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
//        String res = "";
//        for(int i = n; i < n + s.length(); i++)
//            res += s.charAt(i % s.length());
//        return res;
        if (n>=s.length()) return null;
        return s.substring(n) + s.substring(0, n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}