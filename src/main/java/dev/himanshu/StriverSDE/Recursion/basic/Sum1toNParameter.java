package dev.himanshu.StriverSDE.Recursion.basic;

/*
*  Summation of First n numbers (Parameter)
* */

public class Sum1toNParameter {
    public static void main(String[] args) {
        sum(3, 0);
    }

    private static void sum(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }

        sum(n-1, sum+n);

    }
}
