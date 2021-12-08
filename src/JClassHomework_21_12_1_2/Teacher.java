package JClassHomework_21_12_1_2;

public class Teacher extends Person {
    private String department, school;
    public Teacher(String name, int age, String department, String school){
        super(name, age);
        this.department = department;
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void printLesson(){
        System.out.println("Teacher中的printLesson()");
    }

    public void introduce(){
        System.out.println("Hello everyone! my name is " + super.getName() + ". I am " + super.getAge() + " years old. I am from " + getDepartment() + " of " + getSchool() + ".");
    }

    public void print_s(){
        System.out.println("姓名: " + super.getName() + " 年龄: " + super.getAge() + " 部门: " + getDepartment());
    }

}
