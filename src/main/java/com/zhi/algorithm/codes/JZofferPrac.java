package com.zhi.algorithm.codes;

import com.zhi.algorithm.codes.LeetCode.ListNode;

import java.util.*;


/**
 * 剑指offer
 */
public class JZofferPrac {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        JZofferPrac jz = new JZofferPrac();
        System.out.println(jz.movingCount(3, 2, 2));
    }


    /**
     * 删除链表的节点
     *
     * @param head
     * @param toDel
     */
    ListNode deleteNode(ListNode head, ListNode toDel) {
        if (head == null || toDel == null) {//head或toDel为空时
            return head;
        }
        if (head == toDel) {//要删除的是头节点
            return head.next;
        }
        if (toDel.next != null) {//要删除的不是尾节点
            //把它下一个节点的值复制过来，并把下一个节点的下一个节点设置为下一个节点
            toDel.val = toDel.next.val;
            toDel.next = toDel.next.next;
        } else {//要删除的是尾节点
            ListNode temp = head;
            while (temp.next != toDel) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    /**
     * 打印从1到最大的n位数
     * <p>
     * 例如：n=3,打印1-999
     *
     * @param n
     */
    private void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] num = new char[n];//如n=3时，num存储的值从000-999
        print1ToMaxNRec(num, 0);
    }

    /**
     * 递归打印其它位
     *
     * @param num
     * @param index
     */
    private void print1ToMaxNRec(char[] num, int index) {
        if (index == num.length) {//长度为n时，输出
            printNum(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[index] = (char) (i + '0');//index位从0到n
            print1ToMaxNRec(num, index + 1);
        }
    }

    /**
     * 不输出开头的0
     *
     * @param num
     */
    private void printNum(char[] num) {
        boolean isBegin0 = true;
        for (int i = 0; i < num.length; i++) {
            if (isBegin0 && num[i] != '0') {
                isBegin0 = false;
            }
            if (!isBegin0) {
                System.out.print(num[i]);
            }
        }
        System.out.println();
    }


    /**
     * 剪绳子
     *
     * @param length
     * @return
     */
    int maxProductAfterCut(int length) {
        //动态规划
        //dp[i]长度为i的绳子剪完之后最大乘积
//        if (length < 2) {
//            return 0;
//        }
//        if (length == 2) {
//            return 1;//绳子长度为2,1×1
//        }
//        if (length == 3) {
//            return 2;//绳子长度为3,1×2
//        }
//        int[] dp = new int[length + 1];
//        dp[0] = 0;
//        dp[1] = 1;//分割得到长度为1的，不继续分割
//        dp[2] = 2;//分割得到长度为2的，不继续分割
//        dp[3] = 3;//分割得到长度为3的，不继续分割
//        int max = 0;
//        for (int i = 4; i <= length; i++) {
//            for (int j = 1; j <= i / 2; j++) {
//                int cut = dp[j] * dp[i - j];
//                if (max < cut) {
//                    max = cut;
//                }
//                dp[i] = max;
//            }
//        }
//        return dp[length];

        //贪心算法，尽可能多的剪长度为3的绳子段
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;//绳子长度为2,1×1
        }
        if (length == 3) {
            return 2;//绳子长度为3,1×2
        }
        int timeOf3 = length / 3;//先尽可能多的剪长度为3
        if (length - 3 * timeOf3 == 1) {//最后一段长度为4时，不能剪成3的
            timeOf3--;
        }
        int timeOf2 = (length - 3 * timeOf3) / 2;//剪成长度为2的
        return (int) (Math.pow(3, timeOf3) * Math.pow(2, timeOf2));
    }

    /**
     * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
     * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
     * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     *
     * @param threshold
     * @param rows
     * @param cols
     * @return
     */
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        boolean[][] visited = new boolean[rows][cols];
        return getSteps(0, 0, rows, cols, threshold, 0, visited);
    }

    private int getSteps(int i, int j, int rows, int cols, int threshold, int currentstep, boolean[][] visited) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return currentstep;
        }
        if (visited[i][j]) {
            return currentstep;
        }

        int ditsum = 0;
        int temp = i;
        while (temp != 0) {
            ditsum += temp % 10;
            temp = temp / 10;
        }
        temp = j;
        while (temp != 0) {
            ditsum += temp % 10;
            temp = temp / 10;
        }
        if (ditsum <= threshold) {
            visited[i][j] = true;
            int a = getSteps(i + 1, j, rows, cols, threshold, currentstep, visited);
            int b = getSteps(i - 1, j, rows, cols, threshold, currentstep, visited);
            int c = getSteps(i, j + 1, rows, cols, threshold, currentstep, visited);
            int d = getSteps(i, j - 1, rows, cols, threshold, currentstep, visited);
            return a + b + c + d + 1;
        }
        return currentstep;
    }


    /**
     * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
     * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
     * 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
     * 例如
     * a b c e
     * s f c s
     * a d e e
     * 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
     * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
     *
     * @param matrix
     * @param rows
     * @param cols
     * @param str
     * @return
     */
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i * cols + j] == str[0]) {
                    //从第一个匹配的字母开始回溯，每条回溯路径一个标记数组
                    boolean[] visited = new boolean[matrix.length];
                    if (containsStr(matrix, i, j, rows, cols, str, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean containsStr(char[] matrix, int i, int j, int rows, int cols, char[] str, int index, boolean[] visited) {
        if (index == str.length) {
            return true;
        }
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return false;
        }
        if (visited[i * cols + j]) {
            return false;
        }
        if (matrix[i * cols + j] == str[index]) {
            visited[i * cols + j] = true;
            return containsStr(matrix, i - 1, j, rows, cols, str, index + 1, visited) ||
                    containsStr(matrix, i + 1, j, rows, cols, str, index + 1, visited) ||
                    containsStr(matrix, i, j - 1, rows, cols, str, index + 1, visited) ||
                    containsStr(matrix, i, j + 1, rows, cols, str, index + 1, visited);
        }
        return false;
    }


    /**
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
//        ArrayList<Integer> res = new ArrayList<>();
//        if (size > 0) {
//            for (int i = 0; i <= totalRings.length - size; i++) {
//                int max = getMaxHere(totalRings, i, size);
//                res.add(max);
//            }
//        }
//
//        return res;
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> m = new LinkedList<>();
        if (num.length > 0 && size > 0 && size <= num.length) {
            m.offer(0);
            for (int i = 1; i < size; i++) {
                while (!m.isEmpty() && num[i] >= num[((LinkedList<Integer>) m).peekLast()]) {
                    ((LinkedList<Integer>) m).pollLast();
                }
                m.offer(i);
            }
            for (int i = size; i < num.length; i++) {
                res.add(num[m.peek()]);
                while (!m.isEmpty() && num[i] >= num[((LinkedList<Integer>) m).peekLast()]) {//当前数字比队里最后一个数字大
                    ((LinkedList<Integer>) m).pollLast();
                }
                if (!m.isEmpty() && m.peek() <= (i - size)) {//队列第一个下标脱离窗口了
                    m.poll();
                }
                m.offer(i);
            }
            res.add(num[m.peek()]);
            return res;
        }
        return res;
    }

    private int getMaxHere(int[] num, int start, int size) {
        int max = num[start];
        for (int i = start + 1; i < start + size; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    /**
     * 数据流中的中位数,大根堆保存前半部分数字，小根堆保存后半部分数字
     *
     * @param totalRings
     */
    PriorityQueue<Integer> big = new PriorityQueue<>(new Comparator<Integer>() {//大根堆
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    PriorityQueue<Integer> small = new PriorityQueue<>();//小根堆
    int count = 0;

    public void Insert(Integer num) {
        count++;
        if ((count & 1) != 1) {//数目为偶数个时
            if (!big.isEmpty() && num < big.peek()) {
                big.offer(num);
                num = big.poll();
            }
            small.offer(num);
        } else {//数目为奇数个时
            if (!small.isEmpty() && num > small.peek()) {
                small.offer(num);
                num = small.poll();
            }
            big.offer(num);
        }
    }

    public Double GetMedian() {
        if (count == 0) {
            return 0.0;
        }
        double result;
        if ((count & 1) == 1) {//奇数
            result = big.peek();
        } else {
            result = (small.peek() + big.peek()) / 2.0;
        }
        return result;
    }

    /**
     * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
     * 二叉搜索树的第k大节点
     *
     * @param pRoot
     * @param k
     * @return
     */
    int k;

    TreeNode KthNode(TreeNode root, int k) {
        this.k = k;
        return helper(root);
    }

    //中序遍历
    public TreeNode helper(TreeNode root) {
        TreeNode temp = null;
        if (root != null) {
            //第k个在左子树中，返回
            if ((temp = helper(root.left)) != null) {
                return temp;
            }
            //当前树根节点是第k个，返回
            if (--k == 0) {
                return root;
            }
            //第k个在右子树中，返回
            if ((temp = helper(root.right)) != null) {
                return temp;
            }

        }
        //不存在
        return null;
    }

    /**
     * 序列化二叉树
     * 请实现两个函数，分别用来序列化和反序列化二叉树
     *
     * @param root
     * @return
     */
    String Serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Serialize2(root, sb);
        return sb.toString();
    }

    void Serialize2(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val).append(",");
        Serialize2(root.left, sb);
        Serialize2(root.right, sb);
    }

    int index = -1;

    TreeNode Deserialize(String str) {
        if (str.length() == 0) {
            return null;
        }
        String[] strs = str.split(",");
        return Deserialize2(strs);
    }

    /**
     * 1,2,4,#,#,#,3,5,#,#,6,#,#
     */
    TreeNode Deserialize2(String[] strs) {
        index++;
        if (!strs[index].equals("#")) {
            TreeNode root = new TreeNode(0);
            root.val = Integer.parseInt(strs[index]);
            root.left = Deserialize2(strs);
            root.right = Deserialize2(strs);
            return root;
        }
        return null;
    }

    /**
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     *
     * @param pRoot
     * @return
     */
    ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot != null) {
            queue.offer(pRoot);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode t = queue.poll();
                    temp.add(t.val);
                    if (t.left != null) {
                        queue.offer(t.left);
                    }
                    if (t.right != null) {
                        queue.offer(t.right);
                    }
                }
                res.add(temp);
            }
        }
        return res;
    }

    /**
     * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     *
     * @param pRoot
     * @return
     */
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        boolean left = true;

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot != null) {
            queue.offer(pRoot);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode t = queue.poll();
                    temp.add(t.val);
                    if (t.left != null) {
                        queue.offer(t.left);
                    }
                    if (t.right != null) {
                        queue.offer(t.right);
                    }
                }
                if (!left) {
                    ArrayList<Integer> temp2 = new ArrayList<>();
                    for (int i = temp.size() - 1; i >= 0; i--) {
                        temp2.add(temp.get(i));
                    }
                    res.add(temp2);
                    left = true;
                } else {
                    res.add(temp);
                    left = false;
                }
            }
        }
        return res;
    }

    /**
     * 二叉树的下一个节点
     * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     *
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode != null) {
            if (pNode.right == null) {
                if (pNode.next == null) {
                    return null;
                } else {
                    while (pNode.next != null) {
                        if (pNode == pNode.next.left) {//如果该节点是父节点的左节点
                            return pNode.next;
                        } else {
                            pNode = pNode.next;//如果该节点是父节点的右节点，向上寻找，找到一个左节点是父节点的节点
                        }
                    }
                    return null;
                }
            } else {
                return zxbl(pNode.right);//如果该节点有右子树，那么下一个节点就是右子树的最左子节点
            }

        }
        return null;
    }

    private TreeLinkNode zxbl(TreeLinkNode right) {
        if (right.left == null) {
            return right;
        } else {
            return zxbl(right.left);
        }
    }

    /**
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
     * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     *
     * @param pHead
     * @return
     */
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {//0个或1个节点
            return pHead;
        }
        if (pHead.val == pHead.next.val) {
            ListNode node = pHead;
            while (node != null && node.val == pHead.val) {//找到与当前节点不同的节点
                node = node.next;
            }
            return deleteDuplication(node);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

    /**
     * 链表中环的入口节点
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     *
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead != null) {
            ListNode mnode = getMeetNode(pHead);
            ListNode temp = mnode;
            int count = 0;//环的节点数
            if (temp != null) {//有环时
                while (true) {
                    temp = temp.next;
                    count++;
                    if (temp == mnode) {
                        break;
                    }
                }
                mnode = pHead;
                temp = pHead;
                while (count-- != 0) {
                    mnode = mnode.next;
                }
                while (true) {
                    if (mnode == temp) {
                        return mnode;
                    }
                    mnode = mnode.next;
                    temp = temp.next;
                }
            }
        }
        return null;
    }

    /**
     * @param pHead
     * @return
     */
    private ListNode getMeetNode(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (true) {
            if (slow != null) {
                slow = slow.next;
            }
            if (fast.next != null) {
                fast = fast.next.next;
            }
            if (fast.next == null) {//fast到链表尾了，说明无环
                return null;
            }
            if (fast == slow) {
                return fast;
            }
        }
    }


    ArrayList<Character> queue2 = new ArrayList<>();
    int[] mark = new int[127];

    public void Insert(char ch) {
        queue2.add(ch);
        mark[ch]++;
    }

    /**
     * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
     * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
     *
     * @return
     */
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (int i = 0; i < queue2.size(); i++) {
            if (mark[queue2.get(i)] == 1) {
                return queue2.get(i);
            }
        }
        return '#';
    }

    /**
     * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     *
     * @param pRoot
     * @return
     */
    boolean isSymmetrical(TreeNode pRoot) {
        return isSymmetrical(pRoot, pRoot);
    }

    private boolean isSymmetrical(TreeNode pRoot, TreeNode pRoot1) {
        if (pRoot == null && pRoot1 == null) {
            return true;
        }
        if (pRoot == null || pRoot1 == null) {
            return false;
        }
        if (pRoot.val != pRoot1.val) {
            return false;
        }
        return isSymmetrical(pRoot.left, pRoot1.right) && isSymmetrical(pRoot.right, pRoot1.left);
    }

    /**
     * 表示数值的字符串
     * <p>
     * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
     * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
     * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
     *
     * @param str
     * @return
     */
    public boolean isNumeric(char[] str) {
        if (str.length == 0) {
            return false;
        }
        int index = 0;
        boolean num = index != (index = scanInteger(str, index));
        if (index < str.length && str[index] == '.') {
            index++;
            num = index != (index = scanUnsignedInt(str, index)) || num;
        }
        if (index < str.length && (str[index] == 'e' || str[index] == 'E')) {
            index++;
            num = num && index != (index = scanInteger(str, index));
        }
        return num && index == str.length;
    }

    public int scanUnsignedInt(char[] str, int start) {
        while (start < str.length && str[start] >= '0' && str[start] <= '9') {
            start++;
        }
        return start;
    }


    public int scanInteger(char[] str, int start) {
        if (start < str.length && (str[start] == '+' || str[start] == '-')) {
            start++;
        }
        return scanUnsignedInt(str, start);
    }

    /**
     * 正则表达式匹配
     * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
     * 而'*'表示它前面的字符可以出现任意次（包含0次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。
     * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
     * <p>
     * 思路：
     * <p>
     * 而当模式中的第二个字符是“*”时：
     * <p>
     * 如果字符串第一个字符跟模式第一个字符不匹配，则模式后移2个字符，继续匹配。
     * <p>
     * 如果字符串第一个字符跟模式第一个字符匹配，可以有3种匹配方式：
     * 1、模式后移2字符，相当于x*被忽略；
     * 2、字符串后移1字符，模式后移2字符，即字符匹配一次，继续匹配下一个字符；
     * 3、字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；
     * <p>
     * 当模式中的第二个字符不是“*”时：
     * <p>
     * 1、如果字符串第一个字符和模式中的第一个字符相匹配，那么字符串和模式都后移一个字符，然后匹配剩余的。
     * 2、如果字符串第一个字符和模式中的第一个字符相不匹配，直接返回false。
     *
     * @param str
     * @param p
     * @return
     */
    public boolean match(char[] str, char[] p) {
        if (str == null || p == null) {
            return false;
        }
        return matchCore(str, 0, p, 0);
    }

    private boolean matchCore(char[] str, int strIndex, char[] p, int pIndex) {
        //字符串和模式都到末尾了，则匹配成功
        if (strIndex == str.length && pIndex == p.length) {
            return true;
        }
        //模式到尾了，字符串没匹配完，匹配失败
        if (pIndex == p.length) {
            return false;
        }

        //模式的下一个字符是*，则讨论当前字符是否相同
        if (pIndex + 1 < p.length && p[pIndex + 1] == '*') {
            //当前字符相同，分三种情况
            //注意strIndex != str.length，因为可能字符已经便利完，模式还遍历完
            if (strIndex != str.length && (str[strIndex] == p[pIndex] || p[pIndex] == '.')) {
                //字符串后移一位，模式后移两位，即匹配一个字符
                return matchCore(str, strIndex + 1, p, pIndex + 2) ||
                        //字符串后移一位，模式不移动，即再匹配下一个
                        matchCore(str, strIndex + 1, p, pIndex) ||
                        //字符串不移动，模式后移两位，即匹配当前字符0次
                        matchCore(str, strIndex, p, pIndex + 2);
            } else {
                //当前字符不相同，模式字符串后移两位，相当于匹配了0次
                return matchCore(str, strIndex, p, pIndex + 2);
            }
        }

        //字符串和模式的当前字符相同，则比较下一个字符
        //注意strIndex != str.length，因为可能字符已经便利完，模式还遍历完
        if (strIndex != str.length && (str[strIndex] == p[pIndex] || (p[pIndex] == '.'))) {
            return matchCore(str, strIndex + 1, p, pIndex + 1);
        }
        //模式下一个字符不是*，当前字符不匹配时，
        return false;
    }


    /**
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
     *
     * @param A
     * @return
     */
    public int[] multiply(int[] A) {
        if (A.length <= 1) {
            return null;
        }
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        double temp = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            temp = temp * A[i + 1];
            B[i] = (int) (B[i] * temp);
        }
        return B;
    }

    /**
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     *
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        //因为每个数都是0-n-1范围的，没有重复数字时，数字m的下标也是m，所以从前往后遍历，将m放在下标m处，则下次遇见m时，与下标m处数字对比可知，m重复
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {//将num[i]放回他的位置
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return false;
    }

    /**
     * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
     * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
     * 数值为0或者字符串不是一个合法的数值则返回0。
     *
     * @param str
     * @return
     */
    public int StrToInt(String str) {
        int len = str.length();
        if (len == 0) {
            return 0;
        }
        double res = 0;
        boolean flag = true;
        int jw = len;
        int i = 0;
        if (str.charAt(i) == '-') {
            flag = false;
            i++;
            jw--;
        } else if (str.charAt(i) == '+') {
            i++;
            jw--;
        }

        for (; i < len; i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {//ascii码
                return 0;
            }
            int num = str.charAt(i) - '0';
            res += num * Math.pow(10, --jw);
        }
        return (int) (flag ? res : -res);
    }

    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     *
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int sum = num1 ^ num2;//异或操作相当于二进制对应位相加，但没有进位
            int carry = (num1 & num2) >> 1;//与操作得到每位相加的进位，并左移一位下次循环加到高位
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }

    /**
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
     *
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int sum = n;
        //利用与操作的短路特性
        boolean flag = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    /**
     * 0-n-1这n个数字排成一圈，从数字0开始，每次从中删除第m个数字，求出最后一个剩下的数字
     * <p>
     * 圆圈中最后剩下的数字
     *
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        //规律解法，面试时无法推导出
//        if (n < 1 || m < 1) {
//            return -1;
//        }
//        int last = 0;
//        for (int i = 2; i <= n; i++) {
//            last = (last + m) % i;
//        }
//        return last;
        if (n < 1 || m < 1) {
            return -1;
        }
        int[] array = new int[n];
        int i = -1, step = 0, count = n;
        while (count > 0) {   //跳出循环时将最后一个元素也设置为了-1
            i++;          //指向上一个被删除对象的下一个元素。
            if (i >= n) {
                i = 0;  //模拟环。
            }
            if (array[i] == -1) {
                continue; //跳过被删除的对象。
            }
            step++;                     //记录已走过的。
            if (step == m) {               //找到待删除的对象。
                array[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;//返回跳出循环时的i,即最后一个被设置为-1的元素
    }

    /**
     * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
     * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
     * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....
     * LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
     * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
     * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，如果牌能组成顺子就输出true，否则就输出false。
     * 为了方便起见,你可以认为大小王是0。
     *
     * @param numbers
     * @return
     */
    public boolean isContinuous(int[] numbers) {
        if (numbers.length == 0) {
            return false;
        }
        int pre = 0;
        int zerocount = 0;
        int needed = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == pre && pre != 0) {
                return false;
            }
            if (numbers[i] == 0) {
                zerocount++;
                continue;
            }
            if (pre != 0) {
                needed += numbers[i] - pre - 1;
            }
            pre = numbers[i];
        }
        return needed <= zerocount;
    }

    /**
     * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
     * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
     * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
     * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
     *
     * @param str
     * @return
     */
    public String ReverseSentence(String str) {
        int len = str.length();
        if (len == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        int start = 0, end = 0;
        reverse(chars, 0, len - 1);
        while (start < len) {
            if (chars[start] == ' ') {
                start++;
                end++;
            } else if (end == len || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = ++end;
            } else {
                end++;
            }
        }
        return new String(chars);
    }

    /**
     * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
     *
     * @param str
     * @param n
     * @return
     */
    public String LeftRotateString(String str, int n) {
        //借助O(n)空间
//        int len = str.length();
//        if (len == 0 || n <= 0) {
//            return str;
//        }
//        char[] chars = str.toCharArray();
//        char[] res = new char[len];
//        for (int i = 0; i < len; i++) {
//            int newpos;
//            if (i - n < 0) {
//                newpos = len + (i - n) % (len + 1);
//            } else {
//                newpos = i - n;
//            }
//            res[newpos] = chars[i];
//        }
//        return new String(res);
        //翻转法，abcdefg,左移两位，相当于先将ab,cdefg分别翻转，得到bagfedc,再将整体翻转，得到cdefgab
        int len = str.length();
        if (len == 0 || n <= 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars, n, len - 1);
        reverse(chars, 0, len - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     *
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int mul = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        if (array.length > 1) {
            int p1 = 0, p2 = array.length - 1;
            while (p1 < p2) {
                int cursum = array[p1] + array[p2];
                if (cursum == sum) {
                    if (array[p1] * array[p2] < mul) {
                        n1 = p1;
                        n2 = p2;
                        mul = array[p1] * array[p2];
                    }
                    p1++;
                    p2--;
                }

                if (cursum < sum) {
                    p1++;
                }
                if (cursum > sum) {
                    p2--;
                }
            }
            if (n1 != n2) {
                res.add(array[n1]);
                res.add(array[n2]);
            }

        }
        return res;
    }

    /**
     * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
     * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
     * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
     * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
     *
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum <= 2) {
            return res;
        }
        int p1 = 1, p2 = 2;
        int count = 3;
        while (p1 <= (sum - 1) / 2 && p2 <= (sum + 1) / 2) {

            if (count < sum) {
                p2++;
                count += p2;
            }
            if (count > sum) {
                count -= p1;
                p1++;
            }
            if (count == sum) {
                ArrayList<Integer> seq = new ArrayList<>();
                for (int i = p1; i <= p2; i++) {
                    seq.add(i);
                }
                res.add(seq);
                p2++;
                count += p2;
            }
        }

        return res;
    }


    /**
     * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字
     * num1,num2分别为长度为1的数组。传出参数
     * 将num1[0],num2[0]设置为返回结果
     *
     * @param array
     * @param num1
     * @param num2
     */
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length == 0) {
            return;
        }
        num1[0] = 0;
        num2[0] = 0;
        int xorres = 0;
        for (int i = 0; i < array.length; i++) {
            xorres ^= array[i];
        }
        int index = first1(xorres);

        for (int i = 0; i < array.length; i++) {
            if (((array[i] >> index) & 1) == 1) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }

    }

    private int first1(int xorres) {
        int res = 0;
        while ((xorres & 1) != 1) {
            res++;
            xorres >>= 1;
        }
        return res;
    }

    /**
     * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     *
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        return isBalance(root);
    }

    private boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if (Math.abs(left - right) <= 1) {
            return isBalance(root.left) && isBalance(root.right);
        }
        return false;
    }

    /**
     * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     *
     * @param root
     * @return
     */
    public int TreeDepth(TreeNode root) {
        return getMaxDepth(root, 0);
    }

    private int getMaxDepth(TreeNode root, int depth) {
        int left = 0;
        if (root == null) {
            return depth;
        }

        left = getMaxDepth(root.left, depth + 1);
        depth = getMaxDepth(root.right, depth + 1);

        return left > depth ? left : depth;
    }

    /**
     * 统计一个数字在排序数组中出现的次数。
     *
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK(int[] array, int k) {
        int first = getFirstIndex(array, 0, array.length - 1, k);
        int last = getLastIndex(array, 0, array.length - 1, k);
        if (first != -1 && last != -1) {
            return last - first + 1;
        }
        return 0;
    }

    private int getFirstIndex(int[] array, int start, int end, int k) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == k) {
            if (mid - 1 > 0 && array[mid - 1] != k || mid == 0) {
                return mid;
            } else {
                return getFirstIndex(array, start, mid - 1, k);
            }
        } else if (k > array[mid]) {
            return getFirstIndex(array, mid + 1, end, k);
        } else {
            return getFirstIndex(array, start, mid - 1, k);
        }
    }

    private int getLastIndex(int[] array, int start, int end, int k) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == k) {
            if (mid + 1 < array.length && array[mid + 1] != k || mid == array.length - 1) {
                return mid;
            } else {
                return getLastIndex(array, mid + 1, end, k);
            }
        } else if (k > array[mid]) {
            return getLastIndex(array, mid + 1, end, k);
        } else {
            return getLastIndex(array, start, mid - 1, k);
        }
    }

    /**
     * 输入两个链表，找出它们的第一个公共结点。
     *
     * @param node1
     * @param node2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode node1, ListNode node2) {
        if (node1 == null || node2 == null) {
            return null;
        }
        int len1 = getLen(node1);
        int len2 = getLen(node2);
        int steps = len1 - len2;
        ListNode longer = node1;
        ListNode shorter = node2;
        if (len1 < len2) {
            longer = node2;
            shorter = node1;
            steps = len2 - len1;
        }
        while (steps-->0){
            longer = longer.next;
        }
        while (longer != null && shorter != null) {
            if (longer == shorter) {
                return longer;
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }

    private int getLen(ListNode pHead2) {
        ListNode temp = pHead2;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
     *
     * @param array
     * @return
     */
    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array, copy, 0, array.length - 1);//数值过大求余
        return count;
    }

    /**
     * 归并
     *
     * @param array
     * @return
     */
    private int InversePairsCore(int[] array, int[] copy, int low, int high) {
        if (low == high) {
            return 0;
        }
        int mid = (low + high) >> 1;
        int leftCount = InversePairsCore(array, copy, low, mid) % 1000000007;
        int rightCount = InversePairsCore(array, copy, mid + 1, high) % 1000000007;
        int i = mid;
        int j = high;
        int copyIndex = high;
        int count = 0;
        while (i >= low && j > mid) {
            if (array[i] > array[j]) {
                copy[copyIndex--] = array[i--];
                count += j - mid;
                if (count >= 1000000007)//数值过大求余
                {
                    count %= 1000000007;
                }
            } else {
                copy[copyIndex--] = array[j--];
            }
        }
        for (; i >= low; i--) {
            copy[copyIndex--] = array[i];
        }
        for (; j > mid; j--) {
            copy[copyIndex--] = array[j];
        }
        for (int l = low; l <= high; l++) {
            array[l] = copy[l];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }

    /**
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
     * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
     *
     * @param str
     * @return
     */
    public int FirstNotRepeatingChar(String str) {
        if (str.length() != 0) {
            char[] chars = str.toCharArray();
            int[] flag = new int[52];
            for (int i = 0; i < chars.length; i++) {
                int pos = 0;
                if (chars[i] > 'Z') {//小写字母
                    pos = chars[i] - 'A' - 6;
                } else {
                    pos = chars[i] - 'A';
                }
                flag[pos] += 1;
            }
            for (int i = 0; i < chars.length; i++) {
                int pos = 0;
                if (chars[i] > 'Z') {//小写字母
                    pos = chars[i] - 'A' - 6;
                } else {
                    pos = chars[i] - 'A';
                }
                if (flag[pos] == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     *
     * @param index
     * @return
     */
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] uglyNums = new int[index];
        uglyNums[0] = 1;
        int currUgIndex = 1;
        int preIndex2 = 0, preIndex3 = 0, preIndex5 = 0;//下标
        while (currUgIndex < index) {
            //下一个丑数是三者中最小的
            int min = minInThree(uglyNums[preIndex2] * 2, uglyNums[preIndex3] * 3, uglyNums[preIndex5] * 5);
            uglyNums[currUgIndex] = min;

            while (uglyNums[preIndex2] * 2 <= uglyNums[currUgIndex]) {
                preIndex2++;
            }
            while (uglyNums[preIndex3] * 3 <= uglyNums[currUgIndex]) {
                preIndex3++;
            }
            while (uglyNums[preIndex5] * 5 <= uglyNums[currUgIndex]) {
                preIndex5++;
            }
            ++currUgIndex;
        }


        return uglyNums[currUgIndex - 1];
    }

    private int minInThree(int uglyNum, int uglyNum1, int uglyNum2) {
        int min = uglyNum < uglyNum1 ? uglyNum : uglyNum1;
        min = min < uglyNum2 ? min : uglyNum2;
        return min;
    }

    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     *
     * @param numbers
     * @return
     */
    public String PrintMinNumber(int[] numbers) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        for (int i = 0; i < numbers.length; i++) {
            queue.offer(String.valueOf(numbers[i]));
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }


    /**
     * 1-n整数中1出现的次数
     * <p>
     * 整数中1出现的次数
     *
     * @param n
     * @return
     */
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i, b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }
        return count;
    }

    /**
     * 连续子数组最大和
     * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
     *
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        int sum = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if (sum < array[i]) {
                sum = array[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    /**
     * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     *
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = input.length;
        if (k > len || k <= 0) {
            return res;
        }

        int start = 0;
        int end = len - 1;
        int index = partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                index = partition(input, start, index - 1);
            } else {
                index = partition(input, index + 1, end);
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private int partition(int[] arr, int start, int end) {
        int key = arr[start];
        while (start < end) {
            while (start < end && arr[end] >= key) {//从后往前找到一个比枢轴值小的，换到前面去
                end--;
            }
            arr[start] = arr[end];
            while (start < end && arr[start] <= key) {//从前往后找到一个比枢轴值大的，换到后面去
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = key;//将枢轴值放到分割处
        return start;//返回枢轴值的位置
    }

    private void swap(int[] input, int end, int index) {
        int temp = input[index];
        input[index] = input[end];
        input[end] = temp;
    }

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     *
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int half = array.length / 2;
        //result初始值为第一个元素
        int result = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == result) {//如果相同，次数加1
                count++;
            } else if (count == 0) {//次数归零了，重新赋值
                result = array[i];
                count = 1;
            } else {
                count--;
            }
        }
        //再检查一遍是因为，例如[1,2,3,2,4,2,5,2,3]，防止没有超过一半的数时，最后一个被当做正确答案
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (result == array[i]) {
                count++;
            }
        }
        //如果result次数大于一半，则即为要找的数字
        if (count > half) {
            return result;
        }
        return 0;
    }

    /**
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
     * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     *
     * @param str
     * @return
     */
    ArrayList<String> permution = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return permution;
        }
        getRes(str, "", new boolean[str.length()]);
        return permution;
    }

    public void getRes(String str, String sb, boolean[] visited) {
        if (sb.length() == str.length()) {
            if (!permution.contains(sb)) {
                permution.add(sb);
            }
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                getRes(str, sb + str.charAt(i), visited);
                visited[i] = false;
            }
        }
    }

    /**
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
     *
     * @param root
     * @return
     */
    public TreeNode Convert(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode last = null;//last是双向链表最后一个节点
        last = convert(root, last);
        while (last.left != null) {
            last = last.left;
        }
        return last;
    }

    public TreeNode convert(TreeNode node, TreeNode last) {
        if (node.left != null) {//找到左子树双向链表的最后一个节点
            last = convert(node.left, last);
        }
        //然后将左子树链表最后一个节点与当前节点互相连接
        if (last != null) {
            last.right = node;
        }
        node.left = last;
        last = node;//当前节点成为新的链表最后节点
        if (node.right != null) {//将目前最后一个节点与右子树连接
            last = convert(node.right, node);
        }
        return last;
    }

    private void getNodes(TreeNode pRootOfTree, Queue<TreeNode> queue) {
        if (pRootOfTree != null) {
            getNodes(pRootOfTree.left, queue);
            queue.add(pRootOfTree);
            getNodes(pRootOfTree.right, queue);
        }
    }

    /**
     * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
     * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
     *
     * @param pHead
     * @return
     */
    public RandomListNode Clone(RandomListNode pHead) {
        //分三步，克隆原来的节点；连接随机节点；连接克隆节点
        if (pHead == null) {
            return pHead;
        }
        RandomListNode curNode = pHead;
        // 在每个节点后面插入克隆节点
        while (curNode != null) {
            RandomListNode newNode = new RandomListNode(curNode.label);
            newNode.next = curNode.next;
            curNode.next = newNode;
            curNode = newNode.next;
        }
        curNode = pHead;
        //复制random节点
        while (curNode != null) {
            if (curNode.random != null) {
                //random.next是random的克隆节点
                curNode.next.random = curNode.random.next;
            }
            curNode = curNode.next.next;
        }
        // 拆分
        curNode = pHead;
        RandomListNode newStart = pHead.next;
        while (curNode.next != null) {
            RandomListNode nextNode = curNode.next;
            curNode.next = nextNode.next;
            curNode = nextNode;
        }
        return newStart;
    }

    /**
     * 二叉树中和为某一值的路径
     * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
     *
     * @param root
     * @param target
     * @return
     */
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return res;
        }
        getPath(root, target, new ArrayList<>());
        return res;
    }

    private void getPath(TreeNode root, int target, ArrayList<Integer> p) {
        if (root == null) {
            return;
        }
        target -= root.val;
        p.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(p));
        } else {
            getPath(root.left, target, p);
            getPath(root.right, target, p);
        }
        p.remove(p.size() - 1);
    }

    /**
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     *
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    public boolean verify(int[] sequence, int start, int rootidx) {
        if (start > rootidx) {
            return true;
        }
        int i = start;
        for (; i < rootidx; i++) {
            if (sequence[i] > sequence[rootidx]) {
                break;
            }
        }
        for (int j = i; j < rootidx; j++) {
            if (sequence[j] < sequence[rootidx]) {
                return false;
            }
        }
        return verify(sequence, start, i - 1) && verify(sequence, i, rootidx - 1);
    }

    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        //使用队列实现层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                res.add(temp.val);
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        return res;
    }

    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
     * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
     * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
     *
     * @param pushA
     * @param popA
     * @return
     */
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }
        return index == popA.length;
    }


    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
     *
     * @param node
     */
    //一个栈保存所有数据，另一个栈保存这个深度下的最小值
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push2(int node) {
        stack.push(node);
        minstack.push(minstack.isEmpty() || node < minstack.peek() ? node : minstack.peek());
    }

    public void pop2() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }

    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     *
     * @param matrix
     * @return
     */
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        if (row == 0) {
            return null;
        }
        int col = matrix[0].length;
        int start = 0;
        for (int i = 0; i * 2 < row && i * 2 < col; i++) {//注意终止条件
            printInCircle(matrix, start, res, col, row);
            start++;
        }
        return res;
    }

    private void printInCircle(int[][] matrix, int start, ArrayList<Integer> res, int col, int row) {
        int endcol = col - 1 - start;//该圈的终止列
        int endrow = row - 1 - start;//该圈的终止行
        for (int i = start; i <= endcol; i++) {//从左到右打印，从第一个打印到最后一个
            res.add(matrix[start][i]);
        }
        for (int i = start + 1; i <= endrow; i++) {//从上到下打印，从一列第二个打印到最后一个
            res.add(matrix[i][endcol]);
        }
        if (start < endrow) {//防止与从左向右打印重复
            //从右向左打印，从一列倒数第二个打印到第一个
            for (int i = endcol - 1; i >= start; i--) {
                res.add(matrix[endrow][i]);
            }
        }

        if (start < endcol) {//防止与从上向下打印重复
            //从下到上打印，从一列倒数第二个打印到第二个
            for (int i = endrow - 1; i > start; i--) {
                res.add(matrix[i][start]);
            }
        }
    }

    /**
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     *
     * @param root
     */
    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.right);
            Mirror(root.left);
        }
    }

    /**
     * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean res = false;
        if (root1.val == root2.val) {
            res = DoesHasSubtree(root1, root2);
        }
        if (!res) {
            res = HasSubtree(root1.left, root2);
        }
        if (!res) {
            res = HasSubtree(root1.right, root2);
        }
        return res;
    }

    private boolean DoesHasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {//说明root2已经完整遍历完了，是root1的子树
            return true;
        }
        if (root1 == null) {//root2还没遍历完，root1已经没了，说明不是子树
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return DoesHasSubtree(root1.left, root2.left) && DoesHasSubtree(root1.right, root2.right);
    }


    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    /**
     * 反转链表
     * 输入一个链表，反转链表后，输出新链表的表头。
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode newHead = ReverseList(head.next);
//        //原本当前节点的下一个节点设为当前节点，即调换指向
//        head.next.next = head;
//        head.next = null;
//        return newHead;
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        //双指针的方式，
        // 第一个指针比第二个指针多走k-1步，这样当第一个指针指向末尾节点时，
        // 第二个指针正好指向倒数第k个节点
        if (head == null || k == 0) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while (k-- != 1) {
            if (first.next == null) {//防止k大于链表的长度
                return null;
            }
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        //O(n)方法
        int len = array.length;
        int[] res = new int[len];
        boolean[] flag = new boolean[len];
        int oddcount = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                flag[i] = true;
            } else {
                oddcount++;
            }
        }
        int m = 0, n = 0;
        for (int i = 0; i < len; i++) {
            if (flag[i]) {//如果是偶数
                res[oddcount + (m++)] = array[i];
            } else {
                res[n++] = array[i];
            }
        }
        System.arraycopy(res, 0, array, 0, len);
    }

    /**
     * 快速幂
     *
     * @param a
     * @param b
     * @return
     */
    public double power4(int a, int b) {
        //3^5 = 3^(2^2+2^0)=3^(2^2)×3^(2^0)
        int r = 1, base = a;
        while (b != 0) {
            if ((b & 1) != 0) {//从b二进制最右边开始判断是否有1
                r *= base;
            }
            base *= base;
            b >>= 1;
        }
        return r;
    }

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     *
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        if (base == 0 && exponent < 0) {
            return 0;
        }
        if (exponent < 0) {
            if (exponent == Integer.MIN_VALUE) {
                return 1 / powerwithzex(base, Integer.MAX_VALUE) * 1 / base;
            }
            return 1 / powerwithzex(base, -exponent);
        }
        return powerwithzex(base, exponent);
    }

    private double powerwithzex(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        //a^n = {a^(n/2) * a^(n/2) n为偶数时；a^[(n-1）/2] * a^[(n-1）/2])*a n位奇数时}
        double res = powerwithzex(base, exponent >> 1);
        res *= res;
        if ((exponent & 1) == 1) {
            res *= base;
        }
        return res;
    }

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     *
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        //有多少个1就计算多少次的解法
        int count = 0;
        while (n != 0) {
            //一个数减一之后与原来的数按位与操作，相当于把最右边的1变成0，
            // 那么原数的二进制有多少个1，就会运算多少次
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    /**
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     *
     * @param target
     * @return
     */
    public int RectCover(int target) {
        //本质还是斐波那契，前两个元素为1、2
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int prepre = 1;
        int pre = 2;
        int cur = 0;
        for (int i = 3; i < target; i++) {
            cur = pre + prepre;
            prepre = pre;
            pre = cur;
        }
        return cur;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法
     *
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        //        if(target==1){
        //            return 1;
        //        }
        //         return 2<<(target-2);
        return (int) Math.pow(2, target - 1);
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     *
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int preone = 2;//到达上一步台阶的方案数
        int pretwo = 1;//到达前两步台阶的方案数
        int cur = 0;
        for (int i = 3; i <= target; i++) {
            cur = preone + pretwo;
            pretwo = preone;
            preone = cur;
        }
        return cur;
    }

    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，
     * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * n<=39
     *
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prepre = 0;
        int pre = 1;
        int cur = 0;
        for (int i = 2; i <= n; i++) {
            cur = pre + prepre;
            prepre = pre;
            pre = cur;
        }
        return cur;
    }

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     *
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int[] array) {
        //二分法
        if (array.length == 0) {
            return 0;
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int mid = 0;
        while (index1 < index2) {
            //退出条件，index1和index2相遇
            if (index2 - index1 == 1) {
                mid = index2;
                break;
            }
            mid = (index1 + index2) / 2;
            if (array[index1] == array[index2] && array[index1] == array[mid]) {
                return regufind(array, index1, index2);
            }
            if (array[index1] <= array[mid]) {
                index1 = mid;
            } else if (array[index2] >= array[mid]) {
                index2 = mid;
            }
        }
        return array[mid];
    }

    private int regufind(int[] array, int index1, int index2) {
        int res = array[index1];
        for (int i = index1 + 1; i <= index2; i++) {
            if (res > array[i]) {
                res = array[i];
            }
        }
        return res;
    }

    //用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //stack2为空时，将stack1中所有元素弹出到stack2中，stack2的栈顶元素即为队列首
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     *
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
//        //前序遍历第一个是根节点，中序遍历中根节点之前是左子树，根节点之后是右子树
//        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    /**
     * @param pre
     * @param in
     * @param prefrom 前序遍历中子树起始位置
     * @param preto   前序遍历中子树结束位置
     * @param infrom  中序遍历中子树起始位置
     * @param into    中序遍历中子树结束位置
     * @return
     */
    private TreeNode construct(int[] pre, int[] in, int prefrom, int preto, int infrom, int into) {
        if (prefrom > preto || infrom > into) {
            return null;
        }
        TreeNode root = new TreeNode(pre[prefrom]);
        for (int i = infrom; i <= into; i++) {
            if (pre[prefrom] == in[i]) {
                int leftlen = i - infrom;
                root.left = construct(pre, in, prefrom + 1, prefrom + leftlen, infrom, i - 1);
                root.right = construct(pre, in, prefrom + 1 + leftlen, preto, i + 1, into);
            }
        }
        return root;
    }

    /**
     * 从尾到头打印链表
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     *
     * @param head
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        //先反转链表再添加
        ArrayList<Integer> res = new ArrayList<>();
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        while (pre != null) {
            res.add(pre.val);
            pre = pre.next;
        }
        return res;
    }

    /**
     * 请实现一个函数，
     * 将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        //不是在源字符串上修改
        char[] chars = str.toString().toCharArray();
        str = new StringBuffer();
        for (char aChar : chars) {
            if (aChar == ' ') {
                str.append("%20");
                continue;
            }
            str.append(aChar);
        }
        return str.toString();
        //若在原字符串上修改，从后往前替换
    }

    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        int row = array.length;
        if (row == 0) {
            return false;
        }
        int col = array[0].length;
        int i = row - 1, j = 0;
        while (i >= 0 && j < col) {
            if (target > array[i][j]) {
                j++;
            } else if (target < array[i][j]) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }
}
