public class Abs01{
	private int a;
	public int setA(int num){
		a=num;
	}
	public int getA(){
		return a;
	}
	public static void main(String[] args) {
		Abs01 ab = new Abs01();
		ab.setA(5);
		ab.get();
	}
}