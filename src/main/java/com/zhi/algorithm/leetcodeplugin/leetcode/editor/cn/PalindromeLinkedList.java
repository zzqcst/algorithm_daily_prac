package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 1017 👎 0

import com.zhi.algorithm.datastructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhi
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
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
        public boolean isPalindrome(ListNode head) {
            //反转链表后与原链表顺序比较
            ListNode pre = null;
            List<Integer> origin = new ArrayList<>();
            while (head != null) {
                origin.add(head.val);
                ListNode temp = head.next;
                head.next = pre;
                pre = head;
                head = temp;
            }

            int i = 0;
            while (pre != null) {
                if (pre.val != origin.get(i++)) {
                    return false;
                }
                pre = pre.next;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}