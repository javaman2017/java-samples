package interfaces;

public interface GraphicalComponent {
    void draw();            // render on default device
    void draw(Device d);    // render on 'd'
    void rotate(int degrees);
    void fill(Color c);
}
