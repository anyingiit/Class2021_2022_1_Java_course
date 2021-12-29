package JClassHomework_21_12_29_4;

public class Main {
  private static void testEx(){
    try{
      throw new NullPointerException();
    }catch(NullPointerException e){
      System.out.println("在textEX中捕获到异常: " + e);
      throw e;
    }
  }
  public static void main(String[] args) {
    try{
      testEx();
    }catch(NullPointerException e){
      System.out.println("在main方法中捕获到被函数抛出异常: " + e);
    }
  }
}
