public class Recursion02{
	//Modified
	public int sum(int n){
		if(n==0){
			return 0;
		}
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		Recursion02 rec = new Recursion02();
		int sum=rec.sum(4646);
		System.out.print(sum);
	}
}