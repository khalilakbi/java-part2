package input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        // C:\Users\khali\eclipse-workspace\java_part2
        // return directory of your project
        //C:\Users\khali\eclipse-workspace\java_part2\test.txt
        String path = System.getProperty("user.dir") + File.separator + "file.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        fileOutputStream.write(67);
    }
}
