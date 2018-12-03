package com.zhi.algorithm;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 数据结构
 */
public class DataStructure {
    public static void main(String[] args) {

//        //字符串匹配MP算法
//        String t = "ctcaatcacaatcat";
//        String p = "caatncaatm";
//        new DataStructure().MP(p,t);

//        //单向链表
//        List list = new List();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(7);
//        list.add(90);
//        list.add(12);
//        list.removeAll();
//        list.deleteAt(200);

//        //栈
//        ArrayStack a = new ArrayStack();
//        a.push(1);
//        a.push(2);
//        a.push(3);
//        a.push(4);
//
//        while (!a.isEmpty()) {
//            System.out.println(a.pop());
//        }
//
//        String s = "(((()((())()()()((((()))()()(()))))())";
//        System.out.println(bracketsMatch(s));

//        //二叉树
//        BinaryTree tree = new BinaryTree(20);
//        tree.insert(18);
//        tree.insert(25);
//        tree.insert(17);
//        tree.insert(19);
//        tree.insert(24);
//        tree.insert(26);
//
//        tree.levelOrderTraverse(tree.getRoot());


    }


    /**
     * 计算失败时从新开始的位置
     *
     * @param x 要匹配的字符串
     * @param m 要匹配的字符串的长度
     * @return 数组记录对应字符匹配失败时，重新开始的位置
     */
    private int[] preMp(String x, int m) {
        int[] mpNext = new int[m + 1];
        //i是遍历x的下标，j是开头第j个
        int i = 0, j = mpNext[0] = -1;//第一个元素的值为-1
        while (i < m) {//下标i从头开始遍历x
            while (j > -1 && x.charAt(i) != x.charAt(j)) {//判断第i个字符跟开头第j个字符是否相同
                j = mpNext[j];//执行到此步时，j==0
            }
            mpNext[++i] = ++j;//如果第3个字符与第0个字符相同，则第四个字符不匹配时，从第1个字符开始重新比较
        }
        return mpNext;
    }

    /**
     * 字符串匹配MP算法，从t中匹配p
     *
     * @param p 要匹配的字符串
     * @param t 目标字符串
     */
    private void MP(String p, String t) {
        int m = p.length();
        int n = t.length();
        if (m > n) {
            System.err.println("匹配失败");
        }

        int i = 0, j = 0;//i用来遍历p，j用来遍历t
        int[] mpNext = preMp(p, m);

        while (j < n) {
            while (i > -1 && p.charAt(i) != t.charAt(j)) {
                i = mpNext[i];
            }
            i++;
            j++;
            if (i >= m) {
                System.out.printf("在index=%d处匹配成功。", j - i);
                i = mpNext[i];
            }
        }
    }

    /**
     * 括号匹配，判断输入的字符串中左右括号是否匹配
     *
     * @param s 输入字符串
     * @return 是否匹配
     */
    private static boolean bracketsMatch(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push('(');
            }
            if (aChar == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

/**
 * 一般树节点
 */
class TreeNode{
    int data;
    TreeNode leftChild;//左孩子节点
    TreeNode rightSibling;//右兄弟节点

    public TreeNode(int data) {
        this.data = data;
    }
}


/**
 * 一般树
 */
class Tree{
    TreeNode root;
}

class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree(int value) {
        root = new BinaryTreeNode(value);
    }

    public int findMax() {
        BinaryTreeNode temp = root;
        BinaryTreeNode max = temp;
        while (temp != null) {
            max = temp;
            temp = temp.rightNode;
        }
        return max.data;
    }

    public int findMin() {
        BinaryTreeNode temp = root;
        BinaryTreeNode min = temp;
        while (temp != null) {
            min = temp;
            temp = temp.leftNode;
        }
        return min.data;
    }

    /**
     * 层序遍历
     * 采用队列的方式实现，输出节点值，然后按顺序将左右节点入队列
     * @param root
     */
    public void levelOrderTraverse(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.println(node.data);//输出节点值
            if (node.leftNode != null) {//左节点入队列
                queue.offer(node.leftNode);
            }
            if (node.rightNode != null) {//右节点入队列
                queue.offer(node.rightNode);
            }
        }
    }

