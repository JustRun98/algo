package com.lu.all;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author sheldon
 * @date 2022-10-04
 */
public class 动态规划_线性dp_选还是不选_记忆化搜索_q300_最长递增子序列 {

    @Test
    public void test() {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    private int[][] memo;
    private int[] nums;

    public int lengthOfLIS(int[] nums) {
        this.nums = nums;
        this.memo = new int[nums.length][nums.length];
        for (int[] ints : this.memo) {
            Arrays.fill(ints, -1);
        }
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, dfs(i, i + 1));
        }
        return res;
    }

    private int dfs(int index, int indexRight) {
        if (indexRight == nums.length) {
            return 1;
        }
        if (this.memo[index][indexRight] != -1) {
            return this.memo[index][indexRight];
        }
        int res = dfs(index, indexRight + 1);
        if (nums[index] < nums[indexRight]) {
            res = Math.max(res, dfs(indexRight, indexRight + 1) + 1);
        }
        return this.memo[index][indexRight] = res;
    }

//    private int[] nums;
//    private int[] memo;
//
//    public int lengthOfLIS(int[] nums) {
//        this.nums = nums;
//        this.memo = new int[nums.length];
//        Arrays.fill(memo, -1);
//        int res = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            res = Math.max(res, dfs(i));
//        }
//        return res;
//    }
//
//    private int dfs(int index) {
//        if (memo[index] != -1) {
//            return memo[index];
//        }
//        if (index == nums.length - 1) {
//            return 1;
//        }
//        int res = Integer.MIN_VALUE;
//        for (int i = index + 1; i < nums.length; i++) {
//            if (nums[i] > nums[index]) {
//                res = Math.max(res, dfs(i) + 1);
//            }
//        }
//        return memo[index] = (res == Integer.MIN_VALUE ? 1 :res);
//    }

//    public int lengthOfLIS2(int[] nums) {
//        //if nums[i] > nums[j] then dp[i] = max(dp[i],dp[j]+1)
//        int[] dp = new int[nums.length];
//        Arrays.fill(dp,1);
//        int max = 1;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//                max = Math.max(dp[i], max);
//            }
//        }
//        return max;
//    }
//
//
//    public int lengthOfLIS1(int[] nums) {
//        int[] dp = new int[nums.length];
//        //dp[i] 表示第i位为止最大的子序列
//        Arrays.fill(dp, 1);
//        int res = 0;
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[j] < nums[i]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//            res = Math.max(res, dp[i]);
//        }
//        return res;
//    }
//
//    public int lengthOfLIS(int[] nums) {
//        int[] dp = new int[nums.length];
//        Arrays.fill(dp, 1);
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] > nums[j]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//        }
//        int res = 0;
//        for (int i = 0; i < dp.length; i++) {
//            res = Math.max(res, dp[i]);
//        }
//        return res;
//    }

}