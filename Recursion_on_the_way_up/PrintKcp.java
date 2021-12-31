import java.util.*;
import java.io.*;

public class Main {
    static String codes[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKpc(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char currentChar = str.charAt(0);
        String ros = str.substring(1);
        String code = codes[currentChar - '0'];
        for (int i = 0; i < code.length(); i++) {
            printKpc(ros, ans + code.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = "";
        printKpc(str, ans);
    }
}