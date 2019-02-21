package com.zhi.algorithm;

import java.util.ArrayList;

/**
 * 剑指offer
 */
public class JZofferPrac {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        JZofferPrac p = new JZofferPrac();
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        p.reConstructBinaryTree(pre, in);
    }

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     *
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //前序遍历第一个是根节点，中序遍历中根节点之前是左子树，根节点之后是右子树
        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    /**
     * @param pre
     * @param in
     * @param lfrom 前序遍历中左子树起始位置
     * @param lto   前序遍历中左子树结束位置
     * @param rfrom 中序遍历中右子树起始位置
     * @param rto   中序遍历中右子树结束位置
     * @return
     */
    private TreeNode construct(int[] pre, int[] in, int lfrom, int lto, int rfrom, int rto) {
        if (lfrom > lto || rfrom > rto) {
            return null;
        }
        TreeNode root = new TreeNode(pre[lfrom]);
        for (int i = rfrom; i <= rto; i++) {
            if (pre[lfrom] == in[i]) {
                //i是从rfrom开始的，所以左子树的元素个数为i-from
                root.left = construct(pre, in, lfrom + 1, lfrom + (i - rfrom), rfrom, i - 1);
                root.right = construct(pre, in, lfrom + (i - rfrom) + 1, lto, i + 1, rto);
            }
        }
        return root;
    }

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //递归或栈都能实现
        ArrayList<Integer> res = new ArrayList<Integer>();
        getRes(listNode, res);
        return res;
    }

    private void getRes(ListNode listNode, ArrayList<Integer> res) {
        if (listNode == null) {
            return;
        }
        if (listNode.next != null) {
            getRes(listNode.next, res);
        }
        res.add(listNode.data);
    }

    /**
     * 请实现一个函数，
     * 将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        //不是在源字符串上修改
        char[] chars = str.toString().toCharArray();
        str = new StringBuffer();
        for (char aChar : chars) {
            if (aChar == ' ') {
                str.append("%20");
                continue;
            }
            str.append(aChar);
        }
        return str.toString();
        //若在原字符串上修改，从后往前替换
    }

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        int row = array.length;
        if (row == 0) {
            return false;
        }
        int col = array[0].length;
        int i = row - 1, j = 0;
        while (i >= 0 && j < col) {
            if (target > array[i][j]) {
                j++;
            } else if (target < array[i][j]) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }
}
