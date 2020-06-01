package com.zhi.algorithm.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCodeDaily {
    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }

    /**
     * 394 字符串解码
     * 每个字符入栈，遇到]出栈
     * 由最里层向最外层解析
     * @param s
     * @return
     */
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        StringBuilder str;
        StringBuilder num;
        StringBuilder tempRes;
        while (i<s.length()){
            if (s.charAt(i)!=']'){
                stack.push(s.charAt(i++));
                continue;
            }
            str = new StringBuilder();//存中括号中的字符串
            while (stack.peek()!='['){
                str.append(stack.pop());
            }
            str.reverse();
            stack.pop();//弹出[
            num = new StringBuilder();//存中括号外的数字
            while (!stack.isEmpty()&&stack.peek()>='0'&&stack.peek()<='9') {
                num.append(stack.pop());
            }
            num.reverse();
            int times = Integer.parseInt(num.toString());
            tempRes = new StringBuilder();//存数字和字符串解析后的结果
            for (int j = 0; j < times; j++) {
                tempRes.append(str.toString());
            }
            for (int j = 0; j < tempRes.length(); j++) {//解析后的重新入栈
                stack.push(tempRes.charAt(j));
            }
            i++;
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    /**
     * 287 寻找重复数
     * 遍历数组，当前数字和它应该在的位置上的数字相同，当前数字就是那个重复的数字
     * 否则，将数字放回它应该在的位置
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==i) continue;
            if(nums[nums[i]-1]==nums[i]){
                return nums[i];
            }
            int temp = nums[i];
            nums[i]=nums[nums[i]-1];
            nums[temp-1]=temp;
            if (nums[i]!=i+1) i--;
        }
        return 0;
    }

    /**
     * 287 寻找重复数
     * @param A
     * @param K
     * @return
     */
    public static int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1); //前缀和本身能被K整除的情况，{5} 5
        int sum = 0, ans = 0;
        for (int elem: A) {
            sum += elem;
            // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
            int mod = (sum % K + K) % K;
            int cnt = record.getOrDefault(mod, 0);//余数为mod的次数为same次，则当前位置能组成子数组same次
            ans += cnt;
            record.put(mod, cnt + 1);
        }
        return ans;
    }
}
