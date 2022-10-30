import java.util.*;
//josephus problem 
public class Rec06{
    public static int jose(int n,int k){
        if(n==0)
        return 0;
        return (jose(n-1,k)+k)%n;
    }
    public static void main(String args[]){
        System.out.println(jose(4,3));
    }
}