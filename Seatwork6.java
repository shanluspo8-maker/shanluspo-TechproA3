class Student {
	String name;
	
	void displayName() {
		System.out.println("Student Name: " + name);
	}
}

public class Seatwork6 {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.name = "Fritz";
	
	
	try {
		s1.displayName(); 
	} catch (Exception e) {
		System.out.println("Error");
		}
	}
}