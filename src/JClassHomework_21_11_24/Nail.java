package JClassHomework_21_11_24;

public class Nail {
    private int length;
    private String type;//驼峰式命名
    public  Nail(int len,String tp) {
        this.length = len;
        this.type = tp;
    }
    public  Nail(String tp) {

        this.type = tp;
    }
    public  Nail(int len) {
        this.length = len;

    }
    public String getType() {
        return this.type;
    }
    public int getLength() {
        return this.length;
    }
}