
public class Student {
	String Age;
	String Height;
	
	public Student(String stringage, String stringheight) {
		Age= stringage; 
		Height= stringheight;
	}

	public static void main(String[] args) {
		Student student = new Student ("18","6'2");
		System.out.println(student.Age);
		System.out.println(student.Height);

	}

}
