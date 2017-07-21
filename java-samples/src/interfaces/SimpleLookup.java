package interfaces;

public class SimpleLookup implements Lookup {
	protected String[] names;
	protected Object[] values;
	
	public SimpleLookup(String[] names, Object[] values){
		this.names = names;
		this.values = values;
	}
	
	@Override
	public Value find(String name) {
		for(int i = 0; i < names.length; i++){
			if(names[i].equals(name))
			{
				Value value = new Value();
				value.index = i;
				value.val = values[i];
				return value;
			}
		}
		return null;  //not found
	}

}
