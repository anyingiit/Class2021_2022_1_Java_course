package JClassHomework_21_11_3_H_2;

public class Hammer {
    private String hammerType;
    public void setType(String typeString){
        this.hammerType = typeString;
    }
    public String getType(){
        return this.hammerType;
    }
    public void hit(Nail nail){
        System.out.println(this.getType() + "敲击一个" + nail.getLength() + "厘米的钉子");
    }
}
