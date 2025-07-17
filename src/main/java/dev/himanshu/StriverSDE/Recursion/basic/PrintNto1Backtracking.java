package dev.himanshu.StriverSDE.Recursion.basic;

public class PrintNto1Backtracking {
    public static void main(String[] args) {
        print(1, 10);
    }

    private static void print(int i, int n){

        if(i>n)
            return;

        print(i+1, n);
        System.out.println(i);
    }
}
