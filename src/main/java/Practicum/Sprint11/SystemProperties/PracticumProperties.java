package Practicum.Sprint11.SystemProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;


public class PracticumProperties {
    private static final String propertiesFileName = "config.properties";

    public static void main(String[] args) throws IOException {

        Properties myProperties = new Properties();
        myProperties.setProperty("my.important.property", "42");
        myProperties.setProperty("defaults.name", "Иван Петров");
        myProperties.setProperty("defaults.age", "30");

        try (FileOutputStream out = new FileOutputStream(propertiesFileName)) {
            myProperties.store(out, null);
        }

        String fileContent = Files.readString(Paths.get(propertiesFileName));
        System.out.println("Содержимое сохранённого файла:\n");
        System.out.println(fileContent);

        Properties autherProperties = new Properties();
        try (FileInputStream in = new FileInputStream(propertiesFileName)) {
            autherProperties.load(in);
        }

        String value = autherProperties.getProperty("my.important.property");
        System.out.println("Значение свойства my.important.property = " + value);
    }
}
