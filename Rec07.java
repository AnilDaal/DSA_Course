import java.util.*;
import java.lang.*;
//rope cutting problem
public class Rec07{
    static int max(int a,int b,int c){
        if(a>b){
            if(a>c)
            return a;
            else
            return c;
        }
        else{
            if(b>c)
            return b;
            else 
            return c;
        }

    }
    public static int rope(int len,int a,int b,int c){
        if(len==0)
        return 0;
        if(len<0)
        return -1;
        int res = max(rope(len-a,a,b,c),rope(len-b,a,b,c),rope(len-c,a,b,c));
        if(res==-1)
        return -1;
        return res+1;
    }
    public static void main(String args[]){
        System.out.println(rope(23,12,11,10));
    }
}