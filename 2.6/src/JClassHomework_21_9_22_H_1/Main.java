package JClassHomework_21_9_22_H_1;

//求222-765之间第一个能被7整除的数。
//输出姓名和学号。
//要有清晰的代码和运行结果截图。
public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        for (int i = 222 + 1; i < 765; i++){
            if (i % 7 == 0){
                System.out.println("222-765之间第一个能被7整除的数为: " + i);
                break;
            }
        }
    }
}
