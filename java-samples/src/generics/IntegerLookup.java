package generics;

public class IntegerLookup implements Lookup<Integer> {
	protected String[] names;
	protected Integer[] values;
	
	public IntegerLookup(String[] names, Integer[] values){
		this.names = names;
		this.values = values;
	}
	
	@Override
	public Integer find(String name) {
		for(int i = 0; i < names.length; i++){
			if(names[i].equals(name))
			return values[i];
		}
		return null;  //not found
	}

}
