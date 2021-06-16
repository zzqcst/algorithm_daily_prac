package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数
//字，并以数组的形式返回结果。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [4,3,2,7,8,2,3,1]
//输出：[5,6]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,1]
//输出：[2]
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= n <= 105 
// 1 <= nums[i] <= n 
// 
//
// 进阶：你能在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。 
// Related Topics 数组 
// 👍 756 👎 0

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray{
  public static void main(String[] args) {
       Solution solution = new FindAllNumbersDisappearedInAnArray().new Solution();
      solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums.length;
//        for (int num : nums) {
        //将相应位置加n，那么不存在的数字对应的位置就会小于n
        //取模恢复原数
//            int x = (num - 1) % n;
//            nums[x] += n;
//        }
//        List<Integer> ret = new ArrayList<Integer>();
//        for (int i = 0; i < n; i++) {
//            if (nums[i] <= n) {
//                ret.add(i + 1);
//            }
//        }
//        return ret;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[i] == nums[nums[i] - 1]) {
                    break;
                }else {
                    nums[i] = (nums[i] + nums[nums[i] - 1]) - (nums[nums[i] - 1] = nums[i]);
                }
            }
        }
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}