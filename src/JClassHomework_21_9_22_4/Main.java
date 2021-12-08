package JClassHomework_21_9_22_4;

public class Main {
    static int cube(int num) {
        return num * num * num;
    }
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        System.out.println("100 ~ 1000以内的水仙花数为: ");
        for (int i = 101; i < 1000; i++){
            if ((cube(Integer.toString(i).charAt(0) - '0') + cube(Integer.toString(i).charAt(1) - '0') + cube(Integer.toString(i).charAt(2) - '0')) == i){
                System.out.println(i);
            }
        }
    }
}
