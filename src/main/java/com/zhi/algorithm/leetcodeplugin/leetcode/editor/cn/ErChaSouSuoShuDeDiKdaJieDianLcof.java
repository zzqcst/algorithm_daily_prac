package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一棵二叉搜索树，请找出其中第k大的节点。 
//
// 
//
// 示例 1: 
//
// 输入: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//输出: 4 
//
// 示例 2: 
//
// 输入: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//输出: 4 
//
// 
//
// 限制： 
//
// 1 ≤ k ≤ 二叉搜索树元素个数 
// Related Topics 树 
// 👍 118 👎 0

public class ErChaSouSuoShuDeDiKdaJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeDiKdaJieDianLcof().new Solution();
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        int res, k;
        //中序遍历是从小到大，中序遍历的逆序是从大到小，即右子树-根节点-左子树遍历顺序
        public int kthLargest(TreeNode root, int k) {
            this.k = k;
            getOrderedVals(root);
            return res;
        }

        private void getOrderedVals(TreeNode root) {
            if (root == null) return;
            getOrderedVals(root.right);
            if (--k == 0) {
                res = root.val;
                return;
            }
            getOrderedVals(root.left);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}