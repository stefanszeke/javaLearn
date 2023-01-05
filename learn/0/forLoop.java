public class forLoop {
  public static void main(String args[]) {
    double gallons, liters;
    
    int counter = 0;
    for(gallons = 1; gallons<=50; gallons++) {
      liters = gallons*3.7854;
      System.out.println(gallons + " gallons is " + liters + " liters");
      counter++;
      if(counter == 5) {
        System.out.println("");
        counter = 0;
      }
    }
  }
}
