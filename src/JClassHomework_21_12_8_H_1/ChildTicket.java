package JClassHomework_21_12_8_H_1;

public class ChildTicket extends Ticket{
  public ChildTicket(){}
  public ChildTicket(float price){
    super(price);
  }

  @Override
  public float singlePrice() {
    return (float)(super.getPrice() * (0.3));
  }
}
