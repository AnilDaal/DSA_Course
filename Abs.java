public class Abs{
		private int num ;
	public static void main(String[] args) {
		Abs  a = new Abs();
		a.setNum(5);
		System.out.print(a.getNum());
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
}