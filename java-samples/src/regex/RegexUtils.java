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
    
    public static String replaceWithNextLargestNumber(String input) {
        Pattern pat = Pattern.compile("[-+]?[0-9]+");
        Matcher matcher = pat.matcher(input);
        StringBuffer result = new StringBuffer();
        boolean found;
        while((found = matcher.find())) {
            String numStr = matcher.group();
            int num = Integer.parseInt(numStr);
            String plusOne = Integer.toString(num + 1);
            matcher.appendReplacement(result, plusOne);
        }
        matcher.appendTail(result);
        
        return result.toString();
    }


    public static void main(String[] args) {
        String input1 = "The sun shines so bright. The sun is high in the sky";
        
        System.out.println("Before a replace operation: " + input1);
                
        System.out.println("After a replace operation: " + replaceAll(input1,"sun"));
        
        String input2 = "The numbers are 19 and 131";
        
        System.out.println("Before a replace operation: " + input2);
                
        System.out.println("After a replace operation: " + replaceWithNextLargestNumber(input2));
        

    }
}
