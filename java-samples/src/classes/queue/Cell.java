package classes.queue;

public class Cell {
    private Cell next;
    private Object element;
    
    public Cell(Object element) {
        super();
        this.element = element;
    }
    
    public Cell(Cell next, Object element) {
        super();
        this.next = next;
        this.element = element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}