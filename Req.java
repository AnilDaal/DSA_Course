public class Req{
	public static void main(String[] args) {
		Req r = new Req();
		r.fun(235);
	}
	int fun(int n){
		if(n==0){
			return 0;
		}
		System.out.print(n%10);
		return fun(n/10);
	}
}