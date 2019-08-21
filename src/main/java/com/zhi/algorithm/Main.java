package com.zhi.algorithm;

public class Main {
    public static void main(String[] args) {
        System.out.println(isMatch("ab", ".*c"));
    }

    public static boolean isMatch(String s, String pattern) {
        return match_core(s, 0, pattern, 0);
    }

    public static boolean match_core(String s, int i, String pattern, int j) {
        if (i == s.length() && j == pattern.length()) {//二者都到结尾
            return true;
        }
        if (j == pattern.length()) {//字符串没匹配完
            return false;
        }
        //下一个字符是*时
        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
            if (i != s.length() && (s.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.')) {
                return match_core(s, i, pattern, j + 2) ||
                        match_core(s, i + 1, pattern, j + 2) ||
                        match_core(s, i + 1, pattern, j);
            } else {
                return match_core(s, i, pattern, j + 2);
            }
        }
        if (i != s.length() && (s.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.')) {
            return match_core(s, i + 1, pattern, j + 1);
        }
        return false;
    }
}