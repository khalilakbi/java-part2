package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        //my file path (location)
        String path = System.getProperty("user.dir") + File.separator + "test.txt";
        // create instance of FileInputStream to read from file
        FileInputStream fileInputStream = new FileInputStream(path);
        int c = fileInputStream.read();
        System.out.println((char) c);

    }
}
