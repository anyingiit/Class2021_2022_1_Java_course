package JClassHomework_21_12_18_1;

public class Example5_7 {
  public static void main(String[] avgs){
    Printer hp = new Printer();
    USBStrore seagate = new USBStrore();
    Computer dell = new Computer();
    dell.workby(hp);
    dell.workby(seagate);

    Student mike = new Student();
    mike.turnOn(hp);

    System.out.println("某同学 00000000000");
  }
}



