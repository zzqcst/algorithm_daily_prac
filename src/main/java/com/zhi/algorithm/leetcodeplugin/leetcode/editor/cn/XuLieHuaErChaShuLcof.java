package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//请实现两个函数，分别用来序列化和反序列化二叉树。 
//
// 示例: 
//
// 你可以将以下二叉树：
//
//    1
//   / \
//  2   3
//     / \
//    4   5
//
//序列化为 "[1,2,3,null,null,4,5]" 
//
// 注意：本题与主站 297 题相同：https://leetcode-cn.com/problems/serialize-and-deserialize-b
//inary-tree/ 
// Related Topics 树 设计 
// 👍 64 👎 0

import com.zhi.algorithm.datastructure.TreeNode;

/**
 * @author zhi
 */
public class XuLieHuaErChaShuLcof {
    public static void main(String[] args) {

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
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            doSerialize(root, sb);
            return sb.toString();
        }

        private void doSerialize(TreeNode root, StringBuilder sb) {
            if (root == null) {
                sb.append("#,");
                return;
            }
            sb.append(root.val).append(",");
            doSerialize(root.left, sb);
            doSerialize(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.length() == 0) {
                return null;
            }
            String[] nodes = data.split(",");
            return doDeserialize(nodes);
        }

        int index = -1;

        private TreeNode doDeserialize(String[] nodes) {
            index++;
            if (nodes[index].equals("#")) {
                return null;
            }
            TreeNode root = new TreeNode(0);
            root.val = Integer.parseInt(String.valueOf(nodes[index]));
            root.left = doDeserialize(nodes);
            root.right = doDeserialize(nodes);
            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}