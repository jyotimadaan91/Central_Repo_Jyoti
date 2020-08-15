
public class Arithmetic2 {

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
		System.out.println("Final Result is "+c);
	}
	public  static void main(String[] args) {
		Arithmetic2 arith = new Arithmetic2();
		int subR1 = arith.sub(10,2);
		int sumR = arith.sum(subR1, 2);
		int subR2 = arith.sub(sumR, 2);
		int mulR = arith.mul(subR2, 2);
		arith.division(mulR, 2);
		
	}
}
