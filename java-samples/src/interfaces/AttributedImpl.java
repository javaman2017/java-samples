package interfaces;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

import classes.attrs.Attr;

public class AttributedImpl implements Attributed, Iterable<Attr> {
    protected Map<String,Attr> attrTable = new HashMap<>();

    @Override
    public void add(Attr newAttr) {
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
    public Iterator<Attr> attrs() {
        return attrTable.values().iterator();
    }

    @Override
    public Iterator<Attr> iterator() {
        return attrs();
    }
}
