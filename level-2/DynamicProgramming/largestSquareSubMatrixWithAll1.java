import java.util.*;
import java.io.*;

public class Main {
    public static int LargestSquareSubMatrixWithAll(int n, int m, int[][] array) {
        int[][] dp = new int[n + 1][m + 1];
        for (int[] arr : dp)
            Arrays.fill(arr, 0);
        for (int i = 0; i < n; i++)
            if (array[i][m - 1] == 1)
                dp[i][m - 1] = 1;
        for (int i = 0; i < m; i++)
            if (array[n - 1][i] == 1)
                dp[n - 1][i] = 1;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                if (array[i][j] == 1)
                    dp[i][j] = Math.min(dp[i + 1][j + 1], Math.min(dp[i + 1][j], dp[i][j + 1])) + 1;
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                ans = Math.max(dp[i][j], ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = scn.nextInt();
        }
        int res = LargestSquareSubMatrixWithAll(n, m, array);
        System.out.print(res);
    }

}