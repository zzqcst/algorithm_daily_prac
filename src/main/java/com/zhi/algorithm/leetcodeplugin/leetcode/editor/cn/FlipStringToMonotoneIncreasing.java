package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
/*
如果一个由 '0' 和 '1' 组成的字符串，是以一些 '0'（可能没有 '0'）后面跟着一些 '1'（也可能没有 '1'）的形式组成的，那么该字符串是单调
递增的。

 我们给出一个由字符 '0' 和 '1' 组成的字符串 S，我们可以将任何 '0' 翻转为 '1' 或者将 '1' 翻转为 '0'。

 返回使 S 单调递增的最小翻转次数。



 示例 1：

 输入："00110"
输出：1
解释：我们翻转最后一位得到 00111.


 示例 2：

 输入："010110"
输出：2
解释：我们翻转得到 011111，或者是 000111。


 示例 3：

 输入："00011000"
输出：2
解释：我们翻转得到 00000000。




 提示：


 1 <= S.length <= 20000
 S 中只包含字符 '0' 和 '1'

 Related Topics 数组
*/

public class FlipStringToMonotoneIncreasing{
  public static void main(String[] args) {
       Solution solution = new FlipStringToMonotoneIncreasing().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minFlipsMonoIncr(String S) {
        //左边翻转1的数量加上右边翻转0的数量
        //枚举每一个位置
        char[] chars = S.toCharArray();
        int[] oneCnt = new int[chars.length+1];//oneCnt[i]表示[0,i)范围内1的数量
        for (int i = 0; i < chars.length; i++) {
            oneCnt[i+1]=oneCnt[i]+chars[i]-'0';
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= chars.length; i++) {
            res=Math.min(res, oneCnt[i]+chars.length-i-(oneCnt[chars.length]-oneCnt[i]));
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}