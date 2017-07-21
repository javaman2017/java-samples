package generics;

public interface Lookup<T> {
	/** Return the value associated with the name, or 
	 * null is there is no such value
	 */
	T find(String name);

}
