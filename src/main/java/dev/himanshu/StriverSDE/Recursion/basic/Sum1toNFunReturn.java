package dev.himanshu.StriverSDE.Recursion.basic;

public class Sum1toNFunReturn {
    public static void main(String[] args) {

        int ans = sum(3);
        System.out.println(ans);
    }

    private static int sum(int n){
        if(n < 1)
            return 0;

        return n+ sum(n-1);
    }
}
