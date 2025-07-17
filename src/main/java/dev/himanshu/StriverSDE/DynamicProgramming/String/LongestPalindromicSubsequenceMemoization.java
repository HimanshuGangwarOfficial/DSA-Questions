package dev.himanshu.StriverSDE.DynamicProgramming.String;

public class LongestPalindromicSubsequenceMemoization {

    public static void main(String[] args) {
        int ans = longestPalindrome("bbabcbcab");
        System.out.println(ans);
    }

    public static int longestPalindrome(String s){
        int[][] dp = new int[s.length()][s.length()];
        for(int i=0; i< s.length(); i++){
            for(int j=0; j<s.length(); j++){
                dp[i][j] = -1;
            }
        }
        return longestPalindrome(s, new StringBuilder(s).reverse().toString(), s.length()-1, s.length()-1, dp);
    }

    private static int longestPalindrome(String s1, String s2, int m, int n, int[][] dp){

        if(m<0 || n<0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        if(s1.charAt(m) == s2.charAt(n)){
            return dp[m][n] = 1+ longestPalindrome(s1, s2, m-1, n-1,dp);
        } else{
            return dp[m][n] = Math.max(longestPalindrome(s1, s2, m-1, n,dp), longestPalindrome(s1, s2, m, n-1,dp));
        }
    }

}
