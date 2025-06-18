package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
     fileNotFoundExcep();
    }
    public static void fileNotFoundExcep( ) {
        FileReader file;
        try {
            file = new FileReader("raushan.text");
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not Found");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
