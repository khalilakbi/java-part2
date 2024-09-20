package input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        // declare variable path data type string
        // System.getProperty("user.dir") will return the path of your project
        // + concatenate two string
        // File.separator return the '\'
        // path variable  is C:\Users\khali\eclipse-workspace\java_part2\file.txt

        String path = System.getProperty("user.dir") + File.separator + "file.txt";

        // instance FileOutPutStream to write in file
        // constructor take one string parameter the path (location) of our file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // call method write to write in file
        fileOutputStream.write(67);

    }
}
