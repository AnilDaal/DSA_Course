import java.text.MessageFormat;
public class Demo{
    public static void main(String args[]){
       String str = "this is demo";
    //    str.setCharAt(0,'f');
    int [] arr= {3,2,4,2};
    System.out.println(MessageFormat.format("a string {0}",arr[0]));
    fun(arr,2,0);
}
static void fun(int[] arr,int key,int i){
   if(key==arr[i]){
   System.out.println(i);
   return;
   }
   fun(arr,key,i+1);
}
}