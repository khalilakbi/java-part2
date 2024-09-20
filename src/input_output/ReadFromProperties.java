package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
    public static void main(String[] args) throws IOException {
        // path (location) my properties

        String path = System.getProperty("user.dir") + File.separator + "config.properties";

        // instance of FileInputStream to read data from file
        // constructor has one String parameter our file path (location)
        FileInputStream fileInputStream = new FileInputStream(path);

        //create instance of Properties class
        Properties properties = new Properties();


        // using reference variable to call load method to load config.properties
        // take has one parameter the file that we load
        properties.load(fileInputStream);


        // use method getProperty() to return the value of key username
        String user = properties.getProperty("username");
        System.out.println(user);

        System.out.println(System.getProperty("user.dir") );


    }
}
