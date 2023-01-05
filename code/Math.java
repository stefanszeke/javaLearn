import java.util.stream.IntStream;

public class Math {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int max = IntStream.of(arr).max().getAsInt();
        int min = IntStream.of(arr).min().getAsInt();
        System.out.println(max);
        System.out.println(min);
    }

    public static int abs(int x) {
        return 0;
    }
}
