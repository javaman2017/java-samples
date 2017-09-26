package classes.linkedlist;

import classes.vehicles.Vehicle;

public class LinkedList<E> {
	private static final int DEFAULT_LENGTH= 10;
	private Node<E>[] nodes;
	private int size;
	
	@Override
	public String toString() {
		String dump = "";
		for(Node<E> node : nodes)
		    dump += node + "\n";
		return dump;
	}

	public LinkedList(){
		nodes = new Node[DEFAULT_LENGTH];
	}
	
    public LinkedList(E... elements){
        int length = elements.length;
		this.nodes = new Node[length];
		for(int i = 0; i < length; i++)
		    this.add(elements[i]);
	}
	
	public boolean add(E newElement){
		boolean result = false;
        Node<E> newNode = new Node();
        newNode.value = newElement;
		if (size > 0){
			Node<E> headNode = nodes[size - 1];
			headNode.next = newNode;
			nodes[size++] = newNode;
			result = true;
		} else {
			nodes[size++] = newNode;
			result = true;
		}
		
		return result;
	}
	
	public int size(){
		return size;
	}
	
	private class Node<E> {
	    E value;
	    Node<E> next;
        
        @Override
        public String toString() {
            return "Node [value=" + value + ",\n next=" + next + "]";
        }
	}

	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle(null, "Tom");
		vehicle1.setCurrentSpeed(10);
		vehicle1.setCurrentDirection(1);
		
		Vehicle vehicle2 = new Vehicle(null, "Dick");
		vehicle2.setCurrentSpeed(20);
		vehicle2.setCurrentDirection(-1);
		
		Vehicle vehicle3 = new Vehicle(null, "Harry");
		vehicle3.setCurrentSpeed(30);
		vehicle3.setCurrentDirection(0);
		
		LinkedList<Vehicle> linkedList = new LinkedList<>(vehicle1, vehicle2, vehicle3);
		
		System.out.println(linkedList);
		
		System.out.println("Number of elements in linkedList: " + linkedList.size());
		
		LinkedList<Integer> integerLinkedList = new LinkedList<>(1,2,3);
		System.out.println(integerLinkedList);
		
	}
}
