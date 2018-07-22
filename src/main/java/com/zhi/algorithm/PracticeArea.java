package com.zhi.algorithm;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class PracticeArea {
    public class Solution {
        private int[] store;
        private List<Integer> list;
        public Solution(int[] nums) {
            store=nums;
            list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return store;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            Collections.shuffle(list);
            int[] temp = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                temp[i] = list.get(i);
            }
            return temp;
        }
    }

    public static void main(String[] args) throws IOException {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        TreeNode t1 = new TreeNode(3);
//        TreeNode t2 = new TreeNode(9);
//        TreeNode t3 = new TreeNode(20);
//        TreeNode t4 = new TreeNode(15);
//        TreeNode t5 = new TreeNode(7);
//        t1.left = t2;
//        t1.right = t3;
//        t3.left = t4;
//        t3.right = t5;
//        List<List<Integer>> lists = levelOrder(t1);
//        for (List<Integer> list : lists) {
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
//        }
//        Excel_reader test= new Excel_reader();
//        List<ArrayList<String>> arr=test.xlsx_reader("E:\\projects\\java\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.xlsx",0,1,2,3,4,5,6,7,8,9);  //后面的参数代表需要输出哪些列，参数个数可以任意
//        for(int i=0;i<arr.size();i++) {
//            ArrayList<String> row = arr.get(i);
//            for (int j = 0; j < row.size(); j++) {
//                System.out.print(row.get(j) + " ");
//            }
//            System.out.println("");
//        }
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }

    /**
     * 打家劫
     *
     * @param nums
     * @return
     */
    private static int rob(int[] nums) {
        //F(n)=max{a[n]+F(n-2),F(n-1)}
        if (nums.length == 0) {
            return 0;
        }
        int pre1 = 0, pre2 = nums[0],max;
        for (int i = 1; i < nums.length; i++) {
            max=nums[i] + pre1;//最优
            max=max>pre2?max:pre2;//子结构
            pre1=pre2;
            pre2=max;
        }
        return pre2;
    }
