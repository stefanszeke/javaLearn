import java.io.*;

public class FileIO {
    
    public static void main(String[] args) {

            try {

                FileWriter fw = new FileWriter("test.txt");
                BufferedWriter writer = new BufferedWriter(fw);

                writer.write("Hello World!");
                writer.newLine();
                writer.write("This is a test.");
                writer.newLine();

                writer.close();
                
            } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }



            try {

                FileInputStream fis = new FileInputStream("test.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

                String line = null;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();

            } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
}