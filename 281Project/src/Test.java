import java.util.Scanner;
public class Test {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		
		boolean rerun = true;
		
		while (rerun) {
			
			rerun = false;
			
		int x,y,a,b;
		LinkedList L1 = new LinkedList();	
		
		System.out.println("Enter the First  number: ");
		//x = S.nextInt();
		 x = 252 ;
		System.out.println("Enter the Second number: ");
		//y = S.nextInt();
		y = 198 ;
		
		System.out.println("--------------------------");
		
		System.out.println("Step 1: Using Euclidean algorithm to find GCD for " + x + " and" + y + " :");

		// y is always smaller than x:  (( swap )) 
		if(y>x) {
			int p=x; x=y; y=p;
		}
		
		// if one input is zero:
		if((x == 0 || y == 0) && (x >= 0 && y >= 0)){
			
			
			System.out.println("gcd("+x+","+y+") = "+x);
			System.out.println(x+" * x + "+y+" * y = "+x+" has a solution of (x,y) = ("+1+","+y+")");
		}
		
		
		// if one input is negative:
		else if(x <= 0 || y <= 0) {
			System.out.println("Invalid Number, both numbers have to be Positive integers");
			// since the input is wrong the program will run again
			rerun = true;
		}
		// if one input is a multiple of the other:   (( input is rgiht and the program will run ))
		else if(x % y == 0) {
			System.out.println(x+" = "+x/y+" * "+y+" + "+x%y);
			System.out.println("gcd("+x+","+y+") = "+y);
			System.out.println(y+" = "+x%y+" * "+x+" + "+1+" * "+y);
			System.out.println(x+" * x + "+y+ " * y = "+y+" has a solution of (x,y) = ("+x%y+","+1+")");
		}	
		
		
		// the euclidean algorithm:
		else {
				a = x;
				b = y;
				
			int j=0,i=1;
			
			while(i != 0) {
				j = a / b;
				i = a % b;
				System.out.println(a+" = "+j+" * "+b+" + "+i);
				L1.insert(a, j, b, i);
				if( i != 0) {
					a = b;
					b = i;
				}
			}
			System.out.println("--------------------------");
			System.out.println("# The GCD is " + b + " # " );
			System.out.println("==========================================================");
			System.out.println("Step 2: Working backwards:");
			L1.display();

		}
		}
		S.close();
		
		}
		
	}