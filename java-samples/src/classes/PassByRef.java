package classes;

import classes.body.Body;

public class PassByRef {

	public static void main(String[] args) {
		Body sirius = new Body("Sirius");
		
		System.out.println("before: " + sirius);
		commonName(sirius);
		System.out.println("after: " + sirius);
	}
	
	public static void commonName(Body bodyRef){
		bodyRef.name = "Dog Star";
		bodyRef = null;
	}

}
