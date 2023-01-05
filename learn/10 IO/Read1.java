import java.io.*;

class Read1 {
    public static void main(String[] args) {
        try {
            byte[] data = new byte[10];
            int b = 'X';
            System.out.write(b);

            System.out.write('\n');

            System.out.println("Enter some characters.");
            System.in.read(data);
            System.out.println("You have entered: ");

            for(int i = 0; i < data.length; i++) System.out.print((char)data[i]);
            
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
    }
}