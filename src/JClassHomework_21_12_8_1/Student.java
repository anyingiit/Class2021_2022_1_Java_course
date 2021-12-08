package JClassHomework_21_12_8_1;

public class Student extends Person{
  int num;
  
  public Student(){

  }

  public Student(String name, int age, int num){
    super(name, age);
    this.num = num;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public void doHomework(){
    System.out.println(this.name + " is doing homework.");
  }

}
