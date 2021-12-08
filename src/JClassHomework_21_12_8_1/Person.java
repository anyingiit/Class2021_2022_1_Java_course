package JClassHomework_21_12_8_1;

public class Person {
  protected String name;
  protected int age;

  public Person(){

  }

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void say(String something){
    System.out.println(this.name + ":" + something);
  }

}
