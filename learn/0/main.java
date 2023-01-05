class HelloWorld {
  public static void main(String args[]) {
    System.out.println(args.length);
    if(args.length > 0) {
      System.out.println("Hello " + args[0]);
    } else {
      System.out.println("Hello World");
    }

    char c = 'c';
    String s = "string of words";
    String myString = null;

    short age = 20; short height = 180;

    System.out.println("I am " + age + " years old and " + height + " cm tall");



  }
}

// data types in java:
// int, double, float, char, boolean, String

// variables in java:
// int x = 5;
// double y = 5.5;
// float z = 5.5f;
// char a = 'a';
// boolean b = true;
// String c = "Hello World";



// operators in java:
// +, -, *, /, %, ++, --, +=, -=, *=, /=, %=, ==, !=, >, <, >=, <=, &&, ||, !

// if statements in java:
// if (x == 5) {
//   System.out.println("x is 5");
// } else if (x == 6) {
//   System.out.println("x is 6");
// } else {
//   System.out.println("x is not 5 or 6");
// }