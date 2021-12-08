package JClassHomework_21_12_8_H_1;

public class OldTicket extends Ticket{
  public OldTicket(){}
  public OldTicket(float price){
    super(price);
  }

  @Override
  public float singlePrice() {
    return (float)(super.getPrice() * (0.5));
  }
}
