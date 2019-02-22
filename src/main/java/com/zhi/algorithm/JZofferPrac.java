package com.zhi.algorithm;

import com.zhi.algorithm.PracticeArea.ListNode;

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

    public static void main(String[] args) {
        JZofferPrac p = new JZofferPrac();
        TreeNode t1 = new TreeNode(1);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(3);
//        TreeNode t4 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(4);
//        TreeNode t6 = new TreeNode(6);
//        t1.left = t2;
//        t1.right = t3;
//        t2.left = t4;
//        t2.right = t5;
//        t3.left = t6;
//        ArrayList<ArrayList<Integer>> lists = p.FindPath(t1, 7);
//        for (ArrayList<Integer> list : lists) {
//            for (Integer integer : list) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//        }

    }

    /**
     * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
     * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
     *
     * @param pHead
     * @return
     */
    public RandomListNode Clone(RandomListNode pHead) {
        CloneNodes(pHead);
        ConnectRandomNodes(pHead);
        return ReconnectNodes(pHead);
    }

    public void CloneNodes(RandomListNode head) {
        //克隆每一个节点，并接在原节点后面
        RandomListNode node = head;
        while (node != null) {
            RandomListNode cloned = new RandomListNode(node.label);
            cloned.next = node.next;
            cloned.random = null;
            node.next = cloned;
            node = cloned.next;
        }
    }

    public void ConnectRandomNodes(RandomListNode head) {
        RandomListNode node = head;
        while (node != null) {
            RandomListNode cloned = node.next;
            if (node.random != null) {
                cloned.random = node.random.next;
            }
            node = cloned.next;
        }
    }

    public RandomListNode ReconnectNodes(RandomListNode head) {
        RandomListNode node = head;
        RandomListNode clonedHead = null;
        RandomListNode clonedNode = null;
        if (node != null) {
            clonedHead = clonedNode = node.next;
            node.next = clonedNode.next;
            node = node.next;
        }
        while (node != null) {
            clonedNode.next = node.next;
            clonedNode = clonedNode.next;
            node.next = clonedNode.next;
            node = node.next;
        }
        return clonedHead;
    }

    /**
     * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
     *
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        if (root != null) {
            getPath(root, target, p, res);
        }
        res.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {

                return o1.size() - o2.size();
            }
        });
        return res;
    }

    private void getPath(TreeNode root, int target, ArrayList<Integer> p, ArrayList<ArrayList<Integer>> res) {
        p.add(root.val);
        boolean isLeaf = root.left == null && root.right == null;
        if (root.val == target && isLeaf) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer integer : p) {
                temp.add(integer);
            }
            res.add(temp);
        }
        if (root.val < target) {
            if (root.left != null) {
                getPath(root.left, target - root.val, p, res);
            }
            if (root.right != null) {
                getPath(root.right, target - root.val, p, res);
            }
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
        return isBST(sequence, 0, sequence.length - 1);
    }

    /**
     * @param sequence 树的后序遍历序列
     * @param start    开始下标
     * @param end      终止下标
     * @return
     */
    private boolean isBST(int[] sequence, int start, int end) {
        int root = sequence[end];
        int i = start;//i是右子树第一个元素下标
        //找到比根节点值大的元素
        for (; i < end; i++) {
            if (sequence[i] > root) {
                break;
            }
        }
        int j = i;//没有右子树时，i的值为end,下面判断不会进行
        for (; j < end; j++) {//如果右子树某个元素小于根节点，说明不是二叉搜索树
            if (sequence[j] < root) {
                return false;
            }
        }
        boolean left = true;
        if (i > start) {
            left = isBST(sequence, start, i - 1);
        }
        boolean right = true;
        if (i < end) {
            right = isBST(sequence, i, end - 1);
        }
        return left && right;
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
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        stack.push(pushA[j++]);//初始时栈内需要一个数
        for (int i1 : popA) {//从弹出序列遍历
            while (i1 != stack.peek()) {//如果要弹出的数字不在栈顶
                if (j < pushA.length) {
                    stack.push(pushA[j++]);//则向栈内压入数字，直到栈顶数字为要弹出的数字，或者数字已经全部进栈
                } else {//已经全部进栈，则停止压入
                    break;
                }
            }
            if (i1 != stack.pop()) {//栈顶数字与要弹出的数字不一样，则返回false
                return false;
            }
        }
        return true;
    }


    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
     *
     * @param node
     */
    //使用优先队列保存有序数列
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    });

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    //    public void push2(int node) {
//        queue.add(node);
//        stack.push(node);
//    }
    public void push2(int node) {
        stack.push(node);
        if (minstack.size() == 0 || node < minstack.peek()) {
            minstack.push(node);
        } else {
            minstack.push(minstack.peek());
        }
    }

    //    public void pop2() {
//        queue.remove(stack.pop());
//    }
    public void pop2() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    //    public int min() {
