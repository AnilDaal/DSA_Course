import java.io.*;
import java.util.*;
public class Rec08{
    static String swap(int position1,int position2,String s){
        char[] charArr = s.toCharArray();
        char c1=s.charAt(position1),c2=s.charAt(position2);
        charArr[position2]=c1;charArr[position1]=c2;
        s = charArr.toString();
        return s;
    }
    public static void fun(int n,String str)
    {
        if(n==(str.length()-1)){
            System.out.println(str);
            return;
        }
        for(int i=n;i<str.length();i++){
        tringBuilder s = new StringBuilder(str);
        s.setCharAt(n,str.charAt(i));
        s.setCharAt(i,str.charAt(n));
        str = s.toString();
            fun(n+1,str);
        s.setCharAt(n,str.charAt(i));
        s.setCharAt(i,str.charAt(n));
        str = s.toString();
            }
    }
    public static void main(String args[]){
        fun(0,"ABCD");
    }
}