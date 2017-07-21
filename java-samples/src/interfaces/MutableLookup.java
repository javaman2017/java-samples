package interfaces;

public interface MutableLookup extends Lookup {
	/** Adds a name/value pair to the Lookup table
	 */
	boolean add(String name, Object value);
	
	/** Removes a name/value pair from the Lookup table
	 */
	boolean remove(String name);
}
