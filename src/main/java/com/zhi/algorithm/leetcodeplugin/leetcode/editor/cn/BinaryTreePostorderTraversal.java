package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个二叉树，返回它的 后序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [3,2,1] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 609 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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
        //        public List<Integer> postorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<>();
//            postorderTraversalHelper(root, res);
//            return res;
//        }
//
//        private void postorderTraversalHelper(TreeNode root, List<Integer> res) {
//            if (root == null) {
//                return;
//            }
//            postorderTraversalHelper(root.left, res);
//            postorderTraversalHelper(root.right, res);
//            res.add(root.val);
//        }
        //迭代方法，stack1弹出的是中右左的顺序，stack2保存的是左右中的顺序
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();
            stack1.push(root);
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                stack2.push(node);
                if (node.left != null) {
                    stack1.push(node.left);
                }
                if (node.right != null) {
                    stack1.push(node.right);
                }
            }
            while (!stack2.isEmpty()) {
                list.add(stack2.pop().val);
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}