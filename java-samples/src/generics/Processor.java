package generics;

public class Processor {

	void processValues(String[] names, Lookup<? extends Number>table){
		for(int i = 0; i < names.length; i++){
			Object value = table.find(names[i]);
			if(value != null)
				processValue(names[i],value);
		}
	}
	
	private void processValue(String name, Object value) {
		System.out.println("Processed name: " + name + " with value: " + value);
		
	}

	public static void main(String[] args) {
		Processor processor = new Processor();
		IntegerLookup table = new IntegerLookup(new String[]{"One","Two"}, new Integer[]{1,2});
		String[] names = {"One","Two"};
		processor.processValues(names,table);
	}

}
