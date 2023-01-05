import java.util.Scanner;

public class WhileInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");
        while(!input.hasNextInt()) {
            System.out.println("not integer");
            System.out.println(input.hasNextInt());
            System.out.println("enter a number: ");
            input.next();
            
        }

        int inputNumber = input.nextInt();
        System.out.println("You have entered: " + inputNumber);
    }
}
