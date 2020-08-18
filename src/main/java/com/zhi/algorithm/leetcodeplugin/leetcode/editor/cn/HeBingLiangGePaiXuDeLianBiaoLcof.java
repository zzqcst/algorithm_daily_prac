package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 分治算法 
// 👍 44 👎 0

import com.zhi.algorithm.datastructure.ListNode;

/**
 * @author zhi
 */
public class HeBingLiangGePaiXuDeLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//            if (l1 == null) return l2;
//            if (l2 == null) return l1;
//            if (l1.val > l2.val) {
//                l2.next = mergeTwoLists(l1, l2.next);
//                return l2;
//            } else {
//                l1.next = mergeTwoLists(l1.next, l2);
//                return l1;
//            }
            ListNode dump = new ListNode(0);
            ListNode cur = dump;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }
            cur.next = l1 == null ? l2 : l1;
            return dump.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}