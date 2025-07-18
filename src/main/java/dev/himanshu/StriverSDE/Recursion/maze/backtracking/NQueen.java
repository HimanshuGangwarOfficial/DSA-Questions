package dev.himanshu.StriverSDE.Recursion.maze.backtracking;

public class NQueen {
    public static void main(String[] args) {
        int N=4;
        boolean[][] board = new boolean[N][N];

        int ans = count(board, 0);
        System.out.println(ans);

    }

    private static int count(boolean[][] board, int row){

        if(row == board.length){
            return 1;
        }

        int count = 0;
        for(int col=0; col<board[0].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count+=count(board, row+1 );
                board[row][col] = false;
            }

        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for(int i=0; i< row; i++){
            if(board[i][col]){
               return false;
            }
        }

        for(int i=0; i<col; i++){
            if(board[row][i]){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-1][col-1]){
                return false;
            }
        }

        int maxRight = Math.min(row, board[0].length - 1 - col);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }


}
