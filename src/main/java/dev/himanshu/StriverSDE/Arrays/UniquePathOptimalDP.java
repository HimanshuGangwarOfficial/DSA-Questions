package dev.himanshu.StriverSDE.Arrays;

import java.util.Arrays;

public class UniquePathOptimalDP {
    public static void main(String[] args) {
        int ans = uniquePaths(3, 7);
        System.out.println(ans);
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return countPath(0,0,m,n, dp);
    }

    private static int countPath( int i, int j ,int m, int n , int[][] dp){
        if(i>m-1 || j>n-1) return 0;
        if(i==m-1 && j==n-1) return 1;

        if(dp[i][j] != -1)
            return dp[i][j];
        else
            return dp[i][j] = countPath(i+1, j, m, n, dp) + countPath(i, j+1, m, n,dp);
    }
}
