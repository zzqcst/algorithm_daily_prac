package com.zhi.algorithm.datastructure;

import com.zhi.algorithm.codes.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhuzhiqiang
 * @Date 2020/7/15
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("null,");
            }else {
                sb.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        sb.append("]");
        sb.replace(sb.lastIndexOf(","), sb.indexOf("]"), "");
        return sb.toString();
    }
}
