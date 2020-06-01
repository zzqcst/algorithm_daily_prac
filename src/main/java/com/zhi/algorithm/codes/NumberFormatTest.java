package com.zhi.algorithm.codes;

public class NumberFormatTest {

    public static void main(String[] args) {
        System.out.println(solve("一亿三千万"));
    }

    private static String formatInteger(String string) {
        String[] s1 = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String[] s2 = {"十", "百", "千", "万", "十", "百", "千", "亿"};
        StringBuilder result = new StringBuilder();
        int n = string.length();
        for (int i = 0; i < n; i++) {
            int num = string.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result.append(s1[num]).append(s2[n - 1 - i - 1]);//额外减1是因为s2从十位开始，不是从个位开始的
            } else {
                if (num == 0 && (i + 1 <= n - 1) && (string.charAt(i + 1) - '0' != 0))//判断下一位是否为0,不为0则添加
                    result.append(s1[num]);
                else if (num != 0) {//不为0直接添加
                    result.append(s1[num]);
                }
            }
        }
        return result.toString();
    }

    private static int solve(String s) {
        int i = s.indexOf("亿");
        if (i != -1) {
            int l = solve(s.substring(0, i));
            int r = solve(s.substring(i + 1));
            return l * 100000000 + r;
        }

        i = s.indexOf("万");
        if (i != -1) {
            int l = solve(s.substring(0, i));
            int r = solve(s.substring(i + 1));
            return l * 10000 + r;
        }
        i = s.indexOf("千");
        if (i != -1) {
            int l = solve(s.substring(0, i));
            int r = solve(s.substring(i + 1));
            return l * 1000 + r;
        }
        i = s.indexOf("百");
        if (i != -1) {
            int l = solve(s.substring(0, i));
            int r = solve(s.substring(i + 1));
            return l * 100 + r;
        }
        i = s.indexOf("十");
        if (i != -1) {
            int l = solve(s.substring(0, i));
            if (l == 0)
                l = 1;
            int r = solve(s.substring(i + 1));
            return l * 10 + r;
        }
        i = s.indexOf("零");
        if (i != -1) {
            int l = solve(s.substring(0, i));
            int r = solve(s.substring(i + 1));
            return l + r;
        }
        i = 0;
        switch (s) {
            case "九":
                return 9;
            case "八":
                return 8;
            case "七":
                return 7;
            case "六":
                return 6;
            case "五":
                return 5;
            case "四":
                return 4;
            case "三":
                return 3;
            case "二":
                return 2;
            case "一":
                return 1;
        }
        return 0;
    }
}

