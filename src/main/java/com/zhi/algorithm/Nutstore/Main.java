package com.zhi.algorithm.Nutstore;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            str = str.replace("[", "");
            str = str.replace("]", "");
            String[] split = str.split(", ");
            int[] nums = new int[split.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.valueOf(split[i]);
            }
            System.out.println(longestConsecutive(nums));
        }
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}