import java.util.Arrays;

public class lamb {

    interface MyValue {
        double getValue();
    }

    interface MyParamValue {
        double getValue(double v);
    }

    interface NumericTest {
        boolean test(int n, int d);
    }

    interface DoubleParams {
        double summ(double n, double d);
    }

    interface StringTest {
        boolean test(String aStr, String bStr);
    }

    interface NumbersToArray {
        int[] getArray(int x, int y);
    }

    // generic
    interface SomeFunc<T> {
        T func(T t);
    }

    public static void main(String[] args) {
        MyValue myVal; // declare an interface reference
        myVal = () -> 98.6; // a lambda expression that returns a value

        // call getValue(), which is provided by the previously assigned lambda expression
        System.out.println("A constant value: " + myVal.getValue());

        // a lambda expression that takes a parameter
        MyParamValue myPval = (n) -> 1.0 / n;

        // call getValue(), which is provided by the previously assigned lambda expression
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));

        // a lambda expression that takes two parameters
        NumericTest isFactor = (n, d) -> (n % d) == 0; 

        if (isFactor.test(10, 2)) {
            System.out.println("2 is a factor of 10");
        }

        DoubleParams summer = (n, d) -> n + d;
        System.out.println("Sum of 2 and 3 is " + summer.summ(2, 3));

        StringTest isIn = (a, b) -> a.contains(b);
        String str = "This iss a test";
        String str2 = "his";
        System.out.println("Is [" + str2 + "] in ['" + str + "'] ? " + isIn.test(str, str2));

        // block lambda:

        NumericTest isFactor2 = (n, d) -> {
            if (d == 0) {
                return false;
            }
            return (n % d) == 0;
        };

        NumbersToArray getBetween = (x,y) -> {
            int[] result = new int[y - x + 1];
            for(int i = 0; i < result.length; i++)
                result[i] = x + i;
            return result;
        };

        int[] arr = getBetween.getArray(5, 10);
        System.out.println(Arrays.toString(arr));

        // generic
        SomeFunc<String> reverse = (str1) -> {
            String result = "";
            for(int i = str1.length() - 1; i >= 0; i--)
                result += str1.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));

        SomeFunc<Integer> factorial = (numb) -> {
            int result = 1;
            for(int i = 1; i <= numb; i++)
                result *= i;
            return result;
        };

        System.out.println("Factorial of 5 is " + factorial.func(5));
    }
}
