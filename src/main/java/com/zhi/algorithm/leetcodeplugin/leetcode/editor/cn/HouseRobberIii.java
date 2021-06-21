package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“
//房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。 
//
// 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。 
//
// 示例 1: 
//
// 输入: [3,2,3,null,3,null,1]
//
//     3
//    / \
//   2   3
//    \   \ 
//     3   1
//
//输出: 7 
//解释: 小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7. 
//
// 示例 2: 
//
// 输入: [3,4,5,1,3,null,1]
//
//     3
//    / \
//   4   5
//  / \   \ 
// 1   3   1
//
//输出: 9
//解释: 小偷一晚能够盗取的最高金额 = 4 + 5 = 9.
// 
// Related Topics 树 深度优先搜索 动态规划 
// 👍 883 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class HouseRobberIii {
    public static void main(String[] args) {
        Solution solution = new HouseRobberIii().new Solution();
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
        //f表示选择当前节点时，最大收益
        Map<TreeNode, Integer> chooseCur = new HashMap<TreeNode, Integer>();
        //g表示不选择当前节点时，最大收益
        Map<TreeNode, Integer> notChooseCur = new HashMap<TreeNode, Integer>();

        public int rob(TreeNode root) {
            dfs(root);
            return Math.max(chooseCur.getOrDefault(root, 0), notChooseCur.getOrDefault(root, 0));
        }

        public void dfs(TreeNode node) {
            if (node == null) {
                return;
            }
            dfs(node.left);
            dfs(node.right);
            //选择当前节点时，则左右子节点不能被选择
            chooseCur.put(node, node.val + notChooseCur.getOrDefault(node.left, 0) + notChooseCur.getOrDefault(node.right, 0));
            //不选择当前节点时，则左右子节点分为选与不选两种情况，取最大值
            notChooseCur.put(node, Math.max(chooseCur.getOrDefault(node.left, 0), notChooseCur.getOrDefault(node.left, 0)) +
                    Math.max(chooseCur.getOrDefault(node.right, 0), notChooseCur.getOrDefault(node.right, 0)));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}