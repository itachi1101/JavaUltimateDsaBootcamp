import java.util.*;
import java.io.*;
public class Main {
    public static void print(int []arr,int curr){
        if(curr>=arr.length)
            return;
        print(arr,curr+1);
        System.out.println(arr[curr]);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        print(arr,0);
    }
}