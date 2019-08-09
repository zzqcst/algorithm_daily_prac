package com.zhi.algorithm;

public class NumberFormatTest {

    static String[] units = { "", "十", "百", "千", "万", "十万", "百万", "千万", "亿",
            "十亿", "百亿", "千亿", "万亿" };
    static char[] numArray = { '零', '一', '二', '三', '四', '五', '六', '七', '八', '九' };
    public static void main(String[] args) {
        int num = 143;
        String numStr = formatInteger(String.valueOf(num));
        System.out.println("totalRings= " + num + ", 转换结果: " + numStr);
    }
    private static String formatInteger(String string) {
        String[] s1 = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] s2 = { "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" };
        StringBuilder result = new StringBuilder();
        int n = string.length();
        for (int i = 0; i < n; i++) {
            int num = string.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result.append(s1[num]).append(s2[n - 2 - i]);
            } else {
                result.append(s1[num]);
            }
        }
        System.out.println(result);
        return result.toString();
    }
}

