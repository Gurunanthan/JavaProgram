package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the File Name: ");
            String value = sc.next();
            System.out.println(value);
            String fileName = (value == null || value.equals("")) ? "Sample.txt" : value;

            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String data = "";

            String line;
            System.out.println();
            while ((line = reader.readLine()) != null) {
                data += line + "\n";
            }

            reader.close();
            sc.close();

            System.out.println("Data:\n" + data);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
