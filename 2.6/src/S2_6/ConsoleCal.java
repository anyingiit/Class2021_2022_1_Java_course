package S2_6;

import java.util.Scanner; //?

public class ConsoleCal {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        double num1;
        double num2;
        char single;
        double result = 0;
        System.out.println("请输入第一个操作数:");
        num1 = sin.nextDouble();
        System.out.println("请输入第二个操作数");
        num2 = sin.nextDouble();
        System.out.println("请输入一个运算符(+, -, *, /)");
        single = sin.next().charAt(0);
        switch (single){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("您输入的操作符号有误");
                break;
        }
        System.out.println("您的计算结果为: " + result);
    }
}
