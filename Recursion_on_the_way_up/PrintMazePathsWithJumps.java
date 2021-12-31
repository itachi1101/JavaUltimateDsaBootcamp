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
        for (int h = 1; h <= m - y; h++) {
            printMazePaths(x, y + h, n, m, path + "h" + h);
        }
        for (int v = 1; v <= n - x; v++) {
            printMazePaths(x + v, y, n, m, path + "v" + v);
        }
        for (int d = 1; d <= Math.min(n - x, m - y); d++) {
            printMazePaths(x + d, y + d, n, m, path + "d" + d);
        }
        return;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n, m, "");
    }
}