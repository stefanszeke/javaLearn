import java.util.Arrays;

public class moreArrays {
    public static void main(String[] args) {
        String arr1[] = {"a", "b", "c", "d", "e"};
        String arr2[] = {"a", "b", "c", "d", "e"};
        String[] arr3 = {"x", "y", "z", "x", "y"};
        String[] arr1Reference = arr1;
        int[] intArr = {5,8,10,0,2,1,3,9,4,7,6};

        System.out.print("arr1 == arr2: ");
        System.out.println(arr1 == arr2);

        System.out.print("arr1.equals(arr2): ");
        System.out.println(arr1.equals(arr2));

        System.out.print("Arrays.equals(arr1, arr2): ");
        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println();

        System.out.print("arr1 == arr1Reference: ");
        System.out.println(arr1 == arr1Reference);

        System.out.print("arr1.equals(arr1Reference): ");
        System.out.println(arr1.equals(arr1Reference));

        System.out.print("Arrays.equals(arr1, arr1Reference): ");
        System.out.println(Arrays.equals(arr1, arr1Reference));


        System.out.println();

        System.out.print("arr1 == arr3: ");
        System.out.println(arr1 == arr3);

        System.out.print("arr1.equals(arr3): ");
        System.out.println(arr1.equals(arr3));

        System.out.print("Arrays.equals(arr1, arr3): ");
        System.out.println(Arrays.equals(arr1, arr3));
        
        Arrays.sort(intArr);
        System.out.print("IntArr sorted: ");
        System.out.println(Arrays.toString(intArr));
    }
}
