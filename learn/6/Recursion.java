class Recursion {
    public static void main(String[] args) {

        System.out.println("Factorial of 3 is " + Factorial.fact(3));
        System.out.println("Factorial of 4 is " + Factorial.fact(4));
        System.out.println("Factorial of 5 is " + Factorial.fact(5));


    }
}

class Factorial {
    static int fact(int n) {
        int result;

        if(n == 1) return 1; // base case

        result = fact(n - 1) * n; // recursive call
        return result; 
    }

    static int fact2(int n) {
        int t, result;

        if(n == 1) return 1; // base case
        
        result = fact2(n - 1) * n; // recursive call
        return result;
    }
}