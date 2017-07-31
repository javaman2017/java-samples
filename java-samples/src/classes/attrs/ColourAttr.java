package classes.attrs;

public class ColourAttr extends Attr {
	private ScreenColour myColour; // the decoded colour

	public ColourAttr(String name, Object value) {
		super(name, value);
		//decode colour
	}
	
	public ColourAttr(String name){
		this(name,"transparent");
	}
	
	public ColourAttr(String name, ScreenColour value) {
		super(name, value.toString());
		myColour = value;
	}

	public Object setValue(Object newValue) {
		// do the superclass's setValue work first
		Object retVal = super.setValue(newValue);
		//decoded colour
	    return retVal;
	}
	
	public ScreenColour setValue(ScreenColour newValue) {
		// do the superclass's setValue work first
		super.setValue(newValue.toString());
		ScreenColour oldValue = myColour;
		myColour = newValue;
	    return oldValue;
	}

	public ScreenColour getMyColour() {
		return myColour;
	}
	
	
	protected void decodeColour(){
		if(getValue() == null)
			myColour = null;
		else
			myColour = new ScreenColour(getValue());
	}
}
