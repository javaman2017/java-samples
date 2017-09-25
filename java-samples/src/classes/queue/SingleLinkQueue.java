package classes.queue;

public class SingleLinkQueue<E> {
    private Cell<E> head;
    private Cell<E> tail;
    
    public void add(Cell<E> item){
        if(!(item instanceof Cell))
            throw new IllegalArgumentException("Cannot add " +item.getClass().getName() 
                                             + " to " + this.getClass().getName());
        if (tail == null){
            tail = item;
            head = tail;
        } else {
            if (head == null){
                tail.setNext(head);
            } else {
                head.setNext(item);
            }
            head = item;
        }
    }
    
    public Cell<E> remove(){
        if (tail == null)
            throw new RuntimeException("SingleLinkQueue is empty");
        
        Cell<E> cell = null;
        if (tail != null && head != null && !head.equals(tail)){
            cell = head;
            Cell<E> preHead = findPreHead(tail);
            preHead.setNext(null);
            head = preHead;
        } else {
            cell = tail;
            tail = null;
        }
        
        return cell;
    }
    
    private Cell<E> findPreHead(Cell<E> cell){
       Cell<E> preHead = null;
       if (cell == null){
           preHead = null;
       } else {
           Cell<E> next = cell.getNext();
           if (next == null)
               preHead = cell;
           else {
               if (next.getElement().equals(head.getElement()))
                   preHead =  cell;
               else 
                   preHead = findPreHead(cell.getNext());
           }
       }
       
       return preHead;    
    }
    
    public boolean isEmpty(){
        return tail == null;
    }
    
    public String toString() {
        if (tail == null)
            return "[]";
        
        String[] elements = elements(tail).split(",");
        String desc = "";
        for(int i = elements.length - 1; i >= 0; i--)
            desc += elements[i] + "\n";
        return desc;
    }
    
    private String elements(Cell<E> cell){
        if (cell == null)
            return "";
        
        String desc;
        if (cell.getElement() != null)
         desc = (String)cell.getElement() + ",";
        else 
         desc = "";
        
        if (cell.getNext() != null)
            desc += elements(cell.getNext());
    
        return desc;
    }
 
    public static void main(String[] args){
        
        Cell<String> item1 = new Cell<>("Tom");
        Cell<String> item2 = new Cell<>("Dick");
        Cell<String> item3 = new Cell<>("Harry");
        Cell<String> item4 = new Cell<>("Johnny");
        Cell<String> item5 = new Cell<>("Micky");
        
        SingleLinkQueue<String> singleLinkQueue = new SingleLinkQueue<>();
        singleLinkQueue.add(item1);
        singleLinkQueue.add(item2);
        singleLinkQueue.add(item3);
        singleLinkQueue.add(item4); 
        singleLinkQueue.add(item5);
        
        System.out.println(singleLinkQueue);
        
        while(!singleLinkQueue.isEmpty()){
            System.out.println("Removing element " + ((Cell)singleLinkQueue.remove()).getElement());
            System.out.println("Single Linked Queue is now: ");
            System.out.println(singleLinkQueue);
        }
     }
}
