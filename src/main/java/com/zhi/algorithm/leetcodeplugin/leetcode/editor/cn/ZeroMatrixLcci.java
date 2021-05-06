package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。 
//
// 
//
// 示例 1： 
//
// 输入：
//[
//  [1,1,1],
//  [1,0,1],
//  [1,1,1]
//]
//输出：
//[
//  [1,0,1],
//  [0,0,0],
//  [1,0,1]
//]
// 
//
// 示例 2： 
//
// 输入：
//[
//  [0,1,2,0],
//  [3,4,5,2],
//  [1,3,1,5]
//]
//输出：
//[
//  [0,0,0,0],
//  [0,4,5,0],
//  [0,3,1,0]
//]
// 
// Related Topics 数组 
// 👍 29 👎 0

public class ZeroMatrixLcci {
    public static void main(String[] args) {
        Solution solution = new ZeroMatrixLcci().new Solution();
        solution.setZeroes(new int[][]{{1, 2, 3, 4}, {5, 0, 5, 2}, {8, 9, 2, 0}, {5, 7, 2, 1}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            if (rows == 0) return;
            int cols = matrix[0].length;
            boolean firstRow = false, firstCol = false;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstCol = true;
                }
            }
            for (int i = 0; i < cols; i++) {
                if (matrix[0][i] == 0) {
                    firstRow = true;
                }
            }
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
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
            if (firstRow) {
                for (int i = 0; i < cols; i++) {
                    matrix[0][i] = 0;
                }
            }
            if (firstCol) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}