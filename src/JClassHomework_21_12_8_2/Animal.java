package JClassHomework_21_12_8_2;

public abstract class Animal{// 一旦定义了抽象类, 就不能单独实例化了
  String name;
  String color;

  public Animal(){

  }

  public Animal(String name, String color){
    this.name = name;
    this.color = color;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // 抽象方法只能定义在抽象类
  public abstract void eat();
  public abstract void sleep();
}