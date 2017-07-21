package interfaces;

public interface Lookup {
	/** Return the value associated with the name, or 
	 * null is there is no such value
	 */
	Value find(String name);

}
