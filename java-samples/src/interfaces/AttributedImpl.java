package interfaces;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class AttributedImpl implements Attributed, Iterable<Attributed.Attr> {
    protected Map<String,Attributed.Attr> attrTable = new HashMap<>();

    @Override
    public void add(Attributed.Attr newAttr) {
        attrTable.put(newAttr.getName(),newAttr);
    }

    @Override
    public Attr find(String attrName) {
        return attrTable.get(attrName);
    }

    @Override
    public Attr remove(String attrName) {
        return attrTable.remove(attrName);
    }

    @Override
    public Iterator<Attributed.Attr> attrs() {
        return attrTable.values().iterator();
    }

    @Override
    public Iterator<Attributed.Attr> iterator() {
        return attrs();
    }
    
    public void replaceValue(String name, Object newValue) 
        throws NoSuchAttributeException {
        Attr attr = find(name);
        if(attr == null)
            throw new NoSuchAttributeException(name);
        attr.setValue(newValue);
    }
}
