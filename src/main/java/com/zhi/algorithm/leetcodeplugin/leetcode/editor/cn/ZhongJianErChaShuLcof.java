package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
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
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
// Related Topics 树 递归 
// 👍 146 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

/**
* @author zhi
*/
public class ZhongJianErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();
    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeReverse(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    private TreeNode buildTreeReverse(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart>preEnd) return null;
        if (inStart>inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i]==preorder[preStart]){
                root.left = buildTreeReverse(preorder, inorder, preStart+1, preStart+i-inStart, inStart, i-1);
                root.right = buildTreeReverse(preorder, inorder, preStart+i-inStart+1, preEnd, i+1, inEnd);
                break;
            }
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}