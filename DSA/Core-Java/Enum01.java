enum Enum01{
  SUN(23),
  MON(14),
  TUE(45);
  private int day;
  private Enum01(int d){
    day = d;
  }
  public static void main(String[] args) {
    for(Enum01 e:Enum01.values()){
      System.out.println(e+" "+e.day);
    }
  }
}
