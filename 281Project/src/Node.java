public class Node {
	private int bigger, multi, smaller, mod;
	private Node next;
	
	public Node(int a, int j, int b, int i) {
		bigger = a;
		multi = j;
		smaller = b;
		mod = i;
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

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	

}
