package JClassHomework_21_9_22_3;

//求1-100之问所有能被3整除的数的和

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("1-100之问所有能被3整除的数的和为: " + sum);
    }
}
