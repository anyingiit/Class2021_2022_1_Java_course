package JClassHomework_21_12_29_2;

public class ExcepitionMoreTest {
  public static void main(String[] args) {
    try{
      int a = args.length;
      int b = 42 / a;
  
      int arr[] = {1};
      System.out.println(arr[42]);
    }catch(ArithmeticException e){
      System.out.println("算数异常: " + e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("数组下标越界异常: " + e);
    }
  }
}
