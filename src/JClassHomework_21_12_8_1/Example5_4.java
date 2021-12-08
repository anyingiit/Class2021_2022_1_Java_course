package JClassHomework_21_12_8_1;

public class Example5_4 {
  public static void main(String[] args) {
    Student mike = new Student("Mike", 12, 55);
    System.out.println(mike.getName());
    mike.doHomework();

    Monitor joy = new Monitor("Joy", 13, 5, "cleaning blackboard");
    System.out.println(joy.getName());
    joy.doHomework();
    joy.onDyty();

    Student aStudent = joy;
    aStudent.doHomework();// 上转型独享调用的仍然是子类覆盖后的方法(既子类重写的方法)
    // aStudent.onDuty();// 上转型对象会丢失子类新增的方法
    if(aStudent instanceof Monitor){
      ((Monitor)aStudent).onDyty();// 上转型对象能够转换成子类的对象, 进而回复子类所丢失的方法
    }

    // Monitor aMonitor = mike;// 父类的对象不能够赋值子类的引用

    System.out.println();

    HavaLesson.study(mike);
    HavaLesson.study(joy);
  }
}
