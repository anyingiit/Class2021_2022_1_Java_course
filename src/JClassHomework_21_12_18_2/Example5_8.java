package JClassHomework_21_12_18_2;

public class Example5_8{
  public static void main(String[] args) {
    Desk desk = new Desk(10, 20);
    Cake cake = new Cake(12, 8);
    BasketBall basketBall = new BasketBall(10);
  
    Student mikeStudent = new Student("Mike");
    mikeStudent.calArea(desk);
    mikeStudent.calArea(cake);
    mikeStudent.calArea(basketBall);

    System.out.println("某同学 00000000000");
  }
}
