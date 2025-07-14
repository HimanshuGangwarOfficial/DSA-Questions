package dev.himanshu.StriverSDE.DynamicProgramming.Math;

import java.util.Arrays;

public class FibonacciMemoization {
    public static void main(String[] args) {
        int n = 100;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = fibonacci(n, dp);

        System.out.println(ans);
    }

    public static int fibonacci(int n,int[] dp ){

        if(n<=1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fibonacci(n-1, dp)+fibonacci(n-2, dp);

    }
}
