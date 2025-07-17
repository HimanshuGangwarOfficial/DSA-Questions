package dev.himanshu.StriverSDE.Recursion.basic;

public class Print1toN {
    public static void main(String[] args) {
        print(1, 10);
    }

    private static void print(int count, int n){
        if(count>n)
            return;

        System.out.println(count);
        print(count+1, n);
    }
}
