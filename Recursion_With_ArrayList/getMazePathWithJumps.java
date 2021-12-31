import java.util.*;
import java.io.*;
public class Main {
   
    public static ArrayList<String>getMazePaths(int x,int y,int n,int m){
        if(x==n-1 && y==m-1){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(x>=n   || y>=m || x<0 || y<0){
            ArrayList<String>base=new ArrayList<>();
            return base;
        }
        ArrayList<String>res=new ArrayList<>();
        for(int h=1;h<=m-y;h++){
            ArrayList<String>temp=getMazePaths(x,y+h,n,m);
            for(String ele:temp){
                res.add("h"+h+ele);
            }
        }
        for(int v=1;v<=n-x;v++){
            ArrayList<String>temp=getMazePaths(x+v,y,n,m);
            for(String ele:temp){
                res.add("v"+v+ele);
            }
        }
        for(int d=1;d<=Math.min(n-x,m-y);d++){
            ArrayList<String>temp=getMazePaths(x+d,y+d,n,m);
            for(String ele:temp){
                res.add("d"+d+ele);
            }
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