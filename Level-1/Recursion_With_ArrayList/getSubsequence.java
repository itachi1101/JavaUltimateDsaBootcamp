import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<String> getSubSequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> temp = getSubSequence(ros);
        ArrayList<String> res = new ArrayList<>();
        for (String ele : temp)
            res.add(ele);
        for (String ele : temp)
            res.add(ch + ele);
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String subSoFar = "";
        ArrayList<String> ans = getSubSequence(str);
        System.out.print(ans);
    }
}