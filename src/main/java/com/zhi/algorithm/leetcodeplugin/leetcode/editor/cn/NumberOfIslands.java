package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 300 
// grid[i][j] 的值为 '0' 或 '1' 
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集 
// 👍 1188 👎 0

public class NumberOfIslands{
  public static void main(String[] args) {
       Solution solution = new NumberOfIslands().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
      public int numIslands(char[][] grid) {
          //遍历grid,遇到1则计数加一，同时将从该位置开始能到达的1置为0
          if (grid.length == 0 || grid[0].length == 0) {
              return 0;
          }
          int rows = grid.length;
          int cols = grid[0].length;
          int res = 0;
          for (int i = 0; i < rows; i++) {
              for (int j = 0; j < cols; j++) {
                  if (grid[i][j] == '1') {
                      res++;
                      toZero(grid, i, j, rows, cols);
                  }
              }
          }
          return res;
      }
      private void toZero(char[][] grid, int i, int j, int rows, int cols) {
          if (i < 0 || i >= rows || j < 0 || j >= cols) {//超出边界了
              return;
          }
          if (grid[i][j] != '1') {//遇到相邻的不是1
              return;
          }
          grid[i][j] = '0';
          toZero(grid, i - 1, j, rows, cols);
          toZero(grid, i + 1, j, rows, cols);
          toZero(grid, i, j - 1, rows, cols);
          toZero(grid, i, j + 1, rows, cols);
      }
  }
//leetcode submit region end(Prohibit modification and deletion)

}