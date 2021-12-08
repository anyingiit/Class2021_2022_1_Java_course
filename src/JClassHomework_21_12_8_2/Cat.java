package JClassHomework_21_12_8_2;

public class Cat extends Animal{
  public Cat(){

  }
  
  public Cat(String name, String color){
    super(name, color);
  }

  @Override
  public void eat() {
    System.out.println(this.name + " is eating fish.");
  }

  @Override
  public void sleep() {
    System.out.println(this.name + " is sleeping on the bed");
  }
}
