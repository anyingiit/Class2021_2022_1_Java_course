package JClassHomework_21_12_8_1;

public class Monitor extends Student{
  private String duty;
  public Monitor(){

  }
  
  public Monitor(String name, int age, int num, String duty){
    super(name, age, num);
    this.duty = duty;
  }

  public void onDyty(){
    System.out.println(this.name + " is " + this.duty);
  }

  @Override
  public void doHomework(){
    System.out.println(this.name + " do and collect homework.");
  }
}
