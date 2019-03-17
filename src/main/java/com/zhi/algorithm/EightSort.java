package com.zhi.algorithm;

/**
 * 八大排序算法
 */
public class EightSort {
    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 3, 7, 9, 2, 5, 7, 3, 11, 19, 13, 14, 11, 16, 13};
        simpSelectSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * 1.
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

    /**
     * 2.
     * 希尔排序
     * 先将整个待排序序列分割成若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序时”,再对全体记录进行一次直接插入排序（增量为1）
     * <p>
     * 注意：增量序列中的值，除1之外，没有其它公因子，并且最后一个增量值必须等于1
     * 时间复杂度与增量序列有关，使用Hibbard序列（Dk=2^k-1）,最坏情况O(N^3/2),平均O(N^5/4)
     * 不稳定排序
     *
     * @param arr
     */
    public static void shellOrder(int[] arr) {
        for (int dk = arr.length / 2; dk > 0; dk /= 2) {//希尔增量序列
            for (int i = dk; i < arr.length; i++) {//插入排序
                if (arr[i] < arr[i - dk]) {
                    int temp = arr[i];
                    int j = 0;
                    arr[i] = arr[i - dk];
                    for (j = i - dk - dk; j >= 0 && temp < arr[j]; j -= dk) {
                        arr[j + dk] = arr[j];
                    }
                    arr[j + dk] = temp;
                }
            }
        }

    }

    /**
     * 3.
     * 简单选择排序
     * 首先在未排序序列中找到最小（最大）元素，存放到排序序列的起始位置，然后每次从剩余未排序元素中继续寻找最小（最大）元素放到已排序序列末尾，以此类推。
     * 最坏O(n^2) 最好O(n^2),平均O(n^2)
     * 不稳定
     *
     * @param arr
     */
    public static void simpSelectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
