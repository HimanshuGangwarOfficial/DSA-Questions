package dev.himanshu.StriverSDE.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        System.out.println(printNode(5, 3));
        System.out.println(printRow(5));
        System.out.println(generate(6));
        printPascalsTriangle(6);

    }

    private static int printNode(int row, int col) {

//        n-1 C r-1 = (n-1)! / (r-1)! * (n-r)!
//        Instead of applying full ncr formula we can evalute to a level like below
//        8 C 3 = 7! / 2! * 5! = 7*6/2*1

        int ans = 1;
        for(int i=1; i<= col-1 ; i++){
            ans = ans * (row-i);
            ans = ans / i;
        }

        return ans;

    }

    private static List<Integer> printRow(int rowNum) {

        List<Integer> row = new ArrayList<>();

        for(int i=1; i<= rowNum ;i++){
            row.add(printNode(rowNum, i));
        }

        return row;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=1; i<= numRows ;i++){
            triangle.add(printRow(i));
        }
        return triangle;

    }

    private static void printPascalsTriangle(int n) {
    }
}
