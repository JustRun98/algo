package com.lu.all;

import org.junit.Test;

/**
 * @author sheldon
 * @date 2022-11-12
 */
public class rev_动态规划_状态动归_q790 {

    @Test
    public void test() {
        System.out.println(numTilings(4));
    }

    static final int MOD = 1000000007;

    public int numTilings(int n) {


        return 0;
    }

//    public int numTilings(int n) {
//        int[][] dp = new int[n + 1][4];
//        dp[0][3] = 1;
//        for (int i = 1; i <= n; i++) {
//            dp[i][0] = dp[i - 1][3]% MOD;
//            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
//            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
//            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % MOD + dp[i - 1][2]) % MOD + dp[i - 1][3]) % MOD;
//        }
//        return dp[n][3];
//    }

}
