import java.util.*;
import java.io.*;

public class Main {
    public static boolean valid(int r, int c, int x, int y, int[][] maze) {
        if (r < 0 || r >= x || c < 0 || c >= y || maze[r][c] == 1)
            return false;
        return true;
    }

    public static void floodFill(int[][] maze, int x, int y, String asf) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == 1)
            return;
        maze[x][y] = 1;
        if (valid(x - 1, y, maze.length, maze[0].length, maze)) {
            floodFill(maze, x - 1, y, asf + 't');
        }
        if (valid(x, y - 1, maze.length, maze[0].length, maze)) {
            floodFill(maze, x, y - 1, asf + 'l');
        }
        if (valid(x + 1, y, maze.length, maze[0].length, maze)) {
            floodFill(maze, x + 1, y, asf + 'd');
        }
        if (valid(x, y + 1, maze.length, maze[0].length, maze)) {
            floodFill(maze, x, y + 1, asf + 'r');
        }
        maze[x][y] = 0;
        return;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }
        floodFill(maze, 0, 0, "");

    }
}