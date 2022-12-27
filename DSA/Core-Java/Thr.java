import java.util.*;
public class Thr implements Runnable{
  public static void main(String[] args) {
        Thread t = new Thread(new Thr());
        t.start();
  }
  public void run(){
    System.out.print("this is thread");
  }
}
