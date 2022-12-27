public class Enum{
  enum Month{
    JAN(1000),
    FEB(2000),
    MAR(3000);
    private int data;
    private Month(int data){
    this.data=data;
  }
  }
  public static void main(String[] args) {
    for(Month m:Month.values()){
      System.out.print(m+" "+m.data+" ");
    }
    System.out.print(Month.valueOf("JAN").ordinal());
  }
}
