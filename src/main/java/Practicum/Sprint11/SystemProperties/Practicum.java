package Practicum.Sprint11.SystemProperties;

public class Practicum {
    public static void main (String[] args) {
        String path = System.getenv("PATH");
        System.out.println("Значение переменной окружения [PATH] = [" + path + "]");

        String javaVersion = System.getProperty("java.version");
        System.out.println("Значение системного свойства [java.version] = [" + javaVersion + "]");
    }
}

