package JClassHomework_21_10_27_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Scanner sin = new Scanner(System.in);
        System.out.println("请依次输入5个学生的成绩");
        double []score = new double[5];
        for (int i = 0; i < score.length; i++){
            score[i] = sin.nextDouble();
        }
        System.out.print("原始数据: " + '\t');
        for (double item :
                score) {
            System.out.print(Double.toString(item) + '\t');
        }
        System.out.println();
        Arrays.sort(score);
        System.out.print("排序后数据: " + '\t');
        for (double item :
                score) {
            System.out.print(Double.toString(item) + '\t');
        }
    }
}
