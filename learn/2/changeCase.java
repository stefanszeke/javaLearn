import java.util.Scanner;
import java.util.Stack;

public class changeCase {
    public static void main(String[] args) {


        System.out.println("a: " + (int) 'a'); // 97
        System.out.println("z: " + (int) 'z'); // 122
        System.out.println("A: " + (int) 'A'); // 65
        System.out.println("Z: " + (int) 'Z'); // 90

        Scanner input = new Scanner(System.in);

        String word = input.next();
        char[] wordArray = word.toCharArray();
        char[] result = word.toCharArray();



        char a = 'a';
        System.out.println((char)(a + 25));
        System.out.println(wordArray[0]);

        int fromLower = 0;
        int fromUpper = 0;

        for(int i = 0; i < wordArray.length; i++) {
            char c = wordArray[i];
            System.out.print(c + ": ");
            if((int)c >= 97 && (int)c <= 122) {
                System.out.print("lowerCase");
                result[i] = (char) (c - 32);
                fromLower++;
            }
            else if((int)c >= 65 && (int)c <= 90) {
                System.out.print("UpperCase");
                result[i] = (char) (c + 32);
                fromUpper++;
            }
            else {
                System.out.print("something else");
                result[i] = c;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("changed to Upper: " + fromLower);
        System.out.println("changed to Lower: " + fromUpper);
        System.out.println(wordArray);
        System.out.println(result);

    }
}
