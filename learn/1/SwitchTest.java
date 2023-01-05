public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        try {
            char c = (char)System.in.read();
            switch (c) {
                case 'x':
                case 'y':
                case 'z':
                    System.out.println("You entered: x, y, or z");
                    switch (c) {
                        case 'x':
                            System.out.println("You entered: x");
                            break;
                        case 'y':
                            System.out.println("You entered: y");
                            break;
                        case 'z':
                            System.out.println("You entered: z");
                            break;
                    }
                    break;
                case 'a':
                    System.out.println("You entered an a");
                    break;
                case 'b':
                    System.out.println("You entered a b");
                    break;
                case 'c':
                    System.out.println("You entered a c");
                    break;
                default:
                    System.out.println("You entered something else");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
