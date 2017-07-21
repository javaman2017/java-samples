package interfaces;

public class Processor {
	
	void processValue(String name, Value value){
		System.out.println("Processing " + name + " with value " + value.val);
	}

	void processValues(String[] names, Lookup table){
		for(int i = 0; i < names.length; i++){
			Value value = table.find(names[i]);
			if(value != null){
				processValue(names[i],value);
			} else {
				System.out.println(names[i] + " not found in table");
			}
		}
	}
	
	public static void main(String[] args) {
		Processor processor = new Processor();
		
		String[] names = new String[]{"Tom","Dick","Harry"};
		Object[] values = new Object[] {1, 2, 3};
		MutableLookup table = new SimpleMutableLookup(names,values);
		
		System.out.println("Try to find Tom, Dick and Harry in the table");
		String[] queryNames = new String[] {"Tom","Dick","Harry"};
		processor.processValues(queryNames,table);
		
		System.out.println();
		System.out.println("Try to add a new name/value pair");
		table.add("Mike","4");
		queryNames = new String[] {"Tom","Dick","Harry","Mike"};
		processor.processValues(queryNames,table);
		
		System.out.println();
		System.out.println("Try to add two more new name/value pairs");
		table.add("Gerry","5");
		table.add("Martin","6");
		queryNames = new String[] {"Tom","Dick","Harry","Mike","Gerry","Martin"};
		processor.processValues(queryNames,table);
		
		System.out.println();
		System.out.println("Remove Mike, Gerry and Martin from the table");
		queryNames = new String[] {"Tom","Dick","Harry","Mike","Gerry","Martin"};
		table.remove("Mike");
		table.remove("Gerry");
		table.remove("Martin");
		processor.processValues(queryNames,table);
		
	}

}
