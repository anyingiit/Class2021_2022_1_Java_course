package JClassHomework_21_12_8_H_1;

public abstract class Ticket {
  private float price;

  public Ticket(){
    this.price = 188;// 默认票价
  }
  public Ticket(float price){
    this.price = price;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public abstract float singlePrice();
}
