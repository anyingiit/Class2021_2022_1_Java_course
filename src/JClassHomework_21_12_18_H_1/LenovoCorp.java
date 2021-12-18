package JClassHomework_21_12_18_H_1;

public class LenovoCorp implements Advertisement{

  @Override
  public void showAdvertisement() {
    System.out.println("*********************");
    System.out.println("让世界变的很小");
    System.out.println("*********************");
  }

  @Override
  public String getCorpName() {
    return "联想集团";
  }
  
}
