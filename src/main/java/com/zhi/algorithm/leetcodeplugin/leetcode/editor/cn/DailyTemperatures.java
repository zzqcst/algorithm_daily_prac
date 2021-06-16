package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
// 
//
// 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2
//, 1, 1, 0, 0]。 
//
// 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。 
// Related Topics 栈 哈希表 
// 👍 781 👎 0

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        Solution solution = new DailyTemperatures().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 枚举每个温度，检查它是否大于前面的温度，前面温度的下标都保存到了栈中，从栈中弹出比当前温度小的位置，更新这些位置的值
         * 例如[73, 74, 75, 71, 69, 72, 76, 73] ，到72时，前面比它
         * @param temperatures
         * @return
         */
        public int[] dailyTemperatures(int[] temperatures) {
            int[] ans = new int[temperatures.length];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < temperatures.length; i++) {
                int temperature = temperatures[i];
                while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                    Integer index = stack.pop();
                    ans[index] = i - index;
                }
                stack.push(i);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}