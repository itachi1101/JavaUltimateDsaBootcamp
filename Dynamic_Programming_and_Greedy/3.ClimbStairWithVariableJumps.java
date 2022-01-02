import java.util.*;
import java.io.*;

public class Main {
    public static int ClimbStairs(int n, int[] array) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= array[i]; j++) {
                if (i + j <= n) {
                    dp[i] += dp[i + j];
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        int res = ClimbStairs(n, array);
        System.out.print(res);
    }
}