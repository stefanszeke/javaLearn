public class CustomException  {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        try {
            if(a % b != 0) {
                throw new NonIntResultException(a, b);
            }
        } catch (NonIntResultException exc) {
            System.out.println(exc);
        }
    }
}


class NonIntResultException extends Exception {
    int n;
    int d;
    double result;

    NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
        this.result = (double) n / d;
    }

    public String toString() {
        return "CustomException: " + n + " / " + d + " (" + result + ") is not an integer";
    }
}
