public class Node {
    private int bigger, multi, smaller, reminder;
    private Node next;

    // Constructor for the Node class
    public Node(int a, int j, int b, int i) {
        bigger = a;    // a is the bigger number 
        multi = j;    // j is the multiplier for the bigger number 
        smaller = b;   	// b is the smaller number
		reminder = i;    // i is the reminder
        next = null;   
    }

    // Getter for bigger
    public int getBigger() {
        return bigger;
    }

    // Setter for bigger
    public void setBigger(int bigger) {
        this.bigger = bigger;
    }

    // Getter for multi
    public int getMulti() {
        return multi;
    }

    // Setter for multi
    public void setMulti(int multi) {
        this.multi = multi;
    }

    // Getter for smaller
    public int getSmaller() {
        return smaller;
    }

    // Setter for smaller
    public void setSmaller(int smaller) {
        this.smaller = smaller;
    }

    // Getter for reminder
    public int getReminder() {
        return reminder;
    }

    // Setter for reminder
    public void setReminder(int reminder) {
        this.reminder = reminder;
    }

    // Getter for the next Node
    public Node getNext() {
        return next;
    }

    // Setter for the next Node
    public void setNext(Node next) {
        this.next = next;
    }
}
