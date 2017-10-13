package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    
    public static String replaceAll(String input,String regex) {
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(input);
        String result = matcher.replaceAll("moon");
        return result;
    }


    public static void main(String[] args) {
        String input = "The sun shines so bright. The sun is high in the sky";
        
        System.out.println("Before a replace operation: " + input);
        
        String result = replaceAll(input,"sun");
        
        System.out.println("After a replace operation: " + result);

    }
}
