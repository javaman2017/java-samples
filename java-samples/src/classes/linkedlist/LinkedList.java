package classes.linkedlist;

import java.util.Arrays;

import classes.vehicles.Vehicle;

public class LinkedList {
	private Node[] nodes = null;
	
	@Override
	public String toString() {
		return "LinkedList [nodes=" + Arrays.toString(nodes) + "]";
	}

	public LinkedList(){
	}
	
	public LinkedList(Node... nodes){
		this.nodes = nodes;
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
		
		Node node3 = new Node(vehicle3);
		Node node2 = new Node(vehicle2,node3);
		Node node1 = new Node(vehicle1,node2);

		
		Node[] nodes = {node1,node2,node3};
		LinkedList linkedList = new LinkedList(nodes);
		
		System.out.println(linkedList);
		
	}
}
