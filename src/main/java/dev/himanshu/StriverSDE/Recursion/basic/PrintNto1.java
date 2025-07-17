package dev.himanshu.StriverSDE.Recursion.basic;

public class PrintNto1 {

    public static void main(String[] args) {
        print(10, 10);
    }

    private static void print(int i, int n){
        if(i < 1)
            return;

        System.out.println(i);
        print(i-1, n);
    }
}
