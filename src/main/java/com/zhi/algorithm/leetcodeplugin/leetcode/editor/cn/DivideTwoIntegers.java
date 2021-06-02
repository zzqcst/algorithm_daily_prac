package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。 
//
// 返回被除数 dividend 除以除数 divisor 得到的商。 
//
// 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2 
//
// 
//
// 示例 1: 
//
// 输入: dividend = 10, divisor = 3
//输出: 3
//解释: 10/3 = truncate(3.33333..) = truncate(3) = 3 
//
// 示例 2: 
//
// 输入: dividend = 7, divisor = -3
//输出: -2
//解释: 7/-3 = truncate(-2.33333..) = -2 
//
// 
//
// 提示： 
//
// 
// 被除数和除数均为 32 位有符号整数。 
// 除数不为 0。 
// 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231, 231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。 
// 
// Related Topics 数学 二分查找 
// 👍 578 👎 0

public class DivideTwoIntegers{
  public static void main(String[] args) {
       Solution solution = new DivideTwoIntegers().new Solution();
      solution.divide(10, 2);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
      public int divide(int dividend, int divisor) {
          long first = dividend;
          long second = divisor;
          int sign = 1;
          if (first < 0) {
              first = -first;
              sign = -sign;
          }
          if (second < 0) {
              second = -second;
              sign = -sign;
          }
          long count = 0;
          //倍增法
          //first每次减去倍数个second，知道
          while (first >= second) {
              long tmp = second;
              long i = 1;
              while (first >= tmp) {
                  first -= tmp;
                  count += i;
                  //每次tmp变为原来的两倍
                  tmp <<= 1;
                  //i个tmp，i也增倍
                  i <<= 1;
              }
          }
          return count > Integer.MAX_VALUE ? (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE) : (int) ((sign > 0) ? count : -count);
      }
}
//leetcode submit region end(Prohibit modification and deletion)

}