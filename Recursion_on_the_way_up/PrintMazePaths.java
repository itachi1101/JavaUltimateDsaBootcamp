import java.util.*;
import java.io.*;

public class Main {
    public static void printMazePaths(int x, int y, int n, int m, String path) {
        if (x == n - 1 && y == m - 1) {
            System.out.println(path);
            return;
        }
        if (x < 0 || x >= n || y < 0 || y >= m)
            return;

        printMazePaths(x, y + 1, n, m, path + "h");
        printMazePaths(x + 1, y, n, m, path + "v");
        return;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n, m, "");
    }
}