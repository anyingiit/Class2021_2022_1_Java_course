package JClassHomework_21_11_10_H_1;

public class Example4_6 {

	public static void main(String[] args) {
		new Student("Mike",97);
		new Student("Joy",98);
		Student s3 = new Student("Bob",100);
		new Student("Ben",89);
		
		System.out.println(s3.getName());
		System.out.println(Student.className);
		Student.doHomework();
		PrintStudent.showStudent(s3);
		
		Student.setCounter(90);
		Student.s5 = new Student("Rose");
		Student.s6 = new Student("Kely");
		
		if(!Student.errorMessage.equals(""))
		{
			PrintStudent.showErrorMessage(Student.errorMessage);
			return;
		}

	}

}
