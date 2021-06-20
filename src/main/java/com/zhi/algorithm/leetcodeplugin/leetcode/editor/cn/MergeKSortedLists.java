package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个链表数组，每个链表都已经按升序排列。 
//
// 请你将所有链表合并到一个升序链表中，返回合并后的链表。 
//
// 
//
// 示例 1： 
//
// 输入：lists = [[1,4,5],[1,3,4],[2,6]]
//输出：[1,1,2,3,4,4,5,6]
//解释：链表数组如下：
//[
//  1->4->5,
//  1->3->4,
//  2->6
//]
//将它们合并到一个有序链表中得到。
//1->1->2->3->4->4->5->6
// 
//
// 示例 2： 
//
// 输入：lists = []
//输出：[]
// 
//
// 示例 3： 
//
// 输入：lists = [[]]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// k == lists.length 
// 0 <= k <= 10^4 
// 0 <= lists[i].length <= 500 
// -10^4 <= lists[i][j] <= 10^4 
// lists[i] 按 升序 排列 
// lists[i].length 的总和不超过 10^4 
// 
// Related Topics 堆 链表 分治算法 
// 👍 1350 👎 0

import com.zhi.algorithm.datastructure.ListNode;

public class MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeKSortedLists().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) {
                return null;
            }
            return merge(lists, 0, lists.length - 1);
        }

        public ListNode merge(ListNode[] lists, int start, int end) {
            if (start == end) {
                return lists[start];
            }
            int mid = (start + end) >> 1;
            ListNode left = merge(lists, start, mid);
            ListNode right = merge(lists, mid + 1, end);
            return mergeTwoLists(left, right);
        }


        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            //合并两个有序链表，递归法
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
            //合并两个有序链表，迭代法
//            ListNode newnode = new ListNode(0);
//            ListNode tmp = newnode;
//            while (l1 != null && l2 != null) {
//                if (l1.val < l2.val) {
//                    tmp.next = l1;
//                    l1 = l1.next;
//                } else {
//                    tmp.next = l2;1
//                    l2 = l2.next;
//                }
//                tmp = tmp.next;
//            }
//            if (l1 != null) {
//                tmp.next = l1;
//            }
//            if (l2 != null) {
//                tmp.next = l2;
//            }
//            return newnode.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}