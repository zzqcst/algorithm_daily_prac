package com.zhi.algorithm;

public class LeetCodeDaily {

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
}
