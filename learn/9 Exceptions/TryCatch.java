import java.util.Arrays;

public class TryCatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("set number must be lesser than 10");
        try {
            if(setNumber(11) >= 10) {
                throw new Exception("number must be lesser than 10");
            } else {
                System.out.println("number is lesser than 10");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println();
        
        try {
            TryCatch.makeException(10);
        } catch (Exception exc) {
            // catch the exception
            exc.getLocalizedMessage();
        }
        System.out.println("After catch statement.");
        System.out.println();

        TryCatch.divide();
    }

    static void makeException(int testnum) {
        int[] nums = new int[4];
        System.out.println("Before exception is generated.");
        // generate an index out-of-bounds exception
        nums[testnum] = 10;
        System.out.println("This won't be displayed.");
    }

    static void divide() {
        int[] nums1 = {10, 20, 30, 40, 50, 100, 200};
        int[] nums2 = {2, 0, 3, 10, 0};

        for(int i = 0; i < nums1.length; i++) {
            try {
                System.out.println(nums1[i] + " divided by " + nums2[i] + " is " + nums1[i] / nums2[i]);
            } catch (Exception exc) {
                System.out.println("[EXC]: " + exc.getClass().toString().replace("class java.lang.", "") + " [message]: " + exc.getMessage() );
            }
        }
    }

    static int setNumber(int number) {
        System.out.println("setting number to " + number);
        return number;
    }
}
