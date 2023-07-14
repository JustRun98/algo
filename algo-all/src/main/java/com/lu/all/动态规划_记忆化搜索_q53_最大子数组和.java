package com.lu.all;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author sheldon
 * @date 2022-03-19
 */
public class 动态规划_记忆化搜索_q53_最大子数组和 {

    @Test
    public void test() {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private int[] nums;
    private int[] memo;

    public int maxSubArray(int[] nums) {
        this.nums = nums;
        this.memo = new int[nums.length];
        Arrays.fill(memo, Integer.MIN_VALUE);
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, dfs(i));
        }
        return res;
    }

    private int dfs(int i) {
        if (memo[i] != Integer.MIN_VALUE) {
            return memo[i];
        }
        if (i == 0) {
            return nums[i];
        }
        return Math.max(nums[i], nums[i] + dfs(i - 1));
    }

}
