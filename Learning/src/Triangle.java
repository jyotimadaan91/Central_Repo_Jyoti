import java.util.Scanner;

public class Triangle {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Iput the number of rows ");
		int row = sc.nextInt();
		for (int i=1;i<=row;i++) {
			for (int j=row;j>=i;j--) {
			System.out.print(" ");
			for(j=1;j<=i;j++) {
				System.out.print(" *");
			}
		System.out.println();
			}
	}

}
}
