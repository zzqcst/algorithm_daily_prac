package com.zhi.algorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a = {0, 8, 4, 12, 2};
        System.out.println(lengthOfLIS(a));
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = Arrays.binarySearch(dp, 0, len, nums[i]);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = nums[i];
            if (index == len) {
                len++;
            }
        }
        return len;
    }

}