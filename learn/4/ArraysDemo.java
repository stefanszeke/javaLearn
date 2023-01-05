import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] random_numbers = {1,3,2,-3,-1,-2};


        int min, max;
        min = max = random_numbers[0];
        for(int i = 1; i < random_numbers.length; i++) {
            if(random_numbers[i] > max) max = random_numbers[i];
            if(random_numbers[i] < min) min = random_numbers[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        for(int i = 0; i < random_numbers.length; i++) {
            for(int j = i + 1; j < random_numbers.length; j++) {
                if(random_numbers[i] > random_numbers[j]) {
                    int temp = random_numbers[j];
                    random_numbers[j] = random_numbers[i];
                    random_numbers[i] = temp;
                }
            }
        }

        for(int i = 0; i < random_numbers.length; i++) {
            System.out.print(random_numbers[i] + ", ");
        }
        System.out.println("array:");
        System.out.println(Arrays.asList(random_numbers));

    }


}


// 1,3,2,-3,-1,-2

// i = 0, j = 1
// -3,3,2,1,-1,-2

// i = 1, j = 2
// -3,-2,3,2,1,-1

// i = 2, j = 3
// -3,-2,-1,3,2,1

// i = 3, j = 4
// -3,-2,-1,1,3,2

// i = 4, j = 5
// -3,-2,-1,1,2,3