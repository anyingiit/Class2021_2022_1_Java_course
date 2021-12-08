package JClassHomework_21_12_8_2;

public class Dog extends Animal{
  public Dog(){

  }

  public Dog(String name, String color){
    super(name, color);
  }

  @Override
  public void eat() {
    System.out.println(this.name + " is gnawing bone.");
  }

  @Override
  public void sleep() {
    System.out.println(this.name + " is sleeping on the floor");
  }
}
