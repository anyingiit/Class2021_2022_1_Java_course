package JClassHomework_21_12_29_1;

public class ExcepitionTest {
  public static void main(String[] args) {
    try{
      int d = 0;
      int a = 42 / 0;
    }catch(ArithmeticException e){
      System.out.println("算数异常: 除数为0!");
      System.out.println("异常信息: " + e);
    }
  }
}
