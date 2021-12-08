package JClassHomework_21_9_29_1;

//输入一个整数, 求其平方

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Scanner sin = new Scanner(System.in);
        System.out.print("输入一个整数, 求其平方: ");
        int inputNum = sin.nextInt();
        sin.close();
        System.out.println("整数[" + Integer.toString(inputNum) + "]平方为: " + inputNum * inputNum);
    }
}
