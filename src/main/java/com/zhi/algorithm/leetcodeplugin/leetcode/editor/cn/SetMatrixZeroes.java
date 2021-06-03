package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。 
//
// 进阶： 
//
// 
// 一个直观的解决方案是使用 O(mn) 的额外空间，但这并不是一个好的解决方案。 
// 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。 
// 你能想出一个仅使用常量空间的解决方案吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
//输出：[[1,0,1],[0,0,0],[1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[0].length 
// 1 <= m, n <= 200 
// -231 <= matrix[i][j] <= 231 - 1 
// 
// Related Topics 数组 
// 👍 495 👎 0

/**
 * @author zhi
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        Solution solution = new SetMatrixZeroes().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void setZeroes(int[][] matrix) {
            if (matrix.length == 0) {
                return;
            }
            int rows = matrix.length, cols = matrix[0].length;
            boolean firstRow = false, firstCol = false;
            for (int i = 0; i < cols; i++) {
                if (matrix[0][i] == 0) {
                    firstRow = true;
                    break;
                }
            }
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstCol = true;
                    break;
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = matrix[0][j] = 0;
                    }
                }
            }
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < cols; i++) {
                if (firstRow) {
                    matrix[0][i] = 0;
                }
            }
            for (int i = 0; i < rows; i++) {
                if (firstCol) {
                    matrix[i][0] = 0;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}