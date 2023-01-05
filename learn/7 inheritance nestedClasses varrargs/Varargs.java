import java.util.stream.IntStream;

public class Varargs {
    public static void main(String[] args) {
        vaTest(10, 20, 30, 40, 50);
    }

    // variable number of arguments:
    static void vaTest(int ... args) {
        System.out.println("Number of args: " + args.length);
        System.out.println("Contents: ");
        for(int i = 0; i < args.length; i++) {
            System.out.println("argument ["+ (i+1) +"]: " + args[i]);
        }
        System.out.println();
    }
}
