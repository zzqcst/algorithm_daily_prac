package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层序遍历结果： 
//
// 
//[
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 890 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhi
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            int size = 0, i = 0;
            if (root != null) {
                queue.offer(root);
            }
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                size = queue.size();
                for (i = 0; i < size; i++) {
                    TreeNode t = queue.poll();
                    level.add(t.val);
                    if (t.left != null) {
                        queue.offer(t.left);
                    }
                    if (t.right != null) {
                        queue.offer(t.right);
                    }
                }
                result.add(level);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}