public class Base{
      int i;
      static int j=3;
      static Base b = new Base();
      public Base(){
        String[] str = {"Anil","Daal"};
        // main(str);
        System.out.print("main run before this");
      }
      public static void main(String[] args) {
        // static int a;
        Base b = new Base();
        b.fun01();
        b.fun02();
        System.out.println(b);
        System.out.print(b.b);
      }
      public static void fun01(){
        System.out.print(j);
      }
      public void fun02(){
        System.out.print(i);
      }
}
