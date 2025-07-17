package dev.himanshu.StriverSDE.Arrays;

public class RotateMatrixOptimal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };

        rotate(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0 ;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {

        transpose(matrix);
        reverseRows(matrix);

    }

    private static void reverseRows(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0, k = matrix[0].length-1 ;j<matrix[0].length/2; j++, k--){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    private static void transpose(int[][] matrix) {

        for(int i=0; i<matrix.length-1; i++){
            for(int j=i; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
