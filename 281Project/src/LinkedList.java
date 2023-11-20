public class LinkedList {
    private Node head; // A reference to the first node of the linked list

    // Constructor for LinkedList
    public LinkedList() {
        head = null; // Initializes the head as null, indicating an empty list
    }

    // Method to insert a new Node into the LinkedList
    public void insert(int a, int j, int b, int i) {
        Node newNode = new Node(a, j, b, i); // Creates a new Node with provided values
        if (head == null) {
            head = newNode; // If list is empty, sets head to the new Node
        } else {
            newNode.setNext(head); // Sets the new Node's next reference to the current head
            head = newNode;        // Updates head to point to the new Node
        }
    }

    // Method to display the LinkedList
    public void display() throws NullPointerException {
        Node current = head; // Start with the head of the list
        current = current.getNext(); // Move to the next node (skipping the head)
        int x = current.getReminder(); // Get the remainder value from the current node
        int y = 1; // Initialize y, used in the formula
        int z = current.getMulti(); // Get the multiplier value from the current node
        int i = 0; // Counter variable for alternating the formula
        int j; // Temporary variable for swapping values

        // Iterate through the list until the end
        while (current.getNext() != null) {
            // For even iterations (i = 0, 2, 4, ...)
            if (i++ % 2 == 0) {
                // Print the current formula
                System.out.println(x + " = " + y + " * " + current.getBigger() + " - " + z + " * " + current.getSmaller());
                System.out.print(x + " = " + y + " * " + current.getBigger() + " - " + z + " * ");
                current = current.getNext(); // Move to the next node
                // Continue the formula with the next node's values
                System.out.println("(" + current.getBigger() + " - " + current.getMulti() + " * " + current.getSmaller() + ")");
                j = z; // Swap y and z
                z = (z * current.getMulti()) + y; // Update z based on the formula
                y = j; // Complete the swap
            } else {
                // For odd iterations (i = 1, 3, 5, ...)
                // Similar to the even case but with '-' and '+' swapped
                System.out.println(x + " = " + "-" + y + " * " + current.getBigger() + " + " + z + " * " + current.getSmaller());
                System.out.print(x + " = " + "-" + y + " * " + current.getBigger() + " + " + z + " * ");
                current = current.getNext();
                System.out.println("(" + current.getBigger() + " - " + current.getMulti() + " * " + current.getSmaller() + ")");
                j = z;
                z = (z * current.getMulti()) + y;
                y = j;
            }

            // Handling the last iteration
            if (current.getNext() == null) {
                System.out.println(x + " = " + y + " * " + current.getBigger() + " - " + z + " * " + current.getSmaller());
            }
        }

        // Final output for the linear combination of GCD
        if ((current.getBigger() * y) < (current.getSmaller() * z))
            System.out.println("s = " + y + " , " + " t= -" + z);
        else
            System.out.println("s = " + y + " , " + " t= -" + z);
    }
}
