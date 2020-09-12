package Evidence;

import java.io.*;

public class BufferedInputStreamText {

    public static void main(String args[]) {
        try {
            try (FileInputStream fin = new FileInputStream("G:/file.txt")) {
                BufferedInputStream bin = new BufferedInputStream(fin);
                int i = 0;
                while ((i = bin.read())i = -1){
                System.out.println((char) i);
                
            }
               System.out.println((int) 'h');
               fin.close();
            }

        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
