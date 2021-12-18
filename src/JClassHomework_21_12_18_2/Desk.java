package JClassHomework_21_12_18_2;

public class Desk implements IArea{
  private float lenght;
  private float width;
  private String type = "Desk";

  public Desk(){}
  public Desk(float lenght, float width){
    this.lenght = lenght;
    this.width = width;
  }

  public float getWidth() {
    return width;
  }
  public void setWidth(float width) {
    this.width = width;
  }

  public float getLenght() {
    return lenght;
  }
  public void setLenght(float lenght) {
    this.lenght = lenght;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public float getArea() {
    return this.lenght * this.width;
  }
  
}
