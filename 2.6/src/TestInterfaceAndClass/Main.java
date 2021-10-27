package TestInterfaceAndClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
    }
}

interface StudentInterface{
    int getMathScore(int studentId);
    void sayHello();
}

class Student implements StudentInterface {
    @Override
    public int getMathScore(int studentId) {
        if (studentId == 1){
            return 100;
        }else if (studentId == 2) {
            return 60;
        }else {
            return -1;
        }
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public String toString(){
        return "";
    }
}