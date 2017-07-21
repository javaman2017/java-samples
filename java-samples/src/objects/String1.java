package objects;

public class String1 {

	public static void main(String[] args) {
		String name = "Petronius";
		Object obj = name;
		name = (String)obj;
		
		System.out.println(name);
		
		Integer i = (Integer)obj;

	}

}
