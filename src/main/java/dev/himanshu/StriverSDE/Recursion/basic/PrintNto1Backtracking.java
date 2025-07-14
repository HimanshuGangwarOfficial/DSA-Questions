package dev.himanshu.StriverSDE.Recursion.basic;

public class Print1toNBacktracking {
    public static void main(String[] args) {
        print(10, 10);
    }

    private static void print(int i, int n){

        if(i<1)
            return;

        print(i-1, n);
        System.out.println(i);
    }
}
