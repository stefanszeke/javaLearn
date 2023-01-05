public class ShortCircuit {
  public static void main(String args[]) {
    int x = 0;
    int y = 9;

    if(x != 0 && y%x == 0) { // short circuit, y/x is not evaluated, because x != 0 is false
      System.out.println("All are true");
    } else {
      System.out.println("All are not true");
    }
    
    System.out.println();

    if(x != 0 & y%x == 0) { // & is not short circuit, trows error because cant divide by 0
      System.out.println("All are true");
    } else {
      System.out.println("All are not true");
    }
  }
}
