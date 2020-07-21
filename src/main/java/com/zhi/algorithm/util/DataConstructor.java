package com.zhi.algorithm.util;

import com.zhi.algorithm.codes.LeetCode;
import com.zhi.algorithm.datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

/**
 * 构造各种数据结构，树、链表
 * @author zhuzhiqiang
 * @Date 2020/7/15
 */
public class DataConstructor {
    private static final Pattern p = Pattern.compile("^\\[.*]$");
    /**
     * 根据字符串构建树
     * <br/>
     * 例：
     * <br/>
     * [3,9,20,null,null,15,7]
     *
     * <p>
     *      3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * </p>
     * @return
     */
    public static TreeNode buildTreeFromString(String tree) {
        if (!p.matcher(tree).matches()) {
            return null;
        }
        tree = tree.replace("[", "");
        tree = tree.replace("]", "");
        String[] nodes = tree.split(",");
        if (nodes.length == 0) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int i=0;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[i++]));
        queue.add(root);
        while (i<nodes.length) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode node = queue.poll();
                if (!"null".equals(nodes[i])) {
                    node.left = new TreeNode(Integer.parseInt(nodes[i]));
                    queue.offer(node.left);
                }
                i++;
                if (!"null".equals(nodes[i])) {
                    node.right = new TreeNode(Integer.parseInt(nodes[i]));
                    queue.offer(node.right);
                }
                i++;
            }
        }
        return root;
    }
}
