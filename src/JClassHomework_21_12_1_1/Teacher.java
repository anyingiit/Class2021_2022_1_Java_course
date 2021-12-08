package JClassHomework_21_12_1_1;

public class Teacher extends Person{
    private String department;
    public Teacher(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void print_s(){
        System.out.println("姓名: " + super.getName() + " 年龄: " + super.getAge() + " 部门: " + getDepartment());
    }

}