//    private static int rob(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        return getHighestRob(nums,nums.length-1);
//    }
//
//    private static int getHighestRob(int[] nums, int i) {
//        if (i == 1) {
//            return Math.max(nums[0], nums[1]);
//        }
//        if (i == 0) {
//            return nums[0];
//        }
//        //不抢劫i和抢劫i之间的最大值
//        return Math.max(getHighestRob(nums, i - 1), getHighestRob(nums, i - 2)+nums[i]);
//    }

    /**
     * 最大子序和
     *
     * @param nums 数组
     * @return 最大子序和
     */
    private static int maxSubArray(int[] nums) {
        int max = nums[0], submax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (submax < 0) {//如果上一个子序列和小于零,丢弃,子序列从当前从新计算
                submax = nums[i];
            } else {
                submax += nums[i];//否则当前元素算入上个子序列
            }

            if (submax > max) {//和不为零的子序列中,和的最大值
                max = submax;
            }
        }
        return max;
    }


    /**
     * 买股票的最佳时机
     *
     * @param prices 价格数组
     * @return 最大利润
     */
    private static int maxProfit1(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxpf = 0;
        int starter = prices[0];//最小的元素
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - starter;//计算与最小元素的差值
            if (temp < 0) {
                starter = prices[i];//遇到比当前最小元素更小的值,替换当前最小元素
                continue;
            }
            maxpf = Math.max(temp, maxpf);//保存最大差值
        }
        return maxpf;
    }

    /**
     * 爬楼梯
     *
     * @param n 楼梯阶数
     * @return 方法数
     */
    private static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2, temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }


    /**
     * 第一个错误的版本
     * 二分查找
     * 最后两个数为左边一个为false,右边一个为true,
     * mid为左边一个数,加一后等于后边一个数,即结果
     *
     * @param n 最大版本数
     * @return 第一个错误版本数
     */
    private static int firstBadVersion(int n) {
        if (n <= 0)
            return 0;
        long l = 1, r = n;
        while (l < r) {
            long mid = (l + r) / 2;
            if (isBadVersion((int) mid))//mid:true,往左边查找
                r = mid;
            else //mid:false,往右边查找
                l = mid + 1;
        }
        return (int) l;
    }

    private static int getBadVersion(long lo, long hi) {
        if (isBadVersion((int) lo)) {//lo:true
            return (int) lo;
        }
        long mid = (lo + hi) / 2;
        if (!isBadVersion((int) mid)) {//mid:false
            return getBadVersion(mid + 1, hi);
        } else {//mid:true
            return getBadVersion(lo, mid);
        }
    }

    private static boolean isBadVersion(int version) {
        return version == 1702766719;
    }

    /**
     * 合并两个有序数组
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     *
     * @param nums1
     * @param m     nums1大小
     * @param nums2
     * @param n     nums2大小
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //先复制再排序
//        for (int i = m; i <m+n ; i++) {
//            nums1[i]=nums2[i-m];
//        }
//        Arrays.sort(nums1);
        //从后往前
        while (m > 0 && n > 0) {
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[m + n - 1] = nums2[n - 1];//m+n-1从最后一位逐一向前移动
                n--;
            } else {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            }
            if (m == 0) {
                while (n > 0) {
                    nums1[n - 1] = nums2[n - 1];
                    n--;
                }
            }
        }
    }

    /**
     * 将有序数组转换为二叉搜索树
     *
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

    /**
     * 二叉树的层次遍历
     *
     * @param root
     * @return
     */
    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        int size = 0, i = 0;
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            size = queue.size();
            for (i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                level.add(t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    /**
     * 对称二叉树
     *
     * @param root
     * @return
     */
    private static boolean isSymmetric(TreeNode root) {
        //递归
//        if (root == null) {
//            return true;
//        }
//        return symmetric(root.left, root.right);

        //迭代
        if (root == null) {
            return true;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root.left);
        s.push(root.right);
        while (!s.empty()) {
            TreeNode p = s.pop();
            TreeNode q = s.pop();
            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            s.push(p.left);
            s.push(q.right);
            s.push(p.right);
            s.push(q.left);
        }
        return true;
    }

    private static boolean symmetric(TreeNode p, TreeNode q) {//也可用于判断两棵树是否相等
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && symmetric(p.right, q.left) && symmetric(p.left, q.right);
    }

    /**
     * 验证二叉搜索树
     *
     * @param root
     * @return
     */
    private static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }

    /**
     * 二叉树最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        //递归
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 链表中是否有环
     *
     * @param head
     * @return
     */
    private static boolean hasCycle(ListNode head) {
        //own
//        HashMap<Integer, Integer> map = new HashMap<>();
//        while (head != null) {
//            if (map.containsKey(head.hashCode())) {
//                return true;
//            }else {
//                map.put(head.hashCode(), 1);
//            }
//            head = head.next;
//        }
//        return false;
        //追赶法
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    private static boolean isPalindrome(ListNode head) {
        //借助反转链表的方法
//        ListNode pre = null;
//        List<Integer> origin = new ArrayList<>();
//        while (head != null) {
//            origin.add(head.val);
//            ListNode temp = head.next;
//            head.next=pre;
//            pre = head;
//            head=temp;
//        }
//
//        int i=0;
//        while (pre != null) {
//            if (pre.val != origin.get(i++)) {
//                return false;
//            }
//            pre=pre.next;
//        }
//        return true;
        //另一种方法
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {//当fast遍历完时，slow正好遍历一半
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while (slow != null) {//将反转后的后一半和前一半比较
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        //递归方法
//        if (head == null || head.next == null) {
//            return head;
//        }else {
//            ListNode newHead = reverseList(head.next);
//            head.next.next=head;
//            head.next = null;
//            return newHead;
//        }
        //非递归方法
        ListNode preNode = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = preNode;//将保存的上一个节点作为该节点的下一个节点
            preNode = head;//然后当前节点成为下次循环的上一个节点
            head = temp;
        }
        return preNode;
    }


    /**
     * 删除链表中的节点
     *
     * @param node
     */
    private void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 删除链表的倒数第N个节点
     *
     * @param head
     * @param n
     * @return
     */
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preNode = head;
        ListNode curNode = head;

        for (int i = 0; i < n; i++) {
            curNode = curNode.next;
            if (curNode == null) {
                return preNode.next;
            }
        }


        while (curNode.next != null) {
            preNode = preNode.next;
            curNode = curNode.next;
        }

        preNode.next = preNode.next.next;

        return head;
    }

    /**
     * 最长公共前缀
     *
     * @param strs
     * @return
     */
    private static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
////            return "";
////        }
////        char last = '-';
////        int index = 0;
////        boolean running = true;
////        StringBuilder sb = new StringBuilder();
////        while (running) {
////            for (String str : strs) {
////                if (str.length() == 0) {
////                    return "";
////                }
////                if (index >= str.length()) {
////                    running = false;
////                    last = ' ';
////                    break;
////                }
////                if (last != '-' && str.charAt(index) != last) {
////                    running = false;
////                    last = ' ';
////                    break;
////                }
////                last = str.charAt(index);
////            }
////            if (last != ' ')
////                sb.append(last);
////            last = '-';
////            index++;
////        }
////        return sb.toString();
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {//等于0时，表示匹配成功
                prefix = prefix.substring(0, prefix.length() - 1);//若不匹配，每次将prefix最后一个字符去掉
                if (prefix.compareTo("") == 0)//没有匹配的
                    return "";
            }
        }
        return prefix;
    }

    /**
     * 数数并说
     *
     * @param n
     * @return
     */
    private static String countAndSay(int n) {
        String current = "1";
        for (int i = 0; i < n - 1; i++) {
            current = count(current);
        }
        return current;
    }

    private static String count(String str) {
        char[] chars = str.toCharArray();
        int len = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] != chars[i + 1]) {//当前与下一个不同
                len++;
                sb.append(len).append(chars[i] - '0');
                len = 0;
                continue;
            }
            if (i + 1 == chars.length) {//最后一个
                len++;
                sb.append(len).append(chars[i] - '0');
            }
            len++;
        }
        return sb.toString();
    }

    /**
     * 实现strStr()
     *
     * @param haystack
     * @param needle
     * @return
     */
    private static int strStr(String haystack, String needle) {
//        if (needle.isEmpty()) {
//            return 0;
//        }
//        int i = 0;
//        while (i < haystack.length()) {
//            if (haystack.charAt(i) == needle.charAt(0)) {
//                if (i + needle.length() > haystack.length()) {
//                    return -1;
//                } else if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                    return i;
//                }
//            }
//            i++;
//        }
//        return -1;
        return haystack.indexOf(needle);
    }

    private static int myAtoi(String str) {

        if (str.isEmpty()) return 0;

        double number = 0;
        int sign = 1, i = 0, length = str.length();
        while (i < length - 1 && str.charAt(i) == ' ') i++;
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i++) == '+' ? 1 : -1;
        }
        while (i < length && str.charAt(i) <= '9' && str.charAt(i) >= '0') {
            if (number > Integer.MAX_VALUE)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            number = number * 10 + str.charAt(i++) - '0';
        }
        return (int) (number * sign);

