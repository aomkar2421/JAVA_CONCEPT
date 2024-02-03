package telusko;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class  PropertiesExample {
    public static void main(String[] args) throws IOException {
        // Creating a Properties object
        Properties properties = new Properties();

        // Setting properties
        properties.setProperty("database.url", "localhost");
        properties.setProperty("database.username", "admin");
        properties.setProperty("database.password", "password123");

        // Saving properties to a file
        FileOutputStream fileOut = new FileOutputStream("config.properties");
        properties.store(fileOut, "Database Configuration");
        fileOut.close();

        // Loading properties from a file
        Properties loadedProperties = new Properties();
        FileInputStream fileIn = new FileInputStream("config.properties");
        loadedProperties.load(fileIn);
        fileIn.close();

        // Displaying loaded properties
        System.out.println("Loaded Properties:");
        System.out.println("Database URL: " + loadedProperties.getProperty("database.url"));
        System.out.println("Username: " + loadedProperties.getProperty("database.username"));
        System.out.println("Password: " + loadedProperties.getProperty("database.password"));
    }
}
