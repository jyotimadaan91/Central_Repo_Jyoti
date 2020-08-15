
public class Student {

	int rollno,age;
	public void method1() {
		System.out.println("Welcome All...");
	}
	public void method2() {
		System.out.println("Automation is easy");	
		}
	
	public static void main (String args[]) {
		Student Deepak = new Student();
		Deepak.rollno=15;
		Deepak.age=20;
		Deepak.method1();
		Deepak.method2();
		System.out.println("Rollno. of Deepak is: "+Deepak.rollno);
		System.out.println("Age of Deepak is: "+Deepak.age+"yrs");
		
	}
	
}
