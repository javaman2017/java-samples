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
        return new StringBuilder().append('#')
                    .append(quote).append('#').toString();
    }
    
    public static void replace(StringBuilder str, char oldChar, char newChar) {
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == oldChar)
                str.setCharAt(i, newChar);
    }
    
    public static String sqrtInt(int i) {
        StringBuilder buf = new StringBuilder();
        
        buf.append("sqrt(").append(i).append(')');
        buf.append(" = ").append(Math.sqrt(i));
        return buf.toString();
    }
    
    public static StringBuilder addDate(StringBuilder buf) {
        String now = new java.util.Date().toString();
        buf.insert(0,now).insert(now.length(), ": ");
        return buf;
    }
    
    public static StringBuilder remove(StringBuilder buf, int pos, int cnt) {
        if (pos < 0 || cnt < 0 || pos + cnt > buf.length())
            throw new IndexOutOfBoundsException();
        
        int leftover = buf.length() - (pos + cnt);
        if (leftover == 0) {    //a simple truncation
            buf.setLength(pos);
            return buf;
        }
        
        char[] chrs = new char[leftover];
        buf.getChars(pos + cnt, buf.length(), chrs, 0);
        buf.setLength(pos);
        buf.append(chrs);
        return buf;
    }
    
    public static String convertToCommaSequence(String numStr) {
        if (numStr == null || numStr.length() == 0)
            throw new IllegalArgumentException();
        
        int len = numStr.length();
        if (len <= 3)
            return numStr;
        
        String DELIMATOR = ",";
        StringBuilder buf = new StringBuilder(numStr);
      
        buf.insert(len - 3, DELIMATOR);
        int leftover = buf.length() - 4;
        for(int i = buf.length() - 7; leftover > 3 && i > 0; i-=3) {
            buf.insert(i, DELIMATOR);
            leftover = buf.length() - i;
        }
        
        return buf.toString();
    }
    
    public static void main(String[] args) {       
       String s = "Il a dit #Bonjour!# #Bonjour!#";
       String[] tokens = StringUtils.delimitedString("Il a dit #Bonjour!# #Bonjour!# #Bonjour!# #J'e ma pelle#",'#','#');
       for(String token: tokens)
           System.out.println(token);
       System.out.println();
       
       List<Long> runningTimes = new ArrayList<>();
       
       String quote = "To be or not to be";
       long start = 0;
       long elapsedTime = 0;
       for(int j = 0; j < 10000; j++) {
           start = System.nanoTime();
           for(int i = 0; i < 10000; i++)
               hashedQuote(quote);
           elapsedTime = System.nanoTime() - start;
           runningTimes.add(elapsedTime);
       }
       
       double totalRunningTime = 0;
       for(long rt: runningTimes)
           totalRunningTime += rt;
       System.out.println("Average running time of 10,000 calls to hashQuote for 10,000 iterations: " + 
                          (totalRunningTime/runningTimes.size()));
       
       StringBuilder str = new StringBuilder("abc");
       StringUtils.replace(str,'c','b');
       System.out.println(str);
       
       System.out.println(sqrtInt(2));
       
       StringBuilder logMsg = new StringBuilder("Initialised application");
       System.out.println(addDate(logMsg));
       
       StringBuilder buf = new StringBuilder("Tom, Dick and Harry");
       System.out.println(buf);
       System.out.println("Harry has to go: " + remove(buf,14,5));
       
       String[] numStrs = {"1","12","123","1234","12345","123456","1234567","12345678","123456789","987654321989"};
       for(String numStr : numStrs)
           System.out.println("Old numStr: " + numStr + ", new numStr: " + convertToCommaSequence(numStr));
      
    }
}
