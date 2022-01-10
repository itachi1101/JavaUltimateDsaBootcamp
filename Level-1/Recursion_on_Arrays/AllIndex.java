import java.util.*;
import java.io.*;
public class Main {
    public static int []solve(int []arr,int curr,int target,int cnt){
        if(curr>=arr.length){
            int [] base=new int[cnt];
            return base;
        }
        if(arr[curr]==target)
            cnt+=1;
        int [] ans=solve(arr,curr+1,target,cnt);
        if(arr[curr]==target)
            ans[cnt-1]=curr;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int target=scn.nextInt();
        int [] ans= solve(arr,0,target,0);
        if(ans.length==0){
            System.out.println();
            return;
        }
        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
        
    }
}