package classes.linkedlist;

public class ObjectNotFoundException extends Exception {
    public final Object value;
    
    public ObjectNotFoundException(Object value){
        super("No Node found with value \"" + value + " found" );
        this.value = value;
    } 
}
