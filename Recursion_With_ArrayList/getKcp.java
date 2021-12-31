import java.util.*;
import java.io.*;
public class Main {
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String>getKpc(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>temp=getKpc(ros);
        ArrayList<String>res=new ArrayList<>();
        
        String codeForCh=codes[ch-'0'];
        for(int i=0;i<codeForCh.length();i++){
            char chcode=codeForCh.charAt(i);
            for(String rstr:temp){
                res.add(chcode+rstr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String subSoFar="";
        ArrayList<String>ans=getKpc(str);
        System.out.print(ans);
    }
}