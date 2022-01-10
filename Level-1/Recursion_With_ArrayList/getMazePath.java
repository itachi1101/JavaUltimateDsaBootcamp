import java.util.*;
import java.io.*;
public class Main {
   
    public static ArrayList<String>getMazePaths(int x,int y,int n,int m){
        // there are two only two possible ways to go around the maze 
        // 1. down down
        // 2. go up
        if(x==n-1 && y==m-1){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(x<0 || x>=n || y<0 || y>=m){
            ArrayList<String>base=new ArrayList<>();
            return base;
        }
        ArrayList<String>left=getMazePaths(x,y+1,n,m);
        ArrayList<String>down=getMazePaths(x+1,y,n,m);
        ArrayList<String>res=new ArrayList<>();
        for(String ele:left){
            res.add("h"+ele);
        }
        for(String ele:down){
            res.add("v"+ele);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String>ans=getMazePaths(0,0,n,m);
        System.out.print(ans);
    }
}