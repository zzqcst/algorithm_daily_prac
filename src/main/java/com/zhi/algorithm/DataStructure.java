package com.zhi.algorithm;

/**
 * 数据结构
 */
public class DataStructure {
    public static void main(String[] args) {
        String t = "ctcaatcacaatcat";
        String p = "caatncaatm";
        new DataStructure().MP(p,t);
    }

    /**
     * 计算失败时从新开始的位置
     * @param x 要匹配的字符串
     * @param m 要匹配的字符串的长度
     * @return 数组记录对应字符匹配失败时，重新开始的位置
     */
    private int[] preMp(String x,int m){
        int[] mpNext = new int[m + 1];
        //i是遍历x的下标，j是开头第j个
        int i=0,j=mpNext[0]=-1;//第一个元素的值为-1
        while (i < m) {//下标i从头开始遍历x
            while (j > -1 && x.charAt(i) != x.charAt(j)) {//判断第i个字符跟开头第j个字符是否相同
                j=mpNext[j];//执行到此步时，j==0
            }
            mpNext[++i] = ++j;//如果第3个字符与第0个字符相同，则第四个字符不匹配时，从第1个字符开始重新比较
        }
        return mpNext;
    }

    /**
     * 字符串匹配MP算法，从t中匹配p
     * @param p 要匹配的字符串
     * @param t 目标字符串
     */
    private void MP(String p, String t) {
        int m = p.length();
        int n = t.length();
        if (m > n) {
            System.err.println("匹配失败");
        }

        int i=0,j=0;//i用来遍历p，j用来遍历t
        int[] mpNext = preMp(p, m);

        while (j < n) {
            while (i > -1 && p.charAt(i) != t.charAt(j)) {
                i=mpNext[i];
            }
            i++;
            j++;
            if (i >= m) {
                System.out.printf("在index=%d处匹配成功。",j-i);
                i=mpNext[i];
            }
        }
    }
}
