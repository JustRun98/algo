package com.lu.all;

import org.junit.Test;

/**
 * @author sheldon
 * @date 2022-09-30
 */
public class 动态规划_q377_组合总和Ⅳ {

    @Test
    public void test() {
        System.out.println(combinationSum4(new int[]{1, 2, 3}, 4));
    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= i) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }

//    public int combinationSum4(int[] nums, int target) {
//        int[] dp = new int[target + 1];
//        dp[0] = 1;
//        for (int i = 0; i <= target; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i >= nums[j]) {
//                    dp[i] += dp[i - nums[j]];
//                }
//            }
//        }
//        return dp[target];
//    }

//    public int combinationSum41(int[] nums, int target) {
//        int[] ints = new int[target + 1];
//        ints[0] = 1;
//        for (int i = 0; i <= target; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] <= i) {
//                    ints[i] += ints[i - nums[j]];
//                }
//            }
//        }
//        return ints[target];
//    }
//
//    public int combinationSum4(int[] nums, int target) {
//        int[] ints = new int[target + 1];
//        ints[0] = 1;
//        for (int i = 0; i <= target; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i >= nums[j]) {
//                    ints[i] += ints[i - nums[j]];
//                }
//            }
//        }
//        return ints[target];
//    }

}
