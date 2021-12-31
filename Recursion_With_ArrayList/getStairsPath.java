import java.util.*;
import java.io.*;
public class Main {
   
    public static ArrayList<String>getStairPaths(int n){
        if(n==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0){
            ArrayList<String>base=new ArrayList<>();
            return base;
        }
        ArrayList<String>first=getStairPaths(n-1);
        ArrayList<String>second=getStairPaths(n-2);
        ArrayList<String>third=getStairPaths(n-3);
        ArrayList<String>ans=new ArrayList<>();
        for(String ele:first)
            ans.add("1"+ele);
        for(String ele:second)
            ans.add("2"+ele);
        for(String ele:third)
            ans.add("3"+ele);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String>ans=getStairPaths(n);
        System.out.print(ans);
    }
}