public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello World";   
        System.out.println(checkString(str1, 'e'));
        System.out.println(checkString(str1, 'f'));
        System.out.println(checkString(str1, 'o'));
    }


    public static void stringToCharArray(String str) {
        char[] charArray = str.toCharArray();
    }

    public static String checkString(String str, char ch) {
        int indexOfChar = str.indexOf(ch);
        int lastIndexOfChar = str.lastIndexOf(ch);

        String result = "Character [" + ch + "] in string [" + str + "] ";

        if(indexOfChar == -1) {
            result += "not found";
        } else if(indexOfChar == lastIndexOfChar) {
            result += "found once";
        } else {
            result += "found more than once";
        }

        return result;
    }
}
