import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = -7;
        double d = 4.5e-7;
        boolean b = true;
        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(b);
        pw.println(i + " + " + d + " = " + (i + d));
    }
}
