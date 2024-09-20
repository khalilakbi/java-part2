package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Properties;

public class CheckedException {
    public static void main(String[] args)  {
        try {
            String path = System.getProperty("user.dir") + File.separator + "config.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("username"));
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }


    }


}
