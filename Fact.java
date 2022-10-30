/** This is not a tail recursion problem */
public class Fact{
	public static void main(String[] args) {
		System.out.print(fun(5));
	}
	final static int fun(int n){
		if(n==0||n==1)
			return 1;
		return n*fun(n-1);
	}
}