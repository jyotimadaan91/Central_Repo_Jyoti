
public class Child extends Parent {

	public  Child() {
		super(10,20);
		System.out.println("Child Default Constructor");
	}
	
	public  Child(int a) {
		this(10,20,30);
		System.out.println("Child 1-Paramterized Constructor");
	}
	public  Child(int a, int b) {
		this(10);
		System.out.println("Child 2 Paramterized Constructor");
	}
	public  Child(int a, int b, int c) {
		this(10,20,30,40);
		System.out.println("Child 3 Paramterized Constructor");
	}
	public  Child(int a, int b, int c, int d) {
		this();
		System.out.println("Child 4 Paramterized Constructor");
	}
	
	public static void main(String args[]) {
		Child c = new Child(10,20);
		
	}
	
}
	