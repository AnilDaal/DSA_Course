// This is Toh 
public class Rec03{
    public static void main(String args[]){
        toh(4,'A','B','C');
    }
    static void toh(int n,char a,char b,char c){
        if(n==1){
            System.out.println("Move disk 1 from "+a+ " to "+c);
            return;
        }
        toh(n-1,a,c,b);
        System.out.println("Move disk "+n+" from "+a+" to "+c);
        toh(n-1,b,a,c);
    }
}