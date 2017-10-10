package classes.strings;

public class StringUtils {
    
    public static String delimitedString(String from, char start, char end){
        int startPos = from.indexOf(start);
        int endPos = from.lastIndexOf(end);
        if(startPos == -1)
            return null;
        else if (endPos == -1)
            return from.substring(startPos);
        else
            return from.substring(startPos, endPos + 1);
    }

    public static void main(String[] args) {
       System.out.println(StringUtils.delimitedString("Il a dit #Bonjour!#",'#','#'));
    }
}
