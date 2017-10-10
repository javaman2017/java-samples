package generics;

import java.util.List;
import java.util.ArrayList;

public class WildCard {
    
    static <T> List<T> passThrough(List<T> list){
        return list;
    }
    
    static <T> List<T> merge(List<T> src, List<T> dest){
        return null;
    }

    public static void main(String[] args) {
        List<?> list1 = new ArrayList<String>();
        WildCard.passThrough(list1);
        List<?> list2 = new ArrayList<String>();
        //WildCard.merge(list1, list2);
        
        List<?>[] list3 = new List<?>[1];
        System.out.println("list3[0]: " + list3[0]);
        
        List<?> list4 = new ArrayList<Number>();
        ((List<String>)list4).add("abc");
        ((List<Integer>)list4).add(3);
        System.out.println(list4.get(0));
        System.out.println(list4.get(1));

    }

}
