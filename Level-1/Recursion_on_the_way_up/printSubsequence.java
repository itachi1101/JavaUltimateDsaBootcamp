/// in this part we don't have to store we directly print the subsequence

import java.util.*;
import java.io.*;

public class Main {

    public static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char currentChar = str.charAt(0);
        String restOfSring = str.substring(1);
        printSS(restOfSring, ans + currentChar);
        printSS(restOfSring, ans + "");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = "";
        printSS(str, ans);
    }
}