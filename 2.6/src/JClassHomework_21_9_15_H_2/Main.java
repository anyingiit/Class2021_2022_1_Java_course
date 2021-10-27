package JClassHomework_21_9_15_H_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 2020310109");
        Scanner sin = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        int num1 = sin.nextInt();
        System.out.println("输入的整数是: " + num1);

        System.out.print("请输入一个小数: ");
        double num2 = sin.nextDouble();
        System.out.println("请输入一个小数" + num2);

        System.out.print("请输入一个字符: ");
        char ch = sin.next().charAt(0);
        System.out.println("输入的字符是: " + ch);
    }
}
