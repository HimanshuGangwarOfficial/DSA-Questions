package dev.himanshu.StriverSDE.Recursion.maze.backtracking;

public class PrintAllPathIncludingUpBack {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        path(maze,3,3);
    }

    private static void path(boolean[][] maze, int row, int col){
        path("", maze, row, col);
    }

    private static void path(String s,boolean[][] maze, int row, int col) {

        if(row==1 && col==1){
            System.out.println(s);
            return;
        }

        if(!maze[row-1][col-1])
            return;

        maze[row-1][col-1] = false;

        if(row>1){
            path(s+"D",maze, row-1, col);
        }

        if(col>1){
            path(s+"R", maze, row, col-1);
        }

        if(row<3){
            path(s+"U",maze, row+1, col);
        }

        if(col<3){
            path(s+"B", maze, row, col+1);
        }

        maze[row-1][col-1] = true;

    }

}
