import java.util.*;
import java.io.*;
public class Main {
    public static int Fibonacii(int n){
        if(n==0)
            return 1;
        if(n==1 || n==2)
            return 1;
        int first=1;
        int second=1;
        int ans=0;
        for(int i=3;i<=n;i++){
            ans=first+second;
            first=second;
            second=ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int res=Fibonacii(n);
        System.out.print(res);        
    }
}