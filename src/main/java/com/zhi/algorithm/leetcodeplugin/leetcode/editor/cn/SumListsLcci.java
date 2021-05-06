package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定两个用链表表示的整数，每个节点包含一个数位。 
//
// 这些数位是反向存放的，也就是个位排在链表首部。 
//
// 编写函数对这两个整数求和，并用链表形式返回结果。 
//
// 
//
// 示例： 
//
// 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
//输出：2 -> 1 -> 9，即912
// 
//
// 进阶：思考一下，假设这些数位是正向存放的，又该如何解决呢? 
//
// 示例： 
//
// 输入：(6 -> 1 -> 7) + (2 -> 9 -> 5)，即617 + 295
//输出：9 -> 1 -> 2，即912
// 
// Related Topics 链表 数学 
// 👍 66 👎 0

import com.zhi.algorithm.datastructure.ListNode;
import com.zhi.algorithm.util.DataConstructor;

public class SumListsLcci {
    public static void main(String[] args) {
        Solution solution = new SumListsLcci().new Solution();
        ListNode listNode = DataConstructor.buildList(new int[]{2, 4, 3});
        ListNode listNode1 = DataConstructor.buildList(new int[]{5, 6, 4});
        solution.addTwoNumbers(listNode, listNode1);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            StringBuilder sb = new StringBuilder();
            int carry = 0;
            while (l1 != null || l2 != null) {
                int sum = 0;
                if (l1 != null && l2 != null) {
                    sum = l1.val + l2.val + carry;
                }
                if (l1 == null) {
                    sum = l2.val + carry;
                }
                if (l2 == null) {
                    sum = l1.val + carry;
                }
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
                if (sum > 9) {
                    carry = 1;
                    sum %= 10;
                } else {
                    carry = 0;
                }
                sb.append(sum);
            }
            if (carry != 0) {
                sb.append(carry);
            }
            ListNode head = new ListNode(0);
            ListNode tmp = head;
            for (int i = 0; i < sb.length(); i++) {
                tmp.next = new ListNode(sb.charAt(i) - '0');
                tmp = tmp.next;
            }
            return head.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}