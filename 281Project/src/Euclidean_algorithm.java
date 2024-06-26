import java.util.Scanner;
//Welcome to the Euclidean Algorithm
public class Euclidean_algorithm {
	public static void Euclidean(int a, int b) {
		int r =b%a;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("-----------------------------------");
		System.out.println(" Step 1: Using the Euclidean Algorithm to find the GCD of " + a + " and " + b);
		
		while(r!=0){
			 r =b%a;
		System.out.println(b + " = " + (b / a)  + " * " + a + " + " + r);
		b = a;
		a = r;
		r = b%a;
		if(r==0){
			System.out.println(b + " = " + (b / a)  + " * " + a + " + " + r);
		}
		}
		System.out.println("The GCD is " + a);
		System.out.println("-----------------------------------\n-----------------------------------");
		System.out.println(" Step 2: Working Backwards");
		int s=1;
		int t =0;
		System.out.println(a + " = " + a);

		
	}
	//hi 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Number :");
		int a = input.nextInt();
		System.out.println("Enter the second Number :");
		int b = input.nextInt();
		Euclidean(a, b);
	}
}
