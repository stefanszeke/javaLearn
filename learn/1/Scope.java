public class Scope {
    public static void main() {
        System.out.println();

        char c = 'a';

        // a block defines a scope
        {
            int i = 10;
            System.out.println("i3: " + i); // i3 is visible here

            System.out.println("c: " + c); // c is visible here
        }
        
        //System.out.println("i3: " + i); // i3 is not defined in this scope
        System.out.println("c: " + c); // c is visible here
    }
}
