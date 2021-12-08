//父类是Person类，属性是姓名和年龄，方法是print_p，功能是输出属性
//        子类是Teacher类，属性是部门，方法是print_s，功能是输出属性
//
//        主类中，创建Teacher类对象，调用构造方法赋值，并调用print_s
//
//        之后，用set方法赋值，再次调用print_s
package JClassHomework_21_12_1_1;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("小飞鼠", 20, "教学部");
        teacher.print_s();
        teacher.setDepartment("行政部");
        System.out.println("调用了修改部门的方法...");
        teacher.print_s();
        System.out.println("某同学 00000000000");
    }
}


