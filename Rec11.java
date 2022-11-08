public class Rec11{
    static void printArray(int[] arr,int key,int i){
        // if(key==arr[i]){
        // System.out.println(i);
        //     return;
        // }
        if(arr.length==i)
        return ;
        printArray(arr,key,i++);
    }
    public static void main(String[] args){
        int[] arr = new int[]{2,4,3,3,4,1};
        printArray(arr,3,0);
    }
}