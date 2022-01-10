import java.util.*;
import java.io.*;
public class Main {
    public static class Pair{
        int i;
        int s;
        int j;
        String psf;
        Pair(int i,int s,int j,String psf){
            this.i=i;
            this.j=j;
            this.s=s;
            this.psf=psf;
        }
    }
    public static void PrintAllPathsWithMinimumJumps(int n,int[]arr){
        Integer []dp=new Integer [n+1];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int steps=arr[i];
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=steps &&  i+j<n;j++){
                if(dp[i+j]!=null && dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            if(min!=Integer.MAX_VALUE)
                dp[i]=min+1;
        }
        System.out.println(dp[0]);
        ArrayDeque<Pair>queue=new ArrayDeque<>();
        queue.add(new Pair(0,arr[0],dp[0],0+ ""));
        while(queue.size()>0){
            
            Pair rem=queue.removeFirst();
            if(rem.j==0){
                System.out.println(rem.psf+" .");
            }
            for(int j=1;j<=rem.s && rem.i+j<n;j++){
                int curr=rem.i+j;
                if(dp[curr]!=null && dp[curr]==rem.j-1){
                    queue.add(new Pair(curr,arr[curr],dp[curr],rem.psf+" -> " +curr));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr= new int [n+1];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        PrintAllPathsWithMinimumJumps(n,arr);
    }
    
}