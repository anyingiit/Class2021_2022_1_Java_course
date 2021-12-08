package JClassHomework_21_12_1_1;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void print_p(){
        System.out.println("姓名: " + getName() + " 年龄: " + getAge());
    }
}
