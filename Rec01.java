public class Recursion01{
	public static void main(String[] args) {
		fun(5,1);
	}
	static void fun(int n,int k){
		if(n==0){
			return;
		}
		System.out.print(k);
		fun(n-1,k+1);
;	}
}