package classes.strings;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    
    public static String[] delimitedString(String from, char start, char end){
        List<String> dslist = new ArrayList<>();
        String s = "";
        char c;
        for(int i = 0; i < from.length(); i++){
              c = from.charAt(i);
              if (s.length() > 0){ // s.length() > 0 only when we are in a delimited string
                  s += c;
                  if (c == end){
                      dslist.add(s);
                      s = "";
                  }
              } else {
                  if (c == start)
                      s += c;
              }    
        }
        
        return dslist.toArray(new String[dslist.size()]);   
    }
    
    public static String hashedQuote(String quote) {
        return '#' + quote + '#';
    }
    
    
    
    public static void main(String[] args) {       
       String s = "Il a dit #Bonjour!# #Bonjour!#";
       String[] tokens = StringUtils.delimitedString("Il a dit #Bonjour!# #Bonjour!# #Bonjour!# #J'e ma pelle#",'#','#');
       for(String token: tokens)
           System.out.println(token);
       System.out.println();
       
       String quote = "To be or not to be";
       long start = System.nanoTime();
       for(int i = 0; i < 10000; i++)
           hashedQuote(quote);
       long elapsedtime = System.nanoTime() - start;
       System.out.println("Elapsed time to hash quote 10000 times: " + elapsedtime);
    }
}
