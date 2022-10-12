public class Recursion04{
	static boolean pal(String str,int first,int end){
		 if(first>=end)
		 	return true;
		 return ((str.charAt(first)==str.charAt(end-1))&& pal(str,first+1,end-2));
	}
	public static void main(String[] args) {
		System.out.print(pal("1bb1",0,4));
	}
}