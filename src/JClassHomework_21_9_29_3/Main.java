package JClassHomework_21_9_29_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                String result;
                if (i * j < 10){
                    result = "" + i * j + " ";
                }else {
                    result = "" + i * j;
                }
                System.out.print(i + "*" + j + " = " + result + "\t");
            }
            System.out.println();
        }
    }
}
