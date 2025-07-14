package dev.himanshu.StriverSDE.Arrays;

public class UniquePathBrute {
    public static void main(String[] args) {
        int ans = uniquePaths(3, 7);
        System.out.println(ans);
    }
    public static int uniquePaths(int m, int n) {
        return countPath(0,0,m,n);
    }

    private static int countPath( int i, int j ,int m, int n ){
        if(i>m || j>n) return 0;
        if(i==m-1 && j==n-1) return 1;

        return countPath(i+1, j, m, n) + countPath(i, j+1, m, n);
    }
}
