package JClassHomework_21_10_27_H_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Scanner sin = new Scanner(System.in);
        System.out.print("请输入目标字符串:");
        String inputString = sin.nextLine();
        if (!isEchoBackString(inputString)){
            System.out.println("您输入的字符串不是回文字符串...");
        }else {
            System.out.println("恭喜! 您输入的字符串是回文字符串!");
        }
        System.out.println("使用equals方法判断");
        if (!isEchoBackString1(inputString)){
            System.out.println("您输入的字符串不是回文字符串...");
        }else {
            System.out.println("恭喜! 您输入的字符串是回文字符串!");
        }
    }

    public static boolean isEchoBackString(String inputString){
        for (int i = 0, j = inputString.length() - 1; i < j; i++, j--){
            if (inputString.charAt(i) != inputString.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static boolean isEchoBackString1(String inputString){
        if (inputString.equals(new StringBuilder(inputString).reverse().toString())){
            return true;
        }
        return false;
    }
}
