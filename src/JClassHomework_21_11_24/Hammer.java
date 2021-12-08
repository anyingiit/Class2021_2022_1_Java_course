package JClassHomework_21_11_24;

public class Hammer {

    public String type;
    public String colour;
    public Hammer(String tp,String co) {
        this.type=tp;
        this.colour = co;
    }
    public  void setType(String tp) {
        this.type=tp;
    }
    public String getType() {
        return this.type;
    }
    public String getColour() {
        return this.colour;
    }
    public  void hit(Nail nail) {
        System.out.println(this.colour+"的"+this.type+"敲击一个"+nail.getLength()+"厘米的"+nail.getType());
    }
}