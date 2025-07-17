package dev.himanshu.StriverSDE.Arrays;

public class Pow {
    public static void main(String[] args) {

        double ans = myPow(2,10);
        System.out.println(ans);
    }

    public static double myPow(double x, int n) {
        double ans = 1.0;
        double nn = n;
        if(n<0) nn = -1 * nn;
        while(nn>0){
            if(nn%2 != 0){
                ans = ans * x ;
                nn--;
            } else{
                x = x * x;
                nn = nn /2;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;

    }
}
