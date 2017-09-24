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
                switch (c) {
                    case '\n':
                        result += "\\n";
                        break;
                    case '\t':
                        result += "\\t";
                        break;
                    case '\b':
                        result += "\\b";
                        break;
                    case '\r':
                        result += "\\r";
                        break;
                    case '\f':
                        result += "\\f";
                        break;
                    case '\\':
                        result += "\\";
                        break;
                    case '\'':
                        result += "\'";
                        break;
                    case '\"':
                        result += "\"";
                        break;
                    default:
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
