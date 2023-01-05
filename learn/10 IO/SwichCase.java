import java.io.*;

public class SwichCase {
    // I/O program that switches uppercases to lowercases and vice versa:
    
    public static void main(String[] args) {
        // read file: 
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        // First, confirm that a filename has been specified.
        if(args.length != 2) {
            System.out.println("Usage: SwichCase FileIn FileOut");
            return;
        }

        // Open the file.
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        // At this point, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) {
                    if(i >= 65 && i <= 90) {
                        i += 32;
                    } else if(i >= 97 && i <= 122) {
                        i -= 32;
                    }
                    fout.write(i);
                }
            } while(i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        } finally {
            // Close the file.
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }

    }
}
