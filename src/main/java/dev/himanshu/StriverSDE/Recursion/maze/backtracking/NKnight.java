package dev.himanshu.StriverSDE.Recursion.maze.backtracking;

public class NKnight {

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

        int[][] directions = {
                {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                {1, -2}, {1, 2}, {2, -1}, {2, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValid(board, newRow, newCol) && board[newRow][newCol]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col){
        return (row >= 0 && row < board.length) && (col >= 0 && col < board[0].length);
    }
}
