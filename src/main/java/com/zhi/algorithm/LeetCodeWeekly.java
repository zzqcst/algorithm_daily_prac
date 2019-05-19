package com.zhi.algorithm;

import java.util.*;
import java.util.List;

public class LeetCodeWeekly {

    public static void main(String[] args) {
        LeetCodeWeekly weekly = new LeetCodeWeekly();
        int[] a = {1, 4, 8, 2, 1, 3, 19, 20, 34};
        System.out.println(weekly.lastStoneWeightII(a));
    }



    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int a[] = new int[sum + 1];//declaration and instantiation
        a[0] = 1;
        for (int i = 0; i < stones.length; i++) {
            for (int j = sum; j >= stones[i]; j--) {
                if (a[j - stones[i]] == 1) {
                    a[j] = 1;
                }
            }
        }
        int ans = sum;
        for (int i = 0; i <= sum; i++) {
            if (a[i] == 1) {
                if (abs(i - (sum - i)) < ans) {
                    ans = abs(i - (sum - i));
                }
            }
        }
        return ans;
    }

    public int abs(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }

    /**
     * leetcode
     * 137周周赛
     * 最长字符串链
     *
     * @param words
     * @return
     */
    public static int longestStrChain(String[] words) {
        //{"a", "b", "ba", "bca", "bda", "bdca"}
        //例如遍历到bca时,map中已存在(a,1),(b,1),(ba,1)
        //bca分别去掉一个字符,则以bca结尾的字符串链长度，等于以ca,ba,bc结尾的字符串链长度最大者+1
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> wc = new HashMap<>();
        int res = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                wc.put(word, Math.max(wc.getOrDefault(word, 0), wc.getOrDefault(word.substring(0, i) + word.substring(i + 1), 0) + 1));
                res = Math.max(res, wc.getOrDefault(word, 0));
            }
        }
        return res;
    }

    /**
     * leetcode
     * 137周赛
     * 删除字符串中的所有相邻重复项
     *
     * @param S
     * @return
     */
    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)) {
                stack.pop();
                continue;
            }
            stack.push(S.charAt(i));
        }
        char[] chars = new char[stack.size()];
        int i = chars.length - 1;
        while (!stack.isEmpty()) {
            chars[i--] = stack.pop();
        }
        return new String(chars);
    }

    /**
     * leetcode
     * 137周赛
     * 最后一块石头的重量
     *
     * @param stones
     * @return
     */
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < stones.length; i++) {
            queue.add(stones[i]);
        }
        while (true) {
            if (queue.size() == 1 || queue.size() == 0) {
                break;
            }
            int a = queue.poll();
            int b = queue.poll();
            queue.offer(Math.abs(a - b));
        }
        return queue.size() == 1 ? queue.poll() : 0;
    }
}
