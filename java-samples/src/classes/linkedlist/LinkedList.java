package classes.linkedlist;

import classes.vehicles.Vehicle;

public class LinkedList {
	private Object value;
	private LinkedList next;
	
	public LinkedList(Object value, LinkedList next){
		this.value = value;
		this.next = next;
	}
	
	public LinkedList(Object value){
		this(value,null);
	}
	
	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "LinkedList [value=" + value + ", next=" + next + "]";
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public LinkedList getNext() {
		return next;
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
		
		LinkedList tail = new LinkedList(vehicle3);
		LinkedList node2 = new LinkedList(vehicle2,tail);
		LinkedList head = new LinkedList(vehicle1,node2);
		
		System.out.println(head);
		
	}
}
