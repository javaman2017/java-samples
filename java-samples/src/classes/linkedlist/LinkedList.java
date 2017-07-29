package classes.linkedlist;

import java.util.Arrays;

import classes.vehicles.Vehicle;

public class LinkedList {
	private static final int DEFAULT_SIZE= 10;
	private Node[] nodes = null;
	private int headIndex = 0;
	
	@Override
	public String toString() {
		return "LinkedList [nodes=" + Arrays.toString(nodes) + "]";
	}

	public LinkedList(){
		nodes = new Node[DEFAULT_SIZE];
	}
	
	public LinkedList(Node... nodes){
		if (nodes == null || nodes.length == 0)
			throw new IllegalArgumentException("Please supply a node list");
		this.nodes = nodes;
	}
	
	public boolean add(Node node){
		if (headIndex + 1 > nodes.length){
			Node[] tempNodeArray = new Node[2 * nodes.length];
			System.arraycopy(nodes, 0, tempNodeArray, nodes.length, nodes.length);
			nodes = tempNodeArray;
		}
		
		boolean result = false;
		if (headIndex > 0){
			Node currentHead = nodes[headIndex];
			Node oldHead = new Node(currentHead,node);
			nodes[headIndex] = oldHead;
			nodes[headIndex++] = node;
			result = true;
		} else {
			nodes[headIndex++] = node;
			result = true;
		}
		
		return true;
	}

	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Tom");
		vehicle1.setCurrentSpeed(10);
		vehicle1.setCurrentDirection(1);
		
		Vehicle vehicle2 = new Vehicle("Dick");
		vehicle2.setCurrentSpeed(20);
		vehicle2.setCurrentDirection(-1);
		
		Vehicle vehicle3 = new Vehicle("Harry");
		vehicle3.setCurrentSpeed(30);
		vehicle3.setCurrentDirection(0);
		
		Node tail = new Node(vehicle3);
		Node node2 = new Node(vehicle2,tail);
		Node head = new Node(vehicle1,node2);

		LinkedList linkedlist = new LinkedList();
		linkedlist.add(head);
		linkedlist.add(node2);
		linkedlist.add(tail);
		
		System.out.println(linkedlist);
		
	}
}
