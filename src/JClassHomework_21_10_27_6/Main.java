package JClassHomework_21_10_27_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String pass, rePass;
        System.out.print("请输入新密码:");
        pass = sin.nextLine();
        System.out.print("请再次输入密码:");
        rePass = sin.nextLine();
        sin.close();
        if (pass.equals(rePass)){
            System.out.println("注册完成!");
        }else {
            System.out.println("输入不一致, 请重新注册");
        }
    }
}
