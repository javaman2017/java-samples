package classes.linkedlist;

import java.util.Arrays;

import classes.vehicles.Vehicle;

public class LinkedList {
	private static final int DEFAULT_LENGTH= 10;
	private Node[] nodes = null;
	private int size = 0;
	
	@Override
	public String toString() {
		return "LinkedList [nodes=" + Arrays.toString(nodes) + "]";
	}

	public LinkedList(){
		nodes = new Node[DEFAULT_LENGTH];
	}
	
	public LinkedList(Node... nodes){
		this.nodes = nodes;
	}
	
	public boolean add(Node node){
		boolean result = false;
		if (size > 0){
			Node currentHead = nodes[size];
			Node oldHead = new Node(currentHead,node);
			nodes[size] = oldHead;
			nodes[size++] = node;
			result = true;
		} else {
			nodes[size++] = node;
			result = true;
		}
		
		return true;
	}
	
	public int size(){
		return size;
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
		
		Node tail = new Node(vehicle3);
		Node node2 = new Node(vehicle2,tail);
		Node head = new Node(vehicle1,node2);

		LinkedList linkedList = new LinkedList();
		linkedList.add(head);
		linkedList.add(node2);
		linkedList.add(tail);
		
		System.out.println(linkedList);
		
		System.out.println("Number of elements in linkedList: " + linkedList.size());
		
	}
}
