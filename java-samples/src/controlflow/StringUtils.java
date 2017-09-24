package controlflow;

public class StringUtils {

    /**
     * Returns a string with all special characters replaced with their language
     * equivalents i.e. if special-char occurs in str its replaced with
     * \special-char
     */
    static String replaceSpecialChars(String str) {
        String result = "";

        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '\n') {
                    result += "\\n";
                } else if (c == '\t' ) {
                    result += "\\t";
                } else if (c == '\b' ) {
                    result += "\\b";
                } else if (c == '\r' ) {
                    result += "\\r";
                } else if (c == '\f' ) {
                    result += "\\f";
                } else if (c == '\\' ) {
                    result += "\\";
                } else if (c == '\'' ) {
                    result += "\\'";
                } else if (c == '\"' ) {
                    result += "\"";
                } else {
                    result += c;
                } 
            }
        } else {
            result = str;
        }

        return result;
    }

    public static void main(String[] args) {
        String testStr = "abc\ndef\r\t";
        System.out.println("Original String: " + testStr);
        System.out.println("Changed  String: " + StringUtils.replaceSpecialChars(testStr));
    }
}
