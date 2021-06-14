package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
// 
//
// 示例 2: 
//
// 
//输入: nums = [1], k = 1
//输出: [1] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// k 的取值范围是 [1, 数组中不相同的元素的个数] 
// 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的 
// 
//
// 
//
// 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。 
// Related Topics 堆 哈希表 
// 👍 775 👎 0

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution solution = new TopKFrequentElements().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
            HashMap<Integer, Integer> map = new HashMap();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            // 遍历map，用最小堆保存频率最大的k个元素
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return map.get(a) - map.get(b);
                }
            });
            for (Integer key : map.keySet()) {
                if (pq.size() < k) {
                    pq.add(key);
                } else if (map.get(key) > map.get(pq.peek())) {
                    pq.remove();
                    pq.add(key);
                }
            }
            // 取出最小堆中的元素
            int[] res = new int[pq.size()];
            int i=0;
            while (!pq.isEmpty()) {
                res[i++] = pq.poll();
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}