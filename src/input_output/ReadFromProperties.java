package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + File.separator + "config.properties";

        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties = new Properties();
        properties.load(fileInputStream);
        String  user = properties.getProperty("username");
        System.out.println(user);



    }
}
