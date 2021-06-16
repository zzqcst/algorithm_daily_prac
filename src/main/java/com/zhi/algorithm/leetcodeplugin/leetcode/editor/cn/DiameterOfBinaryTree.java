package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。 
//
// 
//
// 示例 : 
//给定二叉树 
//
//           1
//         / \
//        2   3
//       / \     
//      4   5    
// 
//
// 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。 
//
// 
//
// 注意：两结点之间的路径长度是以它们之间边的数目表示。 
// Related Topics 树 
// 👍 719 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

public class DiameterOfBinaryTree{
  public static void main(String[] args) {
       Solution solution = new DiameterOfBinaryTree().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxLen;
    public int diameterOfBinaryTree(TreeNode root) {
        /**
         * 思路：以每个节点的为顶点的最大长度等于左子树最大长度加上右子树最大长度
         * 用成员变量来保存这个最大值，然后将左右子树较大的一边返回上一层继续遍历
         */
        diameterOfBinaryTreeHelper(root);
        return maxLen;
    }
    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if(root == null){return 0;}
        int l = diameterOfBinaryTreeHelper(root.left);
        int r = diameterOfBinaryTreeHelper(root.right);
        if(l+r > maxLen) maxLen = l+r;
        //返回左子树和右子树的最大深度
        return Math.max(l,r)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}