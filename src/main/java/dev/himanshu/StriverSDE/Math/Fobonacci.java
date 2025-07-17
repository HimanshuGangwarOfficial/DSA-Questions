package dev.himanshu.StriverSDE.Math;

public class Fobonacci {
    public static void main(String[] args) {
        int ans  = fibbonacci(6);
        //5 = 0 1 1 2 3 5 8
        System.out.println(ans);
    }

    public static int fibbonacci(int n){
        if(n<=1){
            return n;
        }
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
}
