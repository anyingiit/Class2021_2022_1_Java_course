package JClassHomework_21_12_18_1;

public class Example5_7 {
  public static void main(String[] avgs){
    Printer hpPrinter = new Printer();
    USBStrore mySeagate = new USBStrore();
    Computer dell = new Computer();
    dell.workby(hpPrinter);
    dell.workby(mySeagate);

    Student mike = new Student();
    mike.turnOn(hpPrinter);

    System.out.println("某同学 00000000000");
  }
}



