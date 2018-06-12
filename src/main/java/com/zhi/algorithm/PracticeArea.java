package com.zhi.algorithm;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeArea {
    public static void main(String[] args) {
//        javaOpenDoc();
//        bigDecimalDemo();
//
//        float a =3;
//        float b = 2.4f;
//        System.out.println(a-b);
//        String temp = "";
//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        System.out.println((temp=list.get(0)).equals("hello")?temp:"no");
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len=removeDuplicates(nums);
        System.out.println();
        for (int i=0;i<len;i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    private static void bigDecimalDemo() {
        BigDecimal b1 = new BigDecimal("3.0");
        BigDecimal b2 = new BigDecimal("2.4");
        System.out.println(b1.subtract(b2));
    }

    private static void javaOpenDoc() {
        try {
            Desktop.getDesktop().open(new File("F:\\IdeaProjects\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String replaceSpace(StringBuffer str) {
        char[] dest = new char[str.length()];
        str.getChars(0,str.length(),dest,0);
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < dest.length; i++) {
            if (dest[i] != ' ') {
                result.append(dest[i]);
            }else {
                result.append("%20");
            }
        }
        return result.toString();
    }
}
