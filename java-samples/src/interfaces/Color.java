package interfaces;

public class Color {
    private final String color;

    public Color(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return  color;
    }   
}