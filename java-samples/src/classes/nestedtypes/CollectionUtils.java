package classes.nestedtypes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CollectionUtils {
    
    public static Iterator<Object> walkThrough(final Object[] objs){
        return new Iterator<Object>() {
            private int pos = 0;
            public boolean hasNext(){
                return (pos < objs.length);
            }
            
            public Object next() throws NoSuchElementException {
                if (pos >= objs.length)
                    throw new NoSuchElementException();
                return objs[pos++];
            }
            
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        String[] names = {"Tom", "Dick", "Harry"};
        Iterator<Object> iter = CollectionUtils.walkThrough(names);
      
        while(iter.hasNext())
            System.out.println("name: " + iter.next());

    }

}
