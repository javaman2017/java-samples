package classes.queue;

public class SingleLinkQueue {
    private Cell head;
    private Cell tail;
    
    public void add(Object item){
        if(!(item instanceof Cell))
            throw new IllegalArgumentException("Cannot add " +item.getClass().getName());
        
        Cell cell = (Cell)item;
        if (tail == null){
            tail = cell;
            head = tail;
        } else {
            if (head == null){
                tail.setNext(head);
            } else {
                head.setNext(cell);
            }
            head = cell;
        }
    }
    
    @Override
    public String toString() {
        return element(tail);
    }
    
    private String element(Cell cell){
        String desc = (String)cell.getElement() + "\n";
        if (cell.getNext() != null)
            desc += element(cell.getNext());
        return desc;
    }
 
    public static void main(String[] args){
        
        Cell item1 = new Cell("Tom");
        Cell item2 = new Cell("Dick");
        Cell item3 = new Cell("Harry");
        Cell item4 = new Cell("Micky");
        
        SingleLinkQueue singleLinkQueue = new SingleLinkQueue();
        singleLinkQueue.add(item1);
        singleLinkQueue.add(item2);
        singleLinkQueue.add(item3);
        singleLinkQueue.add(item4);   
        
        System.out.println(singleLinkQueue);
    }
}
