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

public class ShunShiZhenDaYinJuZhenLcof{
  public static void main(String[] args) {
       Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
       int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       solution.spiralOrder(a);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row==0) return new int[]{};
        int col = matrix[0].length;
        int[][] visited = new int[row][col];
        int total = row*col;
        int[] res = new int[total];
        int k=0;
        int top=0,right=col-1,bottom=row-1,left=0;
        while (total>0){
            for (int i = 0; i < col; i++) {//向右
                if (visited[top][i]==1){
                    continue;
                }
                res[k++]=matrix[top][i];
                total--;
                visited[top][i]=1;
            }
            for (int i = 0; i < row; i++) {//向下
                if (visited[i][right]==1) continue;
                res[k++]=matrix[i][right];
                total--;
                visited[i][right]=1;
            }
            for (int i = col-1; i >=0; i--) {//向左
                if (visited[bottom][i]==1) continue;
                res[k++] = matrix[bottom][i];
                total--;
                visited[bottom][i]=1;
            }

            for (int i = row-1; i>= 0; i--) {//向上
                if (visited[i][left]==1) continue;
                res[k++]=matrix[i][left];
                total--;
                visited[i][left]=1;
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}