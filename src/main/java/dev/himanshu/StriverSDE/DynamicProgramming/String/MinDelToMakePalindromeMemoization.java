package dev.himanshu.StriverSDE.DynamicProgramming.String;

public class MinDelToMakePalindromeMemoization {

    public static void main(String[] args) {
        int ans = minDeletion("cooc");
        System.out.println(ans);
    }

    public static int minDeletion(String s){

        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return minDeletion(s, 0, s.length()-1,dp);
    }

    private static int minDeletion(String s, int left, int right,int[][] dp){

        if(left>=right){
            return 0;
        }

        if(dp[left][right] != -1){
            return dp[left][right];
        }

        if(s.charAt(left) == s.charAt(right)){
            return dp[left][right] = minDeletion(s, left+1, right-1,dp);
        } else{
            return dp[left][right] = 1 + Math.min(minDeletion(s, left+1, right,dp), minDeletion(s, left, right-1,dp));
        }

    }
}
