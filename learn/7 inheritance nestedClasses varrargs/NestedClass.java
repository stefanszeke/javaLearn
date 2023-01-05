import java.util.Arrays;
import java.util.stream.IntStream;

class NestedClass {
    public static void main(String[] args) {
        Outer outerObject = new Outer(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13});
        outerObject.analize();
    }
}

class Outer {
    int[] nums;

    Outer(int[] nums) {
        this.nums = nums;
    }

    void analize() {
        Inner innerObject = new Inner();
        System.out.println("analizing nums: " + Arrays.toString(nums));
        System.out.println("[min]: " + innerObject.min());
        System.out.println("[max]: " + innerObject.max());
        System.out.println("[avg]: " + innerObject.avg());
        System.out.println("[minStatic]: " + Inner.minStatic(nums));
    }

    class Inner {

        int min() {
            int m = nums [0];
            for(int i = 0 ; i<nums.length; i++) {
                if(m > nums[i]) m = nums[i];
            }
            return m;
        }

        int max() {
            return IntStream.of(nums).max().getAsInt();
        }

        int avg() {
            return (int) IntStream.of(nums).average().getAsDouble();
        }

        static int minStatic(int[] nums) {
            return IntStream.of(nums).min().getAsInt();
        }
    }
}
