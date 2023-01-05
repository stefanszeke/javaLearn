
public class Loops2 {
    public static void main(String[] args) {

        for(int i = 2; i <=100; i++) {
            System.out.print("Factors of " + i +": ");
            for(int j = 2; j <= i/2; j++) {

                if(i%j == 0) {
                    System.out.print(j + ", ");
                } 
            }
            System.out.println();
        }

        for(int i = 0; i<10; i++) {
            System.out.print(i + " ");
            if((i%2) == 0) continue;
            System.out.println();
            }
        

        System.out.println();

        for(int i = 1; i<=36; i*=2) {
            System.out.println("i: " + i);
        }
    }
}
