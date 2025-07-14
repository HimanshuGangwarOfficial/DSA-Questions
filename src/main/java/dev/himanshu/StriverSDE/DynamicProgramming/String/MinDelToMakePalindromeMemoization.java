package dev.himanshu.StriverSDE.DynamicProgramming.String;

public class MinDelToMakePalindromeRecursive {

    public static void main(String[] args) {
        int ans = minDeletion("cook");
        System.out.println(ans);
    }

    public static int minDeletion(String s){

       return minDeletion(s, 0, s.length()-1);
    }

    private static int minDeletion(String s, int left, int right){

        if(left>=right){
            return 0;
        }

        if(s.charAt(left) == s.charAt(right)){
            return minDeletion(s, left+1, right-1);
        } else{
            return 1 + Math.min(minDeletion(s, left+1, right), minDeletion(s, left, right-1));
        }


    }
}
