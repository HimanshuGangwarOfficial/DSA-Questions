package dev.himanshu.StriverSDE.Recursion.maze;

public class MazeWithObstacles {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
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

        if(row>1){
            path(s+"D",maze, row-1, col);
        }

        if(col>1){
            path(s+"R", maze, row, col-1);
        }

    }

}
