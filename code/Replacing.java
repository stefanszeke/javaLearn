public class Replacing {
    public static void main(String[] args) {
        
        // replace() method
        String str1 = "Hello World";
        String str2 = str1.replace('l', 'x'); // replace char with char
        System.out.println(str2);

        // replaceAll() method
        String str3 = "Hello World";
        String str4 = str3.replaceAll("\\s", "-*-"); // replace regex with String
        System.out.println(str4);

        // replaceFirst() method
        String str5 = "Hello World";
        String str6 = str5.replaceFirst("l", "XXX");
        System.out.println(str6);

        // difference between replace() and replaceAll()  is that replaceAll() takes a regex, while replace() takes a char

    }
}
