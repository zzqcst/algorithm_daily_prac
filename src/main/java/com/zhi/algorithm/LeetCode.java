package com.zhi.algorithm;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class LeetCode {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public static class Interval {
        int start;
        int end;

        @Override
        public String toString() {
            return "Interval{" + "min=" + start + ", max=" + end + '}';
        }

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {
        //        ListNode node1 = new ListNode(4);
        //        ListNode node2 = new ListNode(5);
        //        ListNode node3 = new ListNode(8);
        //        ListNode node4 = new ListNode(12);
        //        ListNode node5 = new ListNode(15);
        //        ListNode node6 = new ListNode(1);
        //        ListNode node7 = new ListNode(3);
        //        ListNode node8 = new ListNode(4);
        //        ListNode node9 = new ListNode(7);
        //        ListNode node10 = new ListNode(8);
        //        ListNode node11 = new ListNode(9);
        //        ListNode node12 = new ListNode(20);
        //        ListNode node13 = new ListNode(21);
        //        node1.next = node2;
        //        node2.next = node3;
        //        node3.next = node4;
        //        node4.next = node5;
        //
        //        node6.next = node7;
        //        node7.next = node8;
        //        node8.next = node9;
        //        node9.next = node10;
        //        node10.next = node11;
        //        node11.next = node12;
        //        node12.next = node13;
        //        ListNode listNode = mergeTwoLists(node1, node6);
        //        while (listNode != null) {
        //            System.out.print(listNode.val + " ");
        //            listNode = listNode.next;
        //        }
        //        ListNode listNode = addTwoNumbers(node1, node4);
        //        while (listNode != null) {
        //            System.out.print(listNode.val + " ");
        //            listNode = listNode.next;
        //        }

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
        //        int[] a = {1};
        //        System.out.println(threeSum(new int[]{-2, 0, 1, 1, 2}));

        //        hannoi(3, "a", "b", "c");
        //        ListNode res = getIntersectionNode(node1, node6);
        //        while (res != null) {
        //            System.out.println(res.val);
        //            res = res.next;
        //        }
        //        TreeNode node1 = new TreeNode(3);
        //        TreeNode node2 = new TreeNode(9);
        //        TreeNode node3 = new TreeNode(20);
        //        TreeNode node4 = new TreeNode(15);
        //        TreeNode node5 = new TreeNode(7);
        //        node1.left = node2;
        //        node1.right = node3;
        //        node3.left = node4;
        //        node3.right = node5;
        //        List<List<Integer>> integers = zigzagLevelOrder(node1);
        //        for (List<Integer> integer : integers) {
        //            for (Integer integer1 : integer) {
        //                System.out.print(integer1 + " ");
        //            }
        //            System.out.println();
        //        }

        //        TreeLinkNode node1 = new TreeLinkNode(1);
        //        TreeLinkNode node2 = new TreeLinkNode(2);
        //        TreeLinkNode node3 = new TreeLinkNode(3);
        //        TreeLinkNode node4 = new TreeLinkNode(4);
        //        TreeLinkNode node5 = new TreeLinkNode(5);
        //        TreeLinkNode node6 = new TreeLinkNode(6);
        //        TreeLinkNode node7 = new TreeLinkNode(7);
        //        node1.left = node2;
        //        node1.right = node3;
        //        node2.left = node4;
        //        node2.right = node5;
        //        node3.left = node6;
        //        node3.right = node7;
        //
        //        connect(node1);
        //        List<String> strings = generateParenthesis(3);
        //        for (String string : strings) {
        //            System.out.println(string);
        //        }
        //        int[] nums = { 1, 2, 3 };
        //        List<List<Integer>> permute = subsets(nums);
        //        for (List<Integer> integers : permute) {
        //            System.out.println(integers.toString());
        //        }
        //        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        //        System.out.println(exist(board, "SEE"));
        //        Interval interval = new Interval(1, 3);
        //        Interval interval1 = new Interval(2, 6);
        //        Interval interval2 = new Interval(8, 10);
        //        Interval interval3 = new Interval(15, 18);
        //        List<Interval> list = new ArrayList<>();
        //        list.add(interval);
        //        list.add(interval1);
        //        list.add(interval2);
        //        list.add(interval3);
        //        for (Interval interval4 : merge(list)) {
        //            System.out.println(interval4);
        //        }
        //        while (scanner.hasNextInt()) {
        //            int n = scanner.nextInt();
        //            if (n > 1000) {
        //                n = 999;
        //            }
        //            List<Integer> list = new ArrayList<>();
        //            for (int i = 0; i < n; i++) {
        //                list.add(i);
        //            }
        //            int i = 0;
        //            while (list.size() > 1) {
        //                i = (i + 2) % list.size();
        //                list.remove(i);
        //            }
        //            System.out.println(list.get(0));
        //        }
        //        Scanner scanner = new Scanner(System.in);
        ////        while (scanner.hasNext()) {
        ////            String s = scanner.next();
        ////            int[] letters = new int[52];
        ////            for (int i = 0; i < s.length(); i++) {
        ////                if (s.charAt(i) > 'Z') {
        ////                    if (letters[s.charAt(i) - 'a' + 26] == 0) {
        ////                        System.out.print(s.charAt(i));
        ////                        letters[s.charAt(i) - 'a' + 26] = 1;
        ////                    }
        ////                } else {
        ////                    if (letters[s.charAt(i) - 'A'] == 0) {
        ////                        System.out.print(s.charAt(i));
        ////                        letters[s.charAt(i) - 'A'] = 1;
        ////                    }
        ////                }
        ////
        ////            }
        ////            System.out.println();
        ////        }
        //        Scanner scanner = new Scanner(System.in);
        //        while (scanner.hasNextInt()) {
        //            int[][] nums = new int[9][9];
        //            for (int i = 0; i < 9; i++) {
        //                for (int j = 0; j < 9; j++) {
        //                    nums[i][j] = scanner.nextInt();
        //                }
        //            }
        //
        //        }
        LeetCode l = new LeetCode();
        int[] nums = {7, 2, 5, 10, 8};
        l.splitArray(nums, 2);
    }

    //美丽的项链
    //https://www.nowcoder.com/questionTerminal/e7e0230b12de4239a7f547a01d731522?source=relative
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int n = scanner.nextInt();
//            int m = scanner.nextInt();
//            Node[] nodes = new Node[n];
//            for (int i = 0; i < n; i++) {
//                int start = scanner.nextInt();
//                int end = scanner.nextInt();
//                nodes[i] = new Node(start, end);
//            }
//            long[][] dp = new long[n + 1][m + 1];
////            初始化，只有一种宝珠选择的情况
//            for (int i = nodes[0].start; i <= nodes[0].end; i++) {
//                dp[1][i] = 1;
//            }
//            for (int i = 2; i <= n; i++) {
//                for (int j = 1; j <= m; j++) {
////                    选择该宝珠，可以从最小数量变化到最大数量
//                    for (int k = nodes[i - 1].start; k <= nodes[i - 1].end && j - k >= 0; k++) {
//                        dp[i][j] += dp[i - 1][j - k];
//                    }
//                }
//            }
//            System.out.println(dp[n][m]);
//        }
//    }
//
//    private static class Node {
//        int start, end;
//
//        public Node(int start, int end) {
//            this.start = start;
//            this.end = end;
//        }
//    }

    /**
     * 用队列实现栈
     */
    class MyStack {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int top;

        public MyStack() {

        }

        public void push(int x) {
            queue1.offer(x);
            top = x;
        }

        public int pop() {
            if (queue1.isEmpty()) {
                while (!queue2.isEmpty()) {
                    queue1.offer(queue2.poll());
                }
            }
            int tmp = queue1.size() - 1;
            while (tmp-- > 0) {
                top = queue1.poll();
                queue2.offer(top);
            }
            return queue1.poll();
        }

        public int top() {
            return top;
        }

        public boolean empty() {
            return queue2.isEmpty() && queue1.isEmpty();
        }
    }

    /**
     * 分发糖果
     *
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        //我们先找从左到右满足最少的糖果，再找从右到左的，最后取两边都满足的值(就是最大值)。
        if (ratings == null || ratings.length == 0) return 0;
        int n = ratings.length;
        int[] candy_nums = new int[n];
        Arrays.fill(candy_nums, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) candy_nums[i] = candy_nums[i - 1] + 1;
        }
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) candy_nums[i - 1] = Math.max(candy_nums[i - 1], candy_nums[i] + 1);
        }
        int res = 0;
        for (int i = 0; i < n; i++) res += candy_nums[i];
        return res;
    }

    /**
     * 分割数组最大值
     *
     * @param nums
     * @param m
     * @return
     */
    public int splitArray(int[] nums, int m) {
        //划分之后子数组最大值，大于数组中最大的一个元素，小于数组的总和
        long l = 0;
        long r = 0;
        int n = nums.length;
        //r是数组总和，l是数组中最大的值
        for (int i = 0; i < n; i++) {
            r += nums[i];
            if (l < nums[i]) {
                l = nums[i];
            }
        }
        long ans = r;
        while (l <= r) {
            //求出中间值mid，计算子数组和不大于mid时，能划分出几个子数组
            long mid = (l + r) >> 1;
            long sum = 0;
            int cnt = 1;//划分的子数组个数,初始值为1是因为，下面只在分割处加了1，分割1次，数组长度为2，所以初始值为1
            for (int i = 0; i < n; i++) {
                if (sum + nums[i] > mid) {
                    cnt++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }
            if (cnt <= m) {//划分出来的子数组少于m个，说明mid值大了
                ans = Math.min(ans, mid);
                r = mid - 1;
            } else {//划分出来的子数组多于m个，说明mid值小了
                l = mid + 1;
            }
        }
        return (int) ans;
    }

    /**
     * 移除元素
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
//        int i = 0;
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j] != val) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//        return i;
    }

    /**
     * 最低公共父节点
     *
     * @param root
     * @param first
     * @param second 思路：
     *               有两种情况，一是要找的这两个节点（p, q），在我遍历的这个节点（r）的两侧，那么我这个节点就是这
     *               两个节点的最小公共父节点；二是节点在同一侧，则 r->left 或者 r->right 为 NULL,另一边返回p或者q，
     *               那么另一边返回的就是他们的最小公共父节点。
     *               递归有两个出口，一是没有找到p或者q，则返回NULL；二是只要碰到p或者q，就立刻返回。
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode first, TreeNode second) {
        if (root == null) {
            return root;
        }
        if (root == first || root == second) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, first, second);
        TreeNode right = lowestCommonAncestor(root.right, first, second);
        if (left == null) {//左边没找到，两个节点都在右边
            return right;
        }
        if (right == null) {//右边没找到，两个节点在左边
            return left;
        }
        return root;//左右都找到了，两个节点在两边，返回root
    }

    /**
     * 最长回文子序列
     *
     * @param s
     * @return
     */
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];//dp[i][j]表示从第i个字符到第j个字符，回文子序列的最大长度
        //s[i]==s[j]时，dp[i][j] = dp[i + 1][j - 1] + 2; 因此i的遍历需要从后到前
        //s[i]!=s[j]时,dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

    //n个员工m中语言，需要多少个翻译机
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();//n个人
//        int m = scanner.nextInt();//m种语言
//        int k = scanner.nextInt();//k种情况
//        if (k == 0) {
//            System.out.println(n);
//            return;
//        }
//        int[] pre = new int[n + 1];
//        int[][] map = new int[n + 1][m + 1];//map[i][j]第i个人会第j中语言
//        for (int i = 0; i < n; i++) {
//            pre[i + 1] = i + 1;
//        }
//        for (int i = 0; i < k; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            map[a][b] = 1;
//        }
//
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                for (int l = 1; l <= n; l++) {
//                    if (map[j][i] == map[l][i] && map[j][i] != 0) {//第j个和第l个人都会语言i
//                        union(pre, j, l);
//                    }
//                }
//            }
//        }
//        int ans = 0;
//        for (int i = 1; i <= n; i++) {
//            if (pre[i] == i) {
//                ans++;
//            }
//        }
//        System.out.println(ans - 1);
//    }
//
//    static void union(int[] pre, int x, int y) {
//        int a = find(pre, x);
//        int b = find(pre, y);
//        if (a != b) {
//            pre[y] = a;
//        }
//    }
//
//    static int find(int[] pre, int x) {
//        if (x == pre[x]) {
//            return x;
//        } else {
//            return pre[x] = find(pre, pre[x]);
//        }
//    }

    /**
     * 最长公共字符串
     *
     * @param str1
     * @param str2
     * @return
     */
    private static int getCommonStrLength(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];//dp[i][j] 表示到str1[i-1]和str2[j-1]位置公共字符串长度
        int max = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }


    /**
     * 最长公共子序列
     * 图解：https://blog.csdn.net/hrn1216/article/details/51534607
     *
     * @param a
     * @param b
     * @return
     */
    public static int findLCS(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n + 1][m + 1];//dp[i][j]表示a[i-1]结束的字符串和b[j-1]结束的字符串公共序列长度
        int maxLen = 0;//记录最长公共序列的长度
        StringBuilder sb = new StringBuilder();
        //path[i][j] 表示到达i,j的位置的上一个位置在哪，1表示上一个位置是左上方，
        //2表示上一个位置是上边，3表示上一个值位置是左边
        int[][] path = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    path[i][j] = 1;
                } else if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = dp[i - 1][j];
                    path[i][j] = 2;
                } else {//dp[i - 1][j] > dp[i][j - 1]和dp[i - 1][j] == dp[i][j - 1]的情况都选择左边
                    dp[i][j] = dp[i][j - 1];
                    path[i][j] = 3;
                }
                if (dp[i][j] > maxLen) {
                    sb.append(a.charAt(i - 1));
                    maxLen = dp[i][j];
                }
            }
        }

        //输出路径
        printLCS(path, a, b, n, m);
        System.out.println();
