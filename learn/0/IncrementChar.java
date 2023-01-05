import java.util.Scanner;

public class IncrementChar {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a character: ");
    char inputChar = input.next().charAt(0);

    System.out.println("You have entered: " + inputChar);
    // print char code at
    System.out.println("The char code at " + inputChar + " is: " + (int)inputChar);

    if(((int)inputChar < 97 || (int)inputChar > 122) && ((int)inputChar < 65 || (int)inputChar > 90)) {
      System.out.println("Thats not a letter");
    } else {
      if(inputChar == 'z') inputChar = 'a'; 
      else if(inputChar == 'Z') inputChar = 'A'; 
      else inputChar++; 
  
      System.out.println("The next Char is: " + inputChar);
    }


  }

}
