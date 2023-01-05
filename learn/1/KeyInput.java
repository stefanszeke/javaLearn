

public class KeyInput {
    public static void main(String[] args)  {

        System.out.println("Enter a character: ");
        try {
            char c = (char)System.in.read();
            System.out.println("You entered: " + c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
