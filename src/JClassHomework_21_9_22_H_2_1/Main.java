package JClassHomework_21_9_22_H_2_1;

//编写程序，分别用while循环，do while循环和for循环求出100-200的和。
//输出姓名和学号。
//要有清晰的代码和运行结果截图。
public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        int sum = 0;
        int i = 100;
        while (i <= 200){
            sum += i;
            i++;
        }
        System.out.println("100-200的和(while)为: " + sum);
    }
}
