package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。 
//
// 求在该柱状图中，能够勾勒出来的矩形的最大面积。 
//
// 
//
// 
//
// 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。 
//
// 
//
// 
//
// 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。 
//
// 
//
// 示例: 
//
// 输入: [2,1,5,6,2,3]
//输出: 10 
// Related Topics 栈 数组 
// 👍 1406 👎 0

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Solution solution = new LargestRectangleInHistogram().new Solution();
        solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/84-by-ikaruga/
        public int largestRectangleArea(int[] heights) {
            //最基本思路，将每个元素视为矩形的高，往左右扩展，如果左右元素大于当前元素，可以继续扩展
            //以下算法是使用单调栈来寻找左右元素
            int res = 0;
            Deque<Integer> stack = new ArrayDeque<>();
            //前后补0
            int[] new_heights = new int[heights.length + 2];
            for (int i = 1; i < heights.length + 1; i++) {
                new_heights[i] = heights[i - 1];
            }
            for (int i = 0; i < new_heights.length; i++) {
                //当栈顶元素大于当前元素值时，说明当前元素位置就是栈顶元素右边界
                //此while循环的意义是将栈顶元素视为左边界，不断往左扩展左边界，在此过程中计算最大值
                while (!stack.isEmpty() && new_heights[i] < new_heights[stack.peek()]) {
                    int cur = stack.pop();
                    int l = stack.peek();
                    int r = i;
                    res = Math.max(res, (r - l - 1) * new_heights[cur]);
                }
                stack.push(i);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}