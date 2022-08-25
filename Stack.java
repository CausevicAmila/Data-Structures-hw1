package ibu.edu.homework1;

public class Stack<Item> {
	private Node<Item> top = null;
    private int size = 0;
 
    
    /* Push an item onto the stack */
    public void push(Item item) {
    	Node<Item> nn = new Node<Item>();
    	nn.data = item;
    	nn.next = top;
    	top = nn;
    	size ++;
    }
    
    /* Check if the stack is empty */
    public boolean isEmpty() {
    	return top == null;
    }
    
    /* Remove the top item from the stack, and return its data */
    public Item pop() {
    	if ( top == null) {
    		throw new IndexOutOfBoundsException("The linked list is empty");
    	}
    	Item data = top.data;
    	top = top.next;
    	size--;
        return data;
    }
    
    /* Return the current size of the stack */
    public int count() {
        return size;
    }
}

