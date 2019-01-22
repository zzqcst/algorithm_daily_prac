package com.zhi.algorithm;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class PracticeArea {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public static class Interval {
        int start;
        int end;

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {
        //        ListNode node1 = new ListNode(4);
        //        ListNode node2 = new ListNode(1);
        //        ListNode node3 = new ListNode(8);
        //        ListNode node4 = new ListNode(4);
        //        ListNode node5 = new ListNode(5);
        //        ListNode node6 = new ListNode(5);
        //        ListNode node7 = new ListNode(0);
        //        ListNode node8 = new ListNode(1);
        //        ListNode node9 = new ListNode(8);
        //        ListNode node10 = new ListNode(4);
        //        ListNode node11 = new ListNode(5);
        //        ListNode node12 = new ListNode(9);
        //        ListNode node13 = new ListNode(9);
        //        node1.next = node2;
        //        node2.next = node3;
        //        node3.next = node4;
        //        node4.next = node5;
        //
        //        node6.next = node7;
        //        node7.next = node8;
        //        node8.next = node9;
        //        node9.next = node10;
        //        node10.next = node11;
        //        node11.next = node12;
        //        node12.next = node13;
        //        ListNode listNode = addTwoNumbers(node1, node4);
        //        while (listNode != null) {
        //            System.out.print(listNode.val + " ");
        //            listNode = listNode.next;
        //        }

        //        TreeNode t1 = new TreeNode(3);
        //        TreeNode t2 = new TreeNode(9);
        //        TreeNode t3 = new TreeNode(20);
        //        TreeNode t4 = new TreeNode(15);
        //        TreeNode t5 = new TreeNode(7);
        //        t1.left = t2;
        //        t1.right = t3;
        //        t3.left = t4;
        //        t3.right = t5;
        //        List<List<Integer>> lists = levelOrder(t1);
        //        for (List<Integer> list : lists) {
        //            for (Integer integer : list) {
        //                System.out.println(integer);
        //            }
        //        }
        //        Excel_reader test= new Excel_reader();
        //        List<ArrayList<String>> arr=test.xlsx_reader("E:\\projects\\java\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.xlsx",0,1,2,3,4,5,6,7,8,9);  //后面的参数代表需要输出哪些列，参数个数可以任意
        //        for(int i=0;i<arr.size();i++) {
        //            ArrayList<String> row = arr.get(i);
        //            for (int j = 0; j < row.size(); j++) {
        //                System.out.print(row.get(j) + " ");
        //            }
        //            System.out.println("");
        //        }
        //        int[] a = {1};
        //        System.out.println(threeSum(new int[]{-2, 0, 1, 1, 2}));

        //        hannoi(3, "a", "b", "c");
        //        ListNode res = getIntersectionNode(node1, node6);
        //        while (res != null) {
        //            System.out.println(res.val);
        //            res = res.next;
        //        }
        //        TreeNode node1 = new TreeNode(3);
        //        TreeNode node2 = new TreeNode(9);
        //        TreeNode node3 = new TreeNode(20);
        //        TreeNode node4 = new TreeNode(15);
        //        TreeNode node5 = new TreeNode(7);
        //        node1.left = node2;
        //        node1.right = node3;
        //        node3.left = node4;
        //        node3.right = node5;
        //        List<List<Integer>> integers = zigzagLevelOrder(node1);
        //        for (List<Integer> integer : integers) {
        //            for (Integer integer1 : integer) {
        //                System.out.print(integer1 + " ");
        //            }
        //            System.out.println();
        //        }

        //        TreeLinkNode node1 = new TreeLinkNode(1);
        //        TreeLinkNode node2 = new TreeLinkNode(2);
        //        TreeLinkNode node3 = new TreeLinkNode(3);
        //        TreeLinkNode node4 = new TreeLinkNode(4);
        //        TreeLinkNode node5 = new TreeLinkNode(5);
        //        TreeLinkNode node6 = new TreeLinkNode(6);
        //        TreeLinkNode node7 = new TreeLinkNode(7);
        //        node1.left = node2;
        //        node1.right = node3;
        //        node2.left = node4;
        //        node2.right = node5;
        //        node3.left = node6;
        //        node3.right = node7;
        //
        //        connect(node1);
        //        List<String> strings = generateParenthesis(3);
        //        for (String string : strings) {
        //            System.out.println(string);
        //        }
        //        int[] nums = { 1, 2, 3 };
        //        List<List<Integer>> permute = subsets(nums);
        //        for (List<Integer> integers : permute) {
        //            System.out.println(integers.toString());
        //        }
//        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
//        System.out.println(exist(board, "SEE"));
//        Interval interval = new Interval(1, 3);
//        Interval interval1 = new Interval(2, 6);
//        Interval interval2 = new Interval(8, 10);
//        Interval interval3 = new Interval(15, 18);
//        List<Interval> list = new ArrayList<>();
//        list.add(interval);
//        list.add(interval1);
//        list.add(interval2);
//        list.add(interval3);
//        for (Interval interval4 : merge(list)) {
//            System.out.println(interval4);
//        }

        System.out.println(uniquePaths(7, 3));
    }

    /**
     * 不同路径
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
     * <p>
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
     * <p>
     * 问总共有多少条不同的路径？
     * <p>
     * 说明：m 和 n 的值均不超过 100。
     * <p>
     * 示例 1:
     * <p>
     * 输入: m = 3, n = 2
     * 输出: 3
     * 解释:
     * 从左上角开始，总共有 3 条路径可以到达右下角。
     * 1. 向右 -> 向右 -> 向下
     * 2. 向右 -> 向下 -> 向右
     * 3. 向下 -> 向右 -> 向右
     * 示例 2:
     * <p>
     * 输入: m = 7, n = 3
     * 输出: 28
     *
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        //递归方法
        int poss = 0;
        Map<String, Integer> map = new HashMap<>();
        return nextStep(1, 1, m, n, poss, map);
    }

    private static int nextStep(int right, int down, int m, int n, int poss, Map<String, Integer> map) {
        if (map.containsKey(right + "," + down)) {
            return map.get(right + "," + down);
        }
        if (right > n || down > m) {
            return 0;
        }
        if (right == n && down == m) {
            poss++;
            return poss;
        }
        int stepr = nextStep(right + 1, down, m, n, poss, map);
        map.put((right + 1) + "," + down, stepr);
        int stepd = nextStep(right, down + 1, m, n, poss, map);
        map.put(right + "," + (down + 1), stepd);
        return stepr + stepd;
    }

    /**
     * 跳跃游戏
     * 给定一个非负整数数组，你最初位于数组的第一个位置。
     * <p>
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * <p>
     * 判断你是否能够到达最后一个位置。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [2,3,1,1,4]
     * 输出: true
     * 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
     * 示例 2:
     * <p>
     * 输入: [3,2,1,0,4]
     * 输出: false
     * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
     *
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        //递归实现
        //能否到达第n步，检查前n-1步是否能到达第n步,若递归能进行到0,则代表可以从第0步到达第n步
//        Map<Integer, Boolean> map = new HashMap<>();
//        return preStep(nums,nums.length-1,map);
        //-------------------
        //贪心算法
//        int lastStep = nums.length - 1;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (i + nums[i] >= lastStep) {//从第i步能到达第lastStep
//                lastStep = i;
//            }
//        }
//        return lastStep == 0;
        //-----------------
        //动态规划
        int max = 0;//能到达的最大距离

        for (int i = 0; i < nums.length; i++) {
            if (i > max) {//最大距离到不了i
                return false;
            }

            max = Math.max(nums[i] + i, max);
        }

        return true;
    }

    private static boolean preStep(int[] nums, int to, Map<Integer, Boolean> map) {
        if (map.containsKey(to)) {
            return map.get(to);
        }
        boolean res = false;
        if (to == 0) {
            res = true;
        }
        for (int i = to - 1; i >= 0; i--) {
            if (to - i <= nums[i]) {//第i步能到to
                res = preStep(nums, i, map);//则检查第i步是否能到达
                if (res) {//如果第i步能到达，则to也能到达,直接返回结果
                    return true;
                }
            }
        }
        map.put(to, res);
        return res;
    }

    /**
     * 搜索二维矩阵 II
     * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
     * <p>
     * 每行的元素从左到右升序排列。
     * 每列的元素从上到下升序排列。
     * 示例:
     * <p>
     * 现有矩阵 matrix 如下：
     * <p>
     * [
     * [1,   4,  7, 11, 15],
     * [2,   5,  8, 12, 19],
     * [3,   6,  9, 16, 22],
     * [10, 13, 14, 17, 24],
     * [18, 21, 23, 26, 30]
     * ]
     * 给定 target = 5，返回 true。
     * <p>
     * 给定 target = 20，返回 false。
     *
     * @param matrix
     * @param target
     * @return
     */
    private static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;
        int j = cols - 1, i = 0;//j控制列数，i控制行数
        while (j >= 0 && i < rows) {//从右上角开始搜索，较大往下，较小往左
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    /**
     * 搜索旋转排序数组
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * <p>
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     * <p>
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     * <p>
     * 你可以假设数组中不存在重复的元素。
     * <p>
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 0
     * 输出: 4
     * 示例 2:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 3
     * 输出: -1
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 合并区间
     * 给出一个区间的集合，请合并所有重叠的区间。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 示例 2:
     * <p>
     * 输入: [[1,4],[4,5]]
     * 输出: [[1,5]]
     * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     * @param intervals
     * @return
     */
    public static List<Interval> merge(List<Interval> intervals) {
        //简单粗暴法，先根据start值排序，再从前往后两两合并
        int size = intervals.size();
        List<Interval> res = new ArrayList<>();
        if (size == 0) {
            return res;
        }
        if (size == 1) {
            return intervals;
        }
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        for (int i = 1; i < size; i++) {//从第二个开始
            Interval current = intervals.get(i);
            Interval pre = intervals.get(i - 1);
            if (pre.end >= current.start) {//如果前一个跟当前能合并，则将当前区间改为合并后的区间
                current.end = Math.max(current.end, pre.end);
                current.start = pre.start;
                //此处不需要立即添加到res中，因为下一个有可能可以继续合并，当不能合并时，再添加到res中
            } else {
                //当前的跟上一个不能合并,将上一个添加到结果中
                res.add(pre);
            }
        }
        res.add(intervals.get(size - 1));
        return res;
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * <p>
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * <p>
     * 如果数组中不存在目标值，返回 [-1, -1]。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [5,7,7,8,8,10], target = 8
     * 输出: [3,4]
     * 示例 2:
     * <p>
     * 输入: nums = [5,7,7,8,8,10], target = 6
     * 输出: [-1,-1]
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && res[0] == -1) {//res[0]==-1表示第一次出现
                res[0] = i;
                res[1] = i;
                continue;
            }
            if (nums[i] == target) {
                res[1] = i;
            }

        }
        return res;
    }

    /**
     * 寻找峰值
     * 峰值元素是指其值大于左右相邻值的元素。
     * <p>
     * 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
     * <p>
     * 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
     * <p>
     * 你可以假设 nums[-1] = nums[n] = -∞。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,2,3,1]
     * 输出: 2
     * 解释: 3 是峰值元素，你的函数应该返回其索引 2。
     * 示例 2:
     * <p>
     * 输入: nums = [1,2,1,3,5,6,4]
     * 输出: 1 或 5
     * 解释: 你的函数可以返回索引 1，其峰值元素为 2；
     * 或者返回索引 5， 其峰值元素为 6。
     *
     * @param nums
     * @return
     */
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int pre = i - 1 < 0 ? Integer.MIN_VALUE : nums[i - 1];
            int next = i + 1 > nums.length - 1 ? Integer.MIN_VALUE : nums[i + 1];
            if (nums[i] > pre && nums[i] > next) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 数组中的第K个最大元素
     * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [3,2,1,5,6,4] 和 k = 2
     * 输出: 5
     * 示例 2:
     * <p>
     * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
     * 输出: 4
     * 说明:
     * <p>
     * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k == 1) {
                return nums[i];
            }
            k--;
        }
        return 0;
    }

    /**
     * 前K个高频元素
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,1,1,2,2,3], k = 2
     * 输出: [1,2]
     * 示例 2:
     * <p>
     * 输入: nums = [1], k = 1
     * 输出: [1]
     *
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
//        List<Integer> res = new ArrayList<>();
//        Map<Integer, Integer> freq = new HashMap<>();
//        //统计频率
//        for (int num : nums) {
//            if (freq.containsKey(num)) {
//                freq.put(num, freq.get(num) + 1);
//                continue;
//            }
//            freq.put(num, 0);
//        }
//
//        int i = 0;
//        //根据频率排序，将数字按降序放回原数组
//        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
//            if (i == 0) {
//                nums[i] = entry.getKey();
//                i++;
//                continue;
//            }
//            int j = i - 1;
//            while (j>=0&&entry.getValue() > freq.get(nums[j])) {
//                nums[j + 1] = nums[j];
//                j--;
//            }
//            nums[j+1]=entry.getKey();
//            i++;
//        }
//        for (int j = 0; j < k; j++) {
//            res.add(nums[j]);
//        }
//        return res;
        List<Integer> list = new ArrayList<>();

        //使用优先队列自动排序
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : set) {
            pq.add(entry);
        }


        for (int i = 0; i < k; i++) {
            list.add(pq.poll().getKey());
        }

        return list;

    }

    /**
     * 颜色分类
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * <p>
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     * <p>
     * 注意:
     * 不能使用代码库中的排序函数来解决这道题。
     * <p>
     * 示例:
     * <p>
     * 输入: [2,0,2,1,1,0]
     * 输出: [0,0,1,1,2,2]
     *
     * @param nums
     */
    public static void sortColors(int[] nums) {
        //选择排序
        //原理：每一趟从待排序的记录中选出最小的元素，顺序放在已排好序的序列最后，直到全部记录排序完毕。
//        for (int i = 0; i < nums.length - 1; i++) {
//            int k = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] < nums[k]) {
//                    k = j;//记下目前找到的最小值所在的位置
//
//                }
//            }
//            if (i != k) {
//                nums[i] = nums[i] + nums[k] - (nums[k] = nums[i]);//和最小位置处的数字交换
//            }
//        }

//        //冒泡排序
//        冒泡排序的基本思想是，对相邻的元素进行两两比较，顺序相反则进行交换，
//         这样，每一趟会将最小或最大的元素“浮”到顶端，最终达到完全有序
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    nums[j] = nums[j] + nums[j + 1] - (nums[j + 1] = nums[j]);
//                }
//            }
//        }

        //插入排序
        //每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
        int j, current;
        for (int i = 1; i < nums.length; i++) {//i之前的是有序序列
            j = i - 1;
            current = nums[i];//current是待排元素
            while (j >= 0 && nums[j] > current) {//与有序序列中比较
                nums[j + 1] = nums[j];//若有序序列中j所指向的数字大于current，后移
                j--;
            }
            nums[j + 1] = current;//最后将待排元素放到正确位置
        }
    }


    /**
     * 单词搜索
     * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
     * 单词必须是连续的，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
     * 示例:
     * board =
     * [
     * ['A','B','C','E'],
     * ['S','F','C','S'],
     * ['A','D','E','E']
     * ]
     * 给定 word = "ABCCED", 返回 true.
     * 给定 word = "SEE", 返回 true.
     * 给定 word = "ABCB", 返回 false.
     *
     * @param board
     * @param word
     * @return
     */
    public static boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        char[] chars = word.toCharArray();
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == chars[0]) {
                    boolean res = findLetter(board, chars, i, j, 0);
                    if (res) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean findLetter(char[][] board, char[] chars, int row, int col, int i) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || i >= chars.length || board[row][col] != chars[i]) {
            return false;
        }
        if (i == chars.length - 1) {//匹配到最后一个也相同
            return true;
        }
        board[row][col] = '#';//访问过的标记，避免重复访问
        boolean res = findLetter(board, chars, row + 1, col, i + 1) ||
                findLetter(board, chars, row, col + 1, i + 1) ||
                findLetter(board, chars, row - 1, col, i + 1) ||
                findLetter(board, chars, row, col - 1, i + 1);
        board[row][col] = chars[i];//恢复原值，避免影响从其它地方开始的比较
        return res;
    }

    /**
     * 子集
     * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
     * 说明：解集不能包含重复的子集。
     * 示例:
     * 输入: nums = [1,2,3]
     * 输出:
     * [
     * [3],
     * [1],
     * [2],
     * [1,2,3],
     * [1,3],
     * [2,3],
     * [1,2],
     * []
     * ]
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsets(int[] nums) {
        //        List<List<Integer>> res = new ArrayList<>();
        //        getsubset(nums,0, new ArrayList<Integer>(), res);
        //        res.add(new ArrayList<Integer>());
        //        return res;

        //另一种解法
        /*
         *
         * 初始：result:[]
         * 遍历到1，result:[],[1]
         * 遍历到2：之前result的结果中都加入2，[],[1],[2].[1,2]
         * 遍历到3：之前result的结果中都加入3,......
         *
         * */
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for (int n : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));//每次在已有结果上加上新的数字
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }

    /**
     * from参数表示只向后添加数字
     * 第一层循环中，各自添加了1,2,3
     * 在它们各自的递归中，from参数变为从下一个数开始，例如：
     * 上一层是2，下一层则从3开始添加，避免了2添加之后又添加1的重复情况
     *
     * @param nums
     * @param from
     * @param level
     * @param res
     */
    private static void getsubset(int[] nums, int from, ArrayList<Integer> level,
                                  List<List<Integer>> res) {
        for (int i = from; i < nums.length; i++) {
            ArrayList<Integer> list = new ArrayList<>(level);
            list.add(nums[i]);
            res.add(list);
            getsubset(nums, i + 1, list, res);
        }
    }

    /**
     * 全排列
     * 给定一个没有重复数字的序列，返回其所有可能的全排列。
     * 示例:
     * 输入: [1,2,3]
     * 输出:
     * [
     * [1,2,3],
     * [1,3,2],
     * [2,1,3],
     * [2,3,1],
     * [3,1,2],
     * [3,2,1]
     * ]
     *
     * @param nums 给定的数字序列
     * @return 返回全排列结果
     */
    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findAll(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private static void findAll(int[] nums, int count, List<Integer> level,
                                List<List<Integer>> res) {
        if (count == nums.length) {
            res.add(level);
            return;
        }
        for (int num : nums) {
            List<Integer> t = new ArrayList<>(level);
            if (!t.contains(num)) {
                t.add(num);
                findAll(nums, count + 1, t, res);
            }
        }

    }

    /**
     * 生成括号
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     * <p>
     * 例如，给出 n = 3，生成结果为：
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        gen("", res, n, n);
        return res;
    }

    private static void gen(String s, List<String> res, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            gen(s + "(", res, left - 1, right);
        }
        if (right > 0) {
            gen(s + ")", res, left, right - 1);
        }
        if (left == 0 && right == 0) {
            res.add(s);
        }
    }

    private static String[]
            maps =
            {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    /**
     * 电话号码的字母组合
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
     * <p>
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        findCombinations(digits, 0, "", res);
        return res;
    }

    private static void findCombinations(String digits, int index, String s, List<String> res) {
        if (index == digits.length()) {
            res.add(s);
            return;
        }
        char letter = digits.charAt(index);//获取数字
        String letters = maps[letter - '0'];//获取数字对应的字母们
        for (int i = 0; i < letters.length(); i++) {
            findCombinations(digits, index + 1, s + letters.charAt(i), res);
        }
    }

    /**
     * 岛屿的个数
     * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
     * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
     * <p>
     * 示例 1:
     * <p>
     * 输入:
     * 11110
     * 11010
     * 11000
     * 00000
     * <p>
     * 输出: 1
     * 示例 2:
     * <p>
     * 输入:
     * 11000
     * 11000
     * 00100
     * 00011
     * <p>
     * 输出: 3
     *
     * @param grid
     * @return
     */
    public static int numIslands(char[][] grid) {
        //遍历grid,遇到1则计数加一，同时将其上下左右相邻的1置为0
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    toZero(grid, i, j, rows, cols);
                }
            }
        }
        return res;
    }

    private static void toZero(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {//超出边界了
            return;
        }
        if (grid[i][j] != '1') {//遇到相邻的不是1
            return;
        }
        grid[i][j] = '0';
        toZero(grid, i - 1, j, rows, cols);
        toZero(grid, i + 1, j, rows, cols);
        toZero(grid, i, j - 1, rows, cols);
        toZero(grid, i, j + 1, rows, cols);
    }

    /**
     * 二叉搜索树中第K小的元素
     * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
     * <p>
     * 说明：
     * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
     * 示例 1:
     * <p>
     * 输入: root = [3,1,4,null,2], k = 1
     * 3
     * / \
     * 1   4
     * \
     * 2
     * 输出: 1
     * 示例 2:
     * <p>
     * 输入: root = [5,3,6,2,4,null,null,1], k = 3
     * 5
     * / \
     * 3   6
     * / \
     * 2   4
     * /
     * 1
     * 输出: 3
     *
     * @param root
     * @param k
     * @return
     */
    public static int kthSmallest(TreeNode root, int k) {
        //二叉搜索树中序遍历是从小到大有序的
        //        List<Integer> nums = new ArrayList<Integer>();
        //        Queue<TreeNode> queue = new LinkedList<>();
        //        if (root != null) {
        //            queue.offer(root);
        //        }
        //        TreeNode temp;
        //        while (!queue.isEmpty()) {
        //            int size = queue.size();
        //            int i =0;
        //            for (i = 0; i < size; i++) {
        //                temp=queue.poll();
        //                nums.add(temp.val);
        //                if (temp.left != null) {
        //                    queue.offer(temp.left);
        //                }
        //                if (temp.right != null) {
        //                    queue.offer(temp.right);
        //                }
        //            }
        //        }
        //        Object[] objects = nums.toArray();
        //        Arrays.sort(objects);
        //        return (int) objects[k-1];

        //使用递归，计算节点数量
        int num = count(root.left);//左子树节点数量
        if (num == k - 1) {
            return root.val;
        }
        if (num > k - 1)//说明要找的数在左子树中
        {
            return kthSmallest(root.left, k);
        }
        return kthSmallest(root.right, k - num - 1);//否则在右子数中查找
    }

    public static int count(TreeNode root) {//计算一棵树的节点数
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    /**
     * 每个节点的右向指针
     * <p>
     * 给定一个二叉树
     * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
     * 初始状态下，所有 next 指针都被设置为 NULL。
     * 示例:
     * <p>
     * 给定完美二叉树，
     * 1
     * /  \
     * 2    3
     * / \  / \
     * 4  5  6  7
     * 调用你的函数后，该完美二叉树变为：
     * 1 -> NULL
     * /  \
     * 2 -> 3 -> NULL
     * / \  / \
     * 4->5->6->7 -> NULL
     *
     * @param root
     */
    public static void connect(TreeLinkNode root) {
        //层序遍历的方法
        //        Queue<TreeLinkNode> queue = new LinkedList<>();
        //        TreeLinkNode temp = root;
        //        if (temp != null) {
        //            queue.offer(temp);
        //        }
        //        while (!queue.isEmpty()) {
        //            int size = queue.size();
        //            int i = 0;
        //            List<TreeLinkNode> level = new ArrayList<>();
        //            for (i = 0; i < size; i++) {
        //                temp = queue.poll();
        //                level.add(temp);
        //                if (temp.left != null) {
        //                    queue.offer(temp.left);
        //                }
        //                if (temp.right != null) {
        //                    queue.offer(temp.right);
        //                }
        //            }
        //            for (int i1 = 0; i1 < level.size()-1; i1++) {
        //                temp=level.get(i1);
        //                temp.next = level.get(i1 + 1);
        //            }
        //        }

        //递归的方法
        if (root == null) {
            return;
        }
        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null) {
            root.right.next = root.next == null ? null : root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }

    /**
     * 从前序与中序遍历序列构造二叉树
     * <p>
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     * <p>
     * 注意:
     * 你可以假设树中没有重复的元素。
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    /**
     * 前序序列的第一个节点是根节点，然后在中序序列中找到该节点，位于该节点左侧的是根节点的左子树，位于该节点右侧的是根节点的右子树。
     * 然后中序序列该节点左侧是左子树节点数量，右侧是右子树节点数量
     * 根据左右子树节点数量，可从前序序列中得到左子树的前序序列，和右子树的前序序列
     * <p>
     * 例如：
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     * 从前序遍历知道3是根节点，中序遍历中，3之前的9是左子树的中序遍历，3之后的15,20,7是右子树的中序遍历
     * 前序遍历中，3之后的一个数，即9是左子树的前序遍历，剩下的20,15,7是右子树的前序遍历
     * 一直递归下去
     *
     * @param preorder
     * @param pl
     * @param pr
     * @param inorder
     * @param il
     * @param ir
     * @return
     */
    public static TreeNode construct(int[] preorder, int pl, int pr, int[] inorder, int il,
                                     int ir) {
        if (pl > pr || il > ir) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pl]);//前序的一个值是根节点
        for (int i = il; i <= ir; i++) {//到中序序列中找该根节点值
            if (preorder[pl] == inorder[i]) {//中序序列中，i前面是i的左子树的中序序列，i后面是i的右子树的中序序列
                //左子树的前序序列为pl后的il到i个数，中序序列为i前面的数
                root.left = construct(preorder, pl + 1, pl + i - il, inorder, il, i - 1);
                root.right = construct(preorder, pl + i - il + 1, pr, inorder, i + 1, ir);
            }
        }
        return root;
    }

    /**
     * 二叉树的锯齿形层次遍历
     * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        int size = 0, i = 0;
        boolean left = true;
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            size = queue.size();

            for (i = 0; i < size; i++) {//size是每一层节点的数量
                TreeNode t = queue.poll();
                level.add(t.val);
                //将该层的第i个几点的左右子节点入队列
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            if (!left) {//颠倒该层输出顺序
                List<Integer> level2 = new ArrayList<>();
                for (int j = level.size() - 1; j >= 0; j--) {
                    level2.add(level.get(j));
                }
                level = level2;
            }
            left = !left;
            result.add(level);
        }
        return result;
    }

    /**
     * 树中序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        //迭代实现
        //        List<Integer> res = new ArrayList<>();
        //        Stack<TreeNode> stack = new Stack<>();
        //        TreeNode temp = root;
        //        while (temp!=null||!stack.isEmpty()) {
        //            if (temp != null) {//当前节点不为空，入栈，左子树
        //                stack.push(temp);
        //                temp = temp.left;
        //            }
        //            if (temp == null) {//当前节点为空，左子树已经遍历完，右子树
        //                temp = stack.pop();
        //                res.add(temp.val);
        //                temp=temp.right;
        //            }
        //        }
        //        return res;

        //递归实现
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    /**
     * 编写一个程序，找到两个单链表相交的起始节点。
     * <p>
     * 注意：
     * <p>
     * 如果两个链表没有交点，返回 null.
     * 在返回结果后，两个链表仍须保持原有的结构。
     * 可假定整个链表结构中没有循环。
     * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
     *
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int headALength = 0;
        int headBLength = 0;

        ListNode p = headA;
        while (p != null) {
            ++headALength;
            p = p.next;
        }
        p = headB;
        while (p != null) {
            ++headBLength;
            p = p.next;
        }

        while (headALength > headBLength) {
            headA = headA.next;
            headALength--;
        }

        while (headBLength > headALength) {
            headB = headB.next;
            headBLength--;
        }

        while (headA != null) {
            if (headA.val == headB.val) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    /**
     * 奇偶链表
     * <p>
     * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
     * <p>
     * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
     * 示例 1:
     * <p>
     * 输入: 1->2->3->4->5->NULL
     * 输出: 1->3->5->2->4->NULL
     * 示例 2:
     * <p>
     * 输入: 2->1->3->5->6->4->7->NULL
     * 输出: 2->3->6->7->1->5->4->NULL
     * <p>
     * 说明:
     * <p>
     * 应当保持奇数节点和偶数节点的相对顺序。
     * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
     *
     * @param head 头结点
     * @return 返回排序后的第一个节点
     */
    public static ListNode oddEvenList(ListNode head) {
        //        //首先记录各个节点的值，然后遍历list，先将偶数节点的值重新按顺序赋值给链表，
        //        //再将奇数节点的值重新复制给链表
        //        List<Integer> nodes = new ArrayList<>();
        //        ListNode temp = head;
        //        while (temp != null) {
        //            nodes.add(temp.val);
        //            temp = temp.next;
        //        }
        //
        //        temp = head;
        //        for (int i = 0; i < nodes.size(); i = i + 2) {//将偶数节点的值重新赋值给链表
        //            temp.val = nodes.get(i);
        //            temp = temp.next;
        //        }
        //        for (int i = 1; i < nodes.size(); i = i + 2) {//将奇数节点的值重新赋值给链表
        //            temp.val = nodes.get(i);
        //            temp = temp.next;
        //        }
        //
        //        return head;
        if (head != null) {
            ListNode odd = head, even = head.next, evenhead = even;

            //分为两部分进行，链接奇数节点和链接偶数节点
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenhead;//最后将奇偶连个链表链接在一起
        }
        return head;
    }

    /**
     * 汉诺塔问题
     *
     * @param n 盘子的数量
     * @param a 第一个柱子
     * @param b 第二个柱子
     * @param c 第三个柱子
     */
    private static void hannoi(int n, String a, String b, String c) {
        if (n == 1) {
            move(a, c);
        } else {
            hannoi(n - 1, a, c, b);
            move(a, c);
            hannoi(n - 1, b, a, c);
        }
    }

    /**
     * 将n个盘子从from移动到to
     *
     * @param from
     * @param to
     */
    private static void move(String from, String to) {
        System.out.println("从" + from + "移动盘子到" + to);
    }

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //own method
        //        double num1 = 0, num2 = 0;
        //        StringBuilder s = new StringBuilder();
        //        while (l1 != null) {
        //            s.append(l1.val);
        //            l1 = l1.next;
        //        }
        //        BigInteger b1 = new BigInteger(s.reverse().toString());
        //        s = new StringBuilder();
        //        while (l2 != null) {
        //            s.append(l2.val);
        //            l2 = l2.next;
        //        }
        //        BigInteger b2 = new BigInteger(s.reverse().toString());
        //        BigInteger res = b1.add(b2);
        //        System.out.println(res.toString());
        //        if (res.toString().equals("0")) {
        //            return new ListNode(0);
        //        }
        //        return strToList(new StringBuilder(res.toString()).reverse().toString());

        //直接相加法
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;//求和
            carry = sum / 10;//进位
            curr.next = new ListNode(sum % 10);//取余
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    private static ListNode strToList(String res) {
        if (res.length() == 0) {
            return null;
        }
        ListNode head = new ListNode(Integer.valueOf(String.valueOf(res.charAt(0))));
        head.next = strToList(res.substring(1, res.length()));
        return head;
    }

    /**
     * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。子序列不一定连续
     * 数学表达式如下:
     * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
     * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
     * 输入: [1,2,3,4,5]
     * 输出: true
     * <p>
     * 输入: [5,4,3,2,1]
     * 输出: false
     * <p>
     * 输入: [5,1,5,5,2,5,4]
     * 输出: true
     */
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (first >= nums[i]) {//第一个数字总是最小的
                first = nums[i];
            } else if (second >= nums[i]) {//第一个数字小于nums[i],第二个数字如果大于nums[i],则nums[i]成为新的第二个数字
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 最长回文子串
     * <p>给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。</p>
     *
     * @param s
     * @return
     */
    private static String longestPalindrome(String s) {

        StringBuilder newS = new StringBuilder();
        newS.append('#');
        for (int i = 0; i < s.length(); i++) {
            newS.append(s.charAt(i));
            newS.append('#');
        }
        int[] RL = new int[newS.length()];
        int maxRight = 0;
        int pos = 0;
        int maxLen = 0;
        for (int i = 0; i < newS.length(); i++) {
            if (i < maxRight) {
                RL[i] = Math.min(RL[2 * pos - i], maxRight - i);
            } else {
                RL[i] = 1;
            }
            while (i - RL[i] >= 0 && i + RL[i] < newS.length() && newS.charAt(i - RL[i]) == newS
                    .charAt(i + RL[i])) {
                RL[i] += 1;
            }
            if (RL[i] + i - 1 > maxRight) {
                maxRight = RL[i] + i - 1;
                pos = i;
            }
            if (RL[i] > maxLen) {
                maxLen = RL[i];
                s = newS.substring(i - RL[i] + 1, i + RL[i] - 1);
            }
            //            maxLen = Math.max(maxLen, RL[i]);
        }
        return s.replace("#", "");
    }

    /**
     * 无重复字符的最长子串
     * <p>给定一个字符串，找出不含有重复字符的最长子串的长度。</p>
     *
     * @param s
     * @return
     */
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // 保存字符的位置,ascii码表长度为128
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    /**
     * 字谜分组
     * <p>给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     *
     * @param strs 给定的字符串
     * @return 结果
     */
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String temp = String.valueOf(chars);
            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }

    /**
     * 矩阵置零
     * <p>如果某个元素为零，将它所在行所在列置零</p>
     *
     * @param matrix 矩阵
     */
    private static void setZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }

        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * 三数之和
     *
     * @param nums
     * @return
     */
    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = 0 - nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> row = new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(nums[k]);
                    res.add(row);
                    while (j < k && nums[j] == nums[j + 1]) {
                        ++j;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        --k;
                    }
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }

    /**
     * 缺失数字
     *
     * @param nums
     * @return
     */
    private static int missingNumber(int[] nums) {
        int count = 0, len = nums.length;
        for (int num : nums) {
            count += num;
        }
        int
                sum =
                len * (len + 1) / 2;//固定长度的连续序列的和是固定的，例如,0,1,2,3=6,则0,1,2,3中任少一个数，用6减去它们的和，就等于少的那个数

        return sum - count;
    }

    /**
     * 有效的括号
     *
     * @param s
     * @return
     */
    private static boolean isValid(String s) {
        int len = s.length();
        if (len == 0) {
            return true;
        }
        if (len % 2 != 0) {
            return false;
        }
        if (s.substring(0, len / 2 - 1).equals(s.substring(len / 2, len))) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (isPair(s.charAt(i), stack.peek())) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }

    private static boolean isPair(char a, char b) {
        if (a == ')' && b == '(') {
            return true;
        }
        if (a == '}' && b == '{') {
            return true;
        }
        return a == ']' && b == '[';
    }

    /**
     * 帕斯卡三角形
     *
     * @param numRows
     * @return
     */
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int number = 1;
            for (int j = 0; j <= i; j++) {
                row.add(number);
                number = number * (i - j) / (j + 1);
            }
            result.add(row);
        }
        return result;
    }

    /**
     * 颠倒二进制位
     *
     * @param n
     * @return
     */
    private static int reverseBits(int n) {
        //        Queue<Integer> queue = new LinkedList<>();
        //        int length = 32;
        //        while (length-- != 0) {
        //            int temp = n&1;
        //            queue.offer(temp);
        //            n>>>=1;
        //        }
        //        StringBuilder sb = new StringBuilder();
        //        while (!queue.isEmpty()) {
        //            sb.append(queue.poll());
        //        }
        //        return (int) Long.parseLong(sb.toString(), 2);
        int result = 0;
        int i = 0;
        while (i < 32) {
            int temp = n & 0x01;//temp是n的二进制数从右往左，每次取出一位
            n = n >> 1;
            result = (result << 1) | temp;//result是每次将temp放到二进制表示的最右边
            i++;
        }
        return result;
    }

    /**
     * 汉明距离
     * 参见位1的个数解法
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            int tempx = x & 1;
            int tempy = y & 1;
            if (tempx != tempy) {
                count++;
            }
            x >>>= 1;
            y >>>= 1;
        }
        return count;
    }

    /**
     * 位1的个数
     *
     * @param n
     * @return
     */
    private static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {//将十进制转二进制的一个过程
            int temp = n & 1;//例如5:101,5&1=1,无符号右移一位，2:10,2&1=0,...,1&1=1，最后往前就得到了101,即5的二进制表示
            if (temp == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    /**
     * 罗马数字转整数
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (char aChar : chars) {
            switch (aChar) {//将当前字符转化为数字
                case 'I':
                    stack.push(1);
                    break;
                case 'V':
                    if (!stack.isEmpty()) {
                        if (stack.peek() < 5) {//上一个数字比当前小
                            int temp = stack.pop();
                            stack.push(5 - temp);
                            continue;
                        }
                    }
                    stack.push(5);
                    break;
                case 'X':
                    if (!stack.isEmpty()) {
                        if (stack.peek() < 10) {//上一个数字比当前小
                            int temp = stack.pop();
                            stack.push(10 - temp);
                            continue;
                        }
                    }
                    stack.push(10);
                    break;
                case 'L':
                    if (!stack.isEmpty()) {
                        if (stack.peek() < 50) {//上一个数字比当前小
                            int temp = stack.pop();
                            stack.push(50 - temp);
                            continue;
                        }
                    }
                    stack.push(50);
                    break;
                case 'C':
                    if (!stack.isEmpty()) {
                        if (stack.peek() < 100) {//上一个数字比当前小
                            int temp = stack.pop();
                            stack.push(100 - temp);
                            continue;
                        }
                    }
                    stack.push(100);
                    break;
                case 'D':
                    if (!stack.isEmpty()) {
                        if (stack.peek() < 500) {//上一个数字比当前小
                            int temp = stack.pop();
                            stack.push(500 - temp);
                            continue;
                        }
                    }
                    stack.push(500);
                    break;
                case 'M':
                    if (!stack.isEmpty()) {
                        if (stack.peek() < 1000) {//上一个数字比当前小
                            int temp = stack.pop();
                            stack.push(1000 - temp);
                            continue;
                        }
                    }
                    stack.push(1000);
                    break;
            }
        }
        int result = 0;
        for (Integer integer : stack) {
            result += integer;
        }
        return result;
    }

    /**
     * 3的幂
     *
     * @param n 要判断的数
     * @return 结果
     */
    private static boolean isPowerOfThree(int n) {
        //解法一
        //return (n>0&&Math.pow(3,19)%n==0);3^19是int范围内最大的3的幂，那么3^19可以被任何3的幂整除。
        //解法二
        if (n < 0) {
            return false;
        }
        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return false;
    }

    /**
     * 计算质数
     *
     * @param n 上限
     * @return 小于n的数中质数的个数
     */
    private static int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];//标记是否是素数
        int[] prime = new int[n];//保存素数的数组
        int totalPrimes = 1;
        for (int i = 3; i <= n; i += 2) {//4,6,8,....,偶数过滤掉
            isPrime[i] = true;
        }
        isPrime[2] = true;
        prime[0] = 2;
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) {
                prime[totalPrimes++] = i;
            }
            for (int j = 1; i * prime[j] < n
                    && j < totalPrimes; j++) {//i*prime[j]是保证不超过上限n,j<totalPrimes是在prime数组已有质数内计算
                isPrime[i * prime[j]] = false;//过滤素数的倍数（奇数倍）
                if (i % prime[j] == 0) {//此时i不是素数，比如9，若无此条件则例如，9*5=15*3，即i为15时，又将重复计算一次。 15*5=25*3
                    break;
                }
            }
        }
        return totalPrimes;
    }

    /**
     * 3和5的倍数
     *
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.add("FizzBuzz");
                continue;
            }
            if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    class Solution {
        private int[] store;
        private List<Integer> list;

        public Solution(int[] nums) {
            store = nums;
            list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            return store;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {
            Collections.shuffle(list);
            int[] temp = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                temp[i] = list.get(i);
            }
            return temp;
        }
    }

    static class MinStack {
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> minstack = new Stack<>();

        public MinStack() {

        }

        public void push(int x) {
            if (!minstack.isEmpty() && x <= minstack.peek()) {
                minstack.push(x);
            }
            if (minstack.isEmpty()) {
                minstack.push(x);
            }
            stack.push(x);
        }

        public void pop() {
            if (stack.isEmpty()) {
                return;
            }
            if (stack.peek().equals(minstack.peek())) {
                minstack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }

    /**
     * 打家劫
     *
     * @param nums
     * @return
     */
    private static int rob(int[] nums) {
        //F(n)=max{a[n]+F(n-2),F(n-1)}
        if (nums.length == 0) {
            return 0;
        }
        int pre1 = 0, pre2 = nums[0], max;
        for (int i = 1; i < nums.length; i++) {
            max = nums[i] + pre1;//最优
            max = max > pre2 ? max : pre2;//子结构
            pre1 = pre2;
            pre2 = max;
        }
        return pre2;
    }
    //    private static int rob(int[] nums) {
    //        if (nums.length == 0) {
    //            return 0;
    //        }
    //        return getHighestRob(nums,nums.length-1);
    //    }
    //
    //    private static int getHighestRob(int[] nums, int i) {
    //        if (i == 1) {
    //            return Math.max(nums[0], nums[1]);
    //        }
    //        if (i == 0) {
    //            return nums[0];
    //        }
    //        //不抢劫i和抢劫i之间的最大值
    //        return Math.max(getHighestRob(nums, i - 1), getHighestRob(nums, i - 2)+nums[i]);
    //    }

    /**
     * 最大子序和
     *
     * @param nums 数组
     * @return 最大子序和
     */
    private static int maxSubArray(int[] nums) {
        int max = nums[0], submax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (submax < 0) {//如果上一个子序列和小于零,丢弃,子序列从当前从新计算
                submax = nums[i];
            } else {
                submax += nums[i];//否则当前元素算入上个子序列
            }

            if (submax > max) {//和不为零的子序列中,和的最大值
                max = submax;
            }
        }
        return max;
    }

    /**
     * 买股票的最佳时机
     *
     * @param prices 价格数组
     * @return 最大利润
     */
    private static int maxProfit1(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxpf = 0;
        int starter = prices[0];//最小的元素
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - starter;//计算与最小元素的差值
            if (temp < 0) {
                starter = prices[i];//遇到比当前最小元素更小的值,替换当前最小元素
                continue;
            }
            maxpf = Math.max(temp, maxpf);//保存最大差值
        }
        return maxpf;
    }

    /**
     * 爬楼梯
     *
     * @param n 楼梯阶数
     * @return 方法数
     */
    private static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2, temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

    /**
     * 第一个错误的版本
     * 二分查找
     * 最后两个数为左边一个为false,右边一个为true,
     * mid为左边一个数,加一后等于后边一个数,即结果
     *
     * @param n 最大版本数
     * @return 第一个错误版本数
     */
    private static int firstBadVersion(int n) {
        if (n <= 0) {
            return 0;
        }
        long l = 1, r = n;
        while (l < r) {
            long mid = (l + r) / 2;
            if (isBadVersion((int) mid))//mid:true,往左边查找
            {
                r = mid;
            } else //mid:false,往右边查找
            {
                l = mid + 1;
            }
        }
        return (int) l;
    }

    private static int getBadVersion(long lo, long hi) {
        if (isBadVersion((int) lo)) {//lo:true
            return (int) lo;
        }
        long mid = (lo + hi) / 2;
        if (!isBadVersion((int) mid)) {//mid:false
            return getBadVersion(mid + 1, hi);
        } else {//mid:true
            return getBadVersion(lo, mid);
        }
    }

    private static boolean isBadVersion(int version) {
        return version == 1702766719;
    }

    /**
     * 合并两个有序数组
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     *
     * @param nums1
     * @param m     nums1大小
     * @param nums2
     * @param n     nums2大小
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //先复制再排序
        //        for (int i = m; i <m+n ; i++) {
        //            nums1[i]=nums2[i-m];
        //        }
        //        Arrays.sort(nums1);
        //从后往前
        while (m > 0 && n > 0) {
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[m + n - 1] = nums2[n - 1];//m+n-1从最后一位逐一向前移动
                n--;
            } else {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            }
            if (m == 0) {
                while (n > 0) {
                    nums1[n - 1] = nums2[n - 1];
                    n--;
                }
            }
        }
    }

    /**
     * 将有序数组转换为二叉搜索树
     *
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

    /**
     * 二叉树的层次遍历
     *
     * @param root
     * @return
     */
    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        int size = 0, i = 0;
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            size = queue.size();
            for (i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                level.add(t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    /**
     * 对称二叉树
     *
     * @param root
     * @return
     */
    private static boolean isSymmetric(TreeNode root) {
        //递归
        //        if (root == null) {
        //            return true;
        //        }
        //        return symmetric(root.left, root.right);

        //迭代
        if (root == null) {
            return true;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root.left);
        s.push(root.right);
        while (!s.empty()) {
            TreeNode p = s.pop();
            TreeNode q = s.pop();
            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            s.push(p.left);
            s.push(q.right);
            s.push(p.right);
            s.push(q.left);
        }
        return true;
    }

    private static boolean symmetric(TreeNode p, TreeNode q) {//也可用于判断两棵树是否相等
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && symmetric(p.right, q.left) && symmetric(p.left, q.right);
    }

    /**
     * 验证二叉搜索树
     *
     * @param root
     * @return
     */
    private static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }

    /**
     * 二叉树最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        //递归
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 链表中是否有环
     *
     * @param head
     * @return
     */
    private static boolean hasCycle(ListNode head) {
        //own
        //        HashMap<Integer, Integer> map = new HashMap<>();
        //        while (head != null) {
        //            if (map.containsKey(head.hashCode())) {
        //                return true;
        //            }else {
        //                map.put(head.hashCode(), 1);
        //            }
        //            head = head.next;
        //        }
        //        return false;
        //追赶法
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    private static boolean isPalindrome(ListNode head) {
        //借助反转链表的方法
        //        ListNode pre = null;
        //        List<Integer> origin = new ArrayList<>();
        //        while (head != null) {
        //            origin.add(head.val);
        //            ListNode temp = head.next;
        //            head.next=pre;
        //            pre = head;
        //            head=temp;
        //        }
        //
        //        int i=0;
        //        while (pre != null) {
        //            if (pre.val != origin.get(i++)) {
        //                return false;
        //            }
        //            pre=pre.next;
        //        }
        //        return true;
        //另一种方法
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {//当fast遍历完时，slow正好遍历一半
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while (slow != null) {//将反转后的后一半和前一半比较
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        //递归方法
        //        if (head == null || head.next == null) {
        //            return head;
        //        }else {
        //            ListNode newHead = reverseList(head.next);
        //            head.next.next=head;
        //            head.next = null;
        //            return newHead;
        //        }
        //非递归方法
        ListNode preNode = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = preNode;//将保存的上一个节点作为该节点的下一个节点
            preNode = head;//然后当前节点成为下次循环的上一个节点
            head = temp;
        }
        return preNode;
    }

    /**
     * 删除链表中的节点
     *
     * @param node
     */
    private void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 删除链表的倒数第N个节点
     *
     * @param head
     * @param n
     * @return
     */
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preNode = head;
        ListNode curNode = head;

        for (int i = 0; i < n; i++) {
            curNode = curNode.next;
            if (curNode == null) {
                return preNode.next;
            }
        }

        while (curNode.next != null) {
            preNode = preNode.next;
            curNode = curNode.next;
        }

        preNode.next = preNode.next.next;

        return head;
    }

    /**
     * 最长公共前缀
     *
     * @param strs
     * @return
     */
    private static String longestCommonPrefix(String[] strs) {
        //        if (strs.length == 0) {
        ////            return "";
        ////        }
        ////        char last = '-';
        ////        int index = 0;
        ////        boolean running = true;
        ////        StringBuilder sb = new StringBuilder();
        ////        while (running) {
        ////            for (String str : strs) {
        ////                if (str.length() == 0) {
        ////                    return "";
        ////                }
        ////                if (index >= str.length()) {
        ////                    running = false;
        ////                    last = ' ';
        ////                    break;
        ////                }
        ////                if (last != '-' && str.charAt(index) != last) {
        ////                    running = false;
        ////                    last = ' ';
        ////                    break;
        ////                }
        ////                last = str.charAt(index);
        ////            }
        ////            if (last != ' ')
        ////                sb.append(last);
        ////            last = '-';
        ////            index++;
        ////        }
        ////        return sb.toString();
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {//等于0时，表示匹配成功
                prefix = prefix.substring(0, prefix.length() - 1);//若不匹配，每次将prefix最后一个字符去掉
                if (prefix.compareTo("") == 0)//没有匹配的
                {
                    return "";
                }
            }
        }
        return prefix;
    }

    /**
     * 数数并说
     *
     * @param n
     * @return
     */
    private static String countAndSay(int n) {
        String current = "1";
        for (int i = 0; i < n - 1; i++) {
            current = count(current);
        }
        return current;
    }

    private static String count(String str) {
        char[] chars = str.toCharArray();
        int len = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] != chars[i + 1]) {//当前与下一个不同
                len++;
                sb.append(len).append(chars[i] - '0');
                len = 0;
                continue;
            }
            if (i + 1 == chars.length) {//最后一个
                len++;
                sb.append(len).append(chars[i] - '0');
            }
            len++;
        }
        return sb.toString();
    }

    /**
     * 实现strStr()
     *
     * @param haystack
     * @param needle
     * @return
     */
    private static int strStr(String haystack, String needle) {
        //        if (needle.isEmpty()) {
        //            return 0;
        //        }
        //        int i = 0;
        //        while (i < haystack.length()) {
        //            if (haystack.charAt(i) == needle.charAt(0)) {
        //                if (i + needle.length() > haystack.length()) {
        //                    return -1;
        //                } else if (haystack.substring(i, i + needle.length()).equals(needle)) {
        //                    return i;
        //                }
        //            }
        //            i++;
        //        }
        //        return -1;
        return haystack.indexOf(needle);
    }

    private static int myAtoi(String str) {

        if (str.isEmpty()) {
            return 0;
        }

        double number = 0;
        int sign = 1, i = 0, length = str.length();
        while (i < length - 1 && str.charAt(i) == ' ') {
            i++;
        }
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i++) == '+' ? 1 : -1;
        }
        while (i < length && str.charAt(i) <= '9' && str.charAt(i) >= '0') {
            if (number > Integer.MAX_VALUE) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            number = number * 10 + str.charAt(i++) - '0';
        }
        return (int) (number * sign);

        //        str = str.trim();
        //        if (str.length() == 0) {
        //            return 0;
        //        }
        //        char[] chars = str.toCharArray();
        //        int len = 0;
        //
        //
        //        for (int i = 0; i < chars.length; i++) {
        //            if (i == 0 && isSign(chars[i])) {//判断第一个字符是不是符号
        //                if (str.length() == 1) {//第一个是符号且只有一位
        //                    return 0;
        //                }
        //                len++;
        //                continue;
        //            }
        //            if (i == 0 && isLetter(chars[0])) {
        //                return 0;
        //            }
        //
        //            if (i == 1 && isSign(chars[0]) && !isNum(chars[1])) {//第一位符号，第二位不是数字
        //                return 0;
        //            }
        //
        //
        //            if (i == 1 && isLetter(chars[i])) {//如果以字母开头
        //                if (!isNum(chars[0])) {
        //                    return 0;
        //                }
        //            }
        //
        //
        //
        //            if (isNum(chars[i]) || chars[i] == '.') {
        //                chars[len++] = chars[i];
        //            }else break;
        //        }
        //
        //        if (len == 0) {
        //            return 0;
        //        }
        //
        //        double res = Double.valueOf(new String(chars, 0, len));
        //        if (res > Integer.MAX_VALUE) {
        //            return Integer.MAX_VALUE;
        //        }
        //
        //        if (res < Integer.MIN_VALUE) {
        //            return Integer.MIN_VALUE;
        //        }
        //
        //        return (int) res;
    }

    private static boolean isSign(char a) {
        return a == '-' || a == '+';
    }

    private static boolean isNum(char a) {
        return a <= '9' && a >= '0';
    }

    private static boolean isLetter(char a) {
        return a <= 'z' && a >= 'a' || a <= 'Z' && a >= 'A';
    }

    /**
     * 验证回文字符串
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (('z' - chars[i]) < 26 && ('z' - chars[i]) >= 0
                    || ('9' - chars[i]) < 10 && ('9' - chars[i]) >= 0) {
                if (('z' - chars[j]) < 26 && ('z' - chars[j]) >= 0
                        || ('9' - chars[j]) < 10 && ('9' - chars[j]) >= 0) {
                    if (chars[i] != chars[j]) {
                        return false;
                    }
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return true;
    }

    /**
     * 字母异构词
     *
     * @param s
     * @param t
     * @return
     */
    private static boolean isAnagram(String s, String t) {
        //利用排序的方法
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }
        return true;
        //利用字母出现次数的方法，较快
        //        int i;
        //        char[] arrs = s.toCharArray();
        //        char[] arrt = t.toCharArray();
        //
        //        int[] its = new int[26];
        //        int[] itt = new int[26];
        //
        //        for(i = 0; i < arrs.length; i++)
        //            its[arrs[i] - 'a']++;
        //        for(i = 0; i < arrt.length; i++)
        //            itt[arrt[i] - 'a']++;
        //        for(i=0;i<26;i++)
        //        {
        //            if(its[i] != itt[i])
        //                return false;
        //        }
        //        return true;
    }

    /**
     * 第一个唯一字符
     *
     * @param s
     * @return
     */
    private static int firstUniqChar(String s) {
        //耗时长
        //        char[] chars = s.toCharArray();
        //        Hashtable<Character, Integer> times = new Hashtable<Character, Integer>();
        //        for (char aChar : chars) {
        //            if (times.containsKey(aChar)) {
        //                times.put(aChar, times.get(aChar) + 1);
        //            } else {
        //                times.put(aChar, 1);
        //            }
        //
        //        }
        //        for (int i = 0; i < chars.length; i++) {
        //            if (times.get(chars[i]) == 1) {
        //                return i;
        //            }
        //        }
        //        return -1;
        //较快的解法
        //最多循环26次
        char c;
        int start, end;

        if (s.length() < 26) {
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                start = s.indexOf(c);
                end = s.lastIndexOf(c);
                if (start == end && start != -1) {
                    return i;
                }
            }
        } else {
            int res = s.length();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                start = s.indexOf(ch);
                end = s.lastIndexOf(ch);

                if (start == end && start != -1) {
                    res = Math.min(res, start);
                }
            }
            if (res != s.length()) {
                return res;
            }
        }
        return -1;
    }

    /**
     * 颠倒整数
     *
     * @param x
     * @return
     */
    private static int reverse(int x) {
        if (x == 0) {
            return x;
        }
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (chars[i] == '-') {
                i++;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        long res = Long.parseLong(new String(chars));
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) res;
        //方法二
        //        boolean negative = x < 0;
        //        if (negative) x = -x;
        //        long r = 0;
        //        while (x>0) {
        //            r = r * 10 + x % 10;
        //            x /= 10;
        //        }
        //        if (negative) r = -r;
        //        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
        //        return (int)r;
    }

    /**
     * 反转字符串
     *
     * @param s
     * @return
     */
    private static String reverseString(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    /**
     * 旋转图像
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //由外向内旋转每一层
        for (int i = 0; i < n / 2; ++i) {//行数
            for (int j = i; j < n - 1 - i; ++j) {//列数
                int tmp = matrix[i][j];//左上
                matrix[i][j] = matrix[n - 1 - j][i];//左下赋给左上
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];//右下赋给左下
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];//右上赋给右下
                matrix[j][n - 1 - i] = tmp;//左上赋给右上
            }
        }
    }

    /**
     * 有效的数独
     *
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        //高效解法
        int[][] signs = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int n = 1 << (board[i][j] - '1');//1×2^(board[i][j]-'1'),二进制1左移当前数字对应的位数
                int cubeIndex = i / 3 * 3 + j / 3;//当前格子位于第几块中
                //按位与，若某数字再次出现，对应位上有相同的1，则与后结果不为0
                //例如，9、8出现后，sign的二进制为110000000,再次出现9，n为100000000,这样，
                //按位相与的结果不为0
                if ((signs[0][i] & n) != 0 || (signs[1][j] & n) != 0
                        || (signs[2][cubeIndex] & n) != 0) {
                    return false;
                }
                //sign保存数字对应位数的1，比如9，则为100000000,下一个数字是8,则sign更新为，110000000,
                //即，若某数字出现了，则对应位置上为1
                signs[0][i] |= n;//对应i行的数字，检查一行的数字是否重复
                signs[1][j] |= n;//对应j列的的数字,检查列上的数字是否重复
                signs[2][cubeIndex] |= n;//对应第cubuIndex个块中的数字
            }
        }
        return true;

        //简单解法
        //        Set<Character> rowset = new HashSet<Character>();
        //        Set<Character> colset = new HashSet<Character>();
        //
        //        for(int i = 0; i < 9; i++)
        //        {
        //            rowset.clear();
        //            colset.clear();
        //            for(int j = 0; j < 9; j ++)
        //            {
        //                if(i % 3 == 0 && j % 3 == 0)  // 检查块是否有效
        //                {
        //                    if(!checkBlock(board, i, j))
        //                        return false;
        //                }
        //                if(board[i][j] != '.')  // 检查行是否有效
        //                {
        //                    if(rowset.contains(board[i][j]))
        //                        return false;
        //                    rowset.add(board[i][j]);
        //                }
        //                if(board[j][i] != '.')  // 检查列是否有效
        //                {
        //                    if(colset.contains(board[j][i]))
        //                        return false;
        //                    colset.add(board[j][i]);
        //                }
        //            }
        //        }
        //        return true;
    }

    public boolean checkBlock(char[][] board, int row, int col)  // 检查块是否有效,一个3×3的块中是否有重复数字
    {
        Set<Character> blockSet = new HashSet<Character>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    if (blockSet.contains(board[i][j])) {
                        return false;
                    }
                    blockSet.add(board[i][j]);
                }
            }
        }
        return true;
    }

    /**
     * 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
        //        int[] res = new int[2];
        //        for (int i = 0; i < nums.length; i++) {
        //            for (int j = 0; j < nums.length; j++) {
        //                if (i == j) {
        //                    continue;
        //                }
        //                if (nums[i] + nums[j] == target) {
        //                    res[0]=i;
        //                    res[1]=j;
        //                    return res;
        //                }
        //            }
        //        }
        //        return res;
        //answer
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {//判断是否有剩下值
                res[0] = m.get(target - nums[i]);
                res[1] = i;
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }

    private static void moveZeroes(int[] nums) {
        // 0,1,0,3,5,6
        int i = 0, j = 0;
        for (int num : nums) {
            if (nums[i] != 0) {
                nums[j] = (nums[i] + nums[j]) - (nums[i] = nums[j]);
                i++;
                j++;
                continue;
            }
            i++;
        }
    }

    private static int singleNumber(int[] nums) {
        //        Arrays.sort(nums);
        //        for (int i = 0; i < nums.length-1; i++) {
        //            if (nums[i] != nums[i+1]) {
        //                return nums[i];
        //            }
        //            i++;
        //        }
        //        return nums[nums.length-1];
        //answer
        int n = 0;
        for (int num : nums) {
            n = n ^ num; //按位异或，如1^4 = (001)^(100)=4,举例，[4,2,2,1,1]，后面四个异或结果为0,4和0异或为4
        }
        return n;
    }

    /**
     * 判断存在重复
     *
     * @param nums
     * @return
     */
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 加一
     *
     * @param digits
     * @return
     */
    private static int[] plusOne(int[] digits) {
        int carrry = 0;
        List<Integer> fina = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int res = 0;
            if (i == digits.length - 1) {
                res = digits[i] + 1 + carrry;
            } else {
                res = digits[i] + carrry;
            }
            int a = res % 10;
            fina.add(a);
            carrry = res / 10;
        }
        fina.add(carrry);
        int[] finres = new int[fina.size()];
        int c = 0;
        for (int i = finres.length - 1; i >= 0; i--) {
            finres[c++] = fina.get(i);
        }
        if (finres[0] == 0) {
            int[] b = new int[finres.length - 1];
            System.arraycopy(finres, 1, b, 0, b.length);
            return b;
        }

        return finres;
    }

    /**
     * 两个数组的交集
     *
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] intersect(int[] nums1, int[] nums2) {
        //使用排序的方法
        //        int l1 = nums1.length;
        //        int l2 = nums2.length;
        //        int[] res = new int[Math.max(l1, l2)];
        //        Arrays.sort(nums1);
        //        Arrays.sort(nums2);
        //        int i=0,j=0,c=0;
        //        while (i < l1 && j < l2) {
        //            if (nums1[i] == nums2[j]) {
        //                res[c++] = nums1[i];
        //                i++;
        //                j++;
        //            } else if (nums1[i] > nums2[j]) {
        //                j++;
        //            }else {
        //                i++;
        //            }
        //        }
        //        if (c > 0) {
        //            return Arrays.copyOf(res, c);
        //        }
        //        return new int[0];

        //不使用排序的方法
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int aNums1 : nums1) {
            if (map.containsKey(aNums1)) {
                map.put(aNums1, map.get(aNums1) + 1);
            } else {
                map.put(aNums1, 1);
            }
        }

        int[] res = new int[Math.max(nums1.length, nums2.length)];
        int c = 0;

        for (int aNums2 : nums2) {
            if (map.containsKey(aNums2) && map.get(aNums2) > 0) {
                res[c++] = aNums2;
                map.put(aNums2, map.get(aNums2) - 1);
            }
        }

        if (c > 0) {
            return Arrays.copyOf(res, c);
        }
        return new int[0];
    }

    /**
     * 旋转数组
     *
     * @param nums
     * @param k
     */
    private static void rotate(int[] nums, int k) {
        int[] re = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pos = (i + k) % nums.length;
            re[pos] = nums[i];
        }
        System.arraycopy(re, 0, nums, 0, re.length);

        //O(1) method
        /*
              public void rotate(int[] nums, int k) {
                  int n = nums.length;
                  k = k%n;
                  swap(nums,0,n-k-1);
                  swap(nums,n-k,n-1);
                  swap(nums,0,n-1);
              }
              private void swap(int[] nums, int i, int j) {
                  while (i < j) {
                      int temp = nums[i];
                      nums[i] = nums[j];
                      nums[j] = temp;
                      i++;
                      j--;
                  }
              }
         */
    }

    /**
     * 股票最大收益
     *
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                max += diff;
            }
        }
        return max;
    }

    /**
     * 删除重复值
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * BigDecimal使用
     */
    private static void bigDecimalDemo() {
        BigDecimal b1 = new BigDecimal("3.0");
        BigDecimal b2 = new BigDecimal("2.4");
        System.out.println(b1.subtract(b2));
    }

    /**
     * 打开本地word文档
     */
    private static void javaOpenDoc() {
        try {
            Desktop.getDesktop().open(new File(
                    "F:\\IdeaProjects\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
