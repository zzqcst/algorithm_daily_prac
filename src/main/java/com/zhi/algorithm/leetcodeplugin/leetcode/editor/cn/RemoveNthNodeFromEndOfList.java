package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
//
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
// Related Topics 链表 双指针 
// 👍 1373 👎 0

import com.zhi.algorithm.datastructure.ListNode;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
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
        /**
         * @param head
         * @param n
         * @return 注意：使用头部哑节点，可以避免对头部节点的特殊判断
         * solution 1: 遍历一遍得到长度，倒数第n个，就是整数第len-n个，再遍历一遍删除
         * solution 2: 双指针，first比second多走n步，first到达尾结点时，second指向的就是倒数第n个
         */
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode first = head;
            //first为null时，second指向目标node前一个
            ListNode second = dummy;
            //first比second多走n步
            for (int i = 0; i < n; ++i) {
                first = first.next;
            }
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            second.next = second.next.next;
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}