package dev.himanshu.StriverSDE.Arrays;

public class SetMatrixZerosBruteForce {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1,1,},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };

        setZeroes(matrix);
        printMatrix(matrix);

//        System.out.println(matrix.length);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){

            for(int j = 0; j<matrix[0].length;j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {

        for(int i=0 ; i<matrix.length ; i++){

            for(int j = 0; j<matrix[0].length;j++){

                if(matrix[i][j] == 0){
                    markRows(i, matrix);
                    markRCols(j,  matrix);
                }
            }

        }

        changeToZeros(matrix);

    }

    private static void changeToZeros(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markRows(int i, int[][] matrix) {
        for(int k=0; k<matrix.length ;k++){
            matrix[i][k] = -1;
        }
    }

    private static void markRCols(int j, int[][] matrix) {
        for(int k=0; k<matrix[0].length ;k++){
            matrix[k][j] = -1;
        }
    }
}
