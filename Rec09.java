public class Rec09{
    public static void main(String[] args){
        System.out.println(fun(2,-20));
    }
    static float fun(float n,float p){
        if(p==0)
        return 1;
        if(p>0){
        return n*fun(n,p-1);
        }
        else{
        return (1/n)*fun(n,p+1);
    }
}
}
