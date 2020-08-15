
public class Arithmetic {

	public int sum (int a,int b) {
		int c= a+b;
		System.out.println("Result of sum is "+c);
		return c;
		
	}
	public int sub(int a,int b) {
		int c= a-b;
		System.out.println("Result of substraction is "+c);
		return c;
	
	}
	public int mul(int a,int b) {
		int c=a*b;
		System.out.println("Result of multiplication is "+c);
		return c;
	}
	public void division(int a, int b){
		int c = a/b;
		System.out.println("Final result is "+c);
	}
	public  static void main(String[] args) {
		Arithmetic arith = new Arithmetic();
		int sumR1 = arith.sum(10, 2);
		int sumR2 = arith.sum(sumR1, 2);
		int subR = arith.sub(sumR2, 2);
		int mulR = arith.mul(subR, 2);
		arith.division(mulR, 2);
		
	}
}
