package dev.himanshu.StriverSDE.Recursion.maze;

public class CountAllPathsToReachDestination {

    public static void main(String[] args) {
        int ans = count(3,3);
        System.out.println(ans);
    }

    private static int count(int row, int col){

        if(row == 1 || col == 1 ){
            return 1;
        }

        return count(row-1, col) + count(row, col-1);
    }

}
