public class Fibo{
	
	public static void main(String[] args) {
		System.out.print(fun(6));
	}
	protected static int fun(int n){
		if(n==1||n==0)
			return n;
		return fun(n-1)+fun(n-2);
	}
}