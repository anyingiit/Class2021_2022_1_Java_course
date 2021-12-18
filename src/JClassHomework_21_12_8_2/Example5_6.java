package JClassHomework_21_12_8_2;

public class Example5_6 {
  public static void main(String[] args) {
    // Animal animal = new Animal("someAnimal", "someColor");// 一旦定义为抽象类, 就不能单独实例化了

    // 单独实例化不属于多态
    Cat cat = new Cat("Cat", "white");
    Dog dog = new Dog("Dog", "black");

    System.out.println(cat.getName());
    System.out.println(dog.getName());

    Raiser mike = new Raiser("Mike");// 在Raiser中实现了多态
    mike.feed(cat);// feed方法由Raiser定义, 会自动调用所有基于Animal基类的对象中的eat方法.
    mike.feed(dog);

    System.out.println("某同学 00000000000");
  }
}
