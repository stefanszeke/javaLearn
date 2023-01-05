public class AsArgs {
    interface StringFunc {
        String func(String n);
    }

    public static void main(String[] args) {
        String inputStr ="Lambda Expressions Expand Java";
        
        System.out.println("Input string: " + inputStr);
        
        StringFunc reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
            return result;
        };

        // pass reverse to changeStr()
        String outputStr1 = changeStr(reverse, inputStr);

        System.out.println("Output string 1: " + outputStr1);
        
        // pass a lambda expression to changeStr()
        String outputStr2 = changeStr((str) -> str.replace(' ', '-'), inputStr);
        
        System.out.println("Output string 2: " + outputStr2);

        // pass a lambda expression to changeStr()
        String  outputStr3 = changeStr((str) -> {
            String result = "";
            char ch;
            for(int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inputStr);

        System.out.println("Output string 3: " + outputStr3);

        String outputStr4 = changeStr(a -> a.substring(0,6) + a.substring(25), inputStr);

        System.out.println("Output string 4: " + outputStr4);
    }

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }
}
