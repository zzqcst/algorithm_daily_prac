package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//堆盘子。设想有一堆盘子，堆太高可能会倒下来。因此，在现实生活中，盘子堆到一定高度时，我们就会另外堆一堆盘子。请实现数据结构SetOfStacks，模拟这种行
//为。SetOfStacks应该由多个栈组成，并且在前一个栈填满时新建一个栈。此外，SetOfStacks.push()和SetOfStacks.pop()应该与
//普通栈的操作方法相同（也就是说，pop()返回的值，应该跟只有一个栈时的情况一样）。 进阶：实现一个popAt(int index)方法，根据指定的子栈，执行p
//op操作。 
//
// 当某个栈为空时，应当删除该栈。当栈中没有元素或不存在该栈时，pop，popAt 应返回 -1. 
//
// 示例1: 
//
//  输入：
//["StackOfPlates", "push", "push", "popAt", "pop", "pop"]
//[[1], [1], [2], [1], [], []]
// 输出：
//[null, null, null, 2, 1, -1]
// 
//
// 示例2: 
//
//  输入：
//["StackOfPlates", "push", "push", "push", "popAt", "popAt", "popAt"]
//[[2], [1], [2], [3], [0], [0], [0]]
// 输出：
//[null, null, null, null, 2, 1, 3]
// 
// Related Topics 设计 
// 👍 19 👎 0

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackOfPlatesLcci {
    public static void main(String[] args) {

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class StackOfPlates {
        private int cap;
        private List<Stack<Integer>> list;
        public StackOfPlates(int cap) {
            list = new ArrayList<Stack<Integer>>();
            cap = cap;
        }

        public void push(int val) {
            if(cap <= 0) {
                return;
            }

            if(list.isEmpty()) {
                list.add(new Stack<Integer>());
            }

            if(list.get(list.size() - 1).size() >= cap) {
                list.add(new Stack<Integer>());
            }

            Stack<Integer> stack = list.get(list.size() - 1);

            stack.push(val);
        }

        public int pop() {
            if(list.size() <= 0) {
                return  -1;
            }
            Stack<Integer> stack = list.get(list.size() - 1);
            Integer pop = stack.pop();
            if(stack.isEmpty()) {
                list.remove(list.size() - 1);
            }
            return pop;
        }

        public int popAt(int index) {

            if(list.size() <= 0 || index > list.size() - 1) {
                return  -1;
            }
            Stack<Integer> stack = list.get(index);
            Integer pop = stack.pop();
            if(stack.isEmpty()) {
                list.remove(index);
            }
            return pop;
        }
    }

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}