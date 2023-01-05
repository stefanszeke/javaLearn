
import java.util.stream.*;

public class IntArrToString {
    public static void main(String[] args) {
        int[] intArr1 = {0,1,2,3,4,5,6,7,8,9};

        String joined = IntStream.of(intArr1)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining())
            .replaceFirst("(\\d{5})(\\d+)", "first five: [$1], rest: [$2]");

        System.out.println(joined);
    }   
}
