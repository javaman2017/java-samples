package interfaces;

import java.util.Arrays;

public class SimpleMutableLookup extends SimpleLookup implements MutableLookup {
	
	public SimpleMutableLookup(String[] names, Object[] values){
		super(names,values);
	}

	@Override
	public boolean add(String name, Object value) {
		boolean result;
		if(super.find(name) == null){		
			super.names = Arrays.copyOf(super.names,super.names.length + 1);
			super.names[super.names.length - 1] = name;
			
			super.values = Arrays.copyOf(super.values,super.values.length + 1);
			super.values[super.values.length - 1] = value;			
			result =  true;
		} else {
			result = false;
		}
			
		return result;
	}

	@Override
	public boolean remove(String name) {
		boolean result;
		Value value = super.find(name);
		if(value != null){	
			Object[] front;
			Object[] back;
			
			int len1 = super.names.length;
			front = Arrays.copyOfRange(super.names,0,value.index);
			back = Arrays.copyOfRange(super.names,value.index + 1,super.names.length);
			super.names = new String[len1 - 1];
			
			for(int i = 0; i < front.length; i++){
				super.names[i] = (String)front[i];
			}
			
			for(int i = 0; i < back.length; i++){
				super.names[i + front.length] = (String)back[i];
			}
			
			int len2 = super.values.length;
			front = Arrays.copyOfRange(super.values,0,value.index - 1);
			back = Arrays.copyOfRange(super.values,value.index + 1,super.values.length);
			super.values = new Object[len2 - 1];
			
			for(int i = 0; i < front.length; i++){
				super.values[i] = front[i];
			}
			
			for(int i = 0; i < back.length; i++){
				super.values[i + front.length] = back[i];
			}
						
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
