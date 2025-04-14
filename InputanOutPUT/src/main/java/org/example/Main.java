package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      /*  Scanner sc = new Scanner(System.in);
        String filename= "notes.txt";

        try(BufferedWriter bf = new BufferedWriter(new FileWriter("notes.txt"))){
            System.out.println("Enter the file name");
            while (true) {
                String line = sc.nextLine();
            }
        }*/
;        // Write to the file (append mode: true)
        try {
            FileWriter writer = new FileWriter("D:\\Anne project\\java project\\java_repo\\InputanOutPUT\\src\\main\\java\\org\\example\\message.txt");
            writer.write("Wonderful!\n");
            writer.write("Amazing!\n");
            writer.write("!\n");


            writer.close(); // Always close to save changes
            System.out.println("File has been written.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read from the file
       try (BufferedReader reader = new BufferedReader(new FileReader("message.txt"))) {
           // System.out.println("📖 Reading from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("➡️ " + line);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Read Error: " + e.getMessage());
        }
    }
}
