import java.util.*;
import java.io.*;

public class Main {
    public static int ClimbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int jump = 1; jump <= 3; jump++) {
                if (i - jump >= 0)
                    dp[i] += dp[i - jump];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = ClimbStairs(n);
        System.out.print(res);
    }
}