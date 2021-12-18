package JClassHomework_21_12_18_H_1;

public class PhilipsCorp implements Advertisement{

  @Override
  public void showAdvertisement() {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("没有最好, 只有更好");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@");
  }

  @Override
  public String getCorpName() {
    return "飞利浦";
  }
  
}
