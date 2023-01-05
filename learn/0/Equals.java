public class Equals {
  public static void main(String args[]) {
    int a = 5;
    int b = a;
    b = 100;

    String testString = a > 5 
    ? "a is greater than 5" 
    : "a is not greater than 5";

    System.out.println(testString);

    String[] arr = {"a", "b", "c"};
    String[] arr2 = arr;
    arr2[0] = "d";

    System.out.println("a: " + a);
    System.out.println("b " + b);
    System.out.println("a == b ? " + (a == b));

    System.out.println();
    System.out.println("arr:");
    for(String s : arr) {
      System.out.println(s);
    }

    System.out.println();
    System.out.println("arr2: ");
    for(String s : arr2) {
      System.out.println(s);
    }
    
    System.out.println("arr == arr2 ? " + (arr == arr2));
    System.out.println(arr);
    System.out.println(arr2);

    System.out.println(Integer.valueOf("50"));

    boolean bool1 = true;
    int fromBool = bool1 == true ? 1 : 0;

    System.out.println(fromBool);


  }
}
