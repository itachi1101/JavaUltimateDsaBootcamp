import java.util.*;
import java.io.*;

public class Main {
    public static boolean isValid(int row, int col, int[][] chess) {
        for (int i = 0; i < chess[0].length; i++) {
            if (i == col)
                continue;
            if (chess[row][i] == 1)
                return false;
        }
        for (int i = 0; i < chess.length; i++) {
            if (i == row)
                continue;
            if (chess[i][col] == 1)
                return false;
        }
        int r = row;
        int c = col;
        r += 1;
        c += 1;
        while (r < chess.length && c < chess[0].length) {
            if (chess[r++][c++] == 1)
                return false;
        }
        r = row + 1;
        c = col - 1;
        while (r < chess.length && c >= 0) {
            if (chess[r++][c--] == 1)
                return false;
        }
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (chess[r--][c--] == 1)
                return false;
        }
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < chess[0].length) {
            if (chess[r--][c++] == 1)
                return false;
        }
        return true;
    }

    public static void nQueen(int[][] chess, String asf, int curr, int n) {
        if (curr == n) {
            System.out.println(asf + ".");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(curr, i, chess)) {
                chess[curr][i] = 1;
                nQueen(chess, asf + curr + "-" + i + ", ", curr + 1, n);
                chess[curr][i] = 0;
            }
        }
        return;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }
        }
        nQueen(chess, "", 0, n);

    }
}