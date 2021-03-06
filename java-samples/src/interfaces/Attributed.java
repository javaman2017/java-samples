package interfaces;

public interface Attributed {
    void add(Attr newAttr);
    Attr find(String attrName);
    Attr remove(String attrName);
    java.util.Iterator<Attr> attrs();
    
    static class Attr {
        private final String name;
        private Object value = null;
        
        public Attr(String name) {
            this.name = name;
        }

        public Attr(String name, Object value) {
            this.name = name;
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public Object setValue(Object newValue) {
            Object oldVal = value;
            value = newValue;
            return oldVal;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + "='" + value + "'";
        }
    }
}
