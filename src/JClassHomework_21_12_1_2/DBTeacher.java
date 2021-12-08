package JClassHomework_21_12_1_2;

public class DBTeacher extends Teacher{
    public DBTeacher(String name, int age, String department, String school) {
        super(name, age, department, school);
    }
    @Override
    public void printLesson(){
        System.out.println("打开了mysql");
    }
}
