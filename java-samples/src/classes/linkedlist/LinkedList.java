package classes.linkedlist;

import classes.vehicles.Vehicle;

public class LinkedList {
	public Object value;
	public LinkedList next;
	
	LinkedList(Object value, LinkedList next){
		this.value = value;
		this.next = next;
	}
	
	LinkedList(Object value){
		this(value,null);
	}
	
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle("Tom");
		vehicle1.currentSpeed = 10;
		vehicle1.currentDirection = 1;
		
		Vehicle vehicle2 = new Vehicle("Dick");
		vehicle2.currentSpeed = 20;
		vehicle2.currentDirection = -1;
		
		Vehicle vehicle3 = new Vehicle("Harry");
		vehicle3.currentSpeed = 30;
		vehicle3.currentDirection = 0;
		
		LinkedList tail = new LinkedList(vehicle3);
		LinkedList node2 = new LinkedList(vehicle2,tail);
		LinkedList head = new LinkedList(vehicle1,node2);
	}
}
