package JClassHomework_21_9_15_H_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Scanner sin = new Scanner(System.in);
        int number;
        System.out.print("请输入一个年份: ");
        try {
            number = Integer.parseInt(sin.next());
        }catch (NumberFormatException e){
            System.out.println("您输入的内容不是整数!");
            return;
        }
        if (number < 0){
            System.out.println("请输入大于0的整数!");
            return;
        }
        System.out.printf("您输入的年份[%d]", number);
        if (((number % 4 == 0) && (number % 100 != 0)) || number % 400 == 0){
            System.out.println("是闰年.");
            return;
        }
        System.out.println("是平年.");
    }
}
