import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner S = new Scanner(System.in);

        // A boolean flag to control the while loop
        boolean run = true;

        // Start of the while loop
        while (run) {
            // Initially set run to false; it will only be set to true again if input is invalid
            run = false;

            // Declare variables for user input and calculations
            int x, y, a, b;

            // Create a new LinkedList instance
            LinkedList L1 = new LinkedList();

            // Prompt the user to enter the first number and read it
            System.out.println("Enter the First number: ");
            x = S.nextInt();

            // Prompt the user to enter the second number and read it
            System.out.println("Enter the Second number: ");
            y = S.nextInt();

            // Print a separator line
            System.out.println("--------------------------");

            // Print the start of the Euclidean algorithm process
            System.out.println("Step 1: Using Euclidean algorithm to find GCD for " + x + " and " + y + " :");

            // Swap x and y if y is greater than x to ensure x is always larger
            if (y > x) {
                int p = x;
                x = y;
                y = p;
            }

            // Check if either input is zero and handle that case
            if ((x == 0 || y == 0) && (x >= 0 && y >= 0)) {
                System.out.println("gcd(" + x + "," + y + ") = " + x);
                System.out.println(x + " * x + " + y + " * y = " + x + " has a solution of (x,y) = (" + 1 + "," + y + ")");
            } 
            // Check for negative numbers and print an error if found, then repeat the loop
            else if (x <= 0 || y <= 0) {
                System.out.println("Invalid Number, both numbers have to be Positive integers");
                run = true;
            } 
            // Handle the case where one input is a multiple of the other
            else if (x % y == 0) {
                System.out.println(x + " = " + x / y + " * " + y + " + " + x % y);
                System.out.println("gcd(" + x + "," + y + ") = " + y);
                System.out.println(y + " = " + x % y + " * " + x + " + " + 1 + " * " + y);
                System.out.println(x + " * x + " + y + " * y = " + y + " has a solution of (x,y) = (" + x % y + "," + 1 + ")");
            } 
            // Main case for the Euclidean algorithm
            else {
                a = x;
                b = y;
                int j = 0, i = 1;

                // Loop for the Euclidean algorithm to find GCD
                while (i != 0) {
                    j = a / b;
                    i = a % b;
                    System.out.println(a + " = " + j + " * " + b + " + " + i);
                    L1.insert(a, j, b, i);
                    if (i != 0) {
                        a = b;
                        b = i;
                    }
                }
                // Print the GCD and start the process of working backwards
                System.out.println("--------------------------");
                System.out.println("# The GCD is " + b + " # ");
                System.out.println("==========================================================");
                System.out.println("Step 2: Working backwards:");
                L1.display();
            }
        }
        // Close the scanner object to avoid resource leak
        S.close();
    }
}
