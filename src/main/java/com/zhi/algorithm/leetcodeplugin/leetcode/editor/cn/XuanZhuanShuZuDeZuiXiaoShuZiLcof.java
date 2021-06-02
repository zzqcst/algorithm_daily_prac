package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2
//] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。 
//
// 示例 1： 
//
// 输入：[3,4,5,1,2]
//输出：1
// 
//
// 示例 2： 
//
// 输入：[2,2,2,0,1]
//输出：0
// 
//
// 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sor
//ted-array-ii/ 
// Related Topics 二分查找 
// 👍 118 👎 0

/**
 * @author zhi
 */
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
        System.out.println(solution.minArray(new int[]{1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minArray(int[] numbers) {
            int low = 0;
            int high = numbers.length - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (numbers[mid] < numbers[high]) {
                    high = mid;
                } else if (numbers[mid] > numbers[high]) {
                    low = mid + 1;
                } else {
                    //numbers[mid]==numbers[high] 不能确定mid在最小值左边还是右边
                    high -= 1;
                }
            }
            return numbers[low];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}