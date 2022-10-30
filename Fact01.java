public class Fact01{
	public static void main(String[] args) {
		System.out.print(fun(5,1));
	}
	private static int fun(int n,int k){
		if(n==0||n==1)
			return k;
		return fun(n-1,k*n);
	}
}