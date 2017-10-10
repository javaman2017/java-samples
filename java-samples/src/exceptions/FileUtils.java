package exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {
    
    public static boolean searchFor(String file, String word)
        throws IOException {
        InputStream input = null;
        try{
            input = new FileInputStream(file);
            byte[] bytes = new byte[input.available()];
            while(input.read(bytes) != -1){
                String line = new String(bytes);
                String[] words = line.split(" ");
                for(String w : words)
                    if(word.equals(w))
                        return true;
            }    
            
            return false;
                
        } finally {
            if (input != null)
                input.close();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Found little in Test.txt: " +
                        FileUtils.searchFor("/home/user/git/java-samples/java-samples/src/exceptions/Test.txt", "little"));
            System.out.println("Found Car in Test.txt: " +
                    FileUtils.searchFor("/home/user/git/java-samples/java-samples/src/exceptions/Test.txt", "Car"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
