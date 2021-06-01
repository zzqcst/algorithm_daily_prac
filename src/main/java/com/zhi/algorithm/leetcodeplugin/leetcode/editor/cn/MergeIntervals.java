package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返
//回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。 
//
// 
//
// 示例 1： 
//
// 
//输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
//输出：[[1,6],[8,10],[15,18]]
//解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
// 
//
// 示例 2： 
//
// 
//输入：intervals = [[1,4],[4,5]]
//输出：[[1,5]]
//解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。 
//
// 
//
// 提示： 
//
// 
// 1 <= intervals.length <= 104 
// intervals[i].length == 2 
// 0 <= starti <= endi <= 104 
// 
// Related Topics 排序 数组 
// 👍 953 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhi
 */
public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> sorted = Arrays.stream(intervals).sorted(Comparator.comparingInt(a -> a[0])).collect(Collectors.toList());
            List<int[]> list = new ArrayList<>();
            int start = -1, end = -1;
            for (int[] interval : sorted) {
                if (start == -1 && end == -1) {
                    start = interval[0];
                    end = interval[1];
                    continue;
                }
                if (interval[0] >= start && interval[0] <= end && interval[1] > end) {
                    end = interval[1];
                }
                if (interval[0] > end) {
                    list.add(new int[]{start, end});
                    start = interval[0];
                    end = interval[1];
                }
            }
            list.add(new int[]{start, end});
            return list.toArray(new int[][]{});
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}