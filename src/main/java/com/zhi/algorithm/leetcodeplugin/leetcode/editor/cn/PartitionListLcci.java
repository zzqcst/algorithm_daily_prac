package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//编写程序以 x 为基准分割链表，使得所有小于 x 的节点排在大于或等于 x 的节点之前。如果链表中包含 x，x 只需出现在小于 x 的元素之后(如下所示)。
//分割元素 x 只需处于“右半部分”即可，其不需要被置于左右两部分之间。 
//
// 示例: 
//
// 输入: head = 3->5->8->5->10->2->1, x = 5
//输出: 3->1->2->10->5->5->8
// 
// Related Topics 链表 双指针 
// 👍 58 👎 0

public class PartitionListLcci {
    public static void main(String[] args) {
        Solution solution = new PartitionListLcci().new Solution();
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode smallHead = new ListNode(0);
            ListNode bigHead = new ListNode(0);
            ListNode small = smallHead;
            ListNode big = bigHead;
            while (head != null) {
                if (head.val < x) {
                    small.next = head;
                    small = small.next;
                } else {
                    big.next = head;
                    big = big.next;
                }
                head = head.next;
            }
            big.next = null;
            small.next = bigHead.next;
            return smallHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}