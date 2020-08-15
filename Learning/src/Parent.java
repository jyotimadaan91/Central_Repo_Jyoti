
public class Parent {

	
	public Parent() {
		this(10,20,30);
		System.out.println("Parent Default Constructor");
	}
	public Parent(int a) {
		this(10,20,30,40);
		System.out.println("Parent 1 parameterized constructor");
	}
	
	public Parent(int a, int b ) {
		this(10);
		System.out.println("Parent 2- parameterized constructor");
	}
	public Parent(int a, int b, int c) {
		System.out.println("Parent 3 parameterized constructor");
	}
	public Parent(int a, int b, int c, int d) {
		this();
		System.out.println("Parent 4 parameterized constructor");
	}
	
}
 