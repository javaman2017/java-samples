package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplace {

    public static void main(String[] args) {
        String input = "The sun shines so bright. The sun is high in the sky";
        
        System.out.println("Before a replace operation: " + input);
        
        Pattern pat = Pattern.compile("sun");
        Matcher matcher = pat.matcher(input);
        StringBuffer result = new StringBuffer();
        boolean found;
        while((found = matcher.find())) // continue to match as long as there are matches to be made
            matcher.appendReplacement(result, "moon");
        matcher.appendTail(result);
        
        System.out.println("After a replace operation: " + result);

    }

}
