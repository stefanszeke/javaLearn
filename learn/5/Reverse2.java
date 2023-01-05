import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        String[] testArray = {"A","B","C","D","E","F","G","H"};
        System.out.println(Arrays.toString(testArray));


        String testString = String.join("", testArray);
        String[] resultArray = new StringBuilder().append(testString).reverse().toString().split("");
        System.out.println(Arrays.toString(resultArray));
    }
}
