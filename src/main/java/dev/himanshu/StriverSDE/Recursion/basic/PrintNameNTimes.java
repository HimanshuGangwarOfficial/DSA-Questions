package dev.himanshu.StriverSDE.Recursion.basic;

public class PrintNameNTimes {

    public static void main(String[] args) {

        print(1, 6);
    }

    private static void print(int count, int n ){

        if(count > n)
            return;

        System.out.println("Himanshu");
        print(count+1, n);
    }
}


