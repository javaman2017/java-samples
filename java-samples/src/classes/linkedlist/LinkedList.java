package classes.linkedlist;

import classes.vehicles.Vehicle;

public class LinkedList<E> {
	private static final int DEFAULT_LENGTH= 10;
	private Node<E>[] nodes;
	private int size;
	
	@Override
	public String toString() {
	    if(nodes.length > 0)
	        return this.nodes[0].toString();
	    else 
	        return "";
	}

	public LinkedList(){
		this.nodes = new Node[DEFAULT_LENGTH];
	}
	
    public LinkedList(E... elements){
        int length = elements.length;
		this.nodes = new Node[length];
		for(int i = 0; i < length; i++)
		    this.add(elements[i]);
	}
	
	public boolean add(E newElement){
		boolean result = false;
        Node newNode = new Node();
        newNode.value = newElement;
		if (size > 0){
			Node headNode = nodes[size - 1];
			headNode.next = newNode;
			nodes[size++] = newNode;
			result = true;
		} else {
			nodes[size++] = newNode;
			result = true;
		}
		
		return result;
	}
	
	public Node<E> find(E value) throws ObjectNotFoundException {
	    Node<E> targetNode = null;
	    for(Node<E> n : nodes)
	        if (n.value.equals(value))
	            targetNode =  n;
	    
	    if (targetNode == null)
	        throw new ObjectNotFoundException(value);
	    else 
	        return targetNode;
	}
	
	public int size(){
		return size;
	}
	
    public static class Node<E> {
	    E value;
	    Node<E> next;
        
        @Override
        public String toString() {
            return "Node [value=" + value + ", next=" + next + "]";
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
		
		LinkedList<Vehicle> vllist = new LinkedList<>(vehicle1, vehicle2, vehicle3);
		
		System.out.println(vllist);
		
		System.out.println("Number of elements in linkedList: " + vllist.size());
		
		LinkedList<Integer> illist = new LinkedList<>(1,2,3);
		System.out.println(illist);
		
		try {
            System.out.println(illist.find(3));
        } catch (ObjectNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
}
