
public class constructor_1 {

	public constructor_1() {
		this(1, 2, 3);
		System.out.println("Default Constructor called...");
	}

	public constructor_1(int a) {
		this();
		System.out.println("1- paramertized constructor called...");
	}

	public constructor_1(int a, int b) {
		this(1);
		System.out.println("2 paramertized constructor called...");
	}

	public constructor_1(int a, int b, int c) {
		System.out.println("3 paramterized constructor called...");
	}

	public constructor_1(int a, int b, int c, int d) {
		this(1, 2);
		System.out.println("4 paramterized constructor called...");
	}

	public static void main(String[] args) {
		constructor_1 c1 = new constructor_1(1, 2, 3, 4);

	}

}
	