package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。 
//
// 
//
// 示例 1: 
//
// 输入: [7,5,6,4]
//输出: 5 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
// 👍 316 👎 0

public class ShuZuZhongDeNiXuDuiLcof{
  public static void main(String[] args) {
       Solution solution = new ShuZuZhongDeNiXuDuiLcof().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array, copy, 0, array.length - 1);//数值过大求余
        return count;
    }

      /**
       * 归并
       *
       * @param array
       * @return
       */
      private int InversePairsCore(int[] array, int[] copy, int low, int high) {
          if (low == high) {
              return 0;
          }
          int mid = (low + high) >> 1;
          int leftCount = InversePairsCore(array, copy, low, mid) ;
          int rightCount = InversePairsCore(array, copy, mid + 1, high) ;
          int i = mid;
          int j = high;
          int copyIndex = high;
          int count = 0;
          while (i >= low && j > mid) {
              if (array[i] > array[j]) {
                  copy[copyIndex--] = array[i--];
                  count += j - mid;

              } else {
                  copy[copyIndex--] = array[j--];
              }
          }
          for (; i >= low; i--) {
              copy[copyIndex--] = array[i];
          }
          for (; j > mid; j--) {
              copy[copyIndex--] = array[j];
          }
          for (int l = low; l <= high; l++) {
              array[l] = copy[l];
          }
          return (leftCount + rightCount + count);
      }
}
//leetcode submit region end(Prohibit modification and deletion)

}