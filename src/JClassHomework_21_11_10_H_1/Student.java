package JClassHomework_21_11_10_H_1;

public class Student {
	private String name;
	private int num;
	private int englishGrade;
	
	static String className ="Computer Class 1";
	static String errorMessage = "";
	private static int counter = 0;
	public static Student s5;
	public static Student s6;

	
	public Student() {

		counter = counter + 1 ;
		this. num=counter;
		checkedNum();

	}
	public Student(String name) {
		
		this. name = name;

		counter = counter + 1;
		this. num = counter;
	
		checkedNum();
		
	}
	public Student(String name, int englishGrade){
		this. name= name;

		this. englishGrade= englishGrade;
		counter = counter + 1;

		this. num= counter;

		checkedNum();
	}
	public Student(String name, int num, int englishGrade) {
		this. name = name;

		this. num = num;

		this. englishGrade = englishGrade;
		checkedNum( ) ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this. name =name;

	}
	public void setNum(int num) {
		this. num = num ;
	}
	public int getEnglishGrade() {
		return englishGrade;
	}
	
	public void setEnglishGrade (int englishGrade) {
		this. englishGrade = englishGrade;
	}
	
	public static int getCounter() {
		return counter ;
	}

	

	public static void setCounter(int aCounter) {
		counter = aCounter;
	}


	public static void doHomework() {
		System. out. println("I am doing myHomework in" + className);
	}

	private void checkedNum() {
		if ( this. num > 50 ) errorMessage = errorMessage + " The num " + this. num + " is out of ranqe. His or her name is "+ this. name + ".\n";
	}
	public int getNum() {
		// TODO Auto-generated method stub
		return num;
	}
	
}
