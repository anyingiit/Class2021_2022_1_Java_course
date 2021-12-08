package JClassHomework_21_11_3_H_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ans = (int)(Math.random()*100+1);
        int flag =0;
        System.out.println("请你猜一个1-100之间的数:");
        for(int i=0;i<20;i++) {
            Scanner sun = new Scanner(System.in);
            int guess = sun.nextInt();
            if(guess == ans) {
                flag = 1;
                System.out.println("恭喜你，猜中了！");
                break;
            }
            else if( guess < ans) {
                System.out.println("猜小了，请重新猜");
            } else {
                System.out.println("猜大了，请重新猜:");
            }

        }
        if(flag ==0) {
            System.out.println("对不起，您已用完所有20次机会");

        }
        System.out.println("某同学 00000000000");}
}

