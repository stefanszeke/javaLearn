public class VarCapture {

    interface MyFunc {
        int func(int n);
    }
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++; // Error: num is effectively final
            return v;
        };
        // num = 9; // Error: num is effectively final

        System.out.println(num);
        System.out.println(myLambda.func(5));
    }
}
