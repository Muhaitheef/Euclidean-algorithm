public class Node {
		
	    private int bigger, multi, smaller, reminder;
	    private Node next;
	
	    public Node(int b, int m, int s, int r) {
	        bigger = b;    // b is the bigger number 
	        multi = m;    // m is the multiplier for the bigger number 
	        smaller = s;   	// s is the smaller number
			reminder = r;    // r is the reminder
	        next = null;   
	    }
	
	    public int getBigger() {
	        return bigger;
	    }
	
	    public void setBigger(int bigger) {
	        this.bigger = bigger;
	    }
	
	    public int getMulti() {
	        return multi;
	    }
	
	    public void setMulti(int multi) {
	        this.multi = multi;
	    }
	
	    public int getSmaller() {
	        return smaller;
	    }
	
	    public void setSmaller(int smaller) {
	        this.smaller = smaller;
	    }
	
	    public int getReminder() {
	        return reminder;
	    }
	
	    public void setReminder(int reminder) {
	        this.reminder = reminder;
	    }
	
	    public Node getNext() {
	        return next;
	    }
	
	    public void setNext(Node next) {
	        this.next = next;
	    }
	    
	}
