public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.printNumber(0);
        MethodOverloading.printNumber(0.0);
        MethodOverloading.printNumber((byte) 10);
        MethodOverloading.printNumber((char) 10);
        MethodOverloading.printNumber((char) 10, (byte) 10);
    }

    static  void printNumber(int number) {
        System.out.println("int: " + number);
    }
    static void printNumber(double number) {
        System.out.println("double: " + number);
    }
    static void printNumber(float number) {
        System.out.println("float: " + number);
    }
    static void printNumber(byte number) {
        System.out.println("byte: " + number);
    }
    static void printNumber(int number, int number2) {
        System.out.println("int+int: " + (number + number2));
    }

}
