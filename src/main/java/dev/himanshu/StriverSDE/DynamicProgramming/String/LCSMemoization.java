package dev.himanshu.StriverSDE.DynamicProgramming.String;

public class LCSRecursion {

    public static void main(String[] args) {
        int ans = LCS("abc", "def");
        System.out.println(ans);
    }

    public static int LCS(String s1, String s2){
        return LCS(s1, s2, s1.length()-1, s2.length()-1);
    }

    private static int LCS(String s1, String s2, int m, int n){

        if(m<0 || n<0){
            return 0;
        }

        if(s1.charAt(m) == s2.charAt(n)){
            return 1+LCS(s1,s2,m-1,n-1);
        } else{
             return Math.max(LCS(s1,s2,m-1,n),  LCS(s1,s2, m, n-1));
        }


    }
}
