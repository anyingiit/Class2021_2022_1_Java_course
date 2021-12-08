package JClassHomework_21_12_1_2;

public class JavaTeacher extends Teacher{
    public JavaTeacher(String name, int age, String department, String school) {
        super(name, age, department, school);
    }
    @Override
    public void printLesson(){
        System.out.println("打开了vscode");
    }
}
