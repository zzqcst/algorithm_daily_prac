package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;

;import com.zhi.algorithm.datastructure.TreeNode;

import java.util.Stack;
//给定一个二叉树，检查它是否是镜像对称的。 
//
// 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
//     1
//   / \
//  2   2
// / \ / \
//3  4 4  3
// 
//
// 
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
//     1
//   / \
//  2   2
//   \   \
//   3    3
// 
//
// 
//
// 进阶： 
//
// 你可以运用递归和迭代两种方法解决这个问题吗？ 
// Related Topics 树 深度优先搜索 广度优先搜索

public class SymmetricTree {
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root.left);
//        stack.push(root.right);
//        while (!stack.isEmpty()){
//            TreeNode left = stack.pop();
//            TreeNode right = stack.pop();
//            if (left==null&&right==null){
//                continue;
//            }
//            if (left==null){
//                return false;
//            }
//            if (right==null){
//                return false;
//            }
//            if (left.val!=right.val){
//                return false;
//            }
//            stack.push(left.left);
//            stack.push(right.right);
//            stack.push(left.right);
//            stack.push(right.left);
//        }
//        return true;
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null) return false;
        return left.val==right.val&&isSymmetric(left.right,right.left)&&isSymmetric(left.left,right.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}    