//        return sb.toString();//求最长公共序列返回sb.toString，只能得到其中一种
        return dp[n][m];//求最大长度返回dp[n][m]
    }

    /**
     * 最长公共子序列长度，压缩空间版
     * @param t1
     * @param t2
     * @return
     */
    public static int longestCommonSubsequence(String t1, String t2) {
        int a = t1.length();
        int b = t2.length();
        int[] dp = new int[b+1];
        int up=0;
        for (int i = 1; i < a + 1; i++) {
            int leftUp =0;
            for (int j = 1; j < b + 1; j++) {
                up=dp[j];
                if (t1.charAt(i-1)==t2.charAt(j-1)){
                    dp[j]=leftUp+1;
                }else {
                    dp[j]=Math.max(up,dp[j-1]);
                }
                leftUp=up;
            }
        }
        return dp[b];
    }

    public static void printLCS(int[][] path, String a, String b, int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (path[i][j] == 1) {
            printLCS(path, a, b, i - 1, j - 1);
            System.out.print(a.charAt(i - 1));
        } else if (path[i][j] == 2) {
            printLCS(path, a, b, i - 1, j);
        } else {
            printLCS(path, a, b, i, j - 1);
        }
    }

    /**
     * 两两交换链表中的节点
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        //递归
//        if (head == null || head.next == null) {
//            return head;
//        }
//        //每次递归调用都会交换head和next
//        ListNode next = head.next;
//        head.next = swapPairs(next.next);
//        next.next=head;
//        return next;
        //遍历法
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode tmp = pre;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode start = tmp.next;
            ListNode end = tmp.next.next;
            start.next = end.next;
            tmp.next = end;
            end.next = start;
            tmp = start;

        }
        return pre.next;
    }

    //区间加法
    void rangeAddition() {
        //第一行两个数字m和n，分别表示数字范围和区间数量
        //加下来n行表示在n个区间上加1
        //输入示例：
        //10 2
        //0 6
        //3 6
        //输出：
        //1 1 1 2 2 2 2 0 0 0
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int[] nums = new int[range];
        int m = scanner.nextInt();
        int[][] each = new int[m][2];
        for (int i = 0; i < m; i++) {
            each[i][0] = scanner.nextInt();
            each[i][1] = scanner.nextInt();
            nums[each[i][0]] += 1;
            if (each[i][1] + 1 < nums.length) {
                nums[each[i][1] + 1] -= 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < range; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        for (int i = 0; i < range; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


    /**
     * 求生艇
     * 每次选最轻的和最重的一起坐，如果超了，最重的自己坐一条
     *
     * @param people
     * @param limit
     * @return
     */
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int i = 0, j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            res++;
            j--;
        }
        return res;
    }

    /**
     * 最长重复子数组
     *
     * @param A
     * @param B
     * @return
     */
    public int findLength(int[] A, int[] B) {
        int res = 0;
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = B.length - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    if (dp[i][j] > res) {
                        res = dp[i][j];
                    }
                }
            }
        }
        return res;
    }

    /**
     * 犯罪计划（没看懂解法）
     *
     * @param G
     * @param P
     * @param group
     * @param profit
     * @return
     */
    int profitableSchemes(int G, int P, int[] group, int[] profit) {
        int resultSum = 0;
        int planNum = group.length;
        int[][] recordProfit = new int[G + 1][P + 1];//[i][j] i个人利润j时犯罪方案数,对于一个方案(m,n),方案数为做了这个犯罪和不做这个犯罪的总方案数，
        // [i][j]=[i][j]+[i-m][j-n]
        final int constNum = 1000000007;
        recordProfit[0][0] = 1;

        for (int i = 0; i < planNum; i++) {
            for (int j = G; j >= group[i]; j--) {
                for (int k = P; k >= 0; k--) {
                    //第i个犯罪计划做和不做
                    recordProfit[j][k] = (recordProfit[j][k] + recordProfit[j - group[i]][Math.max(0, k - profit[i])]) % constNum;
                }
            }
        }

        for (int i = 0; i <= G; i++) {
            resultSum = (resultSum + recordProfit[i][P]) % constNum;
        }
        return resultSum;
    }


    /**
     * 最长连续序列
     * <p>
     * 输入: [100, 4, 200, 1, 3, 2]
     * 输出: 4
     * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
     *
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        //使用hashset保存每个数字
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            //将每个数字作为连续序列的第一个数，得出从它开始连续序列的长度
            if (!set.contains(nums[i] - 1)) {
                int start = nums[i];
                int len = 1;
                while (set.contains(start + 1)) {
                    len++;
                    start++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
        //使用排序的解法
//        if(nums.length<1){
//            return 0;
//        }
//        int res=1;
//        Arrays.sort(nums);
//        int max=1;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==nums[i-1]+1){//与上个数字连续时，记录res递增
//                res++;
//            }else if(nums[i]==nums[i-1]){//与上个数字相同时，res不递增，但是也不重置
//                continue;
//            }
//            else{//与上个数字不连续了，res重置，从这个数字开始数连续序列长度
//                res=1;
//            }
//            if(res>max){
//                max=res;
//            }
//        }
//        return max;
    }

    /**
     * 三维形体的表面积
     * <p>
     * 对于每一堆方块，顶层和底层两面不会被挡住，上下左右判断和相邻方块堆的高度差，为负则完全被挡住，加0
     *
     * @param grid
     * @return
     */
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        if (n < 1) {
            return 0;
        }
        int m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0) {
                    res += 2;
                    int left = i == 0 ? -1 : i - 1;
                    int right = i == n - 1 ? -1 : i + 1;
                    int up = j == 0 ? -1 : j - 1;
                    int down = j == m - 1 ? -1 : j + 1;
                    if (right != -1) {
                        res += Math.max(grid[i][j] - grid[right][j], 0);
                    } else {
                        res += grid[i][j];
                    }
                    if (left != -1) {
                        res += Math.max(grid[i][j] - grid[left][j], 0);
                    } else {
                        res += grid[i][j];
                    }
                    if (up != -1) {
                        res += Math.max(grid[i][j] - grid[i][up], 0);
                    } else {
                        res += grid[i][j];
                    }
                    if (down != -1) {
                        res += Math.max(grid[i][j] - grid[i][down], 0);
                    } else {
                        res += grid[i][j];
                    }
                }
            }
        }
        return res;
    }

    /**
     * 通配符匹配
     * <p>
     * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
     *
     * @param s 字符串
     * @param p 模式
     * @return
     */
    public boolean isMatch2(String s, String p) {
        return false;
    }


    /**
     * 跳跃游戏2
     * 每次找能跳最远的位置
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int end = 0;
        int maxPos = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPos = Math.max(maxPos, nums[i] + i);
            if (i == end) {
                step++;
                end = maxPos;
            }
        }
        return step;
    }


    /**
     * 01背包
     *
     * @param wi 物品体积 wi=new int(n+1）
     * @param pi 物品价值 pi = new int(n+1)
     * @param w  背包容量
     * @return
     */
    public int pack(int[] wi, int[] pi, int w) {
//        int n = wi.length;//物品数量
//        int[][] dp = new int[n + 1][w + 1];//dp[i][j]背包容量为j时，前i个物品的最大价值
//        //dp[i][j]=Math.max(dp[i - 1][j - wi[i]] + pi[i], dp[i - 1][j]);//装第i个和不装第i个的最大值
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= w; j++) {
//                if (j < wi[i]) {//背包容量小于当前物品体积,则第i个物品装不了
//                    dp[i][j] = dp[i - 1][j];
//                } else {
//                    dp[i][j] = Math.max(dp[i - 1][j - wi[i]] + pi[i], dp[i - 1][j]);
//                }
//            }
//        }
//        return dp[n][w];

        //压缩dp，记录i对应的每一行
        int n = wi.length;
        int[] dp = new int[w + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = w; j >= wi[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - wi[i]] + pi[i]);
            }
        }
        return dp[w];
    }

    /**
     * k个一组翻转链表
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;

            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {//翻转链表
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 接雨水
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int maxLeft = 0;
        int sum = 0;
        int[] maxRight = new int[height.length];
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length; i++) {
            maxLeft = Math.max(maxLeft, height[i - 1]);
            int min = Math.min(maxLeft, maxRight[i]);
            if (min > height[i]) {
                sum += min - height[i];
            }
        }
        return sum;
    }

    /**
     * 环形链表2
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        //设置两个指针，一个一次走一步，另一个一次走两步，若有环，两个指针会相遇，记录相遇的节点
        //保存相遇的节点，顺着这个节点走并计数，再次走回这个节点时，得到环中节点数量count
        //设置两个指针，一个先走count步后，两个指针再同时走，当两个节点指向同一个节点时，该节点即环的入口节点
        ListNode meetNode = getMeetNode(head);
        if (meetNode != null) {
            int count = 0;
            ListNode tmp = meetNode;
            while (true) {
                tmp = tmp.next;
                count++;
                if (tmp == meetNode) {
                    break;
                }
            }
            tmp = head;
            while (count-- > 0) {
                tmp = tmp.next;
            }
            while (true) {
                if (tmp == head) {
                    return tmp;
                } else {
                    tmp = tmp.next;
                    head = head.next;
                }
            }
        }
        return null;
    }

    public ListNode getMeetNode(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                return fast;
            }
        }
        return fast;
    }

    /**
     * 下一个排列
     * <p>
     * 找到恰好比当前排列大的序列，例如1,2,3；则1,3,2 恰好比它大
     *
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        //1.找到临界点nums[i] < nums[i + 1]
        //2.从i向后找，找到一个恰好比nums[i]大的元素num[j],而nums[j+1]<=nums[i]或者j==nums.length-1
        //3.交换nums[i]和nums[j]
        //4.数组i之后的数字翻转
        //举例，例如，4,9,8,5,4,3,2；交换之后为5,9,8,4,4,3,2,；然后从9开始的元素翻转即可，得到5,2,3,4,4,8,9
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int temp = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > nums[i] && (j == nums.length - 1 || nums[j + 1] <= nums[i])) {
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                break;
            }
        }
        //i是临界的位置，或者-1（原序列是递减时）
        i = i + 1;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    /**
     * x的平方根
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        long low = 0;
        long high = x / 2 + 1;
        while (low < high) {
            long mid = (high + low + 1) >> 1;//+1是防止计算后mid仍然等于low,例如low:2,high:3
            if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return (int) low;
    }

    /**
     * leetcode
     * Excel表列序号
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Math.pow(26, len - i - 1) * (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }

    /**
     * leetcode
     * 组合总数
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        getSum(candidates, target, 0, res, new ArrayList<Integer>());
        return res;
    }

    private void getSum(int[] candidates, int target, int start, List<List<Integer>> res, ArrayList<Integer> temp) {
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] == target) {
                temp.add(candidates[i]);
                res.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
                return;
            }
            if (candidates[i] < target) {
                temp.add(candidates[i]);
                getSum(candidates, target - candidates[i], i, res, temp);
                temp.remove(temp.size() - 1);
            }
            if (candidates[i] > target) {
                return;
            }
        }
    }

    /**
     * leetcode
     * 合并k个有序链表
     * <p>
     * 归并
     *
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    public static ListNode merge(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = (start + end) >> 1;
        ListNode left = merge(lists, start, mid);
        ListNode right = merge(lists, mid + 1, end);
        return mergeTwoLists(left, right);
    }

    /**
     * leetcode 29
     * 两数相除
     *
     * @param dividend
     * @param divisor
     * @return
     */
    public static int divide(int dividend, int divisor) {
        long first = dividend;
        long second = divisor;
        int sign = 1;
        if (first < 0) {
            first = -first;
            sign = -sign;
        }
        if (second < 0) {
            second = -second;
            sign = -sign;
        }
        long count = 0;
        while (first >= second) {
            long tmp = second;
            long i = 1;
            while (first >= tmp) {
                first -= tmp;
                count += i;
                i <<= 1;
                tmp <<= 1;
            }
        }
        return count > Integer.MAX_VALUE ? (sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE) : (int) ((sign > 0) ? count : -count);
    }

    /**
     * leetcode 86
     * 分隔链表
     * 分割链表
     *
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;//将两个链表进行链接
        return beforeHead.next;
    }

    /**
     * LRU缓存机制
     * <p>
     * 使用双向链表，添加和查找时，将节点放到头部，移除时直接删除尾部节点
     */
    class LRUCache {
        // 双链表节点
        class Node {
            int key;
            int val;
            Node prev;
            Node next;
        }

        private int capacity;
        private Node first;
        private Node last;

        private Map<Integer, Node> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>(capacity);
        }

        public int get(int key) {
            Node node = map.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node);
            return node.val;
        }

        private void moveToHead(Node node) {
            if (node == first) {
                return;
            } else if (node == last) {
                last.prev.next = null;
                last = last.prev;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            node.prev = first.prev;
            node.next = first;
            first.prev = node;
            first = node;
        }

        public void put(int key, int value) {
            Node node = map.get(key);

            if (node == null) {
                node = new Node();
                node.key = key;
                node.val = value;

                if (map.size() == capacity) {
                    removeLast();
                }

                addToHead(node);
                map.put(key, node);
            } else {
                node.val = value;
                moveToHead(node);
            }
        }

        private void addToHead(Node node) {
            if (map.isEmpty()) {
                first = node;
                last = node;
            } else {
                node.next = first;
                first.prev = node;
                first = node;
            }
        }

        private void removeLast() {
            map.remove(last.key);
            Node prevNode = last.prev;
            if (prevNode != null) {
                prevNode.next = null;
                last = prevNode;
            }
        }
    }

    /**
     * 可怜的小猪
     *
     * @param buckets
     * @param minutesToDie
     * @param minutesToTest
     * @return
     */
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int base = minutesToTest / minutesToDie + 1;
        while (Math.pow(base, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }

    /**
     * 将二叉搜索树转化为排序的双向链表
     *
     * @param root
     * @return
     */
    public TreeNode treeToDoublyList(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                list.add(temp);
                temp = temp.right;
            }
        }
        TreeNode node = null;
        for (int i = 0; i < list.size(); i++) {
            node = list.get(i);
            if (i + 1 < list.size()) {
                node.right = list.get(i + 1);
            } else {
                node.right = list.get(0);
            }
            if (i - 1 >= 0) {
                node.left = list.get(i - 1);
            } else {
                node.left = list.get(list.size() - 1);
            }
        }
        return node == null ? node : node.right;
    }


    /**
     * 和为k的子数组
     * <p>
     * 给定一个整数数组和一个整数k,找到数组中和为k的连续子数组的个数
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        // 例如1,5,3,1,2,4;k=4
        //到5时，元素和为6，只要往后累加过程中和为10，则说明中间的某个子序列和为4
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, res = 0;

        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;
    }

    boolean sumisk(int[] nums, int start, int k) {
        int sum = 0;
        for (int i = start; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                return true;
            }
            if (sum > k) {
                return false;
            }
        }
        return false;
    }


    /**
     * leetcode
     * 从中序遍历与后序遍历序列构造二叉树
     * <p>
     * 后序遍历最后一个是根节点，中序遍历中，根节点左边的是左子树，右边的是右子树
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree2(int[] inorder, int[] postorder) {
        return construct2(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode construct2(int[] inorder, int infrom, int into, int[] postorder, int postfrom, int postto) {
        if (infrom > into || postfrom > postto) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postto]);
        for (int i = infrom; i <= into; i++) {
            if (inorder[i] == postorder[postto]) {
                root.left = construct2(inorder, infrom, i - 1, postorder, postfrom, postfrom + i - infrom - 1);
                root.right = construct2(inorder, i + 1, into, postorder, postfrom + i - infrom, postto - 1);
            }
        }
        return root;
    }

    /**
     * leetcode
     * 有序数组中的单一元素
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0, j = nums.length - 1; i < nums.length - 1 && j > 0; i += 2, j -= 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            if (nums[j] != nums[j - 1]) {
                return nums[j];
            }
        }
        return 0;
    }

    /**
     * leetcode
     * 检查替换后的词是否有效
     *
     * @param S
     * @return
     */
    public boolean isValid2(String S) {
        if (S == null || S.length() < 3 || !S.startsWith("a")) {
            return false;
        }
        char pre = '0';
        int flag = 0;
        for (char s : S.toCharArray()) {
            switch (s) {
                case 'a'://类似括号匹配，遇到a，表示开始
                    flag++;
                    break;
                case 'b':
                    if (pre == 'b') {//b之前的字符可能是a，例如ababcc,可能是c,例如aabcbc
                        return false;
                    }
                    break;
                case 'c':
                    if (pre == 'a') {//c之前的字符可能是b,可能是c,例如ababcc
                        return false;
                    }
                    flag--;//表示abc的结束
                    if (flag < 0) {//说明c之前没有a出现过，或c的数量与a的数量不匹配
                        return false;
                    }
                    break;
            }
            pre = s;
        }
        return flag == 0;
    }

    /**
     * leetcode
     * 随机翻转矩阵
     */
    static class Solution2 {
        int rows;
        int cols;
        int one_count;
        int totalsize;
        Set<Integer> set = new TreeSet<>();
        Random random = new Random(System.currentTimeMillis());

        public Solution2(int n_rows, int n_cols) {
            rows = n_rows;
            cols = n_cols;
            totalsize = n_cols * n_rows;
        }

        public int[] flip() {
            if (one_count == totalsize) {
                return new int[0];
            }

            while (true) {
                int val = Math.abs(random.nextInt() % totalsize);
                if (!set.contains(val)) {
                    set.add(val);
                    one_count++;
                    return new int[]{val / cols, val % cols};
                }
            }

        }

        public void reset() {
            set.clear();
            one_count = 0;
        }
    }

    /**
     * leetcode
     * 冗余连接
     * <p>
     * 并查集
     *
     * @param edges
     * @return
     */
    public int[] findRedundantConnection(int[][] edges) {
        int[] pre = new int[edges.length + 1];
        for (int i = 0; i < pre.length; i++) {
            pre[i] = i;
        }
        for (int[] edge : edges) {
            int root1 = find(pre, edge[0]);
            int root2 = find(pre, edge[1]);
            if (root1 == root2) {
                return edge;
            }
            pre[root2] = root1;
        }
        return new int[0];
    }

    /**
     * 查找并压缩路径
     *
     * @param pre
     * @param x
     * @return
     */
    private int find(int[] pre, int x) {
        if (pre[x] == x) {
            return x;
        }
        return pre[x] = find(pre, pre[x]);
    }

    /**
     * leetcode
     * 课程表2
     *
     * @param numCourses
     * @param prerequisites{{1,0},{2,0}表示1的先修课程是0,2的先修课程是0
     * @return
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean isPossible = true;
        //<src,lst>保存src指向的所有节点
        Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
        int[] indegree = new int[numCourses];
        int[] topologicalOrder = new int[numCourses];

        // Create the adjacency list representation of the graph
        for (int i = 0; i < prerequisites.length; i++) {
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
            lst.add(dest);
            adjList.put(src, lst);

            // 计算每个节点的入度
            indegree[dest] += 1;
        }

        // 将入度为0的点加入队列
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int i = 0;
        // 每次取出一个入度为0的点，输出，然后所有该点指向的点的入度减1，减完之后有入度为0的点，入队列
        while (!q.isEmpty()) {
            int node = q.remove();
            topologicalOrder[i++] = node;

            if (adjList.containsKey(node)) {
                for (Integer each :
                        adjList.get(node)) {
                    indegree[each]--;

                    // If in-degree of a nei***or becomes 0, add it to the Q
                    if (indegree[each] == 0) {
                        q.add(each);
                    }
                }
            }
        }

        if (i == numCourses) {//能输出的节点数等于总节点数，说明该图能拓扑排序
            return topologicalOrder;
        }

        return new int[0];
    }

    /**
     * leetcode
     * 翻转字符串里的单词
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        s = s.trim();
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if (!s1[i].equals("")) {
                sb.append(s1[i]);
                if (i != 0) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    /**
     * leetcode
     * 摆动序列
     *
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int up = 1;
        int down = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            }
            if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }

    /**
     * leetcode
     * 子域名访问计数
     *
     * @param cpdomains
     * @return
     */
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        for (String cpdomain : cpdomains) {
            String[] s = cpdomain.split(" ");
            int count = Integer.parseInt(s[0]);
            String domain = s[1];
            int start = 0;
            while (domain.substring(start).length() > 0) {
                String sub = domain.substring(start);
                map.put(sub, map.getOrDefault(sub, 0) + count);
                start = domain.indexOf(".", start + 1) + 1;
                if (start == 0) {
                    start = domain.length();
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            res.add(entry.getValue() + " " + entry.getKey());
        }
        return res;
    }

    /**
     * leetcode
     * 坏了的计算器
     *
     * @param X
     * @param Y
     * @return
     */
    public int brokenCalc(int X, int Y) {
        int res = 0;
        while (X < Y) {//当Y大于X时，让Y除以2快速接近X
            if (Y % 2 == 0) {
                Y /= 2;
                res++;
            } else {//不能整除2时，先加一再整除，占用两步
                Y = (Y + 1) / 2;
                res += 2;
            }
        }//退出循环时，X==Y
        return X - Y + res;//当X大于Y时，只能X递减1靠近Y，此时res为0
    }


    /**
     * leetcode
     * 掉落的方块
     *
     * @param positions
     * @return
     */
    public List<Integer> fallingSquares(int[][] positions) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();//<k,v> 表示位置k~k+1处最大高度为v
        int max = 0;
        for (int i = 0; i < positions.length; i++) {
            int position = positions[i][0];
            int width = positions[i][1];
            int tempMax = 0;
            for (int j = position; j < width + position; j++) {
                tempMax = Math.max(map.getOrDefault(j, 0), tempMax);
            }
            for (int j = position; j < width + position; j++) {
                map.put(j, tempMax + width);
            }
            if (tempMax + width > max) {
                max = tempMax + width;
            }
            list.add(max);
        }
        return list;
    }

    /**
     * leetcode
     * 回旋镖的数量
     * 哈希表
     *
     * @param points
     * @return
     */
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int len = dis(points[i], points[j]);
                map.put(len, map.getOrDefault(len, 0) + 1);
            }
            for (int v : map.values()) {
                if (v >= 2) {
                    res += v * (v - 1);
                }
            }
        }
        return res;
    }

    public int dis(int[] a, int[] b) {
        return (int) (Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2));
    }

    /**
     * leetcode
     * 将数组拆分成斐波那契数列
     * 回溯法
     *
     * @param S
     * @return
     */
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        searchValidNums(S, res, new ArrayList<Integer>(), 0);
        return res;
    }

    private void searchValidNums(String s, List<Integer> res, ArrayList<Integer> list, int start) {
        if (!res.isEmpty()) {
            return;
        }
        if (start == s.length()) {
            if (list.size() >= 3) {
                res.addAll(list);
            }
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(start) == '0' && i > start) {
                return;
            }
            long num = Long.valueOf(s.substring(start, i + 1));
            if (num > Integer.MAX_VALUE) {
                return;
            }
            if (list.size() >= 2 && (num > list.get(list.size() - 1) + list.get(list.size() - 2))) {
                break;
            } else if (list.size() < 2 || (num == list.get(list.size() - 1) + list
                    .get(list.size() - 2))) {
                list.add((int) num);
                searchValidNums(s, res, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    /**
     * leetcode
     * 最长有效括号
     *
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        if (s.length() <= 1) {
            return 0;
        }
        int max = 0;
        int start = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {//左括号
                stack.push(i);
            } else {//右括号
                if (stack.isEmpty()) {//遇到右括号栈为空，下一个字符是起始字符
                    start = i + 1;
                } else {
                    stack.pop();//弹出
                    if (stack.isEmpty()) {
                        max = Math.max(max, i - start + 1);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
        }
        return max;
    }

    /**
     * leetcode
     * 不同的二叉搜索树
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        //dp[n] = dp[0]*dp[n-1]+dp[1]*dp[n-2]+...+dp[n-1]*dp[0]
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            //dp[5]=dp[0]*dp[4]+dp[1]*dp[3]+dp[2]*dp[2]+dp[3]*dp[1]+dp[4]*dp[0]
            for (int j = 1; j <= i; j++) {
                count += dp[j - 1] * dp[i - j];
            }
            dp[i] = count;
        }
        return dp[n];
    }

    /**
     * LeetCode
     * 打家劫舍2
     *
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        int[] dp = new int[nums.length];//dp[i]:到第i户的最高金额，dp[i]=max(dp[i-1],dp[i-2]+nums[i])
        int[] dp2 = new int[nums.length];
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        dp[1] = nums[0];//偷第一个不偷最后一个
        dp2[1] = nums[1];//偷最后一个不偷第一个
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i]);
        }
        return Math.max(dp[nums.length - 1], dp2[nums.length - 1]);
    }

    /**
     * leetcode
     * 单词拆分
     * 动态规划
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];//dp[i]表示s以i-1结尾的单词能否被词典表示
        dp[0] = true;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }

    /**
     * leetcode
     * N叉数最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                depth = Math.max(maxDepth(root.children.get(i)), depth);
            }
        }
        return depth + 1;
    }

    /**
     * leetcode
     * 四数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (nums == null || nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if (nums[i] + nums[len - 1] + nums[len - 2] + nums[len - 3] < target) {
                continue;
            }
            for (int j = i + 1; j < len - 2; j++) {
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if (j != i + 1 && nums[j] == nums[j - 1] || nums[i] + nums[j] + nums[len - 1] + nums[len - 2] < target) {
                    continue;
                }
                int left = j + 1;
                int right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (left != j + 1 && nums[left] == nums[left - 1] || sum < target) {
                        left++;
                    } else if (right != len - 1 && nums[right] == nums[right + 1] || sum > target) {
                        right--;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * leetcode
     * 最接近的三数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        //-4,-1,1,2
        int res = 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int fixed = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (Math.abs(sum + fixed - target) < min) {
                    res = sum + fixed;
                    min = Math.abs(sum + fixed - target);
                }
                if (sum + fixed > target) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return res;
    }

    /**
     * leetcode
     * 柠檬水找零
     *
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
                continue;
            }
            if (bill == 10) {
                if (five == 0) {
                    return false;
                } else {
                    five--;
                }
                ten++;
                continue;
            }
            if (bill == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * leetcode
     * 寻找两个有序数组的中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //https://leetcode-cn.com/problems/median-of-two-sorted-arrays/solution/4-xun-zhao-liang-ge-you-xu-shu-zu-de-zhong-wei-shu
        int n = nums1.length;
        int m = nums2.length;

        if (n > m)  //保证数组1一定最短
        {
            return findMedianSortedArrays(nums2, nums1);
        }

        // Ci 为第i个数组的割,比如C1为2时表示第1个数组只有2个元素。LMaxi为第i个数组割后的左元素。RMini为第i个数组割后的右元素。
        int LMax1 = 0, LMax2 = 0, RMin1 = 0, RMin2 = 0, c1 = 0, c2 = 0, lo = 0, hi = 2 * n;  //我们目前是虚拟加了'#'所以数组1是2*n长度

        while (lo <= hi)   //二分
        {
            c1 = (lo + hi) / 2;  //c1是二分的结果
            c2 = m + n - c1;

            LMax1 = (c1 == 0) ? Integer.MIN_VALUE : nums1[(c1 - 1) / 2];
            RMin1 = (c1 == 2 * n) ? Integer.MAX_VALUE : nums1[c1 / 2];
            LMax2 = (c2 == 0) ? Integer.MIN_VALUE : nums2[(c2 - 1) / 2];
            RMin2 = (c2 == 2 * m) ? Integer.MAX_VALUE : nums2[c2 / 2];

            if (LMax1 > RMin2) {
                hi = c1 - 1;
            } else if (LMax2 > RMin1) {
                lo = c1 + 1;
            } else {
                break;
            }
        }
        return (Math.max(LMax1, LMax2) + Math.min(RMin1, RMin2)) / 2.0;
    }

    /**
     * leetcode
     * 解数独
     *
     * @param board
     */
    public void solveSudoku(char[][] board) {
        //marks[0][i]标记第i行数字，marks[1][j]标记第j列数字,marks[2][cubeIndex]标记第cubeIndex个方块
        int[][] marks = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = 1 << (board[i][j] - '1');
                    marks[0][i] |= num;
                    marks[1][j] |= num;
                    int cubeIndex = i / 3 * 3 + j / 3;
                    marks[2][cubeIndex] |= num;
                }
            }
        }
        //回朔法
        solve(board, marks, 0, 0);
    }

    private boolean solve(char[][] board, int[][] marks, int i, int j) {
        while (board[i][j] != '.') {
            j++;
            if (j >= 9) {
                i++;
                j = 0;
            }
            if (i >= 9) {
                return true;
            }
        }

        for (int fill = 1; fill < 10; fill++) {
            int cubeIndex = i / 3 * 3 + j / 3;
            int num = 1 << (fill - 1);
            if ((marks[0][i] & num) == 0 && (marks[1][j] & num) == 0
                    && (marks[2][cubeIndex] & num) == 0) {
                marks[0][i] |= num;
                marks[1][j] |= num;
                marks[2][cubeIndex] |= num;
                board[i][j] = (char) ('0' + fill);
                if (solve(board, marks, i, j)) {
                    return true;
                } else {
                    marks[0][i] ^= num;
                    marks[1][j] ^= num;
                    marks[2][cubeIndex] ^= num;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    /**
     * leetcode
     * 最低加油次数
     *
     * @param target
     * @param startFuel
     * @param stations
     * @return
     */
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (stations.length == 0 && target > startFuel) {
            return -1;
        }
        int ans = 0;
        int pos = 0;
        int[][] sta = new int[stations.length + 1][2];
        System.arraycopy(stations, 0, sta, 0, stations.length);
        sta[stations.length][0] = target;//把最终目的地也加入，方便比较
        sta[stations.length][1] = 0;
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        while (startFuel < target) {
            //保存所有能达到的加油站
            while (pos < sta.length - 1 && startFuel >= sta[pos][0]) {
                queue.offer(sta[pos++][1]);
            }

            //遇到无法到达的加油站时，从能到达的加油站按油量从大到小加油
            while (startFuel < sta[pos][0]) {
                if (queue.isEmpty()) {//如果为空，说明所有能达到加油站都加了油也无法到达
                    return -1;
                }
                startFuel += queue.poll();
                ans++;
            }
        }
        return ans;
    }

    /**
     * leetcode
     * 整数转罗马数字
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] dic = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder sb = new StringBuilder();
        //把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中
        //并且按照阿拉伯数字的大小降序排列，这是贪心选择思想
        while (num > 0 && i < dic.length) {
            if (num >= value[i]) {
                sb.append(dic[i]);
                num -= value[i];
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    /**
     * leetcode
     * 阶乘后的0
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        // 对于n的阶乘n！，其因式分解中，如果存在一个因子“5”，那么它必然对应着n！末尾的一个“0”。
        //当0 < n < 5时，f(n!) = 0;
        //当n >= 5时，f(n!) = k + f(k!), 其中 k = n / 5（取整）。
        if (n < 5) {
            return 0;
        }
        return n / 5 + trailingZeroes(n / 5);
    }

    /**
     * leetcode
     * 快乐数
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        //所有不快乐数的数位平方和计算，最後都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中。
        while (n != 4) {
            if (n == 1) {
                return true;
            }
            int sum = 0;
            while (n != 0) {
                int temp = n % 10;
                sum += temp * temp;
                n = n / 10;
            }
            n = sum;
        }
        return false;
    }

    static class RandomizedSet {
        private HashMap<Integer, Integer> map = null;

        /**
         * Initialize your data structure here.
         */
        public RandomizedSet() {
            map = new HashMap<>();
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain the specified element.
         */
        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, val);
            return true;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified element.
         */
        public boolean remove(int val) {
            if (map.containsKey(val)) {
                map.remove(val);
                return true;
            }
            return false;
        }

        /**
         * Get a random element from the set.
         */
        public int getRandom() {
            Set<Integer> keys = map.keySet();
            Object[] objects = keys.toArray();
            Random rand = new Random();
            int key = rand.nextInt(keys.size());
            return map.get(objects[key]);
        }
    }

    /**
     * leetcode
     * 盛水最多的容器
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int i = 0, j = len - 1, temp = 0;
        //每次移动高度较小的
        while (i < j) {
            temp = (j - i) * Math.min(height[i], height[j]);
            if (temp > max) {
                max = temp;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    /**
     * leetcode
     * 回文数
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * leetcode
     * 正则表达式匹配
     *
     * @param s
     * @param pattern
     * @return
     */
    public boolean isMatch(String s, String pattern) {
        if (s == null || pattern == null) {
            return false;
        }
        //dp[i][j]表示s中下标到i-1的子串和pattern中下标到j-1的模式匹配
        boolean[][] dp = new boolean[s.length() + 1][pattern.length() + 1];
        dp[0][0] = true;
        //匹配空字符串的情况
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = dp[0][i - 1];
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                //能匹配当前字符时
                if (pattern.charAt(j) == '.' || pattern.charAt(j) == s.charAt(i)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (pattern.charAt(j) == '*') {
                    //不能匹配当前字符，*当空处理
                    if (pattern.charAt(j - 1) != s.charAt(i) && pattern.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        //当空处理；匹配多次；匹配一次
                        dp[i + 1][j + 1] = dp[i + 1][j - 1] || dp[i][j + 1] || dp[i + 1][j];
                    }
                }
            }
        }
        return dp[s.length()][pattern.length()];
    }

    /**
     * leetcode 不同路径2
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        if (rows == 0) {
            return 0;
        }
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < cols; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            dp[0][i] = 1;
        }
        for (int i = 0; i < rows; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[rows - 1][cols - 1];
    }

    /**
     * leetcode
     * 解码方法
     * 隐含条件，以0开头的无法解码，比如01不能解码为A
     * <p>
     * <p>
     * (1)满足以10或者20结尾的，dp[n]=dp[n-2] =>"1220":[12,20],[1,2,20];"12":[12],[1,2]
     * (2)以x0结尾，x>2的，不能解码
     * (3)以0x结尾的，dp[n]=dp[n-1] => "1203":[1,20,3];"120":[1,20]
     * (4)后两位不大于26的，dp[n]=dp[n-1]+dp[n-2]=>"1226":[1,2,26],[12,26],[1,22,6],[12,2,6],[1,2,2,6]
     * (5)后两位大于26的，dp[n]=dp[n-1] => "1236":[1,2,3,6],[1,23,6],[12,3,6]
     *
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];//dp[i]表示从0到i-1的子字符串编码数
        if (s.charAt(0) != '0') {
            dp[1] = dp[0] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) == '0') {//以0结尾的字符串
                if (s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2')//倒数第二位如果是1或2
                {
                    dp[i] = dp[i - 2];//比如“210”的编码数跟“2”一样
                } else {
                    return 0;//“230”无法编码
                }
            } else {
                dp[i] = dp[i - 1];//"201"与“20”
                if (s.charAt(i - 2) != '0') {//倒数第二位为不为0
                    int t = 10 * (s.charAt(i - 2) - '0') + s.charAt(i - 1) - '0';
                    if (t <= 26)//后两位组成的数字可以编码
                    {
                        dp[i] += dp[i - 2];//"221"的编码数等于“2”的编码数加上“22”编码数
                    }
                    //“231”编码数等于“23”编码数
                }
            }
        }
        return dp[n];
    }

    /**
     * leetcode
     * 最小路径和
     * dp[i][j]表示到达(i,j)的最小代价
     * 则dp[i][j]=min{dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]}
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        /**
         * 当前单元格 (i,j)(i,j) 只能从左方单元格 (i-1,j)(i−1,j) 或上方单元格 (i,j-1)(i,j−1) 走到，
         * 因此只需要考虑矩阵左边界和上边界。
         * 走到当前单元格 (i,j) 的最小路径和 == “从左方单元格 (i−1,j) 与 从上方单元格(i,j−1) 走来的两个最小路
         * 径和中较小的 ” + 当前单元格值 grid[i][j] 。具体分为以下 4 种情况
         *
         * 当左边和上边都不是矩阵边界时: 即当i!=0,j!=0时，dp[i][j]=min(dp[i-1][j],dp[i][j-1])+grid[i][j]
         *
         * 当只有左边是矩阵边界时：只能从上面来，即当i=0,j!=0时，dp[i][j]=dp[i][j-1]+grid[i][j]
         *
         * 当只有上面是矩阵边界时：只能从左边来，即当i!=0,j=0时，dp[i][j]=dp[i-1][j]+grid[i][j]
         *
         * 当左边和上边都是矩阵边界时：即当i=0,j=0,其实就是起点，dp[i][j]=grid[i][j]
         *
         */
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                else if (i == 0) grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if (j == 0) grid[i][j] = grid[i - 1][j] + grid[i][j];
                else grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    /**
     * leetcode
     * 等差数列的划分
     *
     * @param A
     * @return
     */
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0;
        int add = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i - 1] - A[i] == A[i - 2] - A[i - 1]) {
                res += ++add;
            } else {
                add = 0;
            }
        }
        return res;
    }

    public int sliceCount(int[] A) {
        int count = 0;
        int[] dp = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
                count += dp[i];
            }
        }
        return count;
    }

    /**
     * leetcode
     * 只有两个键的键盘
     *
     * @param n
     * @return
     */
    public int minSteps(int n) {
        //非质数的的因子和
        int res = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                res += i;
                n /= i;
            }
        }
        return res;
    }

    /**
     * leetcode
     * 逆波兰表达式求值
     *
     * @param tokens
     * @return
     */
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String op = tokens[i];
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                switch (op) {
                    case "+":
                        stack.push(String.valueOf(
                                Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop())));
                        break;
                    case "-":
                        int a = Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(Integer.valueOf(stack.pop()) - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(
                                Integer.valueOf(stack.pop()) * Integer.valueOf(stack.pop())));
                        break;
                    case "/":
                        int b = Integer.parseInt(stack.pop());
                        stack.push(String.valueOf(Integer.valueOf(stack.pop()) / b));
                }
            } else {
                stack.push(op);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    int count = 0;

    /**
     * leetcode N皇后2
     *
     * @param n
     * @return
     */
    public int totalNQueens(int n) {
        int[] pre_pos = new int[n];//pre_pos[i] 表示第i行皇后的所在列
        getSolutions(0, n, pre_pos);
        return count;
    }

    private void getSolutions(int current_row, int n, int[] pre_pos) {
        if (current_row == n) {
            count++;
            return;
        }
        for (int current_col = 0; current_col < n; current_col++) {
            if (isAvali(current_row, n, pre_pos, current_col)) {
                pre_pos[current_row] = current_col;
                getSolutions(current_row + 1, n, pre_pos);
            }
        }
    }

    private boolean isAvali(int current_row, int n, int[] pre_pos, int current_col) {
        for (int i = 0; i < current_row; i++) {
            if (current_col == pre_pos[i] || Math.abs(current_col - pre_pos[i]) == Math
                    .abs(current_row - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * leetcode N皇后
     * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击
     * 任意两个皇后不能放在同一行，同一列或同一斜线上
     *
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n) {
        int[] pre_cols = new int[n];//pre_cols[i]:第i行皇后所在列
        List<List<String>> res = new ArrayList<>();
        queen(n, 0, res, pre_cols);
        return res;
    }

    private void queen(int n, int row, List<List<String>> res, int[] pre_cols) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                char[] chars = new char[n];
                for (int j = 0; j < n; j++) {
                    chars[j] = '.';
                }
                chars[pre_cols[i]] = 'Q';
                solution.add(new String(chars));
            }
            res.add(solution);
            return;
        }
        for (int i = 0; i < n; i++) {//在该行的每一列上尝试放一个皇后
            if (check(n, row, i, pre_cols)) {
                pre_cols[row] = i;
                queen(n, row + 1, res, pre_cols);
            }
        }
    }

    private boolean check(int n, int row, int col, int[] pre_cols) {//检查之前的行的同一列上有没有皇后
        for (int i = 0; i < row; i++) {
            if (col == pre_cols[i] || Math.abs(col - pre_cols[i]) == Math.abs(row - i)) {
                return false;
            }
        }
        return true;
    }

    private boolean validMathExpre(String s) {
        Stack<Character> stack = new Stack<>();//栈用来匹配括号
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' || c == '/' || c == '+' || c == '-') {//遇到运算符时
                if (i - 1 >= 0 && s.charAt(i - 1) >= '0') {//前一个是数字，只需要判断下一个是不是数字或左括号
                    if (!(i + 1 < s.length() && s.charAt(i + 1) >= '0' || s.charAt(i + 1) == '(')) {
                        return false;
                    }
                } else if (i - 1 >= 0 && s.charAt(i - 1) == ')') {//前一个是右括号，只需要判断下一个是不是数字或左括号
                    if (!(i + 1 < s.length() && s.charAt(i + 1) >= '0' || s.charAt(i + 1) == '(')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * 根据后缀表达式计算值
     * 如果是数字，入栈，如果是运算符，弹出两个元素，做相应计算，结果入栈
     * 最终栈中元素就是结果
     *
     * @param s
     * @return
     */
    int compute(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOperator(c)) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (c) {
                    case '+':
                        stack.push(String.valueOf(a + b));
                        break;
                    case '-':
                        stack.push(String.valueOf(b - a));
                        break;
                    case '*':
                        stack.push(String.valueOf(a * b));
                        break;
                    case '/':
                        stack.push(String.valueOf(b / a));
                        break;
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return Integer.parseInt(stack.peek());
    }

    boolean isOperator(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }

    int prior(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    /**
     * 得到后缀表达式
     * 1. 中缀表达式从前往后遍历，如果是数字，添加到结果字符串中
     * 2. 如果是操作符，如果栈为空，操作符入栈；如果栈不为空，如果栈顶是操作符，如果优先级大于栈顶元素，入栈，
     * 如果小于栈顶元素，栈顶元素弹出到结果字符，再跟栈顶元素比较，循环
     * 3.如果是左括号，入栈
     * 4. 如果遇到右括号，逐个弹出栈内元素到结果字符串，直到弹出左括号
     * 5. 便利完成后，如果栈不为空，将元素弹出到结果字符串
     *
     * @param a
     * @return
     */
    String getPostfix(String a) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (isOperator(c)) {
                while (!stack.isEmpty() && isOperator(stack.peek()) && prior(stack.peek()) >= prior(
                        c)) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else {
                sb.append(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    /**
     * leetcode 基本计算器3
     * 输入的字符串包含括号，加减乘除，空格
     * 例如：2*(5+5*2)/3+(6/2+8)
     *
     * @param s
     * @return
     */
    public static int calculate3(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char pre_op = '+';//当前数字之前的运算符
        int cur_num = 0;//当前数字
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                cur_num = cur_num * 10 + c - '0';
            } else if (c == '(') {
                int j = i, cnt = 0;
                for (; i < s.length(); i++) {
                    if (s.charAt(i) == '(') {
                        cnt++;
                    }
                    if (s.charAt(i) == ')') {
                        cnt--;
                    }
                    if (cnt == 0) {
                        break;
                    }
                }
                cur_num = calculate3(s.substring(j + 1, i));
            }
            if (c < '0' && c != ' ' || i == s.length() - 1) {//当前字符是运算符，或者已经是最后一个字符了
                if (pre_op == '+') {
                    stack.push(cur_num);
                }
                if (pre_op == '-') {
                    stack.push(-cur_num);
                }
                if (pre_op == '*') {
                    stack.push(stack.pop() * cur_num);
                }
                if (pre_op == '/') {
                    stack.push(stack.pop() / cur_num);
                }
                pre_op = c;
                cur_num = 0;
            }
        }
        cur_num = 0;
        while (!stack.isEmpty()) {
            cur_num += stack.pop();
        }
        return cur_num;
    }

    /**
     * leetcode
     * 基本计算器Ⅱ
     *
     * @param s
     * @return
     */
    public int calculate2(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char pre_op = '+';//上一个运算符
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = 10 * num + c - '0';
            }
            if (c < '0' && c != ' ' || i == s.length() - 1) {//遇到运算符，或者到了最后一个字符
                if (pre_op == '+') {//上一个符号即数字之前的符号
                    stack.push(num);
                }
                if (pre_op == '-') {
                    stack.push(-num);
                }
                if (pre_op == '*') {
                    int pre = stack.pop();
                    stack.push(pre * num);
                }
                if (pre_op == '/') {
                    int pre = stack.pop();
                    stack.push(pre / num);
                }
                pre_op = c;
                num = 0;
            }
        }

        num = 0;//重复利用
        while (!stack.isEmpty()) {
            num += stack.pop();
        }
        return num;
    }

    /**
     * leetcode
     * 基本计算器
     *
     * @param s
     * @return
     */
    public static int calculate(String s) {
        //递归法
        if (s.length() == 0) {
            return 0;
        }
        int num = 0;
        char pre_op = '+';
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '(') {
                int j = i, cnt = 0;
                for (; i < s.length(); i++) {
                    if (s.charAt(i) == '(') {
                        cnt++;
                    }
                    if (s.charAt(i) == ')') {
                        cnt--;
                    }
                    if (cnt == 0) {
                        break;
                    }
                }
                num = calculate(s.substring(j + 1, i));
            }
            if (c < '0' && c != ' ' || i == s.length() - 1) {
                if (pre_op == '-') {
                    res = res - num;
                }
                if (pre_op == '+') {
                    res = res + num;
                }
                pre_op = c;
                num = 0;
            }

        }
        return res;

        //使用栈来实现括号优先级
        //        int res = 0, sign = 1, len = s.length(), totalRings = 0;
        //        Stack<Integer> stack = new Stack<>();
        //        for (int i = 0; i < len; i++) {
        //            char c = s.charAt(i);
        //            if (c >= '0' && c <= '9') {//当前字符是数字
        //                totalRings = 10 * totalRings + c - '0';
        //            } else if (c == '+') {
        //                res += sign * totalRings;
        //                sign = 1;
        //                totalRings = 0;
        //            } else if (c == '-') {
        //                res += sign * totalRings;
        //                sign = -1;
        //                totalRings = 0;
        //            } else if (c == '(') {
        //                stack.push(res);
        //                stack.push(sign);
        //                res = 0;
        //                sign = 1;
        //                totalRings = 0;
        //            } else if (c == ')') {
        //                res += sign * totalRings;
        //                totalRings = 0;
        //                res *= stack.pop();//括号内的结果
        //                res += stack.pop();//括号内结果和括号外结果合并
        //            }
        //        }
        //        res += totalRings * sign;
        //        return res;
    }

    /**
     * leetcode
     * z字形变换
     *
     * @param s
     * @param numRows
     * @return
     */
    private static String convert(String s, int numRows) {
        int len = s.length();
        if (len == 0 || numRows == 0 || numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, len); i++) {
            list.add(new StringBuilder());
        }

        int row = 0;
        boolean change = false;
        for (int i = 0; i < len; i++) {
            list.get(row).append(s.charAt(i));
            if (row == 0 || row == numRows - 1) {
                change = !change;
            }
            row += change ? 1 : -1;
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : list) {
            sb.append(stringBuilder);
        }
        return sb.toString();
    }

    /**
     * 二叉树的序列化与反序列化
     * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
     * <p>
     * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
     * <p>
     * 示例:
     * <p>
     * 你可以将以下二叉树：
     * <p>
     * 1
     * / \
     * 2   3
     * / \
     * 4   5
     * <p>
     * 序列化为 "[1,2,3,null,null,4,5]"
     *
     * @param root
     * @return
     */
    // Encodes a tree to a single string.
    private static String serialize(TreeNode root) {
        List<Integer> inorder = inorderTraversal(root);
        List<Integer> preorder = preorderTraversal(root);
        return preorder.toString() + "-" + inorder.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] split = data.split("-");
        if (split[0].length() == 2 && split[1].length() == 2) {
            return null;
        }
        split[0] = split[0].replace('[', ' ').replace(']', ' ').trim();
        split[1] = split[1].replace('[', ' ').replace(']', ' ').trim();
        String[] split1 = split[0].split(",");
        String[] split2 = split[1].split(",");
        int[] pre = new int[split1.length];
        int[] inor = new int[split2.length];
        for (int i = 0; i < pre.length; i++) {
            pre[i] = Integer.parseInt(split1[i].trim());
        }
        for (int i = 0; i < inor.length; i++) {
            inor[i] = Integer.parseInt(split2[i].trim());
        }
        return buildTree(pre, inor);
    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    /**
     * 最长增长子序列
     * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
     * <p>
     * 示例:
     * <p>
     * 输入: [10,9,3,5,2,7,101,18]
     * 输出: 4
     * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
     *
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        //        int len = 0;
        //        if (nums == null || nums.length == 0) {
        //            return 0;
        //        }
        //        int[] dp = new int[nums.length];
        //        dp[0] = 1;
        //        //dp[i] 表示到i为止是最长递增子序列的长度
        //        for (int i = 1; i < nums.length; i++) {
        //            dp[i] = 1;
        //            for (int j = 0; j < i; j++) {
        //                if (nums[i] > nums[j]) {//找到i之前的递增子序列最大长度
        //                    dp[i] = Math.max(dp[i], dp[j] + 1);
        //                }
        //            }
        //        }
        //        for (int i = 0; i < nums.length; i++) {
        //            len = Math.max(dp[i], len);
        //        }
        //        return len;
        //-------------------------
        //输入: [10,9,2,5,3,7,101,18]
        //输出: 4

//如果要求子序列是非递减的
//        if (nums.length == 0) return 0;
//        int[] s = new int[nums.length];
//        int top = 0;
//        s[top] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] >= s[top]) {//这里等号
//                s[++top] = nums[i];
//            } else {
//                int lo = 0, hi = top;
//                while (lo <= hi) {
//                    int mid = (lo + hi) / 2;
//                    if (s[mid] <= nums[i]) {//这里等号,否则替换的是相同的值
//                        lo = mid + 1;
//                    } else {
//                        hi = mid - 1;
//                    }
//                }
//                s[lo] = nums[i];
//            }
//        }
//        return top + 1;


        if (nums.length < 1) {
            return 0;
        }
        //对于[0, 8, 4, 12, 2]，遍历到8时，dp中存储的是0、8，len=2，遍历到4时，用4替换8，因为0、4比0、8更容易得到更长的上升序列，此时len还是2
        //遍历到12时，12存到len位置，len加1，遍历到2时，2替换4,0、2比0、4更容易得到更长的上升序列，同时len保存了上一个状态最长上升序列的长度
        int[] dp = new int[nums.length];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = Arrays.binarySearch(dp, 0, len, nums[i]);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = nums[i];
            if (index == len) {
                len++;
            }
        }
        return len;
    }

    /**
     * 零钱兑换
     * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
     * <p>
     * 示例 1:
     * <p>
     * 输入: coins = [1, 2, 5], amount = 11
     * 输出: 3
     * 解释: 11 = 5 + 5 + 1
     * 示例 2:
     * <p>
     * 输入: coins = [2], amount = 3
     * 输出: -1
     * 说明:
     * 你可以认为每种硬币的数量是无限的。
     */
    public static int coinChange(int[] coins, int amount) {
        //从金额数是1，一直往金额数为amount上计算
        if (amount == 0 || coins.length <= 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];//dp[i]表示金额为i时，需要的硬币数
        Arrays.fill(dp, amount + 1);
        Arrays.sort(coins);
        for (int i = 1; i <= amount; i++) {//金额从1开始
            for (int j = 0; j < coins.length; j++) {//对于每个硬币coins[j]
                if (i - coins[j] == 0) {//正好等于金额i时
                    dp[i] = 1;
                } else if (i - coins[j] > 0) {//当该枚硬币可选时
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);//硬币数为，不选coin[j]和选了coins[j]中硬币数最少的
                }
            }
        }
        //没有能组合的硬币时，dp[amount]为初始值amount+1
        return dp[amount] > amount ? -1 : dp[amount];
    }

    /**
     * leetcode
     * 不同路径
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
     * <p>
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
     * <p>
     * 问总共有多少条不同的路径？
     * <p>
     * 说明：m 和 n 的值均不超过 100。
     * <p>
     * 示例 1:
     * <p>
     * 输入: m = 3, n = 2
     * 输出: 3
     * 解释:
     * 从左上角开始，总共有 3 条路径可以到达右下角。
     * 1. 向右 -> 向右 -> 向下
     * 2. 向右 -> 向下 -> 向右
     * 3. 向下 -> 向右 -> 向右
     * 示例 2:
     * <p>
     * 输入: m = 7, n = 3
     * 输出: 28
     *
     * @param m
     * @param n
     * @return
     */
    private static int uniquePaths(int m, int n) {
        //递归方法
        //        Map<String, Integer> map = new HashMap<>();
        //        return nextStep(1, 1, m, n, 0, map);
        //----------------
        //数组方法
        //        int[][] steps = new int[m][n];
        //        steps[0][0] = 1;
        //        int up = 0;
        //        int left = 0;
        //        for (int i = 0; i < m; i++) {
        //            for (int j = 0; j < n; j++) {
        //                if (i == 0 && j == 0) {
        //                    continue;
        //                }
        //                up = 0;
        //                left = 0;
        //                if (i > 0) {
        //                    up = steps[i - 1][j];
        //                }
        //                if (j > 0) {
        //                    left = steps[i][j - 1];
        //                }
        //                steps[i][j] = up + left;
        //            }
        //        }
        //        return steps[m - 1][n - 1];
        //-----------
        //只保留上一行结果的数组方法
        int[] up = new int[n];
        for (int i = 0; i < n; i++) {
            up[i] = 1;
        }
        int left = 1;
        int current = 1;
        for (int i = 1; i < m; i++) {
            left = 1;
            for (int j = 1; j < n; j++) {
                current = up[j] + left;
                left = current;
                up[j] = current;
            }
        }
        return current;
    }

    private static int nextStep(int right, int down, int m, int n, int poss,
                                Map<String, Integer> map) {
        if (map.containsKey(right + "," + down)) {
            return map.get(right + "," + down);
        }
        if (right > n || down > m) {
            return 0;
        }
        if (right == n && down == m) {
            poss++;
            return poss;
        }
        int stepr = nextStep(right + 1, down, m, n, poss, map);
        map.put((right + 1) + "," + down, stepr);
        int stepd = nextStep(right, down + 1, m, n, poss, map);
        map.put(right + "," + (down + 1), stepd);
        return stepr + stepd;
    }

    /**
     * 跳跃游戏
     * 给定一个非负整数数组，你最初位于数组的第一个位置。
     * <p>
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * <p>
     * 判断你是否能够到达最后一个位置。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [2,3,1,1,4]
     * 输出: true
     * 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
     * 示例 2:
     * <p>
     * 输入: [3,2,1,0,4]
     * 输出: false
     * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
     *
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        //递归实现
        //能否到达第n步，检查前n-1步是否能到达第n步,若递归能进行到0,则代表可以从第0步到达第n步
        //        Map<Integer, Boolean> map = new HashMap<>();
        //        return preStep(nums,nums.length-1,map);
        //-------------------
        //贪心算法
        //        int lastStep = nums.length - 1;
        //        for (int i = nums.length - 2; i >= 0; i--) {
        //            if (i + nums[i] >= lastStep) {//从第i步能到达第lastStep
        //                lastStep = i;
        //            }
        //        }
        //        return lastStep == 0;
        //-----------------
        //动态规划
        int max = 0;//能到达的最大距离

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {//最大距离到不了i
                return false;
            }

            max = Math.max(nums[i] + i, max);
        }

        return true;
    }

    private static boolean preStep(int[] nums, int to, Map<Integer, Boolean> map) {
        if (map.containsKey(to)) {
            return map.get(to);
        }
        boolean res = false;
        if (to == 0) {
            res = true;
        }
        for (int i = to - 1; i >= 0; i--) {
            if (to - i <= nums[i]) {//第i步能到to
                res = preStep(nums, i, map);//则检查第i步是否能到达
                if (res) {//如果第i步能到达，则to也能到达,直接返回结果
                    return true;
                }
            }
        }
        map.put(to, res);
        return res;
    }

    /**
     * 搜索二维矩阵 II
     * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
     * <p>
     * 每行的元素从左到右升序排列。
     * 每列的元素从上到下升序排列。
     * 示例:
     * <p>
     * 现有矩阵 matrix 如下：
     * <p>
     * [
     * [1,   4,  7, 11, 15],
     * [2,   5,  8, 12, 19],
     * [3,   6,  9, 16, 22],
     * [10, 13, 14, 17, 24],
     * [18, 21, 23, 26, 30]
     * ]
     * 给定 target = 5，返回 true。
     * <p>
     * 给定 target = 20，返回 false。
     *
     * @param matrix
     * @param target
     * @return
     */
    private static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;
        int j = cols - 1, i = 0;//j控制列数，i控制行数
        while (j >= 0 && i < rows) {//从右上角开始搜索，较大往下，较小往左
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    /**
     * 搜索旋转排序数组
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * <p>
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     * <p>
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     * <p>
     * 你可以假设数组中不存在重复的元素。
     * <p>
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 0
     * 输出: 4
     * 示例 2:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 3
     * 输出: -1
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 合并区间
     * 给出一个区间的集合，请合并所有重叠的区间。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 示例 2:
     * <p>
     * 输入: [[1,4],[4,5]]
     * 输出: [[1,5]]
     * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     * @param intervals
     * @return
     */
    public static List<Interval> merge(List<Interval> intervals) {
        //简单粗暴法，先根据start值排序，再从前往后两两合并
        int size = intervals.size();
        List<Interval> res = new ArrayList<>();
        if (size == 0) {
            return res;
        }
        if (size == 1) {
            return intervals;
        }
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        for (int i = 1; i < size; i++) {//从第二个开始
            Interval current = intervals.get(i);
            Interval pre = intervals.get(i - 1);
            if (pre.end >= current.start) {//如果前一个跟当前能合并，则将当前区间改为合并后的区间
                current.end = Math.max(current.end, pre.end);
                current.start = pre.start;
                //此处不需要立即添加到res中，因为下一个有可能可以继续合并，当不能合并时，再添加到res中
            } else {
                //当前的跟上一个不能合并,将上一个添加到结果中
                res.add(pre);
            }
        }
        res.add(intervals.get(size - 1));
        return res;
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * <p>
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * <p>
     * 如果数组中不存在目标值，返回 [-1, -1]。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [5,7,7,8,8,10], target = 8
     * 输出: [3,4]
     * 示例 2:
     * <p>
     * 输入: nums = [5,7,7,8,8,10], target = 6
     * 输出: [-1,-1]
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && res[0] == -1) {//res[0]==-1表示第一次出现
                res[0] = i;
                res[1] = i;
                continue;
            }
            if (nums[i] == target) {
                res[1] = i;
            }

        }
        return res;
    }

    /**
     * 寻找峰值
     * 峰值元素是指其值大于左右相邻值的元素。
     * <p>
     * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
     * <p>
     * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
     * <p>
     * 你可以假设 nums[-1] = nums[n] = -∞。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,2,3,1]
     * 输出: 2
     * 解释: 3 是峰值元素，你的函数应该返回其索引 2。
     * 示例 2:
     * <p>
     * 输入: nums = [1,2,1,3,5,6,4]
     * 输出: 1 或 5
     * 解释: 你的函数可以返回索引 1，其峰值元素为 2；
     * 或者返回索引 5， 其峰值元素为 6。
     *
     * @param nums
     * @return
     */
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int pre = i - 1 < 0 ? Integer.MIN_VALUE : nums[i - 1];
            int next = i + 1 > nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1];
            if (nums[i] > pre && nums[i] > next) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 数组中的第K个最大元素
     * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [3,2,1,5,6,4] 和 k = 2
     * 输出: 5
     * 示例 2:
     * <p>
     * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
     * 输出: 4
     * 说明:
     * <p>
     * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k == 1) {
                return nums[i];
            }
            k--;
        }
        return 0;
    }

    /**
     * 前K个高频元素
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,1,1,2,2,3], k = 2
     * 输出: [1,2]
     * 示例 2:
     * <p>
     * 输入: nums = [1], k = 1
     * 输出: [1]
     *
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        //        List<Integer> res = new ArrayList<>();
        //        Map<Integer, Integer> freq = new HashMap<>();
        //        //统计频率
        //        for (int totalRings : nums) {
        //            if (freq.containsKey(totalRings)) {
        //                freq.put(totalRings, freq.get(totalRings) + 1);
        //                continue;
        //            }
        //            freq.put(totalRings, 0);
        //        }
        //
        //        int i = 0;
        //        //根据频率排序，将数字按降序放回原数组
        //        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        //            if (i == 0) {
        //                nums[i] = entry.getKey();
        //                i++;
        //                continue;
        //            }
        //            int j = i - 1;
        //            while (j>=0&&entry.getValue() > freq.get(nums[j])) {
        //                nums[j + 1] = nums[j];
        //                j--;
        //            }
        //            nums[j+1]=entry.getKey();
        //            i++;
        //        }
        //        for (int j = 0; j < k; j++) {
        //            res.add(nums[j]);
        //        }
        //        return res;
        List<Integer> list = new ArrayList<>();

        //使用优先队列自动排序
        PriorityQueue<Map.Entry<Integer, Integer>>
                pq =
                new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1,
                                       Map.Entry<Integer, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                });

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : set) {
            pq.add(entry);
        }

        for (int i = 0; i < k; i++) {
            list.add(pq.poll().getKey());
        }

        return list;

    }

    /**
     * 颜色分类
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * <p>
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     * <p>
     * 注意:
     * 不能使用代码库中的排序函数来解决这道题。
     * <p>
     * 示例:
     * <p>
     * 输入: [2,0,2,1,1,0]
     * 输出: [0,0,1,1,2,2]
     *
     * @param nums
     */
    public static void sortColors(int[] nums) {
        //选择排序
        //原理：每一趟从待排序的记录中选出最小的元素，顺序放在已排好序的序列最后，直到全部记录排序完毕。
        //        for (int i = 0; i < nums.length - 1; i++) {
        //            int k = i;
        //            for (int j = i + 1; j < nums.length; j++) {
        //                if (nums[j] < nums[k]) {
        //                    k = j;//记下目前找到的最小值所在的位置
        //
        //                }
        //            }
        //            if (i != k) {
        //                nums[i] = nums[i] + nums[k] - (nums[k] = nums[i]);//和最小位置处的数字交换
        //            }
        //        }

        //        //冒泡排序
        //        冒泡排序的基本思想是，对相邻的元素进行两两比较，顺序相反则进行交换，
        //         这样，每一趟会将最小或最大的元素“浮”到顶端，最终达到完全有序
        //        for (int i = 0; i < nums.length - 1; i++) {
        //            for (int j = 0; j < nums.length - i - 1; j++) {
        //                if (nums[j] > nums[j + 1]) {
        //                    nums[j] = nums[j] + nums[j + 1] - (nums[j + 1] = nums[j]);
        //                }
        //            }
        //        }

        //插入排序
        //每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
        int j, current;
        for (int i = 1; i < nums.length; i++) {//i之前的是有序序列
            j = i - 1;
            current = nums[i];//current是待排元素
            while (j >= 0 && nums[j] > current) {//与有序序列中比较
                nums[j + 1] = nums[j];//若有序序列中j所指向的数字大于current，后移
                j--;
            }
            nums[j + 1] = current;//最后将待排元素放到正确位置
        }
    }

    /**
     * 单词搜索
     * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
     * 单词必须是连续的，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
     * 示例:
     * board =
     * [
     * ['A','B','C','E'],
     * ['S','F','C','S'],
     * ['A','D','E','E']
     * ]
     * 给定 word = "ABCCED", 返回 true.
     * 给定 word = "SEE", 返回 true.
     * 给定 word = "ABCB", 返回 false.
     *
     * @param board
     * @param word
     * @return
     */
    public static boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        char[] chars = word.toCharArray();
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == chars[0]) {
                    boolean res = findLetter(board, chars, i, j, 0);
                    if (res) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean findLetter(char[][] board, char[] chars, int row, int col, int i) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || i >= chars.length
                || board[row][col] != chars[i]) {
            return false;
        }
        if (i == chars.length - 1) {//匹配到最后一个也相同
            return true;
        }
        board[row][col] = '#';//访问过的标记，避免重复访问
        boolean
                res =
                findLetter(board, chars, row + 1, col, i + 1) || findLetter(board, chars, row,
                        col + 1, i + 1) || findLetter(board, chars, row - 1, col, i + 1)
                        || findLetter(board, chars, row, col - 1, i + 1);
        board[row][col] = chars[i];//恢复原值，避免影响从其它地方开始的比较
        return res;
    }

    /**
     * 子集
     * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
     * 说明：解集不能包含重复的子集。
     * 示例:
     * 输入: nums = [1,2,3]
     * 输出:
     * [
     * [3],
     * [1],
     * [2],
     * [1,2,3],
     * [1,3],
     * [2,3],
     * [1,2],
     * []
     * ]
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsets(int[] nums) {
        //        List<List<Integer>> res = new ArrayList<>();
        //        getsubset(nums,0, new ArrayList<Integer>(), res);
        //        res.add(new ArrayList<Integer>());
        //        return res;

        //另一种解法
        /*
         *
         * 初始：res:[]
         * 遍历到1，res:[],[1]
         * 遍历到2：之前result的结果中都加入2，[],[1],[2].[1,2]
         * 遍历到3：之前result的结果中都加入3,......
         *
         * */
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for (int n : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));//每次在已有结果上加上新的数字
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }

    /**
     * from参数表示只向后添加数字
     * 第一层循环中，各自添加了1,2,3
     * 在它们各自的递归中，from参数变为从下一个数开始，例如：
     * 上一层是2，下一层则从3开始添加，避免了2添加之后又添加1的重复情况
     *
     * @param nums
     * @param from
     * @param level
     * @param res
     */
    private static void getsubset(int[] nums, int from, ArrayList<Integer> level,
                                  List<List<Integer>> res) {
        for (int i = from; i < nums.length; i++) {
            ArrayList<Integer> list = new ArrayList<>(level);
            list.add(nums[i]);
            res.add(list);
            getsubset(nums, i + 1, list, res);
        }
    }

    /**
     * 全排列
     * 给定一个没有重复数字的序列，返回其所有可能的全排列。
     * 示例:
     * 输入: [1,2,3]
     * 输出:
     * [
     * [1,2,3],
     * [1,3,2],
     * [2,1,3],
     * [2,3,1],
     * [3,1,2],
     * [3,2,1]
     * ]
     *
     * @param nums 给定的数字序列
     * @return 返回全排列结果
     */
    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findAll(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private static void findAll(int[] nums, int count, List<Integer> level,
                                List<List<Integer>> res) {
        if (count == nums.length) {
            res.add(level);
            return;
        }
        for (int num : nums) {
            List<Integer> t = new ArrayList<>(level);
            if (!t.contains(num)) {
                t.add(num);
                findAll(nums, count + 1, t, res);
            }
        }

    }

    /**
     * 生成括号
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     * <p>
     * 例如，给出 n = 3，生成结果为：
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        gen("", res, n, n);
        return res;
    }

    private static void gen(String s, List<String> res, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            gen(s + "(", res, left - 1, right);
        }
        if (right > 0) {
            gen(s + ")", res, left, right - 1);
        }
        if (left == 0 && right == 0) {
            res.add(s);
        }
    }

    private static String[]
            maps =
            {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    /**
     * 电话号码的字母组合
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
     * <p>
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/solution/leetcode-17-letter-combinations-of-a-phone-number-/
     *
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        findCombinations(digits, 0, "", res);
        return res;
    }

    private static void findCombinations(String digits, int curlen, String s, List<String> res) {
        if (curlen == digits.length()) {
            res.add(s);
            return;
        }
        char letter = digits.charAt(curlen);//获取数字
        String letters = maps[letter - '0'];//获取数字对应的字母们
        for (int i = 0; i < letters.length(); i++) {
            findCombinations(digits, curlen + 1, s + letters.charAt(i), res);
        }
    }

    /**
     * 岛屿的个数
     * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
     * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
     * <p>
     * 示例 1:
     * <p>
     * 输入:
     * 11110
     * 11010
     * 11000
     * 00000
     * <p>
     * 输出: 1
     * 示例 2:
     * <p>
     * 输入:
     * 11000
     * 11000
     * 00100
     * 00011
     * <p>
     * 输出: 3
     *
     * @param grid
     * @return
     */
    public static int numIslands(char[][] grid) {
        //遍历grid,遇到1则计数加一，同时将其上下左右相邻的1置为0
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    toZero(grid, i, j, rows, cols);
                }
            }
        }
        return res;
    }

    private static void toZero(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {//超出边界了
            return;
        }
        if (grid[i][j] != '1') {//遇到相邻的不是1
            return;
        }
        grid[i][j] = '0';
        toZero(grid, i - 1, j, rows, cols);
        toZero(grid, i + 1, j, rows, cols);
        toZero(grid, i, j - 1, rows, cols);
        toZero(grid, i, j + 1, rows, cols);
    }

    /**
     * 二叉搜索树中第K小的元素
     * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
     * <p>
     * 说明：
     * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
     * 示例 1:
     * <p>
     * 输入: root = [3,1,4,null,2], k = 1
     * 3
     * / \
     * 1   4
     * \
     * 2
     * 输出: 1
     * 示例 2:
     * <p>
     * 输入: root = [5,3,6,2,4,null,null,1], k = 3
     * 5
     * / \
     * 3   6
     * / \
     * 2   4
     * /
     * 1
     * 输出: 3
     *
     * @param root
     * @param k
     * @return
     */
    public static int kthSmallest(TreeNode root, int k) {
        //二叉搜索树中序遍历是从小到大有序的
        //        List<Integer> nums = new ArrayList<Integer>();
        //        Queue<TreeNode> queue = new LinkedList<>();
        //        if (root != null) {
        //            queue.offer(root);
        //        }
        //        TreeNode temp;
        //        while (!queue.isEmpty()) {
        //            int size = queue.size();
        //            int i =0;
        //            for (i = 0; i < size; i++) {
        //                temp=queue.poll();
        //                nums.add(temp.val);
        //                if (temp.left != null) {
        //                    queue.offer(temp.left);
        //                }
        //                if (temp.right != null) {
        //                    queue.offer(temp.right);
        //                }
        //            }
        //        }
        //        Object[] objects = nums.toArray();
        //        Arrays.sort(objects);
        //        return (int) objects[k-1];

        //使用递归，计算节点数量
        int num = count(root.left);//左子树节点数量
        if (num == k - 1) {
            return root.val;
        }
        if (num > k - 1)//说明要找的数在左子树中
        {
            return kthSmallest(root.left, k);
        }
        return kthSmallest(root.right, k - num - 1);//否则在右子数中查找
    }

    public static int count(TreeNode root) {//计算一棵树的节点数
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    /**
     * 每个节点的右向指针
     * <p>
     * 给定一个二叉树
     * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
     * 初始状态下，所有 next 指针都被设置为 NULL。
     * 示例:
     * <p>
     * 给定完美二叉树，
     * 1
     * /  \
     * 2    3
     * / \  / \
     * 4  5  6  7
     * 调用你的函数后，该完美二叉树变为：
     * 1 -> NULL
     * /  \
     * 2 -> 3 -> NULL
     * / \  / \
     * 4->5->6->7 -> NULL
     *
     * @param root
     */
    public static void connect(TreeLinkNode root) {
        //层序遍历的方法
        //        Queue<TreeLinkNode> queue = new LinkedList<>();
        //        TreeLinkNode temp = root;
        //        if (temp != null) {
        //            queue.offer(temp);
        //        }
        //        while (!queue.isEmpty()) {
        //            int size = queue.size();
        //            int i = 0;
        //            List<TreeLinkNode> level = new ArrayList<>();
        //            for (i = 0; i < size; i++) {
        //                temp = queue.poll();
        //                level.add(temp);
        //                if (temp.left != null) {
        //                    queue.offer(temp.left);
        //                }
        //                if (temp.right != null) {
        //                    queue.offer(temp.right);
        //                }
        //            }
        //            for (int i1 = 0; i1 < level.size()-1; i1++) {
        //                temp=level.get(i1);
        //                temp.next = level.get(i1 + 1);
        //            }
        //        }

        //递归的方法
        if (root == null) {
            return;
        }
        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null) {
            root.right.next = root.next == null ? null : root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }

    /**
     * 从前序与中序遍历序列构造二叉树
     * <p>
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     * <p>
     * 注意:
     * 你可以假设树中没有重复的元素。
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    /**
     * 前序序列的第一个节点是根节点，然后在中序序列中找到该节点，位于该节点左侧的是根节点的左子树，位于该节点右侧的是根节点的右子树。
     * 然后中序序列该节点左侧是左子树节点数量，右侧是右子树节点数量
     * 根据左右子树节点数量，可从前序序列中得到左子树的前序序列，和右子树的前序序列
     * <p>
     * 例如：
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     * 从前序遍历知道3是根节点，中序遍历中，3之前的9是左子树的中序遍历，3之后的15,20,7是右子树的中序遍历
     * 前序遍历中，3之后的一个数，即9是左子树的前序遍历，剩下的20,15,7是右子树的前序遍历
     * 一直递归下去
     *
     * @param preorder
     * @param pl
     * @param pr
     * @param inorder
     * @param il
     * @param ir
     * @return
     */
    public static TreeNode construct(int[] preorder, int pl, int pr, int[] inorder, int il,
                                     int ir) {
        if (pl > pr || il > ir) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pl]);//前序的一个值是根节点
        for (int i = il; i <= ir; i++) {//到中序序列中找该根节点值
            if (preorder[pl] == inorder[i]) {//中序序列中，i前面是i的左子树的中序序列，i后面是i的右子树的中序序列
                //左子树的前序序列为pl后的i-il个数，中序序列为i前面的数
                root.left = construct(preorder, pl + 1, pl + (i - il), inorder, il, i - 1);
                root.right = construct(preorder, pl + (i - il) + 1, pr, inorder, i + 1, ir);
            }
        }
        return root;
    }

    /**
     * 二叉树的锯齿形层次遍历
     * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        int size = 0, i = 0;
        boolean left = true;
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            size = queue.size();

            for (i = 0; i < size; i++) {//size是每一层节点的数量
                TreeNode t = queue.poll();
                level.add(t.val);
                //将该层的第i个几点的左右子节点入队列
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            if (!left) {//颠倒该层输出顺序
                List<Integer> level2 = new ArrayList<>();
                for (int j = level.size() - 1; j >= 0; j--) {
                    level2.add(level.get(j));
                }
                level = level2;
            }
            left = !left;
            result.add(level);
        }
        return result;
    }

    /**
     * 树中序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        //迭代实现
        //        List<Integer> res = new ArrayList<>();
        //        Stack<TreeNode> stack = new Stack<>();
        //        TreeNode temp = root;
        //        while (temp!=null||!stack.isEmpty()) {
        //            if (temp != null) {//当前节点不为空，入栈，左子树
        //                stack.push(temp);
        //                temp = temp.left;
        //            }
        //            if (temp == null) {//当前节点为空，左子树已经遍历完，右子树
        //                temp = stack.pop();
        //                res.add(temp.val);
        //                temp=temp.right;
        //            }
        //        }
        //        return res;

        //递归实现
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    /**
     * 编写一个程序，找到两个单链表相交的起始节点。
     * <p>
     * 注意：
     * <p>
     * 如果两个链表没有交点，返回 null.
     * 在返回结果后，两个链表仍须保持原有的结构。
     * 可假定整个链表结构中没有循环。
     * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
     *
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int headALength = 0;
        int headBLength = 0;

        ListNode p = headA;
        while (p != null) {
            ++headALength;
            p = p.next;
        }
        p = headB;
        while (p != null) {
            ++headBLength;
            p = p.next;
        }

        while (headALength > headBLength) {
            headA = headA.next;
            headALength--;
        }

        while (headBLength > headALength) {
            headB = headB.next;
            headBLength--;
        }

        while (headA != null) {
            if (headA.val == headB.val) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    /**
     * 奇偶链表
     * <p>
     * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
     * <p>
     * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
     * 示例 1:
     * <p>
     * 输入: 1->2->3->4->5->NULL
     * 输出: 1->3->5->2->4->NULL
     * 示例 2:
     * <p>
     * 输入: 2->1->3->5->6->4->7->NULL
     * 输出: 2->3->6->7->1->5->4->NULL
     * <p>
     * 说明:
     * <p>
     * 应当保持奇数节点和偶数节点的相对顺序。
     * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
     *
     * @param head 头结点
     * @return 返回排序后的第一个节点
     */
    public static ListNode oddEvenList(ListNode head) {
        //        //首先记录各个节点的值，然后遍历list，先将偶数节点的值重新按顺序赋值给链表，
        //        //再将奇数节点的值重新复制给链表
        //        List<Integer> nodes = new ArrayList<>();
        //        ListNode temp = head;
        //        while (temp != null) {
        //            nodes.add(temp.val);
        //            temp = temp.next;
        //        }
        //
        //        temp = head;
        //        for (int i = 0; i < nodes.size(); i = i + 2) {//将偶数节点的值重新赋值给链表
        //            temp.val = nodes.get(i);
        //            temp = temp.next;
        //        }
        //        for (int i = 1; i < nodes.size(); i = i + 2) {//将奇数节点的值重新赋值给链表
        //            temp.val = nodes.get(i);
        //            temp = temp.next;
        //        }
        //
        //        return head;
        if (head != null) {
            ListNode odd = head, even = head.next, evenhead = even;

            //分为两部分进行，链接奇数节点和链接偶数节点
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenhead;//最后将奇偶连个链表链接在一起
        }
        return head;
    }

    /**
     * 汉诺塔问题
     *
     * @param n 盘子的数量
     * @param a 第一个柱子
     * @param b 第二个柱子
     * @param c 第三个柱子
     */
    private static void hannoi(int n, String a, String b, String c) {
        if (n == 1) {
            move(a, c);
        } else {
            hannoi(n - 1, a, c, b);
            move(a, c);
            hannoi(n - 1, b, a, c);
        }
    }

    /**
     * 将n个盘子从from移动到to
     *
     * @param from
     * @param to
     */
    private static void move(String from, String to) {
        System.out.println("从" + from + "移动盘子到" + to);
    }

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //own method
        //        double num1 = 0, num2 = 0;
        //        StringBuilder s = new StringBuilder();
        //        while (l1 != null) {
        //            s.append(l1.val);
        //            l1 = l1.next;
        //        }
        //        BigInteger b1 = new BigInteger(s.reverse().toString());
        //        s = new StringBuilder();
        //        while (l2 != null) {
        //            s.append(l2.val);
        //            l2 = l2.next;
        //        }
        //        BigInteger b2 = new BigInteger(s.reverse().toString());
        //        BigInteger res = b1.add(b2);
        //        System.out.println(res.toString());
        //        if (res.toString().equals("0")) {
        //            return new ListNode(0);
        //        }
        //        return strToList(new StringBuilder(res.toString()).reverse().toString());

        //直接相加法
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;//求和
            carry = sum / 10;//进位
            curr.next = new ListNode(sum % 10);//取余
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    private static ListNode strToList(String res) {
        if (res.length() == 0) {
            return null;
        }
        ListNode head = new ListNode(Integer.valueOf(String.valueOf(res.charAt(0))));
        head.next = strToList(res.substring(1, res.length()));
        return head;
    }

    /**
     * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。子序列不一定连续
     * 数学表达式如下:
     * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
     * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
     * 输入: [1,2,3,4,5]
     * 输出: true
     * <p>
     * 输入: [5,4,3,2,1]
     * 输出: false
     * <p>
     * 输入: [5,1,5,5,2,5,4]
     * 输出: true
     */
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (first >= nums[i]) {//第一个数字总是最小的
                first = nums[i];
            } else if (second >= nums[i]) {//第一个数字小于nums[i],第二个数字如果大于nums[i],则nums[i]成为新的第二个数字
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 最长回文子串
     * <p>给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。</p>
     *
     * @param s
     * @return
     */
    private static String longestPalindrome(String s) {
        //从每一个中心位置向两端扩展，中心可以是某个字符，也可以是两个字符之间
        if (s.length() == 0) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);//中心是第i个字符
            int len2 = expand(s, i, i + 1);//中心是第i个字符和第i+1个字符之间
            int len = Math.max(len1, len2);//二者中最大长度
            if (len > end - start) {
                start = i - (len - 1) / 2;//该子字符串起始下标
                end = i + len / 2;//终止下标
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expand(String str, int start, int end) {
        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }

    /**
     * 无重复字符的最长子串
     * <p>给定一个字符串，找出不含有重复字符的最长子串的长度。</p>
     *
     * @param s
     * @return
     */
    private static int lengthOfLongestSubstring(String s) {
//        int max = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        //j代表子串开始位置
//        for (int i = 0, j = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                //之前的字符可能在子串开始位置之前
//                j = Math.max(map.get(s.charAt(i))+1, j);
//            }
//            max = Math.max(max, i - j + 1);
//            map.put(s.charAt(i), i);
//        }
//        return max;
        int max = 0;
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                max = Math.max(max, i - j);
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return max;
    }

    /**
     * 字谜分组
     * <p>给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     *
     * @param strs 给定的字符串
     * @return 结果
     */
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String temp = String.valueOf(chars);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }

    /**
     * 矩阵置零
     * <p>如果某个元素为零，将它所在行所在列置零</p>
     *
     * @param matrix 矩阵
     */
    private static void setZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }

        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * 三数之和
     *
     * @param nums
     * @return
     */
    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {//去重
                continue;
            }
            int target = 0 - nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        ++j;//去重
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        --k;//去重
                    }
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }

    /**
     * 缺失数字
     *
     * @param nums
     * @return
     */
    private static int missingNumber(int[] nums) {
        int count = 0, len = nums.length;
        for (int num : nums) {
            count += num;
        }
        int
                sum =
                len * (len + 1) / 2;//固定长度的连续序列的和是固定的，例如,0,1,2,3=6,则0,1,2,3中任少一个数，用6减去它们的和，就等于少的那个数

        return sum - count;
    }

    /**
     * 有效的括号
     *
     * @param s
     * @return
     */
    private static boolean isValid(String s) {
        int len = s.length();
        if (len == 0) {
            return true;
        }
        if (len % 2 != 0) {
            return false;
        }
        if (s.substring(0, len / 2 - 1).equals(s.substring(len / 2, len))) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (isPair(s.charAt(i), stack.peek())) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }

    private static boolean isPair(char a, char b) {
        if (a == ')' && b == '(') {
            return true;
        }
        if (a == '}' && b == '{') {
            return true;
        }
        return a == ']' && b == '[';
    }

    /**
     * 帕斯卡三角形
     *
     * @param numRows
     * @return
     */
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int number = 1;
            for (int j = 0; j <= i; j++) {
                row.add(number);
                number = number * (i - j) / (j + 1);
            }
            result.add(row);
        }
        return result;
    }

    /**
     * 颠倒二进制位
     *
     * @param n
     * @return
     */
    private static int reverseBits(int n) {
        //        Queue<Integer> queue = new LinkedList<>();
        //        int length = 32;
        //        while (length-- != 0) {
        //            int temp = n&1;
        //            queue.offer(temp);
        //            n>>>=1;
        //        }
        //        StringBuilder sb = new StringBuilder();
        //        while (!queue.isEmpty()) {
        //            sb.append(queue.poll());
        //        }
        //        return (int) Long.parseLong(sb.toString(), 2);
        int result = 0;
        int i = 0;
        while (i < 32) {
            int temp = n & 0x01;//temp是n的二进制数从右往左，每次取出一位
            n = n >> 1;
            result = (result << 1) | temp;//result是每次将temp放到二进制表示的最右边
            i++;
        }
        return result;
    }

    /**
     * 汉明距离
     * 参见位1的个数解法
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            int tempx = x & 1;
            int tempy = y & 1;
            if (tempx != tempy) {
                count++;
            }
            x >>>= 1;
            y >>>= 1;
        }
        return count;
    }

    /**
     * 位1的个数
     *
     * @param n
     * @return
     */
    private static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {//将十进制转二进制的一个过程
            int temp = n & 1;//例如5:101,5&1=1,无符号右移一位，2:10,2&1=0,...,1&1=1，最后往前就得到了101,即5的二进制表示
            if (temp == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    /**
     * 罗马数字转整数
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        //先把每个罗马数字转阿拉伯数字
        for (int i = 0; i < s.length(); i++) {
            nums[i] = getNum(s.charAt(i));
        }
        int res = 0;
        int pre = 0;
        //如果当前数字大于上一个数字，说明当前数字和上一个数字的组合是反的，需要用当前数字减两次上一个数字，因为上一个数字加了一次
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pre) {
                res += nums[i] - pre - pre;
            } else {
                res += nums[i];
            }
            pre = nums[i];
        }
        return res;
    }

    public int getNum(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    /**
     * 3的幂
     *
     * @param n 要判断的数
     * @return 结果
     */
    private static boolean isPowerOfThree(int n) {
        //解法一
        //return (n>0&&Math.pow(3,19)%n==0);3^19是int范围内最大的3的幂，那么3^19可以被任何3的幂整除。
        //解法二
        if (n < 0) {
            return false;
        }
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return false;
    }

    /**
     * 计算质数
     *
     * @param n 上限
     * @return 小于n的数中质数的个数
     */
    private static int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];//标记是否是素数
        int[] prime = new int[n];//保存素数的数组
        int totalPrimes = 1;
        for (int i = 3; i <= n; i += 2) {//4,6,8,....,偶数过滤掉
            isPrime[i] = true;
        }
        isPrime[2] = true;
        prime[0] = 2;
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) {
                prime[totalPrimes++] = i;
            }
            for (int j = 1; i * prime[j] < n
                    && j < totalPrimes; j++) {//i*prime[j]是保证不超过上限n,j<totalPrimes是在prime数组已有质数内计算
                isPrime[i * prime[j]] = false;//过滤素数的倍数（奇数倍）
                if (i % prime[j] == 0) {//此时i不是素数，比如9，若无此条件则例如，9*5=15*3，即i为15时，又将重复计算一次。 15*5=25*3
                    break;
                }
            }
        }
        return totalPrimes;
    }

    /**
     * 3和5的倍数
     *
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.add("FizzBuzz");
                continue;
            }
            if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    class Solution {
        private int[] store;
        private List<Integer> list;

        public Solution(int[] nums) {
            store = nums;
            list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            return store;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {
            Collections.shuffle(list);
            int[] temp = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                temp[i] = list.get(i);
            }
            return temp;
        }
    }

    static class MinStack {
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> minstack = new Stack<>();

        public MinStack() {

        }

        public void push(int x) {
            if (!minstack.isEmpty() && x <= minstack.peek()) {
                minstack.push(x);
            }
            if (minstack.isEmpty()) {
                minstack.push(x);
            }
            stack.push(x);
        }

        public void pop() {
            if (stack.isEmpty()) {
                return;
            }
            if (stack.peek().equals(minstack.peek())) {
                minstack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }

    /**
     * leetcode
     * 打家劫舍1
     *
     * @param nums
     * @return
     */
    private static int rob(int[] nums) {
        //最优解法，只保存前两个状态即可
        int preMax = 0, curMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = curMax;
            curMax = Math.max(preMax + nums[i], curMax);
            preMax = tmp;
        }
        return curMax;
