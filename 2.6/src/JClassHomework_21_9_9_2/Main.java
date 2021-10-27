package JClassHomework_21_9_9_2;

public class Main {
    public static void main(String[] args){
        System.out.println("某同学 00000000000");
        int lineHeight = 5;
        for(int i = 1; i <= lineHeight; i++){
            for (int j = lineHeight - 1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
