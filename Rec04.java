import java.util.*;
// Find the subset of all string
public class Rec04{
    static void subset(int i,String str,String curr){
        if(i==str.length())
        {System.out.println(curr);
        return;}
        subset(i+1,str,curr);
        subset(i+1,str,curr+str.substring(i,i+1));
    }
    public static void main(String args[]){
        subset(0,"ABC","");
    }
}