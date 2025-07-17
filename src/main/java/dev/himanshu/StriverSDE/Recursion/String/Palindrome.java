package dev.himanshu.StriverSDE.Recursion.String;

public class Palindrome {
    public static void main(String[] args) {

        String s = "MADAME";
        boolean ans = isPalindrome(s, 0);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s, int i){

        if(i >= s.length()/2)
            return true;

        if(s.charAt(i) != s.charAt(s.length()-1-i)){
            return false;
        }

        return isPalindrome(s, i+1);
    }
}
