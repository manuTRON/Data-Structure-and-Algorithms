package datastructure.singlylinkedlist;

public class NodeSL<T> {
	T data;
	NodeSL<T> next;
	
	public NodeSL(T data) {
		this.data = data;
		this.next = null;
	}
}
