package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。 
//
// 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 12
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：n = 13
//输出：6 
//
// 
//
// 限制： 
//
// 
// 1 <= n < 2^31 
// 
//
// 注意：本题与主站 233 题相同：https://leetcode-cn.com/problems/number-of-digit-one/ 
// Related Topics 数学 
// 👍 125 👎 0

public class OneNzhengShuZhong1chuXianDeCiShuLcof{
  public static void main(String[] args) {
       Solution solution = new OneNzhengShuZhong1chuXianDeCiShuLcof().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countDigitOne(int n) {
        //1~9 1
        //10- 19 10
        //20 -99 8
        //100-199 = 1-99 +n-100
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}