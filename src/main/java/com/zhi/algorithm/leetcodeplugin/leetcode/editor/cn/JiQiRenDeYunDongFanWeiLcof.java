package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2：
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
// 👍 134 👎 0

/**
 * @author zhi
 */
public class JiQiRenDeYunDongFanWeiLcof {
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();
        solution.movingCount(1, 2, 1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int movingCount(int m, int n, int k) {
            boolean[] visited = new boolean[m * n];
            return movingCount(0, 0, m, n, k, visited);

        }

        private int movingCount(int i, int j, int m, int n, int k, boolean[] visited) {
            if (i < 0 || i >= m || j < 0 || j >= n) return 0;
            if (ijCount(i, j) > k) return 0;
            if (visited[i * n + j]) {
                return 0;
            }
            int res = 0;
            visited[i * n + j] = true;
            //从左上角走到右下角，只考虑向下走和向右走的情况即可
            res = 1 + movingCount(i + 1, j, m, n, k, visited)
                    + movingCount(i, j + 1, m, n, k, visited);
            return res;
        }

        public int ijCount(int i, int j) {
            int res = 0;
            while (i != 0) {
                res += i % 10;
                i /= 10;
            }
            while (j != 0) {
                res += j % 10;
                j /= 10;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}