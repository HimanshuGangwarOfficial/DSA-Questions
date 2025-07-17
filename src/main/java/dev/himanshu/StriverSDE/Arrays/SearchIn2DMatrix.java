package dev.himanshu.StriverSDE.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        boolean ans = searchMatrix(matrix, 0);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix.length * matrix[0].length -1;
        if(matrix[0].length == 1){

        }

        while(low < high){

            int mid = (low+high)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;

            if(matrix[row][col] == target){
                return  true;
            } else if(matrix[row][col] < target){
                low = mid+1;
            } else{
                high = mid;
            }

        }
        return false;

    }
}
