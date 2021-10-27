package JClassHomework_21_9_29_2;

//输入成绩等级, 推算成绩范围

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Scanner sin = new Scanner(System.in);
        System.out.print("输入您的成绩等级(A - D): ");
        char scoreLevel = sin.next().charAt(0);
        boolean flag = true;
        String result = null;
        while (flag){
            flag = false;
            switch (scoreLevel){
                case 'A':
                    result = "90 - 100";
                    break;
                case 'B':
                    result = "80 - 89";
                    break;
                case 'C':
                    result = "60 - 69";
                    break;
                case 'D':
                    result = "0 - 60";
                    break;
                default:
                    flag = true;
                    System.out.print("您输入的内容非法, 请重新输入您的成绩等级(A - D): ");
                    scoreLevel = sin.next().charAt(0);
                    break;
            }
        }
        System.out.println("您的成绩等级[" + scoreLevel + "]推算所得成绩为: " + result);
    }
}
