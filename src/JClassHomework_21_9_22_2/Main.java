package JClassHomework_21_9_22_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Scanner sin = new Scanner(System.in);
        double score;
        while (true){
            System.out.print("请输入成绩: ");
            score = sin.nextDouble();
            if (score >= 0 && score <= 100){
                break;
            }
            System.out.println("您输入的内容非法, 请输入大于等于0, 小于等于100的数字.");
        }
        System.out.print("您的成绩等级为");
        int scoreFlag = ((int) score - 1) / 10;
        char level = switch (scoreFlag) {
            case 9 -> 'A';
            case 7 -> 'B';
            case 6 -> 'C';
            default -> {
                if(scoreFlag >= 4)
                    yield 'D';
                else
                    yield 'E';
            }
        };
        System.out.println("[" + level + "]");
    }
}
