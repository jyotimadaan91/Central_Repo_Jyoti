import java.util.*;
public class input {
	int x1,x2,x3,x4,x5,x6;
	
	 public int sum(int a,int b) {
		 int c=a+b;
		 return c;
	 }
	 public int substraction(int a, int b) {
		 int c=a-b;
		 return c;
	 }
	 public int mul(int a, int b) {
		 int c = a*b;
		 return c;
	 }
	 public void division(int a,int b) {
		 int c=a/b;
	System.out.println("Output of expression is.. = "+c);
	 }

	 public void input() {
		 
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the value of x1 = ");
			 x1=s.nextInt();
			 System.out.println("Enter the value of x2 = ");
			 x2=s.nextInt();
			 System.out.println("Enter the value of x3 = ");
			 x3=s.nextInt();
			 System.out.println("Enter the value of x4 = ");
			 x4=s.nextInt();
			 System.out.println("Enter the value of x5 = ");
			 x5=s.nextInt();
			 System.out.println("Enter the value of x6 = ");
			 x6=s.nextInt();
			 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input i = new input();
		i.input();
		int resultSum = i.sum(i.x1,i.x2);
		int resultSubstraction = i.substraction(resultSum,i.x3);
		int resultMultiplication = i.mul(resultSubstraction, i.x4);
		int resultSum1=i.sum(resultMultiplication, i.x5);
		i.division(resultSum1, i.x6);
		
		
		
		 
	}

}
