package classes.strings;

public class StringsAndThings {
    
    private static String[] table = {
          "a", "b", "c", "d", "e"
    }; //sorted array
    
    public static int countOccurrences(String str, char ch){
        int beginPos = str.indexOf(ch);
        if(beginPos < 0) // ch not in str
            return -1; 
        
        int occurrences = 0;
        for(char c : str.toCharArray())
            if(c == ch)
                ++occurrences;
        
        return occurrences;
    }
    
    public static int countOccurrences(String str1, String str2){
        int occurrences = 0;
        int start = 0;
        int index = 0;
        while((index = str1.indexOf(str2, start)) != - 1){
            ++occurrences;
            start = index + str2.length();
        }
        
        return occurrences;
    }
    
    public static int position(String key){
        int lo = 0;
        int hi = table.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(table[mid]);
            if(cmp == 0)    //found it!
                return mid;
            else if (cmp < 0) // search lower part
                hi = mid - 1;
            else              // search upper part
                lo = mid + 1;
        }
        
        return - 1; // not found
    }

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuv";
        System.out.println(str1);
        System.out.println(str1.subSequence(1, 3));
        
        System.out.println("index of i in alphabet: " + str1.indexOf("i"));
        
        String str2 = "Fee Fi Fo Fum";
        System.out.println("Start index of Fum: "+ str2.indexOf("Fo"));
        
        String str3 = "akbbaaaabkbbaaabbababkiiciiicciik";
        System.out.println("k occurs in " + str3 + " " 
                        + StringsAndThings.countOccurrences(str3, 'k') + " times");
        
        String str4 = "abccatdefcttatmaccatatnxyz";
        System.out.println(str4 + " contains " + StringsAndThings.countOccurrences(str4, "cat") + " cats");
        
        StringBuilder sb = new StringBuilder("abc");
        String str5 = "abc";
        System.out.println(str5.contentEquals(sb));
        
        System.out.println("Index of f in table: " + StringsAndThings.position("f"));
        
        
        
    }

}
