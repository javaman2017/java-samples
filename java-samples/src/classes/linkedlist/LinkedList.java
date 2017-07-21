package classes.linkedlist;

import classes.vehicles.Vehicle;

public class LinkedList {
	public Object value;
	public LinkedList next;
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle();
		vehicle1.currentSpeed = 10;
		vehicle1.currentDirection = 1;
		vehicle1.ownerName = "Tom";
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.currentSpeed = 20;
		vehicle2.currentDirection = -1;
		vehicle2.ownerName = "Dick";
		
		Vehicle vehicle3 = new Vehicle();
		vehicle3.currentSpeed = 30;
		vehicle3.currentDirection = 0;
		vehicle3.ownerName = "Harry";
		
		LinkedList vehicles = new LinkedList();
		
		vehicles.value = vehicle1;
		vehicles.next = new LinkedList();
		
		vehicles.next.value = vehicle2;
		vehicles.next.next = new LinkedList();
		vehicles.next.next.value = vehicle3;
	}
}
