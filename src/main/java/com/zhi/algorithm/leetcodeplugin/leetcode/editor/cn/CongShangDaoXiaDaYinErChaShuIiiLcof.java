package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [20,9],
//  [15,7]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 
// 👍 23 👎 0

import com.zhi.algorithm.codes.JZofferPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.zhi.algorithm.datastructure.TreeNode;
import com.zhi.algorithm.util.DataConstructor;

public class CongShangDaoXiaDaYinErChaShuIiiLcof {
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiiLcof().new Solution();
        TreeNode root = DataConstructor.buildTreeFromString("[3,9,20,null,null,15,7]");
        solution.levelOrder(root);
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Stack<TreeNode>[] stacks = new Stack[2];
            for (int i = 0; i < 2; i++) {
                stacks[i] = new Stack<TreeNode>();
            }
            int current = 0;
            int next = 1;
            stacks[current].add(root);
            while (!stacks[current].isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int size = stacks[current].size();
                for (int i = 0; i < size; i++) {
                    TreeNode pop = stacks[current].pop();
                    level.add(pop.val);
                    if (current == 0) {
                        if (pop.left != null) {
                            stacks[next].add(pop.left);
                        }
                        if (pop.right != null) {
                            stacks[next].add(pop.right);
                        }
                    } else {
                        if (pop.right != null) {
                            stacks[next].add(pop.right);
                        }
                        if (pop.left != null) {
                            stacks[next].add(pop.left);
                        }
                    }
                }
                current = 1 - current;
                next = 1 - next;
                res.add(level);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}