
public class info_constructor {

	public info_constructor() {
		this(10, 20, 30, 40);
		System.out.println("Default Constructor called....");
	}

	public info_constructor(int a) {
		this();
		System.out.println("1 parameterized constructor called...");
	}

	public info_constructor(int a, int b) {
		this(10);
		System.out.println(" 2 parametrized constructor called...");
	}

	public info_constructor(int a, int b, int c) {
		this(10, 20);
		System.out.println("3 paramterized constructor called...");
	}

	public info_constructor(int a, int b, int c, int d) {
		System.out.println("4 parametrized constructor called...");
	}

	public static void main(String[] args) {
		info_constructor i1 = new info_constructor(10, 20, 30);
	}
}
