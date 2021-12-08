package JClassHomework_21_11_3_H_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        Hammer hammer1 = new Hammer();
        hammer1.setType("羊角锤");
        Hammer hammer2 = new Hammer();
        hammer2.setType("棒棒糖锤");
        Nail nail1 = new Nail();
        nail1.setLength(20);
        Nail nail2 = new Nail();
        nail2.setLength(15);
        hammer1.hit(nail1);
        hammer2.hit(nail2);
    }
}
