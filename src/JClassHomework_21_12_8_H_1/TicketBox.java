package JClassHomework_21_12_8_H_1;

public class TicketBox {// 联系书中上下文可知, 该类本意是为了做图形化, 这里我略微改造
  public static float getTotalPrice(float basePrice, int yongTouristSum, int childTouristSum, int oldTouristSum){
    float totalPrice = 0;

    if(yongTouristSum > 0) { totalPrice += (new YongTicket(basePrice).singlePrice() * yongTouristSum); }
    if(childTouristSum > 0) { totalPrice += (new ChildTicket(basePrice).singlePrice() * childTouristSum); }
    if(oldTouristSum > 0) { totalPrice += (new OldTicket(basePrice).singlePrice() * oldTouristSum); }

    return totalPrice;
  }
}
