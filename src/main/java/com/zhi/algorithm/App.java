package com.zhi.algorithm;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    int[] a = {2, 7, 1, 9, 4, 2, 5, 8, 2, 5, 3};
    insertion_sort(a);
    for (int i : a) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    int[] b = {2, 7, 1, 9, 4, 2, 5, 8, 2, 5, 3};
    shell_sort(b);
    for (int i : b) {
      System.out.printf("%d ", i);
    }
  }

  /**
   * 插入排序
   *
   * @param a 要排序的数组a
   */
  private static void insertion_sort(int[] a) {
    int n = a.length;
    for (int i = 1; i < n; i++) { //从第二个数开始排序
      int temp = a[i]; //当前的数
      int j = i;
      for (; j > 0 && a[j - 1] > temp; j--) { //当前的数往前面有序部分插入，直到移动到合适位置
        a[j] = a[j - 1];//数组元素后移
      }
      a[j] = temp;
    }
  }

  /** 希尔排序，一种分组排序算法
   * @param a
   */
  private static void shell_sort(int[] a) {
    int n = a.length;
    for (int i = n / 2; i > 0; i /= 2) {
      for (int j = i; j < n; j++) {
        int temp = a[j];
        int k = j;
        for (; k >= i && a[k - i] > temp; k -= i) {
          a[k] = a[k - i];
        }
        a[k] = temp;
      }
    }
  }
}
