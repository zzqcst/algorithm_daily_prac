package com.zhi.algorithm.codes;

/**
 * 八大排序算法
 */
public class EightSort {
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 2, 8, 7, 6, 9};
    }

    /**
     * 1.
     * 直接插入排序
     * 将一个数据插入到已经排好序的有序数据中
     * 插入排序的基本思想是：每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
     * 平均：O(n^2) 最好：O(n) 最坏：O(n^2)
     * 空间复杂度：O(1)
     * 稳定
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
     * 空间复杂度：O(1)
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
     * 空间复杂度：O(1)
     * 不稳定
     *
     * @param arr
     */
    private static void simpSelectSort(int[] arr) {
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

    /**
     * 4. 堆排序
     * n个元素的序列(k0,k1,k2,k3...kn-1),当且仅当满足k_i<=k_(2i+1),k_i<=k_(2i+2),(左右子树)，或大于等于，称之为堆
     * (1)建立堆：
     * 从最后一个非叶节点开始调整，直到根节点
     * (2)交换：
     * 堆建立后，将根节点与最后一个节点交换位置
     * (3)重新建立堆：
     * 排除最后一个元素，从根节点开始重新调整成堆
     * 最好：O(nlogn),最坏O(nlogn),平均O(nlogn)
     * 空间复杂度：O(1)
     * 不稳定
     *
     * @param arr
     */
    private static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {//1. 从最后一个非叶子节点开始调整，调整为大根堆
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i >= 0; i--) {//1. 交换堆顶元素和堆位元素，排除堆位元素，重新调整为大根堆
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * @param arr  目标数组
     * @param from 开始位置
     * @param to   结束位置
     */
    private static void adjustHeap(int[] arr, int from, int to) {
        int temp = arr[from];
        for (int j = from * 2 + 1; j < to; j = j * 2 + 1) {//从左子树（i*2+1）开始,然后下一颗树左子树
            if (j + 1 < to && arr[j + 1] > arr[j]) {
                j++;
            }
            if (arr[j] > temp) {//找到比父节点大的，交换到父节点
                arr[from] = arr[j];
                from = j;
            } else {
                break;
            }
        }
        arr[from] = temp;
    }

    /**
     * 5. 冒泡排序
     * <p>
     * 第一个元素与第二个元素比较，若为逆序，交换之；然后第二个与第三个，第三个与第四个。。。直到第n-1与第n个比较完
     * <p>
     * 第一趟比较完之后，最大的元素处于最后的位置，然后进行第二趟，直到第n-2个与第n-1个比较完，以此类推
     * <p>
     * 最好O(n),最坏O(n^2),平均O(n^2)
     * <p>
     * 空间复杂度：O(1)
     * <p>
     * 稳定
     *
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        int flag = arr.length - 1;
        while (flag > 0) {
            int k = flag;
            flag = 0;
            for (int i = 0; i < k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = i;
                }
            }
        }
    }

    /**
     * 6.快速排序
     * 通过一趟排序将待排序的序列分割成两部分，其中一部分的序列均比另一部分的序列小，然后对这两部分分别继续排序
     * 最好：O(nlogn) 最坏 O(n^2) 平均:O(nlogn)
     * 空间复杂度：O(nlogn)
     * 不稳定
     *
     * @param arr
     */
    private static void quickSort(int[] arr) {
        qs(arr, 0, arr.length - 1);
    }

    private static void qs(int[] arr, int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);//找到一个分割位置
            qs(arr, start, index - 1);//前半部分
            qs(arr, index + 1, end);//后半部分
        }
    }

    // 交换两个元素的位置
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 选最后一个数作为枢纽
        int i = (low - 1); // 【low,i]内的数字是比pivot小的数

        // 遍历枢纽数之前的数字，把比枢纽数小的放到前面，i是右边界
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // [low,i]的数字比枢纽值小了，交换枢纽值到i+1的位置，完成分区
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /**
     * 7.归并排序
     * 首先递归将原始数组划分为若干子数组(最终只有两个元素)，对每个子数组进行排序，然后将排序好的子数组递归和并成一个有序的数组
     * 最好：O(nlogn) 最坏：O(nlogn) 平均：O(nlogn)
     * 空间复杂度：O(n)
     * 稳定
     *
     * @param arr
     */
    private static void mergeSort(int[] arr) {
        msort(arr, 0, arr.length - 1);
    }

    private static void msort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            msort(arr, start, mid);
            msort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, start, temp.length);
    }

    /**
     * 8. 基数排序（桶排序）
     * <p>
     * 若排序元素为数字，首先根据元素的个位数将数字放入0-9号桶中，然后从0开始，桶中由底到顶一次收集起来，得到新的元素序列
     * 然后对十位、百位，进行同样处理，直到最高位完成收集最终得到有序数组
     * <p>
     * 若为单词，则桶为字母序列
     * <p>
     * 最坏：O(d*(r+n)) 最好：O(d*(r+n)) 平均：O(d*(r+n))
     * n为数字个数，d为最大数字位数，r为有几个桶（基）
     * 稳定
     *
     * @param arr
     */
    private static void redixSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int d = 1;
        while (max > 0) {
            max /= 10;
            d *= 10;
        }
        int n = 1;
        int k = 0;//从桶中取数字时，原数组下标
        int[][] bucket = new int[10][arr.length];
        int[] order = new int[10];//order[i]为第i个桶中的下标
        while (n < d) {
            for (int num : arr) {
                int digit = (num / n) % 10;//获得对应位数字
                bucket[digit][order[digit]] = num;
                order[digit]++;
            }
            for (int i = 0; i < 10; i++) {//从第i个桶中
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {//从第i个桶中由0开始取出所有数字，放回序列中
                        arr[k++] = bucket[i][j];
                    }
                }
                order[i] = 0;//第i个桶取完了，下标置0
            }
            k = 0;
            n *= 10;
        }
    }

}
