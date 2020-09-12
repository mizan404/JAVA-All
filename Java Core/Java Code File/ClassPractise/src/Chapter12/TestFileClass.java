package Chapter12;

import java.io.File;
import java.io.IOException;

public class TestFileClass {

    public static void main(String[] args) throws IOException {
        File file = new java.io.File("G:\\Mizan@1256317\\OneDrive\\Secure\\Document\\1.png");
        file.createNewFile();
        System.out.println("Doest it exit " + file.exists());
        System.out.println("Doest it legnth " + file.length() + " bytes");
        System.out.println("Doest it read " + file.canRead());
        System.out.println("Doest it write " + file.canWrite());
        System.out.println("Doest it file " + file.isFile());
        System.out.println("Doest it directory " + file.isDirectory());
        System.out.println("Doest it absolute " + file.isAbsolute());
        System.out.println("Doest it heddin " + file.isHidden());
        System.out.println("Doest it absolute path " + file.getAbsolutePath());
        System.out.println("Doest it last modified on " + new java.util.Date(file.lastModified()));
    }
}
