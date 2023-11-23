//Mohammed Almuhaitheef 443101706
//Mohammed Alzubaidi 443100700

import java.util.Scanner;
	
public class Main{
	    public static void main(String[] args) {
	        Scanner S = new Scanner(System.in);
	
	        boolean run = true;
	
	        while (run) {
	        	
	            run = false;    // Initially set run to false; it will only be set to true again if input is invalid
	            
	            int x, y;
	
	            LinkedList L = new LinkedList();
	
	            
	            System.out.println("Enter the First number: ");
	            x = S.nextInt();
	
	            System.out.println("Enter the Second number: ");
	            y = S.nextInt();
	
	            System.out.println("--------------------------");
	
	
	            
	            // there is a six cases  
	            
	            
	            // (1) Swap x and y if y is greater than x to ensure x is always larger
	            if (y > x) {
	                int tmp = x;
	                x = y;
	                y = tmp;
	            }
				 // (2) Handle the case where both inputs are zero
	           
				 if (x == 0 && y == 0) {
	                System.out.println("Undefined , The two numbers cannot be zero , please enter a valid number");
	                run = true;
				}
	            // (3) Check if either input is zero and handle that case
	           else if ((x == 0 || y == 0) && (x >= 0 && y >= 0)) {
		            System.out.println("Step 1: Using Euclidean algorithm to find GCD for " + x + " and " + y + " :");
		            
	                System.out.println(x + " = " + 1 + " x " + y + " + " + x);
	                System.out.println("--------------------------");
	                System.out.println("# The GCD is " + x + " # ");
	                System.out.println("==========================================================");
	                System.out.println("Step 2: Working backwards:");
	                System.out.println(x + " = " + 1 + " x "+ x + " - " + 0 +  " x " + y);
	                System.out.println("--------------------------");
	                System.out.println(" s = " + 1 + ", t = " + 0 );
	                
	            } 
	           
	            // (4) Check for negative numbers and print an error if found, then repeat the loop
	            
	            else if (x < 0 || y < 0) {
	                System.out.println("Invalid Number, both numbers have to be Positive integers");
	                run = true;
	            } 
				
	            // (5) Handle the case where one input is a multiple of the other
	            else if (x % y == 0) {
		            System.out.println("Step 1: Using Euclidean algorithm to find GCD for " + x + " and " + y + " :");

	                System.out.println(x + " = " + x / y + " x " + y + " + " + x % y);
	                System.out.println("--------------------------");
	                System.out.println("# The GCD is " + y + " # ");
	                System.out.println("==========================================================");
	                System.out.println("Step 2: Working backwards:");
	                System.out.println( x%y + " = " + 1 + " x "+ x + " - " + x/y +  " x " + y );               
	                System.out.println("--------------------------");
	                System.out.println(" s = "+ 1 + ",  t = -" + x/y);
	            } 
	            
	            // (6) Main case for the Euclidean algorithm
	            else {
	            	
		           System.out.println("Step 1: Using Euclidean algorithm to find GCD for " + x + " and " + y + " :");

	                int j = 0;
	                int i = 1;
	
	                
	                while (i != 0) {
	                    j = x / y;
	                    i = x % y;
	                    System.out.println(x + " = " + j + " x " + y + " + " + i);
	                   L.insert(x, j, y, i); 
	                    if (i != 0) {
	                        x = y;
	                        y = i;
	                    }
	                }
	                
	                System.out.println("--------------------------");
	                System.out.println("# The GCD is " + y + " # ");
	                System.out.println("==========================================================");
	                System.out.println("Step 2: Working backwards:");
	                L.display();
	                
		            }
		        }
		        S.close();
		    }
		}
