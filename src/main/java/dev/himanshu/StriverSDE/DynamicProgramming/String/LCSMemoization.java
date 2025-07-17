package dev.himanshu.StriverSDE.DynamicProgramming.String;

import java.util.Arrays;

public class LCSMemoization {

    public static void main(String[] args) {
        int ans = LCS("abcde", "ace");
        System.out.println(ans);
    }

    public static int LCS(String s1, String s2){
        int[][] dp = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return LCS(s1, s2, s1.length()-1, s2.length()-1, dp);
    }

    private static int LCS(String s1, String s2, int m, int n,int[][] dp ){

        if(m<0 || n<0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        if(s1.charAt(m) == s2.charAt(n)){
            return dp[m][n] = 1+LCS(s1,s2,m-1,n-1, dp);
        } else{
             return dp[m][n] = Math.max(LCS(s1,s2,m-1,n, dp),  LCS(s1,s2, m, n-1, dp));
        }


    }
}
