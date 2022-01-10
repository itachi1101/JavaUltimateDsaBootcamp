import java.util.*;
import java.io.*;
public class Main {
    public static int solve(int []arr,int curr,int target){
        if(curr>=arr.length)
            return Integer.MIN_VALUE;
        if(arr[curr]==target)
            return Math.max(curr,solve(arr,curr+1,target));
        else 
            return solve(arr,curr+1,target);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int target=scn.nextInt();
        int idx=solve(arr,0,target);
        System.out.print(idx);
    }
}