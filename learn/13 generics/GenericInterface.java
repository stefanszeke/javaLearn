public class GenericInterface {
    interface Containment<T> {
        boolean contains(T item);
    }

    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        GenDemo<Integer> iOb = new GenDemo<>(nums);
        if (iOb.contains(2)) {
            System.out.println("2 is in nums");
        }
        if (!iOb.contains(7)) {
            System.out.println("7 is not in nums");
        }
        System.out.println();
        String[] strs = { "one", "two", "three", "four", "five" };
        GenDemo<String> strOb = new GenDemo<>(strs);
        if (strOb.contains("two")) {
            System.out.println("two is in strs");
        }
        if (!strOb.contains("seven")) {
            System.out.println("seven is not in strs");
        }
    }

    static class GenDemo<T> implements Containment<T> {
        T[] arrayRef;

        public GenDemo(T[] arrayRef) {
            this.arrayRef = arrayRef;
        }

        @Override
        public boolean contains(T item) {
            for (T x : arrayRef) {
                if (x.equals(item)) {
                    return true;
                }
            }
            return false;
        }
    }
}
