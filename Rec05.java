import java.util.*;
//find the subset of set there sum is equal to given sum
public class Rec05{
    public static int subsum(int n,int[] arr,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return subsum(n-1,arr,sum)+subsum(n-1,arr,sum-arr[n-1]);
    }
    public static void main(String args[]){
        int[] arr = {3,4,2,1,5,6};
        System.out.println(subsum(6,arr,1));
    }
}