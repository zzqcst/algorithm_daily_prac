package com.zhi.algorithm.Nutstore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    static String getIndexAndLongest(String users, int k) {
        int len = users.length();
        int index = -1;
        for (int i = 0; i < len; i++) {
            //左右两边都有女生，则保存下标，退出循环
            if (users.charAt(i) == 'b' && users.charAt((i + 1) % len) == 'g' && users.charAt(i > 0 ? i - 1 : len - 1) == 'g') {
                index = i;
                break;
            }
        }
        int count = 0;
        ArrayList<Integer> boys = new ArrayList<>();//保存了每个区间男生数量，3个女生分出了4个区间，找到连续的四个区间值最大即可
        for (int i = 0; i < len; i++) {
            if (users.charAt(i) == 'g') {
                boys.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        if (count != 0) {
            boys.add(0, boys.get(0) + count);
        }
        int max = 0;
        for (int i = 0; i < boys.size(); i++) {
            int sum = 0;
            for (int j = i; j < i + 4; j++) {
                if (j > len) {
                    int realJ = j % len;
                    sum += boys.get(realJ);
                    continue;
                }
                sum += boys.get(j);
            }
            if (sum > max) {
                max = sum;
            }
        }
        return index + " " + max;
    }
}