    /**
     * @param root 中序遍历
     */
    public void inOrderTraverse(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraverse(root.leftNode);
            System.out.println(root.data);
            inOrderTraverse(root.rightNode);
        }
    }

    /**
     * 前序遍历
     *
     * @param root
     */
    public void preOrderTraverse(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrderTraverse(root.leftNode);
            preOrderTraverse(root.rightNode);
        }
    }

    /**
     * 后序遍历
     * @param root
     */
    public void postOrderTraverse(BinaryTreeNode root) {
        if (root != null) {
            postOrderTraverse(root.leftNode);
            postOrderTraverse(root.rightNode);
            System.out.println(root.data);
        }
    }

    public BinaryTreeNode find(int value) {
        BinaryTreeNode temp = root;
        while (temp != null) {
            if (value > temp.data) {
                temp = temp.rightNode;
            } else if (value < temp.data) {
                temp = temp.leftNode;
            } else {
                return temp;
            }
        }
        return null;
    }

    /**
     * 按照左子树<父节点<右子树的方式插入
     *
     * @param n
     * @return
     */
    public boolean insert(int n) {
        BinaryTreeNode newNode = new BinaryTreeNode(n);
        if (root == null) {
            root = newNode;
            return true;
        }
        BinaryTreeNode temp = root;
        BinaryTreeNode pre = null;
        while (true) {
            pre = temp;
            if (n < temp.data) {
                temp = temp.leftNode;
                if (temp == null) {
                    pre.leftNode = newNode;
                    return true;
                }
            } else {
                temp = temp.rightNode;
                if (temp == null) {
                    pre.rightNode = newNode;
                    return true;
                }
            }
        }
    }

    public BinaryTreeNode getRoot() {
        return root;
    }
}

class BinaryTreeNode {
    int data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }
}

class ArrayStack {
    private int[] elements = new int[3];
    private int elementCount;//元素个数

    void push(int v) {
        checkCapacity(elementCount + 1);
        elements[elementCount++] = v;
    }

    private void checkCapacity(int minCapacity) {//如果增加一个元素会超过数组长度，扩展存储数组
        if (minCapacity - elements.length > 0) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    int pop() {
        if (elementCount == 0) {
            throw new RuntimeException("栈为空");
        }
        return elements[--elementCount];
    }

    boolean isEmpty() {
        return elementCount == 0;
    }

    void clear() {
        elementCount = 0;
        elements = new int[10];
    }
}

/**
 * 链表节点类
 */
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

/**
 * 链表类
 */
class List {
    private ListNode head;
    private ListNode tail;
    private int size;

    void add(int val) {
        ListNode node = new ListNode(val);
        ListNode temp = tail;
        tail = node;//插入的节点作为尾节点
        if (temp == null) {//尾节点为空，说明链表此时为空
            head = node;//此时插入的node，既是头结点，也是尾节点
        } else {
            temp.next = node;//尾节点不为空，直接将节点加到尾节点后面
        }
        size++;
    }

    void insertAt(int index, int value) {
        if (index >= size) {
            System.err.println("超过链表最大长度");
            return;
        }
        int temp = 0;
        ListNode tempNode = head;
        ListNode preNode = null;
        ListNode newNode = new ListNode(value);
        while (tempNode != null) {
            if (temp == index) {//将新的节点链接到上一个节点后面，当前节点作为新节点的下一个节点
                if (preNode == null) {//前一个节点为null，则插入链表头部
                    head = newNode;
                    newNode.next = tempNode;
                    break;
                } else {
                    preNode.next = newNode;
                    newNode.next = tempNode;
                    break;
                }
            }
            preNode = tempNode;
            tempNode = tempNode.next;
            temp++;
        }
        size++;
    }

    void deleteTail() {
        if (size == 0) {
            System.err.println("链表为空");
            return;
        }
        ListNode temp = head;
        ListNode preNode = null;
        while (temp != null) {
            if (temp.next == null) {//此时temp为最后一个节点
                if (preNode == null) {//此时链表只有一个节点
                    head = null;
                } else {
                    preNode.next = null;
                    break;
                }
            } else {
                preNode = temp;
                temp = temp.next;
            }
        }
        size--;
    }

    void deleteAt(int index) {
        if (index >= size) {
            throw new RuntimeException("超过链表长度");
        }
        int temp = 0;
        ListNode preNode = null;
        ListNode tempNode = head;
        while (tempNode != null) {
            if (temp == index) {
                if (preNode == null) {//说明要删除头结点
                    head = head.next;
                    break;
                } else {
                    preNode.next = tempNode.next;
                    break;
                }
            }
            preNode = tempNode;
            tempNode = tempNode.next;
            temp++;
        }
        size--;
    }

    int getAt(int index) {
        if (index >= size) {
            return -1;
        }
        int temp = 0;
        ListNode tempNode = head;
        while (tempNode != null) {
            if (temp == index) {
                return tempNode.data;
            }
            tempNode = tempNode.next;
            temp++;
        }
        return 0;
    }

    boolean isEmpty() {

        return size == 0;
    }

    int getSize() {
        return size;
    }

    void removeAll() {
        head = null;
        tail = null;
        size = 0;
    }

    ListNode getNodeAt(int index) {
        if (index >= size) {
            System.err.println("超过链表长度");
            return null;
        }
        int temp = 0;
        ListNode tempNode = head;
        while (tempNode != null) {
            if (temp == index) {
                return tempNode;
            } else {
                tempNode = tempNode.next;
                temp++;
            }
        }
        return null;
    }
}
