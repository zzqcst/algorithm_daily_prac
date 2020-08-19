package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组

import org.apache.tools.ant.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShunShiZhenDaYinJuZhenLcof {
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        int[][] a = new int[][]{{6, 9, 7}};
        solution.spiralOrder(a);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            int rows = matrix.length;
            if (rows == 0) {
                return new int[0];
            }
            int cols = matrix[0].length;
            int total = rows * cols;
            int[] res = new int[total];
            int left = 0, right = cols - 1, top = 0, bottom = rows - 1;
            int index = 0;
            //注意边界条件的控制
            while (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    res[index++] = matrix[top][i];
                }
                for (int i = top + 1; i <= bottom; i++) {
                    res[index++] = matrix[i][right];
                }
                if (bottom > top && left < right) {
                    for (int i = right - 1; i >= left; i--) {
                        res[index++] = matrix[bottom][i];
                    }
                    for (int i = bottom - 1; i > top; i--) {
                        res[index++] = matrix[i][left];
                    }
                }
                left++;
                right--;
                top++;
                bottom--;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}