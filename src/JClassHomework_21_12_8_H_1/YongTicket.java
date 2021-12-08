package JClassHomework_21_12_8_H_1;

public class YongTicket extends Ticket{
  public YongTicket(){}
  public YongTicket(float price){
    super(price);
  }

  @Override
  public float singlePrice() {
    return (float)(super.getPrice() * (1));
  }
}
