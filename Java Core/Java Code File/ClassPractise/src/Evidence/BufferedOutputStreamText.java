package Evidence;

import java.io.*;

public class BufferedOutputStreamText {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("G:/file.txt");
        try (BufferedOutputStream bout = new BufferedOutputStream(fout)) {
            String s = "poargjoucnuoi hjuw";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            System.out.println("Success");
        }
    }
}
