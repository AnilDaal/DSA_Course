 /**This is non tail function */
 public class Recursion{
	public static void main(String[] args) {
		num(5);
	}
	static int num(int n){
		if(n==0)
			return 0;
		System.out.print(n);
		return num(n-1);
	}
}