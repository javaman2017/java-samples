package classes.object;

import java.lang.reflect.Field;

public class TypeTokens {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("Class token for o: " + o.getClass());
        
        Property p = new Property("abc");
        System.out.println("Class token for Property: " + p.getClass());
        System.out.println("TypeName for Property: " + p.getClass().getTypeName());
        System.out.println("Generic string for Property: " + p.getClass().toGenericString());
        System.out.println("Constructors for Property: " + p.getClass().getConstructors());
        System.out.println("Declared fields for Property: ");
        Field[] fields = p.getClass().getFields();
        for(int i = 0; i < fields.length; i++)
            System.out.println("Field: " + fields[i].getName());




    }

}
