import java.util.*;
import java.io.*;

public class Main {
    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String newString = left + right;
            printPermutations(newString, asf + ch);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");
    }
}