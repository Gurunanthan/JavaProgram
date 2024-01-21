package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileCreate {
    public  void CreateNewFile() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String FileName = sc.next();
            Path path = Paths.get(FileName);
            Files.createFile(path);
            System.out.println("File created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FileCreate fc = new FileCreate();
        fc.CreateNewFile();
    }
}
