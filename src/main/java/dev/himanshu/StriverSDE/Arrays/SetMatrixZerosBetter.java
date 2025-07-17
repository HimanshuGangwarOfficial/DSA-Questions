package dev.himanshu.StriverSDE.Arrays;


public class SetMatrixZerosBetter {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,1,},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };

        setZeroes(matrix);
        printMatrix(matrix);
    }

    private static void setZeroes(int[][] matrix) {

        // Using extra arrays to keep track with column and row will become zero
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(rows[i] == 1 || cols[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){

            for(int j = 0; j<matrix[0].length;j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
