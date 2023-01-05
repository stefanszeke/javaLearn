import java.util.Scanner;
import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();


        int answer = rand.nextInt(1,11);
        int guess;
       // int min = 10;
        //int max = 20;
        // random between 10 and 20 using Math.random()
        //int random = (int)(Math.random() * (max - min + 1) + min);


        do {
            do {
                System.out.println("Guess a number between 1 and 10: ");
                while(!input.hasNextInt()) {
                    System.out.println("That is not a number!");
                    System.out.println("Guess a NUMBER between 1 and 10: ");
                    input.next();
                }
                

                guess = input.nextInt();

                if(guess == 0) { System.out.println("exit"); return;  }

                if(guess < 1 || guess > 10) {
                    System.out.println("That's not between 1 and 10!");
                }
            } while (guess < 1 || guess > 10);

 
            System.out.println("You guessed: " + guess);

            if (guess == answer) { System.out.println("That's correct!"); } 
            else { System.out.println("Not correct!, Try again!"); }

        } while (guess != answer);
    }
}