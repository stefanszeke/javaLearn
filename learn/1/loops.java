import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        int sumSum = 0;

        int sum1 = 0;
        for(int i = 1; i <= 5; sumSum += i, sum1 += i++);
        System.out.println("sum1 = " + sum1);

        int sum2 = 0;
        for(int i = 0; i <= 4; sum2 += ++i, sumSum += i); 
        System.out.println("sum2 = " + sum2);

        System.out.println("sumSum = " + sumSum);


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        
        while(!input.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Enter a number!");
            input.next();
        }
        
        System.out.println("got it: ");
        int number = input.nextInt();


        int sum = 0;
        int factor = 1;
        
        for(int i = 1; i <= number; sum += i, factor *= i++);

        System.out.println("The sum of the first " + number + " numbers is " + sum);
        System.out.println("The factorial of " + number + " is " + factor);
    }
}
