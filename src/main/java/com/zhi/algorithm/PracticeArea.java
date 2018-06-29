package com.zhi.algorithm;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class PracticeArea {
    public static void main(String[] args) {
        char[][] board = new char[9][9];
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='.';
            }

        }
        board[0][0]='1';
        board[1][0]='1';
        System.out.println(isValidSudoku(board));
    }

    /**
     * 有效的数独
     *
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        //高效解法
        int[][] signs = new int[3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                int n = 1 << (board[i][j] - '1');//1×2^(board[i][j]-'1'),二进制1左移当前数字对应的位数
                int cubeIndex = i / 3 * 3 + j / 3;//当前格子位于第几块中
                //按位与，若某数字再次出现，对应位上有相同的1，则与后结果不为0
                //例如，9、8出现后，sign的二进制为110000000,再次出现9，n为100000000,这样，
                //按位相与的结果不为0
                if ((signs[0][i] & n) != 0 || (signs[1][j] & n) != 0 || (signs[2][cubeIndex] & n) != 0)
                    return false;
                //sign保存数字对应位数的1，比如9，则为100000000,下一个数字是8,则sign更新为，110000000,
                //即，若某数字出现了，则对应位置上为1
                signs[0][i] |= n;//对应i行的数字，检查一行的数字是否重复
                signs[1][j] |= n;//对应j列的的数字,检查列上的数字是否重复
                signs[2][cubeIndex] |= n;//对应第cubuIndex个块中的数字
            }
        }
        return true;

        //简单解法
//        Set<Character> rowset = new HashSet<Character>();
//        Set<Character> colset = new HashSet<Character>();
//
//        for(int i = 0; i < 9; i++)
//        {
//            rowset.clear();
//            colset.clear();
//            for(int j = 0; j < 9; j ++)
//            {
//                if(i % 3 == 0 && j % 3 == 0)  // 检查块是否有效
//                {
//                    if(!checkBlock(board, i, j))
//                        return false;
//                }
//                if(board[i][j] != '.')  // 检查行是否有效
//                {
//                    if(rowset.contains(board[i][j]))
//                        return false;
//                    rowset.add(board[i][j]);
//                }
//                if(board[j][i] != '.')  // 检查列是否有效
//                {
//                    if(colset.contains(board[j][i]))
//                        return false;
//                    colset.add(board[j][i]);
//                }
//            }
//        }
//        return true;
    }

    public boolean checkBlock(char[][] board, int row, int col)  // 检查块是否有效,一个3×3的块中是否有重复数字
    {
        Set<Character> blockSet = new HashSet<Character>();
        for(int i = row; i < row + 3; i++)
        {
            for(int j = col; j < col + 3; j++)
            {
                if(board[i][j] != '.')
                {
                    if(blockSet.contains(board[i][j]))
                        return false;
                    blockSet.add(board[i][j]);
                }
            }
        }
        return true;
    }

    /**
     * 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                if (nums[i] + nums[j] == target) {
//                    res[0]=i;
//                    res[1]=j;
//                    return res;
//                }
//            }
//        }
//        return res;
        //answer
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {//判断是否有剩下值
                res[0] = m.get(target - nums[i]);
                res[1] = i;
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }

    private static void moveZeroes(int[] nums) {
        // 0,1,0,3,5,6
        int i = 0, j = 0;
        for (int num : nums) {
            if (nums[i] != 0) {
                nums[j] = (nums[i] + nums[j]) - (nums[i] = nums[j]);
                i++;
                j++;
                continue;
            }
            i++;
        }
    }

    private static int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] != nums[i+1]) {
//                return nums[i];
//            }
//            i++;
//        }
//        return nums[nums.length-1];
        //answer
        int n = 0;
        for (int num : nums) {
            n = n ^ num; //按位异或，如1^4 = (001)^(100)=4,举例，[4,2,2,1,1]，后面四个异或结果为0,4和0异或为4
        }
        return n;
    }

    /**
     * 判断存在重复
     *
     * @param nums
     * @return
     */
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 加一
     *
     * @param digits
     * @return
     */
    private static int[] plusOne(int[] digits) {
        int carrry = 0;
        List<Integer> fina = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int res = 0;
            if (i == digits.length - 1) {
                res = digits[i] + 1 + carrry;
            } else {
                res = digits[i] + carrry;
            }
            int a = res % 10;
            fina.add(a);
            carrry = res / 10;
        }
        fina.add(carrry);
        int[] finres = new int[fina.size()];
        int c = 0;
        for (int i = finres.length - 1; i >= 0; i--) {
            finres[c++] = fina.get(i);
        }
        if (finres[0] == 0) {
            int[] b = new int[finres.length - 1];
            System.arraycopy(finres, 1, b, 0, b.length);
            return b;
        }

        return finres;
    }

    /**
     * 两个数组的交集
     *
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] intersect(int[] nums1, int[] nums2) {
        //使用排序的方法
//        int l1 = nums1.length;
//        int l2 = nums2.length;
//        int[] res = new int[Math.max(l1, l2)];
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i=0,j=0,c=0;
//        while (i < l1 && j < l2) {
//            if (nums1[i] == nums2[j]) {
//                res[c++] = nums1[i];
//                i++;
//                j++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            }else {
//                i++;
//            }
//        }
//        if (c > 0) {
//            return Arrays.copyOf(res, c);
//        }
//        return new int[0];
        //不使用排序的方法
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int aNums1 : nums1) {
            if (map.containsKey(aNums1))
                map.put(aNums1, map.get(aNums1) + 1);
            else
                map.put(aNums1, 1);
        }

        int[] res = new int[Math.max(nums1.length, nums2.length)];
        int c = 0;

        for (int aNums2 : nums2) {
            if (map.containsKey(aNums2) && map.get(aNums2) > 0) {
                res[c++] = aNums2;
                map.put(aNums2, map.get(aNums2) - 1);
            }
        }

        if (c > 0) {
            return Arrays.copyOf(res, c);
        }
        return new int[0];
    }

    /**
     * 旋转数组
     *
     * @param nums
     * @param k
     */
    private static void rotate(int[] nums, int k) {
        int[] re = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pos = (i + k) % nums.length;
            re[pos] = nums[i];
        }
        System.arraycopy(re, 0, nums, 0, re.length);

        //O(1) method
        /*
              public void rotate(int[] nums, int k) {
                  int n = nums.length;
                  k = k%n;
                  swap(nums,0,n-k-1);
                  swap(nums,n-k,n-1);
                  swap(nums,0,n-1);
              }
              private void swap(int[] nums, int i, int j) {
                  while (i < j) {
                      int temp = nums[i];
                      nums[i] = nums[j];
                      nums[j] = temp;
                      i++;
                      j--;
                  }
              }
         */
    }


    /**
     * 股票最大收益
     *
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                max += diff;
            }
        }
        return max;
    }


    /**
     * 删除重复值
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * BigDecimal使用
     */
    private static void bigDecimalDemo() {
        BigDecimal b1 = new BigDecimal("3.0");
        BigDecimal b2 = new BigDecimal("2.4");
        System.out.println(b1.subtract(b2));
    }

    /**
     * 打开本地word文档
     */
    private static void javaOpenDoc() {
        try {
            Desktop.getDesktop().open(new File("F:\\IdeaProjects\\algorithm_daily_prac\\src\\main\\java\\com\\zhi\\algorithm\\a.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
