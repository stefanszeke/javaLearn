import java.lang.Math;

public class Trigonometry {

    public static void main(String[] args) {
        double x = 6;
        double y = 18;

        double z = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse: " + z);


        double sinus = Math.toDegrees(Math.asin(x/y)); // 19.471220634490697 degrees is the angle between x and y
        System.out.println("Sinus: " + sinus);

        
    }


}
