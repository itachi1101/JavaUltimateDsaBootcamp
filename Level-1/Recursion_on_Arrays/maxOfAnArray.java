import java.util.*;
import java.io.*;
public class Main {
    public static int solve(int []arr,int curr,int prev){
        if(curr>=arr.length)
            return Integer.MIN_VALUE;
        if(arr[prev]>arr[curr])
            return Math.max(arr[prev],solve(arr,curr+1,prev));
        else {
            return Math.max(arr[curr],solve(arr,curr+1,curr));
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int ans=Math.max(arr[0],solve(arr,1,0));
        System.out.print(ans);
    }
}