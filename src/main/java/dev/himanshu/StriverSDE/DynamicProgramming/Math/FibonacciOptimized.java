package dev.himanshu.StriverSDE.DynamicProgramming.Math;

public class FibonacciOptimized {

    public static void main(String[] args) {
        int n = 6;

        int ans = fibonacci(n);

        System.out.println(ans);
    }

    private static int fibonacci(int n) {

        int prev1 = 1, prev2 = 0, curr;

        for(int i=2; i<=n; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
