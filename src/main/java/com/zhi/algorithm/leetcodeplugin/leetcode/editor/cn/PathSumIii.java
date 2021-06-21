package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个二叉树，它的每个结点都存放着一个整数值。 
//
// 找出路径和等于给定数值的路径总数。 
//
// 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。 
//
// 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。 
//
// 示例： 
//
// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//      10
//     /  \
//    5   -3
//   / \    \
//  3   2   11
// / \   \
//3  -2   1
//
//返回 3。和等于 8 的路径有:
//
//1.  5 -> 3
//2.  5 -> 2 -> 1
//3.  -3 -> 11
// 
// Related Topics 树 
// 👍 886 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

public class PathSumIii {
    public static void main(String[] args) {
        Solution solution = new PathSumIii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int pathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            //总数为从当前节点出发的路径数+从左节点出发的路径数+从右节点出发的路径数
            //左右子节点又分别有自己的左右节点，因此这一层是一个递归调用
            return calPathSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }

        private int calPathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            //以当前节点为出发点，初始值0
            int tmp = 0;
            sum -= root.val;
            if (sum == 0) {
                tmp++;
            }
            //以当前节点为出发点的路径数+以左节点为出发点的路径数+以右节点为出发点的路径数
            return tmp + calPathSum(root.left, sum) + calPathSum(root.right, sum);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}