package com.zhi.algorithm;

import java.util.LinkedList;

/**
 * 数据结构
 */
public class DataStructure {
    public static void main(String[] args) {

//        //字符串匹配MP算法
//        String t = "ctcaatcacaatcat";
//        String p = "caatncaatm";
//        new DataStructure().MP(p,t);

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
}

class Test {
    int a;
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

class List {
    private ListNode head;
    private ListNode tail;
    int size;

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
        int temp=0;
        ListNode tempNode = head;
        ListNode preNode = null;
        ListNode newNode = new ListNode(value);
        while (tempNode != null) {
            if (temp == index) {//将新的节点链接到上一个节点后面，当前节点作为新节点的下一个节点
                if (preNode == null) {//前一个节点为null，则插入链表头部
                    head=newNode;
                    newNode.next = tempNode;
                    break;
                }else {
                    preNode.next=newNode;
                    newNode.next=tempNode;
                    break;
                }
            }
            preNode=tempNode;
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
                    head=null;
                }else {
                    preNode.next=null;
                }
            }else {
                preNode=temp;
                temp=temp.next;
            }
        }
        size--;
    }

    void deleteAt(int index) {
        if (index >= size) {
            System.err.println("超过链表长度");
            return;
        }
        int temp = 0;
        ListNode preNode = null;
        ListNode tempNode = head;
        while (tempNode != null) {
            if (temp == index) {
                if (preNode == null) {//说明链表只有一个节点
                    head=null;
                    break;
                }else {
                    preNode.next=tempNode.next;
                    break;
                }
            }
            preNode=tempNode;
            tempNode = tempNode.next;
            temp++;
        }
        size--;
    }

    int getAt(int index) {
        if (index >= size) {
            System.err.println("超过链表长度");
            return -1;
        }
        int temp =0;
        ListNode tempNode = head;
        while (tempNode != null) {
            if (temp == index) {
                return tempNode.data;
            }
            tempNode=tempNode.next;
            temp++;
        }
        return 0;
    }

    boolean isEmpty() {

        return size==0;
    }

    int getSize() {
        return size;
    }

    void removeAll() {
        head=null;
        tail=null;
        size=0;
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
            }else {
                tempNode=tempNode.next;
                temp++;
            }
        }
        return null;
    }
}
