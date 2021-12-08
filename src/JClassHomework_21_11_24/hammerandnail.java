package JClassHomework_21_11_24;

public class hammerandnail {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Hammer hammer1 = new Hammer(null, null);
        Hammer hammer2 = new Hammer("大铁锤", null);
        Hammer hammer3 = new Hammer("羊角锤", "红色");
        Hammer hammer4 = new Hammer(null, null);

//  hammer1.setType("羊角锤");
//  hammer2.setType("大铁锤");

        Nail nail1 = new Nail(0);
        Nail nail2 = new Nail(18);
        Nail nail3 = new Nail(18, "高脚杯");
        Nail nail4 = new Nail("短钉子");

//  nail1.setLenth("金");
//  nail2.setLenth("银");

        hammer1.hit(nail1);
        hammer2.hit(nail2);
        hammer3.hit(nail3);
        hammer3.hit(nail4);
        System.out.println("某同学 00000000000");
    }
}