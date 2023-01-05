import java.util.Scanner;

public class infiniteLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        for(;;) {
            System.out.println();
            System.out.println("Enter a number between 1-3. (0 to exit): ");
            do {
                while(!input.hasNextInt()) {
                    System.out.println("That is not a number!");
                    input.next();
                }
                number = input.nextInt();
                if(number < 1 || number > 3) { System.out.println("must be between 1-3"); }
            } while (number < 0 || number > 3);


            if(number == 0) { System.out.println("exit"); break; }

            switch(number) {
                case 1:
                    System.out.println("You entered 1");
                    break;
                case 2:
                    System.out.println("You entered 2");
                    break;
                case 3:
                    System.out.println("You entered 3");
                    break;
            }
        }
    }
}
