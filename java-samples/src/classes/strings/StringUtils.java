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
    
    public static void main(String[] args) {       
       String s = "Il a dit #Bonjour!# #Bonjour!#";
       String[] tokens = StringUtils.delimitedString("Il a dit #Bonjour!# #Bonjour!# #Bonjour!# #J'e ma pelle#",'#','#');
       for(String token: tokens)
           System.out.println(token);
    }
}
