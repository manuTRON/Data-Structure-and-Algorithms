package datastructure.singlylinkedlist;

public class SinglyLinkedList<T> {
	NodeSL<T> head;
	NodeSL<T> tail;
	public int size;
	
	//constructor
	public SinglyLinkedList() {
		this.head = new NodeSL<>(null);
		this.tail = new NodeSL<>(null);
		this.size = 0;
	} // End of constructor
	
	/**
	 * Insert function will insert new element at front
	 * @param data
	 */
	public void insert(T data) { 
		NodeSL<T> newNode = new NodeSL<>(data);
		
		// If list is empty : Add the first element
		if(head.next == null) {
			head.next = newNode; // set head to new element
			tail.next = newNode; // set tail to new element
			size++; // increment size
			return;
		}
		
		newNode.next = head.next; // set next of new element to head's next
		head.next = newNode; // set head next to new element
		size++;
		return;
	}// End of insert
	
	public void insertAtEnd(T data) {
		NodeSL<T> newNode = new NodeSL<>(data);
		
		// If list is empty
		if(head.next == null) {
			head.next = newNode;
			tail.next = newNode;
			size++;
			return;
		}
		
		tail.next.next = newNode; // set next of last element to new element
		tail.next = newNode;// set tail to new element
		size++;
		return;
	} // End of insertAtEnd
	
	/**
	 * Delete the value if element present in linked list 
	 * @param data to delete
	 * @return
	 */
	public boolean delete(T data) {
		NodeSL<T> current = head.next;
		NodeSL<T> previous = head.next;
		while(current!=null) {
			if(current.data.equals(data)) {
				previous.next=current.next;
				size--; // decrement size
				return true;
			}
			previous=current;
			current = current.next;
		}
		return false;
	}
	
	/**
	 * Search the element in linked list.
	 * @param data
	 * @return true if element exists in linked list else return false
 	 */
	public boolean search(T data) {
		NodeSL<T> current = head.next;
		while(current!=null) {
			if(current.data.equals(data))
				return true;
			current = current.next;
		}
		return false;
	} // End of search
	
	/**
	 * Give the size of linked list
	 * @return size
	 */
	public int getSize() {
		return size;
	} // End of getSize
	
	/**
	 * Display the linked list
	 */
	public void display() {
		NodeSL<T> current = head.next;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("Size : "+ getSize());
	} // End of display
}
