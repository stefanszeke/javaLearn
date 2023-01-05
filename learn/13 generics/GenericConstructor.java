public class GenericConstructor {
    public static void main(String[] args) {
        GenericConstructorDemo g1 = new GenericConstructorDemo(5);
        GenericConstructorDemo g2 = new GenericConstructorDemo(5.5F);

        g1.showSum();
        g2.showSum();
    }
}

class GenericConstructorDemo {
    private int sum;

    <T extends Number> GenericConstructorDemo(T arg) {
        for(int i = 0; i <= arg.intValue(); i++) {
            sum += i;
        }
    }

    void showSum() {
        System.out.println("sum: " + sum);
    }
}