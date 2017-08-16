package classes.object;

public class Property {
    Object prop;

    public Property(Object prop) {
        this.prop = prop;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((prop == null) ? 0 : prop.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Property))
            return false;
        Property other = (Property) obj;
        if (prop == null) {
            if (other.prop != null)
                return false;
        } else if (!prop.equals(other.prop))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Property [prop=" + prop + "]";
    }
}
