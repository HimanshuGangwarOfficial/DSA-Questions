package dev.himanshu.StriverSDE.Recursion.maze;

public class PrintAllPathsIncludeDiagonalToReachDestination {
    public static void main(String[] args) {
        path(3,3);
    }

    private static void path(int row, int col){
        path("", row, col);
    }

    private static void path(String s, int row, int col) {

        if(row==1 && col==1){
            System.out.println(s);
            return;
        }

        if(row>1 && col>1){
            path(s+"D", row-1, col-1);
        }

        if(row>1){
            path(s+"V", row-1, col);
        }

        if(col>1){
            path(s+"H", row, col-1);
        }

    }

}
