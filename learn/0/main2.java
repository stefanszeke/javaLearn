import java.util.Scanner;


public class main2 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = input.nextLine();

    if(name.length() >= 10) {
      System.out.println("Hi " + name + " you have a long name");
    } else {
      System.out.println("Hello " + name);
    }
  }
  
}
