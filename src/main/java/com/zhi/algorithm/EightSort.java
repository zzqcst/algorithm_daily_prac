package com.zhi.algorithm;

/**
 * 八大排序算法
 */
public class EightSort {
    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 3, 7, 9, 2, 5, 7, 3, 11, 19, 13, 14, 11, 16, 13};
        shellOrder(nums, 5);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * 直接插入排序
     * 将一个数据插入到已经排好序的有序数据中
     * 插入排序的基本思想是：每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
     * 平均：O(n^2) 最好：O(n) 最坏：O(n^2) 稳定
     *
     * @param arr
     */
    public static void insertOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j = 0;
                arr[i] = arr[i - 1];
                for (j = i - 2; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }

    public static void shellOrder(int[] arr, int dk) {
        while (dk != 0) {
            for (int i = 0; i < dk; i++) {
                for (int j = i + dk; j < arr.length; j++) {
                    if (arr[j] < arr[j - dk]) {
                        int temp = arr[j];
                        int h = 0;
                        for (h = j - dk; h >= 0 && temp < arr[h]; h -= dk) {
                            arr[h + dk] = arr[h];
                        }
                        arr[h + dk] = temp;
                    }
                }
            }
            dk = dk / 2;
        }
    }
}
