package JClassHomework_21_12_18_2;

public class Student{
  private String name;

  public Student(){}
  public Student(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @param area 接口变量, 可以调用所有实现了IArea接口的类的对象中IArea所描述的方法.(接口回调)
   */
  public void calArea(IArea area){
    // 指针回调: 表示一个变量的地址在某一时刻存放在一个 '指针变量' 中，这个 '指针变量' 可以间接操作该变量中存放的数据；

    // 接口回调: 接口回调借用了C语言中'指针回调'的术语., 有 '接口变量'.
    //           1. 接口变量的类型声明必须是接口, 声明后就可以接受实现了该接口的对象的引用
    //           2. 使用该接口变量可以调用所有接口中所描述的方法
    //           3. （其实当 接口变量 在调用被类实现的接口方法时，就是在通知相应的对象调用这个方法）



    System.out.println("Area of " + area.getArea() + " is " + area.getType());
  }

}
