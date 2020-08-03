package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果
//一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。 
//
// [["a","b","c","e"], 
//["s","f","c","s"], 
//["a","d","e","e"]] 
//
// 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。 
//
// 
//
// 示例 1： 
//
// 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "A
//BCCED"
//输出：true
// 
//
// 示例 2： 
//
// 输入：board = [["a","b"],["c","d"]], word = "abcd"
//输出：false
// 
//
// 提示： 
//
// 
// 1 <= board.length <= 200 
// 1 <= board[i].length <= 200 
// 
//
// 注意：本题与主站 79 题相同：https://leetcode-cn.com/problems/word-search/ 
// Related Topics 动态规划 
// 👍 118 👎 0

public class JuZhenZhongDeLuJingLcof {
    public static void main(String[] args) {
        Solution solution = new JuZhenZhongDeLuJingLcof().new Solution();
        String[] str = new String[]{
                "ABCE",
                "SFES",
                "ADEE"};
        char[][] board = new char[][]{str[0].toCharArray(), str[1].toCharArray(), str[2].toCharArray()};
        System.out.println(solution.exist(board, "ABCESEEEFS"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean exist(char[][] board, String word) {
            if (word == null || word.length() == 0) return false;
            int rows = board.length;
            if (rows == 0) return false;
            int cols = board[0].length;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        boolean[][] visited = new boolean[rows][cols];
                        boolean res = exist(board, word, i, j, 0, rows, cols, visited);
                        if (res) return true;
                    }
                }
            }
            return false;
        }

        private boolean exist(char[][] board, String word, int i, int j, int index, int rows, int cols, boolean[][] visited) {
            if (index == word.length()) return true;
            if (i < 0 || i >= rows) return false;
            if (j < 0 || j >= cols) return false;
            if (visited[i][j]) return false;
            if (board[i][j] != word.charAt(index)) return false;
            visited[i][j] = true;
            boolean res = exist(board, word, i + 1, j, index + 1, rows, cols, visited)
                    || exist(board, word, i - 1, j, index + 1, rows, cols, visited)
                    || exist(board, word, i, j + 1, index + 1, rows, cols, visited)
                    || exist(board, word, i, j - 1, index + 1, rows, cols, visited);
            visited[i][j] = false;
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}