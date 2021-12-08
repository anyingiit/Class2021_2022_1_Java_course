package JClassHomework_21_9_15_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学00000000000");
        int inputNum;
        Scanner sin = new Scanner(System.in);
        while (true){
            System.out.print("请输入一个四位整数: ");
            inputNum = sin.nextInt();
            if ((inputNum / 1000 > 0) && (inputNum / 10000 == 0)){
                break;
            }
            System.out.println("您输入的内容不符合要求, 请重新输入一个四位整数!");
        }
        System.out.println("您的结果为: ");
        for (int i = 0; i < 4; i++){
            System.out.println(inputNum % 10);
            inputNum /= 10;
        }
    }
}
