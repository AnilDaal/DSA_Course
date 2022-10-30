public class Recursion02{
    public static int fun(int num){
        int n = num%10;
        num=num/10;
        if(num==0)
        return n;
        return n+fun(num);
    }
    public static void main(String[] args){
         System.out.println(fun(134556));
    }
}