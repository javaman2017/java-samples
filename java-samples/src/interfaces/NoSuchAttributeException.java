package interfaces;

public class NoSuchAttributeException extends Exception {
    public final String attrName;
    
    public NoSuchAttributeException(String name){
        super("No attribute named \"" + name + "\" found\n");
        attrName = name;
    }
}