//        int[] dp = new int[nums.length];//dp[i]:到第i户的最高金额，dp[i]=max(dp[i-1],dp[i-2]+nums[i])
//        if (nums.length == 0) {
//            return 0;
//        }
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        if (nums.length == 2) {
//            return Math.max(nums[0], nums[1]);
//        }
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//        for (int i = 2; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
//        }
//        return dp[nums.length - 1];
    }

    /**
     * 最大子序和
     *
     * @param nums 数组
     * @return 最大子序和
     */
    private static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > max) {
                max = sum;
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
        if (n <= 0) {
            return 0;
        }
        long l = 1, r = n;
        while (l < r) {
            long mid = (l + r) / 2;
            if (isBadVersion((int) mid))//mid:true,往左边查找
            {
                r = mid;
            } else //mid:false,往右边查找
            {
                l = mid + 1;
            }
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
        if (nums == null || nums.length == 0) {
            return null;
        }

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
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

    private static boolean symmetric(TreeNode left, TreeNode right) {//也可用于判断两棵树是否相等
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && symmetric(left.right, right.left) && symmetric(left.left, right.right);
    }

    /**
     * 验证二叉搜索树
     *
     * @param root
     * @return
     */
    private static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
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
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
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
     * @return
     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode res = null;
//        if (list1 == null) {
//            return list2;//返回剩下的l2
//        }
//        if (list2 == null) {
//            return list1;//返回剩下的l1
//        }
//        if (list1.val <= list2.val) {
//            res = list1;
//            res.next = mergeTwoLists(list1.next, list2);
//        } else {
//            res = list2;
//            res.next = mergeTwoLists(list1, list2.next);
//        }
//        return res;
        ListNode newnode = new ListNode(0);
        ListNode tmp = newnode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return newnode.next;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        //递归方法
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
        //非递归方法
//        ListNode preNode = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = preNode;//将保存的上一个节点作为该节点的下一个节点
//            preNode = head;//然后当前节点成为下次循环的上一个节点
//            head = next;
//        }
//        return preNode;
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
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {//等于0时，表示匹配成功
                prefix = prefix.substring(0, prefix.length() - 1);//若不匹配，每次将prefix最后一个字符去掉
                if (prefix.equals(""))//没有匹配的
                {
                    return "";
                }
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
        if (str.isEmpty()) {
            return 0;
        }

        double number = 0;
        int sign = 1, i = 0, length = str.length();
        while (i < length - 1 && str.charAt(i) == ' ') {
            i++;
        }
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i++) == '+' ? 1 : -1;
        }
        while (i < length && str.charAt(i) <= '9' && str.charAt(i) >= '0') {
            if (number > Integer.MAX_VALUE) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            number = number * 10 + str.charAt(i++) - '0';
        }
        return (int) (number * sign);
//        String s = str.trim();
//        if (s.length() == 0) {
//            return 0;
//        }
//        char first = s.charAt(0);
//        if (first != '+' && first != '-' && !isDigit(first)) {//第一个字符不是符号也不是数字
//            return 0;
//        }
//        int res = 0;
//        int flag = 1;
//        int i = 0;
//        if (first == '-' || first == '+') {
//            flag = first == '-' ? -1 : 1;
//            i = 1;
//        }
//        for (; i < s.length(); i++) {
//            if (isDigit(s.charAt(i))) {
//                if (flag == 1 && (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (s.charAt(i) - '0' > 7)))) {
//                    return Integer.MAX_VALUE;
//                }
//                if (flag == -1 && (-res < Integer.MIN_VALUE / 10 || (-res == Integer.MIN_VALUE / 10 && (s.charAt(i) - '0' > 8)))) {
//                    return Integer.MIN_VALUE;
//                }
//                res = res * 10 + s.charAt(i) - '0';
//            } else break;
//        }
//        return res * flag;
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
            if (('z' - chars[i]) < 26 && ('z' - chars[i]) >= 0
                    || ('9' - chars[i]) < 10 && ('9' - chars[i]) >= 0) {
                if (('z' - chars[j]) < 26 && ('z' - chars[j]) >= 0
                        || ('9' - chars[j]) < 10 && ('9' - chars[j]) >= 0) {
                    if (chars[i] != chars[j]) {
                        return false;
                    }
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
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
                if (start == end && start != -1) {
                    return i;
                }
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
            if (res != s.length()) {
                return res;
            }
        }
        return -1;
    }

    /**
     * 整数反转
     *
     * @param x
     * @return
     */
    private static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int d = x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }

            ans = ans * 10 + d;
        }
        return ans;
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
        //signs[0][i]对应第i行；signs[1][j]对应第j列;signs[2][cubeIndex]对应第cubeIndex个子方块
        int[][] signs = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int n = 1 << (board[i][j] - '1');//1×2^(board[i][j]-'1'),二进制1左移当前数字对应的位数
                int cubeIndex = i / 3 * 3 + j / 3;//当前格子位于第几块中
                //按位与，若某数字再次出现，对应位上有相同的1，则与后结果不为0
                //例如，9、8出现后，sign的二进制为110000000,再次出现9，n为100000000,这样，
                //按位相与的结果不为0
                if ((signs[0][i] & n) != 0 || (signs[1][j] & n) != 0
                        || (signs[2][cubeIndex] & n) != 0) {
                    return false;
                }
                //sign保存数字对应位数的1，比如9，则为100000000,下一个数字是8,则sign更新为，110000000,
                //即，若某数字出现了，则对应位置上为1
                signs[0][i] |= n;//对应i行的数字，检查一行的数字是否重复
                signs[1][j] |= n;//对应j列的的数字,检查列上的数字是否重复
                signs[2][cubeIndex] |= n;//对应第cubuIndex个块中的数字
            }
        }
        return true;

        // init data
        //        HashMap<Integer, Integer>[] rows = new HashMap[9];
        //        HashMap<Integer, Integer>[] columns = new HashMap[9];
        //        HashMap<Integer, Integer>[] boxes = new HashMap[9];
        //        for (int i = 0; i < 9; i++) {
        //            rows[i] = new HashMap<Integer, Integer>();
        //            columns[i] = new HashMap<Integer, Integer>();
        //            boxes[i] = new HashMap<Integer, Integer>();
        //        }
        //
        //        // validate a board
        //        for (int i = 0; i < 9; i++) {
        //            for (int j = 0; j < 9; j++) {
        //                char totalRings = board[i][j];
        //                if (totalRings != '.') {
        //                    int n = (int) totalRings;
        //                    int box_index = (i / 3) * 3 + j / 3;
        //
        //                    // keep the current cell value
        //                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
        //                    columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
        //                    boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);
        //
        //                    // check if this value has been already seen before
        //                    if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1)
        //                        return false;
        //                }
        //            }
        //        }
        //
        //        return true;
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
        //                }        ListNode dummy = new ListNode(0);
        //        ListNode first = dummy;
        //        ListNode after_head = new ListNode(0);
        //        ListNode second = after_head;
        //
        //        while (head != null) {
        //            if (head.val <= m) {
        //                first.next = head;
        //                first = first.next;
        //            } else {
        //                second.next = head;
        //                second = second.next;
        //            }
        //
        //            head = head.next;
        //        }
        //
        //        second.next = null;
        //
        //        first.next = after_head.next;
        //
        //        return dummy.next;
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
            if (map.containsKey(aNums1)) {
                map.put(aNums1, map.get(aNums1) + 1);
            } else {
                map.put(aNums1, 1);
            }
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
     * 删除排序数组中的重复项
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        int index = 0;//不重复数组的最后一个位置
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {//遇到与最后一个不同的数字时，添加到index后面，同时index+1
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
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
            Desktop.getDesktop().open(new File(
                    "F:\\IdeaProjects\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
