import java.util.*;
public class Dupli{
	public static int dup(int[] arr){
		// Arrays.sort(arr);
		int j=1;
		
		return j+1;
	}
	public static void main(String[] args) {
		int [] arr = {1,1,1,1,1,2,2,2,2,2,2,2,2};
		// dup(arr);
		int j=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[j-1])
			{ 
				arr[j]=arr[i];
				j++; 
			}
		}
		for(int i: arr){
			System.out.print(i);
		}
	}
}