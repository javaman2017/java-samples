package interfaces;

import java.util.Iterator;

import classes.attrs.Attr;
import classes.body.Body;

public class AttributedBody extends Body implements Attributed {
    
    private AttributedImpl attrImpl = new AttributedImpl();
    
    public AttributedBody(){
        super();
    }

    public AttributedBody(String name, Body orbitsAround) {
        super(name, orbitsAround);
    }
    
    public AttributedBody(String name) {
        super(name);
    }
    
    // Forward all Attributed methods to the attrImpl object

    @Override
    public void add(Attr newAttr) {
      attrImpl.add(newAttr);
    }

    @Override
    public Attr find(String attrName) {
        return attrImpl.find(attrName);
    }

    @Override
    public Attr remove(String attrName) {
        return attrImpl.remove(attrName);
    }

    @Override
    public Iterator<Attr> attrs() {
        return attrImpl.attrs();
    }

    public static void main(String[] args) {
        AttributedBody sun = new AttributedBody("Sun");
        sun.add(new Attr("Temperature",3000));
        sun.add(new Attr("Composition","Plasma"));
        sun.add(new Attr("Number of orbiters",9));
        
        sun.attrs()
           .forEachRemaining(System.out::println);
    }

}
