public class Recursion03{
	public static int fact(int n,int k){
		if(n==1||n==0)
			return k;
		k=n*k;
		return fact(n-1,k);
	}
	public static void main(String[] args) {

		System.out.print(fact(4,1));
	}
}