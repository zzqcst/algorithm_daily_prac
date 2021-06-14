package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//根据一棵树的前序遍历与中序遍历构造二叉树。 
//
// 注意: 
//你可以假设树中没有重复的元素。 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
// Related Topics 树 深度优先搜索 数组 
// 👍 1074 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        }

        private TreeNode buildTree(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
            if (preStart > preEnd || inStart > inEnd) {
                return null;
            }
            TreeNode node = new TreeNode(preorder[preStart]);
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == preorder[preStart]) {
                    node.left = buildTree(preorder, inorder, preStart + 1, preStart + (i - inStart), inStart, i - 1);
                    node.right = buildTree(preorder, inorder, preStart + (i - inStart) + 1, preEnd, i + 1, inEnd);
                }
            }
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}