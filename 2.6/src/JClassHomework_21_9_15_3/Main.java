package JClassHomework_21_9_15_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学00000000000");
        Scanner sin = new Scanner(System.in);
        String carName;
        float price, height, width;
        System.out.println("-----------------欢迎登陆汽车查询官网-----------------");
        System.out.print("请输入欲查询汽车名称: ");
        carName = sin.next();
        System.out.print("请输入欲查询汽车价格: ");
        price = sin.nextFloat();
        System.out.print("请输入欲查询汽车高度: ");
        height = sin.nextFloat();
        System.out.print("请输入欲查询汽车宽度: ");
        width = sin.nextFloat();
        System.out.println("您欲查询的汽车[名称]为: " + carName);
        System.out.println("您欲查询的汽车[价格]为: " + price);
        System.out.println("您欲查询的汽车[高度]为: " + height);
        System.out.println("您欲查询的汽车[宽度]为: " + width);
    }
}
