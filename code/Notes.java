import java.util.Arrays;
import java.util.stream.*;

public class Notes {
    public static void main(String[] args) {
        // String from String[]
        String[] strArr = {"x", "y", "z"};
        String str = Stream.of(strArr).collect(Collectors.joining());

        // String from int[]
        int[] intArr1 = {0,1,2,3,4,5,6,7,8,9};
        String joined = IntStream.of(intArr1).mapToObj(String::valueOf).collect(Collectors.joining());
        String joined2 = Arrays.stream(intArr1).mapToObj(String::valueOf).collect(Collectors.joining());

        // String from int[] with delimiter
        String joined3 = IntStream.of(intArr1).mapToObj(String::valueOf).collect(Collectors.joining(", "));

        // String from int[] with delimiter and prefix and suffix
        String joined4 = IntStream.of(intArr1).mapToObj(String::valueOf).collect(Collectors.joining(", ", "[", "]"));


        // get max min from array
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int max = IntStream.of(arr).max().getAsInt();
        int min = IntStream.of(arr).min().getAsInt();

        // create array from range
        int[] arr2 = IntStream.range(0, 10).toArray();

        // create array from range with step
        int[] arr3 = IntStream.range(0, 10).filter(i -> i % 2 == 0).toArray();

        // create array from range with map
        int[] arr4 = IntStream.range(0, 10).map(i -> i = 8).toArray();

        // create array from range with step and map
        int[] arr5 = IntStream.range(0, 10).filter(i -> i % 2 == 0).map(i -> i * 2).toArray();

        // sum of array
        int sum = IntStream.of(arr).sum();

        // filter array from array
        int[] arr6 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr7 = {1,5,10};
        int[] arr8 = IntStream.of(arr6).filter(i -> !Arrays.stream(arr7).anyMatch(j -> j == i)).toArray();

        // Int to String array, split
        int testInt = 123;
        String[] testIntString = Integer.toString(testInt).split("");



        
        
        
        
        
        System.out.println("range " + Arrays.toString(arr2));
        System.out.println("range with step " + Arrays.toString(arr3));
        System.out.println("range with map " + Arrays.toString(arr4));
        System.out.println("range with step and map " + Arrays.toString(arr5));
        System.out.println("sum " + sum);
        System.out.println("filter array from array " + Arrays.toString(arr8));
    }
}
