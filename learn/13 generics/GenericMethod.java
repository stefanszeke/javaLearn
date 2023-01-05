public class GenericMethod {
    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        if (GenDemo.isIn(2, nums)) {
            System.out.println("2 is in nums");
        }
        if (!GenDemo.isIn(7, nums)) {
            System.out.println("7 is not in nums");
        }
        System.out.println();
        String[] strs = { "one", "two", "three", "four", "five" };
        if (GenDemo.isIn("two", strs)) {
            System.out.println("two is in strs");
        }
        if (!GenDemo.isIn("seven", strs)) {
            System.out.println("seven is not in strs");
        }
    }
}

class GenDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) { // can only use types where compareTo(), equals() methods can be used.
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }
}

// <T extends Comparable<T>, V extends T> means that T must be a subclass of Comparable<T> and V must be a subclass of T.
// Comparable<T> is an interface that defines a compareTo() method.