//        str = str.trim();
//        if (str.length() == 0) {
//            return 0;
//        }
//        char[] chars = str.toCharArray();
//        int len = 0;
//
//
//        for (int i = 0; i < chars.length; i++) {
//            if (i == 0 && isSign(chars[i])) {//判断第一个字符是不是符号
//                if (str.length() == 1) {//第一个是符号且只有一位
//                    return 0;
//                }
//                len++;
//                continue;
//            }
//            if (i == 0 && isLetter(chars[0])) {
//                return 0;
//            }
//
//            if (i == 1 && isSign(chars[0]) && !isNum(chars[1])) {//第一位符号，第二位不是数字
//                return 0;
//            }
//
//
//            if (i == 1 && isLetter(chars[i])) {//如果以字母开头
//                if (!isNum(chars[0])) {
//                    return 0;
//                }
//            }
//
//
//
//            if (isNum(chars[i]) || chars[i] == '.') {
//                chars[len++] = chars[i];
//            }else break;
//        }
//
//        if (len == 0) {
//            return 0;
//        }
//
//        double res = Double.valueOf(new String(chars, 0, len));
//        if (res > Integer.MAX_VALUE) {
//            return Integer.MAX_VALUE;
//        }
//
//        if (res < Integer.MIN_VALUE) {
//            return Integer.MIN_VALUE;
//        }
//
//        return (int) res;
    }

    private static boolean isSign(char a) {
        return a == '-' || a == '+';
    }

    private static boolean isNum(char a) {
        return a <= '9' && a >= '0';
    }

    private static boolean isLetter(char a) {
        return a <= 'z' && a >= 'a' || a <= 'Z' && a >= 'A';
    }

    /**
     * 验证回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (('z' - chars[i]) < 26 && ('z' - chars[i]) >= 0 || ('9' - chars[i]) < 10 && ('9' - chars[i]) >= 0) {
                if (('z' - chars[j]) < 26 && ('z' - chars[j]) >= 0 || ('9' - chars[j]) < 10 && ('9' - chars[j]) >= 0) {
                    if (chars[i] != chars[j]) {
                        return false;
                    }
                    i++;
                    j--;
                } else j--;
            } else i++;
        }
        return true;
    }

    /**
     * 字母异构词
     *
     * @param s
     * @param t
     * @return
     */
    private static boolean isAnagram(String s, String t) {
        //利用排序的方法
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }
        return true;
        //利用字母出现次数的方法，较快
