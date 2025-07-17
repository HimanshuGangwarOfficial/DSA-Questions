package dev.himanshu.StriverSDE.DynamicProgramming.String;

public class LongestPalindromicSubsequenceRecursion {

    public static void main(String[] args) {
        int ans = longestPalindrome("bbabcbcab");
        System.out.println(ans);
    }

    public static int longestPalindrome(String s){
        return longestPalindrome(s, new StringBuilder(s).reverse().toString(), s.length()-1, s.length()-1);
    }

    private static int longestPalindrome(String s1, String s2, int m, int n){

        if(m<0 || n<0){
            return 0;
        }

        if(s1.charAt(m) == s2.charAt(n)){
            return 1+ longestPalindrome(s1, s2, m-1, n-1);
        } else{
            return Math.max(longestPalindrome(s1, s2, m-1, n), longestPalindrome(s1, s2, m, n-1));
        }
    }

}
