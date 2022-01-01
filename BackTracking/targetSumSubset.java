import java.util.*;
import java.io.*;

public class Main {
    public static void targetSumSubset(int[] arr, int curr, String set, int currSum, int target) {
        if (curr == arr.length) {
            if (currSum == target) {
                System.out.println(set + ".");
                return;
            }
            return;
        }
        targetSumSubset(arr, curr + 1, set + arr[curr] + ", ", currSum + arr[curr], target);
        targetSumSubset(arr, curr + 1, set, currSum, target);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumSubset(arr, 0, "", 0, target);

    }
}