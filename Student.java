package week1.day1;

public class Student {
	String name = "Nagajothi";
	int rollno = 123456789;
	public void printCollegeName() { 
	String college = "svcet";
	System.out.println(college);
	}
	private void printDegreeName() {
	String degree = "BE";
	System.out.println(degree);
	}
	void printDepartmentName(String dept) {
		System.out.println(dept);
		}
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.rollno);
		obj.printCollegeName();
		obj.printDegreeName();
		obj.printDepartmentName("cse");
		
	}
}
	