package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。 
//
// 
//
// 参考以下这颗二叉搜索树： 
//
//      5
//    / \
//   2   6
//  / \
// 1   3 
//
// 示例 1： 
//
// 输入: [1,6,3,2,5]
//输出: false 
//
// 示例 2： 
//
// 输入: [1,3,2,6,5]
//输出: true 
//
// 
//
// 提示： 
//
// 
// 数组长度 <= 1000 
// 
// 👍 96 👎 0

/**
 * @author zhi
 */
public class ErChaSouSuoShuDeHouXuBianLiXuLieLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeHouXuBianLiXuLieLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean verifyPostorder(int[] postorder) {
            if (postorder.length == 0) {
                return true;
            }
            return verify(postorder, 0, postorder.length - 1);
        }

        private boolean verify(int[] postorder, int start, int rootIdx) {
            if (start > rootIdx) {
                return true;
            }
            int i = 0;
            for (; i < rootIdx; i++) {
                if (postorder[i] > postorder[rootIdx]) {
                    break;
                }
            }
            for (int j = i; j < rootIdx; j++) {
                if (postorder[j] < postorder[rootIdx]) {
                    return false;
                }
            }
            return verify(postorder, start, i - 1) && verify(postorder, i, rootIdx - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}