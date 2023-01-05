public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello World";
        String subStr = str2.substring(1, 5);
        String textBlock = """
            This is a text block
            It can contain multiple lines
            and it is very useful
            no need to use \\n for new lines
            """;


        System.out.println("subStr: " + subStr);

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.compareTo(str2)" + str1.compareTo(str2));
        System.out.println(str2.lastIndexOf("ld"));
        System.out.println(str2.lastIndexOf("W"));

        System.out.println("one g in dog: " + onlyOneInstance("dog","g"));
        System.out.println("one w in dog: " + onlyOneInstance("dog","w"));
        System.out.println("one cat in cat cat cat: " + onlyOneInstance("cat cat cat","cat"));
        System.out.println("one A in ABCDEFGHA: " + onlyOneInstance("ABCDEFGHA","A"));

        System.out.println();

        compareLength(str1, str2);
        compareLength("dogs", "cat");
        compareLength("apple", "mango");

        System.out.println();

        System.out.println("textBlock: " + textBlock);

        
    }

    static boolean onlyOneInstance(String str, String str2) {
        if(str.indexOf(str2) == -1) {
            return false;
        }
        else if(str.indexOf(str2) == str.lastIndexOf(str2)) {
            return true;
        } 
        return false;
    }

    static void compareLength(String str1, String str2 ) {
        if(str1.length() > str2.length()) {
            System.out.println("["+str1+"]" + " is longer than " + "["+str2+"]" + " by " + (str1.length()-str2.length()) + " characters.");
        }
        else if(str1.length() < str2.length()) {
            System.out.println("["+str1+"]" + " is shorter than " + "["+str2+"]" + " by " + (str2.length()-str1.length()) + " characters.");
        }
        else {
            System.out.println("["+str1+"]" + " is the same length as " + "["+str2+"]" + " which is " + str1.length() + " characters.");
        }
    }
    
}
