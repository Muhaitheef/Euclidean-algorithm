public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insert(int a, int j, int b, int i) {
		Node newNode = new Node(a,j,b,i);
		if(head == null)
			head = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
			}
			
		}
	
	public void display() throws NullPointerException {
		Node current = head;
		current = current.getNext();
		int x = current.getMod();
		int h = current.getMod();
		int y = 1;
		int z = current.getMulti();
		int i = 0;
		int j;
		
		
		while(current.getNext() != null) {
			
			
			if(i++ % 2 == 0) {
				System.out.println(x +" = "+y+" * "+current.getBigger()+" - "+z+" * "+current.getSmaller());
				System.out.print(x +" = "+y+" * "+current.getBigger()+" - "+z+" * ");
				current = current.getNext();
				System.out.println("("+current.getBigger()+" - "+current.getMulti()+" * "+current.getSmaller()+")");
				j = z;
				z = (z*current.getMulti())+y;
				y = j;
			}
			
			else {
				System.out.println(x +" = "+"-"+y+" * "+current.getBigger()+" + "+z+" * "+current.getSmaller());
				System.out.print(x +" = "+"-"+y+" * "+current.getBigger()+" + "+z+" * ");
				current = current.getNext();
				System.out.println("("+current.getBigger()+" - "+current.getMulti()+" * "+current.getSmaller()+")");
				j = z;
				z = (z*current.getMulti())+y;
				y = j;
			}
			
			if(current.getNext() == null)
				System.out.println(x +" = "+y+" * "+current.getBigger()+" - "+z+" * "+current.getSmaller());
		}
		
		
		if ((current.getBigger()*y)<(current.getSmaller()*z))
			System.out.println("s = " +  y + " , " + " t= -" + z  );

		else
			System.out.println("s = " +  y + " , " + " t= -" + z  );
		

		
	}
	
}
