import java.util.Scanner;

public class Hypotenuse {
  public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of the first side: ");
    double side1 = input.nextDouble();
    System.out.println("Enter the length of the second side: ");
    double side2 = input.nextDouble();

    double hypotenuse = Math.sqrt(side1*side1 + side2*side2 );

    System.out.println("The length of the hypotenuse is: " + hypotenuse);

  }
  
}