//        return queue.peek();
//    }
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
        while (col > start * 2 && row > start * 2) {
            printInCircle(matrix, start, res, col, row);
            start++;
        }
        return res;
    }

    private void printInCircle(int[][] matrix, int start, ArrayList<Integer> res, int col, int row) {
        int endcol = col - 1 - start;//该圈的终止列
        int endrow = row - 1 - start;//该圈的终止行
        for (int i = start; i <= endcol; i++) {//从左到右打印
            res.add(matrix[start][i]);
        }

        if (start < endrow) {//从上到下打印，条件为终止行大于起始行
            for (int i = start + 1; i <= endrow; i++) {
                res.add(matrix[i][endcol]);
            }
        }
        if (start < endcol && start < endrow) {//从右向左打印，条件为终止列大于起始列，终止行大于起始行
            for (int i = endcol - 1; i >= start; i--) {
                res.add(matrix[endrow][i]);
            }
        }

        if (start < endrow - 1 && start < endcol) {//从下到上打印，条件：终止行比起始行至少大2；终止列大于起始列
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
//        List<Integer> res = new ArrayList<>();
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                res.add(list1.val);
//                list1 = list1.next;
//            } else {
//                res.add(list2.val);
//                list2 = list2.next;
//            }
//        }
//        while (list1 != null) {
//            res.add(list1.val);
//            list1 = list1.next;
//        }
//        while (list2 != null) {
//            res.add(list2.val);
//            list2 = list2.next;
//        }
//        ListNode node = null;
//        ListNode temp = null;
//        for (int i = 0; i < res.size(); i++) {
//            if (node == null) {
//                node = new ListNode(res.get(i));
//                temp = node;
//                continue;
//            }
//            ListNode l = new ListNode(res.get(i));
//            temp.next = l;
//            temp = temp.next;
//
//        }
//        return node;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode res = null;
        if (list1.val < list2.val) {
            res = list1;
            res.next = Merge(list1.next, list2);
        } else {
            res = list2;
            res.next = Merge(list1, list2.next);
        }
        return res;
    }

    /**
     * 输入一个链表，反转链表后，输出新链表的表头。
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = ReverseList(head.next);
        //原本当前节点的下一个节点设为当前节点，即调换指向
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        //使用栈的方式
//        if (head == null) {
//            return null;
//        }
//        Stack<ListNode> stack = new Stack<>();
//        while (head != null) {
//            stack.push(head);
//            head = head.next;
//        }
//        while (true) {
//            if (stack.isEmpty()) {
//                return null;
//            }
//            if (k-- == 1) {
//                return stack.pop();
//            }
//            stack.pop();
//        }

        //双指针的方式，
        // 第一个指针比第二个指针多走k-1步，这样当第一个指针指向末尾节点时，
        // 第二个指针正好指向倒数第k个节点
        if (head == null || k == 0) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < k - 1; i++) {
            if (first.next != null) {//防止k大于链表的长度而产生异常
                first = first.next;
            } else {
                return null;
            }
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
        //O(n^2)
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
//                    array[j] = array[j] + array[j + 1] - (array[j + 1] = array[j]);
//                }
//            }
//        }
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
        //原数有多少位就计算多少次的方法
        //将1与原数按位相与，每次计算之后，1左移一位
//        int c = 0;
//        int flag = 1;
//        while (flag != 0) {
//            if ((n & flag) != 0) {
//                c++;
//            }
//            flag = flag << 1;
//        }
//        return c;
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
        int preisone = 2;
        int preistwo = 1;
        int cur = 0;
        for (int i = 3; i <= target; i++) {
            cur = preisone + preistwo;
            preistwo = preisone;
            preisone = cur;
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
        if (array.length == 0) {
            return 0;
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int mid = 0;
        while (array[index1] >= array[index2]) {
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
//        if (prefrom > preto || infrom > into) {
//            return null;
//        }
//        TreeNode root = new TreeNode(pre[prefrom]);//根节点是前序遍历中第一个元素
//        for (int i = infrom; i <= into; i++) {
//            if (pre[prefrom] == in[i]) {
//                //i是从rfrom开始的，所以左子树的元素个数为i-from
//                int leftlen = i - infrom;//左子树长度
//                //左子树的前序遍历是根节点后的leftlen个元素，即从prefrom+1到prefrom+leftlen
//                //左子树的中序遍历是根节点i之前，从infrom到i-1的元素
//                root.left = construct(pre, in, prefrom + 1, prefrom + leftlen, infrom, i - 1);
//                root.right = construct(pre, in, prefrom + leftlen + 1, preto, i + 1, into);
//            }
//        }
//        return root;
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
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //递归或栈都能实现
        ArrayList<Integer> res = new ArrayList<Integer>();
        getRes(listNode, res);
        return res;
    }

    private void getRes(ListNode listNode, ArrayList<Integer> res) {
        if (listNode == null) {
            return;
        }
        if (listNode.next != null) {
            getRes(listNode.next, res);
        }
        res.add(listNode.val);
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
