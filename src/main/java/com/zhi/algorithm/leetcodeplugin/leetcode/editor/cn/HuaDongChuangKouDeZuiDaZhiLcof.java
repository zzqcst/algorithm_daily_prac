package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。 
//
// 示例: 
//
// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
//输出: [3,3,5,5,6,7] 
//解释: 
//
//  滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7 
//
// 
//
// 提示： 
//
// 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。 
//
// 注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/ 
// Related Topics 队列 Sliding Window 
// 👍 187 👎 0

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuaDongChuangKouDeZuiDaZhiLcof {
    public static void main(String[] args) {
        Solution solution = new HuaDongChuangKouDeZuiDaZhiLcof().new Solution();
        solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums.length == 0 || k > nums.length) {
                return new int[0];
            }

            int[] res = new int[nums.length - k + 1];
            Map<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            int i = 0, j = k - 1;
            for (int l = i; l <= j; l++) {
                queue.offer(nums[l]);
            }
            while (true) {
                while (map.get(queue.peek()) != null && map.get(queue.peek()) != 0) {
                    map.put(queue.peek(), map.get(queue.peek()) - 1);
                    queue.poll();
                }
                res[i] = queue.peek();
                j++;
                if (j >= nums.length) {
                    break;
                }
                queue.offer(nums[j]);
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                i++;
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}