//        int i;
//        char[] arrs = s.toCharArray();
//        char[] arrt = t.toCharArray();
//
//        int[] its = new int[26];
//        int[] itt = new int[26];
//
//        for(i = 0; i < arrs.length; i++)
//            its[arrs[i] - 'a']++;
//        for(i = 0; i < arrt.length; i++)
//            itt[arrt[i] - 'a']++;
//        for(i=0;i<26;i++)
//        {
//            if(its[i] != itt[i])
//                return false;
//        }
//        return true;
    }

    /**
     * 第一个唯一字符
     *
     * @param s
     * @return
     */
    private static int firstUniqChar(String s) {
        //耗时长
//        char[] chars = s.toCharArray();
//        Hashtable<Character, Integer> times = new Hashtable<Character, Integer>();
//        for (char aChar : chars) {
//            if (times.containsKey(aChar)) {
//                times.put(aChar, times.get(aChar) + 1);
//            } else {
//                times.put(aChar, 1);
//            }
//
//        }
//        for (int i = 0; i < chars.length; i++) {
//            if (times.get(chars[i]) == 1) {
//                return i;
//            }
//        }
//        return -1;
        //较快的解法
        //最多循环26次
        char c;
        int start, end;

        if (s.length() < 26) {
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                start = s.indexOf(c);
                end = s.lastIndexOf(c);
                if (start == end && start != -1)
                    return i;
            }
        } else {
            int res = s.length();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                start = s.indexOf(ch);
                end = s.lastIndexOf(ch);

                if (start == end && start != -1) {
                    res = Math.min(res, start);
                }
            }
            if (res != s.length())
                return res;
        }
        return -1;
    }

    /**
     * 颠倒整数
     *
     * @param x
     * @return
     */
    private static int reverse(int x) {
        if (x == 0) return x;
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (chars[i] == '-') {
                i++;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        long res = Long.parseLong(new String(chars));
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) res;
        //方法二
//        boolean negative = x < 0;
//        if (negative) x = -x;
//        long r = 0;
//        while (x>0) {
//            r = r * 10 + x % 10;
//            x /= 10;
//        }
//        if (negative) r = -r;
//        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
//        return (int)r;
    }

    /**
     * 反转字符串
     *
     * @param s
     * @return
     */
    private static String reverseString(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    /**
     * 旋转图像
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //由外向内旋转每一层
        for (int i = 0; i < n / 2; ++i) {//行数
            for (int j = i; j < n - 1 - i; ++j) {//列数
                int tmp = matrix[i][j];//左上
                matrix[i][j] = matrix[n - 1 - j][i];//左下赋给左上
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];//右下赋给左下
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];//右上赋给右下
                matrix[j][n - 1 - i] = tmp;//左上赋给右上
            }
        }
    }

    /**
     * 有效的数独
     *
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        //高效解法
        int[][] signs = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                int n = 1 << (board[i][j] - '1');//1×2^(board[i][j]-'1'),二进制1左移当前数字对应的位数
                int cubeIndex = i / 3 * 3 + j / 3;//当前格子位于第几块中
                //按位与，若某数字再次出现，对应位上有相同的1，则与后结果不为0
                //例如，9、8出现后，sign的二进制为110000000,再次出现9，n为100000000,这样，
                //按位相与的结果不为0
                if ((signs[0][i] & n) != 0 || (signs[1][j] & n) != 0 || (signs[2][cubeIndex] & n) != 0)
                    return false;
                //sign保存数字对应位数的1，比如9，则为100000000,下一个数字是8,则sign更新为，110000000,
                //即，若某数字出现了，则对应位置上为1
                signs[0][i] |= n;//对应i行的数字，检查一行的数字是否重复
                signs[1][j] |= n;//对应j列的的数字,检查列上的数字是否重复
                signs[2][cubeIndex] |= n;//对应第cubuIndex个块中的数字
            }
        }
        return true;

        //简单解法
//        Set<Character> rowset = new HashSet<Character>();
//        Set<Character> colset = new HashSet<Character>();
//
//        for(int i = 0; i < 9; i++)
//        {
//            rowset.clear();
//            colset.clear();
//            for(int j = 0; j < 9; j ++)
//            {
//                if(i % 3 == 0 && j % 3 == 0)  // 检查块是否有效
//                {
//                    if(!checkBlock(board, i, j))
//                        return false;
//                }
//                if(board[i][j] != '.')  // 检查行是否有效
//                {
//                    if(rowset.contains(board[i][j]))
//                        return false;
//                    rowset.add(board[i][j]);
//                }
//                if(board[j][i] != '.')  // 检查列是否有效
//                {
//                    if(colset.contains(board[j][i]))
//                        return false;
//                    colset.add(board[j][i]);
//                }
//            }
//        }
//        return true;
    }

    public boolean checkBlock(char[][] board, int row, int col)  // 检查块是否有效,一个3×3的块中是否有重复数字
    {
        Set<Character> blockSet = new HashSet<Character>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    if (blockSet.contains(board[i][j]))
                        return false;
                    blockSet.add(board[i][j]);
                }
            }
        }
        return true;
    }

    /**
     * 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                if (nums[i] + nums[j] == target) {
//                    res[0]=i;
//                    res[1]=j;
//                    return res;
//                }
//            }
//        }
//        return res;
        //answer
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {//判断是否有剩下值
                res[0] = m.get(target - nums[i]);
                res[1] = i;
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }

    private static void moveZeroes(int[] nums) {
        // 0,1,0,3,5,6
        int i = 0, j = 0;
        for (int num : nums) {
            if (nums[i] != 0) {
                nums[j] = (nums[i] + nums[j]) - (nums[i] = nums[j]);
                i++;
                j++;
                continue;
            }
            i++;
        }
    }

    private static int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] != nums[i+1]) {
//                return nums[i];
//            }
//            i++;
//        }
//        return nums[nums.length-1];
        //answer
        int n = 0;
        for (int num : nums) {
            n = n ^ num; //按位异或，如1^4 = (001)^(100)=4,举例，[4,2,2,1,1]，后面四个异或结果为0,4和0异或为4
        }
        return n;
    }

    /**
     * 判断存在重复
     *
     * @param nums
     * @return
     */
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 加一
     *
     * @param digits
     * @return
     */
    private static int[] plusOne(int[] digits) {
        int carrry = 0;
        List<Integer> fina = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int res = 0;
            if (i == digits.length - 1) {
                res = digits[i] + 1 + carrry;
            } else {
                res = digits[i] + carrry;
            }
            int a = res % 10;
            fina.add(a);
            carrry = res / 10;
        }
        fina.add(carrry);
        int[] finres = new int[fina.size()];
        int c = 0;
        for (int i = finres.length - 1; i >= 0; i--) {
            finres[c++] = fina.get(i);
        }
        if (finres[0] == 0) {
            int[] b = new int[finres.length - 1];
            System.arraycopy(finres, 1, b, 0, b.length);
            return b;
        }

        return finres;
    }

    /**
     * 两个数组的交集
     *
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] intersect(int[] nums1, int[] nums2) {
        //使用排序的方法
//        int l1 = nums1.length;
//        int l2 = nums2.length;
//        int[] res = new int[Math.max(l1, l2)];
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i=0,j=0,c=0;
//        while (i < l1 && j < l2) {
//            if (nums1[i] == nums2[j]) {
//                res[c++] = nums1[i];
//                i++;
//                j++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            }else {
//                i++;
//            }
//        }
//        if (c > 0) {
//            return Arrays.copyOf(res, c);
//        }
//        return new int[0];

        //不使用排序的方法
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int aNums1 : nums1) {
            if (map.containsKey(aNums1))
                map.put(aNums1, map.get(aNums1) + 1);
            else
                map.put(aNums1, 1);
        }

        int[] res = new int[Math.max(nums1.length, nums2.length)];
        int c = 0;

        for (int aNums2 : nums2) {
            if (map.containsKey(aNums2) && map.get(aNums2) > 0) {
                res[c++] = aNums2;
                map.put(aNums2, map.get(aNums2) - 1);
            }
        }

        if (c > 0) {
            return Arrays.copyOf(res, c);
        }
        return new int[0];
    }

    /**
     * 旋转数组
     *
     * @param nums
     * @param k
     */
    private static void rotate(int[] nums, int k) {
        int[] re = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pos = (i + k) % nums.length;
            re[pos] = nums[i];
        }
        System.arraycopy(re, 0, nums, 0, re.length);

        //O(1) method
        /*
              public void rotate(int[] nums, int k) {
                  int n = nums.length;
                  k = k%n;
                  swap(nums,0,n-k-1);
                  swap(nums,n-k,n-1);
                  swap(nums,0,n-1);
              }
              private void swap(int[] nums, int i, int j) {
                  while (i < j) {
                      int temp = nums[i];
                      nums[i] = nums[j];
                      nums[j] = temp;
                      i++;
                      j--;
                  }
              }
         */
    }


    /**
     * 股票最大收益
     *
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                max += diff;
            }
        }
        return max;
    }


    /**
     * 删除重复值
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * BigDecimal使用
     */
    private static void bigDecimalDemo() {
        BigDecimal b1 = new BigDecimal("3.0");
        BigDecimal b2 = new BigDecimal("2.4");
        System.out.println(b1.subtract(b2));
    }

    /**
     * 打开本地word文档
     */
    private static void javaOpenDoc() {
        try {
            Desktop.getDesktop().open(new File("F:\\IdeaProjects\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
