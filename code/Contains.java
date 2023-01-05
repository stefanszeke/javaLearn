import java.util.Arrays;

public class Contains {
    public static void main(String args[]) {
        String[] testArray = {"A","B","C","D","E","F","G","H"};
        System.out.println(Arrays.toString(testArray));

        System.out.println("contains1 [A]:" + Contains.contains1(testArray, "A"));
        System.out.println("contains1 [Z]:" + Contains.contains1(testArray, "Z"));
        System.out.println();
        System.out.println("contains2 [A]:" + Contains.contains2(testArray, "A"));
        System.out.println("contains2 [Z]:" + Contains.contains2(testArray, "Z"));

    }

    public static boolean contains1(String[] arr, String item) {
        for (String i : arr) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains2(String[] arr, String item) {
        return Arrays.asList(arr).contains(item);
    }
}
