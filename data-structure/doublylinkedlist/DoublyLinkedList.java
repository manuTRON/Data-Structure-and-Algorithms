//add package name here if needed
class Node<T>{
	T data;
	Node<T> prev;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
}

public class DoublyLinkedList<T> {
	int size;
	Node<T> head;
	Node<T> tail;
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	/**
	 * find the element in doubly linked list return true if element is found
	 * @param data
	 * @return true if element exist in list else false
	 */
	public boolean find(T data) {
		Node<T> current = this.head;
		while(current != null) {
			if(current.data.equals(data))
				return true;
			current=current.next;
		}
		return false;
	} // End of find
	
	/**
	 * insert the new element in the front
	 * @param data to insert
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		
		// if list is empty 
		if(head == null) {
			head=newNode;    // set head's next to new node
			tail= newNode;   // set tail's prev to new node
			size++;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode; 
		size++;
		return;
	} // End of insert
	
	public void deleteAll() {
		this.head = null;
		this.tail = null;
		size = 0;
	} // End of deleteAll
	
	/**
	 * delete the element from the linked list 
	 * @param data
	 */
	public void delete(T data) {
		Node<T> current = this.head.next;
		if(head.data.equals(data)) {
			this.head=current;
			size--;
			return;
		}
		while(current != null) {
			if(current.data.equals(data)) {
				current.prev.next = current.next;
				size--;
				return;
			}
			current=current.next;
		}
	}// End of delete
	
	public void display() {
		Node<T> current = this.head;
		while(current != null) {
			System.out.print(current.data + " ");
			current= current.next;
		}
		System.out.println("Size : " + this.size);
	} // End of display
}
