package JClassHomework_21_9_15_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学00000000000");
        float basePrice = 20;
        float price = 0;
        int totalCallTime;
        Scanner sin = new Scanner(System.in);
        System.out.print("请输入本月主叫通话时间: ");
        totalCallTime = sin.nextInt();
        if (totalCallTime > 100){
            price += (totalCallTime - 100) * 0.15;
        }
        price += basePrice;
        System.out.println("您的本月话费总费用为: " + price);
    }
}
