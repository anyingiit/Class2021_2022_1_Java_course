package JClassHomework_21_12_18_2;

public class BasketBall implements IArea{
  private float radius;
  private String type = "BasktBall";
  
  public BasketBall(){}
  public BasketBall(float radius){
    this.radius = radius;
  }

  public float getRadius() {
    return radius;
  }
  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public float getArea() {
    return this.radius * this.radius * IArea.PI;// 调用了接口中的值
  }
  
}
