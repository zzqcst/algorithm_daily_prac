package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 示例 1: 
//
// 输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 说明: 
//
// 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。 
// Related Topics 堆 分治算法 
// 👍 1127 👎 0

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution solution = new KthLargestElementInAnArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //第k个最大元素，即倒数第k大的元素
        public int findKthLargest(int[] nums, int k) {
            return findKthLargest(nums, 0, nums.length - 1, nums.length - k);
        }

        private int findKthLargest(int[] nums, int l, int r, int index) {
            int q = partition(nums, l, r);
            if (q == index) {
                return nums[q];
            }else {
                return q > index ? findKthLargest(nums, l, q-1, index) : findKthLargest(nums, q+1, r, index);
            }
        }

        private int partition(int[] arr, int start, int end) {
            //4,2,3,7,9,1
            int key = arr[start];
            while (start < end) {
                while (start < end && arr[end] >= key) {//从后往前找到一个比枢轴值小的，换到前面去
                    end--;
                }
                arr[start] = arr[end];
                while (start < end && arr[start] <= key) {//从前往后找到一个比枢轴值大的，换到后面去
                    start++;
                }
                arr[end] = arr[start];
            }
            arr[start] = key;//将枢轴值放到分割处
            return start;//返回枢轴值的位置
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}