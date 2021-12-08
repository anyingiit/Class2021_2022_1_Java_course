package JClassHomework_21_12_1_2;

public class Main {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher("小飞鼠", 20, "教学部", "Beijing Polytechnic");
        javaTeacher.introduce();
        javaTeacher.printLesson();

        DBTeacher dbTeacher = new DBTeacher("大猫猫", 22, "行政部", "Beijing Polytechnic");
        dbTeacher.introduce();
        dbTeacher.printLesson();
        System.out.println("某同学 00000000000");
    }
}


