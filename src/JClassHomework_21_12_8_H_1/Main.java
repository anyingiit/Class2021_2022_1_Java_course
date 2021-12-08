package JClassHomework_21_12_8_H_1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 测试TickBox的获取总价功能
    tourisTotalSystem();

    // 测试单独使用类
    float basePrice;
    YongTicket yongTicket;
    OldTicket oldTicket;
    ChildTicket childTicket;

    basePrice = 100;
    yongTicket = new YongTicket(basePrice);
    oldTicket = new OldTicket(basePrice);
    childTicket = new ChildTicket(basePrice);
    System.out.println("基础票价为: " + basePrice);
    System.out.println("成人票价为: " + yongTicket.singlePrice());// 100
    System.out.println("老年票价为: " + oldTicket.singlePrice());// 50
    System.out.println("儿童票价为: " + childTicket.singlePrice());// 30

    System.out.println();

    System.out.println("设置基础票价涨价到150...");
    basePrice = 150;
    yongTicket.setPrice(basePrice);
    oldTicket.setPrice(basePrice);
    childTicket.setPrice(basePrice);
    System.out.println("基础票价为: " + basePrice);
    System.out.println("成人票价为: " + yongTicket.singlePrice());
    System.out.println("老年票价为: " + oldTicket.singlePrice());
    System.out.println("儿童票价为: " + childTicket.singlePrice());

    System.out.println();

    System.out.println("某同学 00000000000");
  }

  public static void tourisTotalSystem(){
    Scanner sin = new Scanner(System.in);

    float basePrice;
    int yongTouristSum, childTouristSum, oldTouristSum;
    System.out.println("欢迎使用游客计费系统!");
    System.out.print("请输入基本票价: ");
    basePrice = sin.nextFloat();
    System.out.print("请输入成人总人数: ");
    yongTouristSum = sin.nextInt();
    System.out.print("请输入儿童总人数: ");
    childTouristSum = sin.nextInt();
    System.out.print("请输入老人总人数: ");
    oldTouristSum = sin.nextInt();
    sin.close();
    System.out.println("========================================");
    System.out.println("基本票价为: " + basePrice 
                    + "\n\t\t成人总人数为: " + yongTouristSum 
                    + "\n\t\t儿童总人数为: " + childTouristSum 
                    + "\n\t\t老人总人数为: " + oldTouristSum
                  + "\n总票价为: " + TicketBox.getTotalPrice(basePrice, 
                                                            yongTouristSum, 
                                                            childTouristSum, 
                                                            oldTouristSum));
    System.out.println("========================================");
  }
}
