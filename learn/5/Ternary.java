import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.println("Enter your age: ");
        do{
            while(!input.hasNextInt()) {
                System.out.println("Please enter a valid age");
                input.next();
            }
            age = input.nextInt();

            if(age <= 0) {
                System.out.println("Please enter a valid age");
            }
        } while(age <= 0);

        // String message = (age >= 18) ? "You are an adult" : "You are a minor";

        // System.out.println(message);

        System.out.println((age >= 18) ? "You are an adult" : "You are a minor");
    }
}
