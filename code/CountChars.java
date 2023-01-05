import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        String str = "Hello World";

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        System.out.println(charMap);
        
        // remove space

        charMap.remove(' ');
        // iterate over map
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //

    }
}
