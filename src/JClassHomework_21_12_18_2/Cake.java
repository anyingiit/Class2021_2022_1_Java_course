package JClassHomework_21_12_18_2;

public class Cake implements IArea{
  private float width;
  private float height;
  private String type = "Cake";

  public Cake(){}
  public Cake(float width, float height){
    this.width = width;
    this.height = height;
  }

  public float getWidth() {
    return width;
  }
  public void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }
  public void setHeight(float height) {
    this.height = height;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public float getArea() {
    return this.width * this.height / 2;
  }
  
}
