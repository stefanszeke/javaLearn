

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";

        // reverse the string with strning builder
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        System.out.println(sb);

        // append the string with string builder
        sb.append(" !");
        System.out.println(sb);

        // insert the string with string builder
        sb.reverse();
        sb.insert(0, "Hi, ");
        sb.replace(4, 6, "");
        sb.append(" !");
        System.out.println(sb);

        // delete the string with string builder
        sb.delete(0, 4);
        System.out.println(sb);

        // stringbuilder usage:
        // 1. when you need to modify a string
        // 2. when you need to append a string
        // 3. when you need to insert a string
        // 4. when you need to delete a string
        // 5. when you need to replace a string

        // stringbuilder is not thread safe, meaning that it is not synchronized
        // stringbuffer is thread safe, meaning that it is synchronized

    }
}
