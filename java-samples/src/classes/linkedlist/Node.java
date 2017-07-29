package classes.linkedlist;

public class Node {
	private Object value;
	private Node next;

	public Node(Object value, Node next){
		this.value = value;
		this.next = next;
	}
	
	public Node(Object value){
		this(value,null);
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}
	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}
}
