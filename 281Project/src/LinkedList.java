public class LinkedList {
		
		private Node head;
		
		public LinkedList() {
		        head = null;     // Initializes 
		        
		    }
		
		    
		    public void insert(int x, int j, int y, int i) {
		        Node newNode = new Node(x, j, y, i);     
		        
		        if (head == null) {
		            head = newNode;                 // If list is empty, sets head to the new Node
		        					} 
		        else {
		            newNode.setNext(head);		   // Sets the next of the new Node to reference to the current head
		            head = newNode;    		       // Updates head to point to the new Node

		        }
		    }
		
		   
		    public void display() throws NullPointerException {
		    	
		        Node current = head;
		       
		        current = current.getNext(); 
		        
		        int x = current.getReminder();
		        
		        int y = 1; // Initialise for the formula
		        
		        int z = current.getMulti();

		        int i = 0; // counter

		        int j;  // hold the values
		
		        while (current.getNext() != null) {
		        	
		            if (i++ % 2 == 0) {
		                
		                System.out.println(x + " =  " + y + " x " + current.getBigger() + " - " + z + " x " + current.getSmaller());
		                
		                System.out.print(x + " =  " + y + " x " + current.getBigger() + " - " + z + " x ");
		                current = current.getNext();
		                System.out.println("(" + current.getBigger() + " - " + current.getMulti() + " x " + current.getSmaller() + ")");
		                j = z; 
		                // Swap y and z
		                z = (z * current.getMulti()) + y;
		                // Update z based on the formula
		                y = j; 
		                // Complete the swap
		            } 
		            else {
		                  // Similar to the even case but with '-' and '+' swapped
		                System.out.println(x + " = " + "-" + y + " x " + current.getBigger() + " + " + z + " x " + current.getSmaller());
		                
		                System.out.print(x + " = " + "-" + y + " x " + current.getBigger() + " + " + z + " x ");
		                current = current.getNext();
		                System.out.println("(" + current.getBigger() + " - " + current.getMulti() + " x " + current.getSmaller() + ")");
		                j = z;
		                z = (z * current.getMulti()) + y;
		                y = j;
		            }
		 
		        }
		
		        // Handling the last iteration
	            if (current.getNext() == null) {
	            
		        // Final output for the linear combination of GCD
		        if ( (current.getBigger() * y) < (current.getSmaller() * z) ) {
	                System.out.println(x + " =  " + z + " x " + current.getSmaller() + " - " + y + " x " + current.getBigger());
		            System.out.println("s = " + z + " , " + " t = -" + y);
			                
		        } else {
	                System.out.println(x + " =  " + y + " x " + current.getBigger() + " - " + z + " x " + current.getSmaller());
		            System.out.println("s = " + y + " , " + " t = -" + z);
			           }
		            
	            }
		            
		   			}
			    
	
		}
