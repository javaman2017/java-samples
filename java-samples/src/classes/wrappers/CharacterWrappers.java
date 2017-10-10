package classes.wrappers;

public class CharacterWrappers {

    public static void main(String[] args) {
        char[] chars = {
          '1',
          'a',
          '?',
        };

        for(char c: chars)
            System.out.println("char: " + c + 
                               ", isLetterOrDigit: " + Character.isLetterOrDigit(c));
        System.out.println();
        System.out.println();
        
        char[] letters = {
                'a',
                'b',
                'c',
                'd',
        };
        
        int radix = 16;
        for(char letter : letters)
            System.out.println("letter: " + letter + " has value: " + Character.digit(letter, radix)  
            + " in radix " + radix);
        System.out.println();
        System.out.println();
        
        int N = 100;
        for(int i = 0; i < N; i++)
            System.out.println("i: " + i + " is char: " + Character.forDigit(i,21));
        System.out.println();
        System.out.println();       
        
//        for(int i = 0; i < Integer.MAX_VALUE; i++){
//           System.out.println("i: " + i +
//                    " needs " + Character.charCount(i) + " to encode it");
//        }
//        System.out.println();
//        System.out.println();  
        
        char start = 'a';
        int i = 0;
        while(i <= N){
            System.out.println(start++);
            i++;
        }
    }

}
