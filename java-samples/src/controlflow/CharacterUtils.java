package controlflow;

public class CharacterUtils {
    
    static void printBetweenChars(char start, char finish){
        for(int i = start; i <= finish; i++)
            System.out.println("char: " + (char)i);
    }

    public static void main(String[] args) {
        CharacterUtils.printBetweenChars('a', 'h');

    }

}
