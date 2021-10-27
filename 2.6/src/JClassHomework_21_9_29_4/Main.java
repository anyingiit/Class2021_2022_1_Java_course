package JClassHomework_21_9_29_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        int scoreLen = 5;
        Scanner sin = new Scanner(System.in);
        int []score = new int[scoreLen];
        double sum = 0;
        System.out.println("本次共计录入[" + scoreLen + "]门课程.");
        for (int i = 0; i < scoreLen; i++){
            System.out.print("请输入第[" + (i + 1) + "]门课程成绩: ");
            score[i] = sin.nextInt();
        }
        for (int i = 0; i < scoreLen; i++){
            sum += score[i];
        }
        System.out.println("=============================");
        System.out.println("共计[" + scoreLen + "]门课程");
        for (int i = 0; i < scoreLen; i++){
            System.out.println("第[" + (i + 1) + "]门课程成绩为: " + score[i]);
        }
        System.out.println("他们的总和为: " + sum);
        System.out.format("他们的平均分为: %.2f\n", sum / scoreLen);
    }
}
