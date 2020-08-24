package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。 
//
// 
//
// 为了让您更好地理解问题，以下面的二叉搜索树为例： 
//
// 
//
// 
//
// 
//
// 我们希望将这个二叉搜索树转化为双向循环链表。链表中的每个节点都有一个前驱和后继指针。对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是
//第一个节点。 
//
// 下图展示了上面的二叉搜索树转化成的链表。“head” 表示指向链表中有最小元素的节点。 
//
// 
//
// 
//
// 
//
// 特别地，我们希望可以就地完成转换操作。当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。还需要返回链表中的第一个节点的指针。 
//
// 
//
// 注意：本题与主站 426 题相同：https://leetcode-cn.com/problems/convert-binary-search-tree-
//to-sorted-doubly-linked-list/ 
//
// 注意：此题对比原题有改动。 
// Related Topics 分治算法 
// 👍 95 👎 0

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhi
 */
public class ErChaSouSuoShuYuShuangXiangLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuYuShuangXiangLianBiaoLcof().new Solution();
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(1);
        Node e = new Node(3);
        b.left = d;
        b.right = e;
        a.left = b;
        a.right = c;
        solution.treeToDoublyList(a);
    }

    // Definition for a Node.
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public Node treeToDoublyList(Node root) {
            if (root == null) {
                return root;
            }
            List<Node> list = new ArrayList<>();
            getAllNodes(root, list);
            Node head = list.get(0);
            Node pre = head;
            for (int i = 1; i < list.size(); i++) {
                Node cur = list.get(i);
                pre.right = cur;
                cur.left = pre;
                pre = cur;
            }
            pre.right = head;
            head.left = pre;
            return head;
        }

        private void getAllNodes(Node root, List<Node> list) {
            if (root.left != null) {
                getAllNodes(root.left, list);
            }
            list.add(root);
            if (root.right != null) {
                getAllNodes(root.right, list);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}