import java.util.*;
import java.io.*;

public class Main {
    public static void displayBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    public static void KnightTours(int[][] board, int x, int y, int upComing, int n) {
        if (x < 0 || x >= n || y < 0 || y >= n || board[x][y] != 0)
            return;
        if (upComing == (n * n)) {
            board[x][y] = upComing;
            displayBoard(board);
            System.out.println();
            board[x][y] = 0;
            return;
        }
        board[x][y] = upComing;
        KnightTours(board, x - 2, y + 1, upComing + 1, n);
        KnightTours(board, x - 1, y + 2, upComing + 1, n);
        KnightTours(board, x + 1, y + 2, upComing + 1, n);
        KnightTours(board, x + 2, y + 1, upComing + 1, n);
        KnightTours(board, x + 2, y - 1, upComing + 1, n);
        KnightTours(board, x + 1, y - 2, upComing + 1, n);
        KnightTours(board, x - 1, y - 2, upComing + 1, n);
        KnightTours(board, x - 2, y - 1, upComing + 1, n);
        board[x][y] = 0;
        return;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
        KnightTours(board, x, y, 1, n);

    }
}