package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。 
//
// 
//
// 示例: 
//给定如下二叉树，以及目标和 sum = 22， 
//
//               5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \    / \
//        7    2  5   1
// 
//
// 返回: 
//
// [
//   [5,4,11,2],
//   [5,8,4,5]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 10000 
// 
//
// 注意：本题与主站 113 题相同：https://leetcode-cn.com/problems/path-sum-ii/ 
// Related Topics 树 深度优先搜索 
// 👍 73 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhi
 */
public class ErChaShuZhongHeWeiMouYiZhiDeLuJingLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaShuZhongHeWeiMouYiZhiDeLuJingLcof().new Solution();
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            //回溯使用LinkedList暂存节点移除最后一个节点时，速度更快
            List<List<Integer>> res = new LinkedList<>();
            if (root == null) {
                return res;
            }
            getAns(root, new LinkedList<Integer>(), res, sum);
            return res;
        }

        private void getAns(TreeNode node, LinkedList<Integer> path, List<List<Integer>> res, int sum) {
            sum -= node.val;
            path.add(node.val);
            if (node.left == null && node.right == null && sum == 0) {
                LinkedList<Integer> t = new LinkedList<>(path);
                res.add(t);
            }
            if (node.left != null) {
                getAns(node.left, path, res, sum);
            }
            if (node.right != null) {
                getAns(node.right, path, res, sum);
            }
            path.removeLast();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}