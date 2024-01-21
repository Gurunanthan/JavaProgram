package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();  // Use nextLine() to capture the entire line

        System.out.print("Write the data: ");
        String data = sc.nextLine();

        try (FileWriter fw = new FileWriter(fileName);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(data);
            System.out.println("Data written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();  // Close the Scanner
        }
    }
}
