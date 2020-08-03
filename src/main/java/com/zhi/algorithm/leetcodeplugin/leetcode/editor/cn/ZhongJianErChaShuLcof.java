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
// 👍 144 👎 0

import com.zhi.algorithm.datastructure.TreeNode;
import com.zhi.algorithm.entity.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ZhongJianErChaShuLcof{
  public static void main(String[] args) {
       Solution solution = new ZhongJianErChaShuLcof().new Solution();
        String a = "2021-07-23";
      LocalDateTime l = LocalDateTime.now();
      LocalDate parse = LocalDate.parse(a);
      l=LocalDateTime.of(parse, LocalTime.of(0,0));
      System.out.println(l);
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
        TreeNode root = new TreeNode(preorder[preStart]);
        int leftCnt=0, rightCnt=0;
        for (int i = inStart; i <=inEnd ; i++) {
            if (inorder[i] == preorder[preStart]) {
                leftCnt = i-preStart;
                rightCnt = inEnd - i;
                break;
            }
        }
        root.left = buildTreeReverse(preorder, inorder, preStart+1, preStart+leftCnt, inStart, inStart+leftCnt);
//        root.right = buildTreeReverse(preorder, inorder, preStart + leftCnt +1, preEnd, inStart+leftCnt)
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}