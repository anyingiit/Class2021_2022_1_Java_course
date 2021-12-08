package JClassHomework_21_12_8_2;

public class Raiser {
  private String name;

  public Raiser(){

  }

  public Raiser(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void feed(Animal animal){
    animal.eat();
  }
}
