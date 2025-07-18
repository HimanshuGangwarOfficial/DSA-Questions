package dev.himanshu.StriverSDE.DynamicProgramming.Math;

import java.util.Arrays;

public class FibonacciTabulation {

    public static void main(String[] args) {
        int n = 60;
        int[] dp = new int[n+1];

        int ans = fibonacci(n, dp);

        System.out.println(ans);
    }

    private static int fibonacci(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


}
