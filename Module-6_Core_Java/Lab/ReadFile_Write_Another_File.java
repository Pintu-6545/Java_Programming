package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile_Write_Another_File {

	public static void main(String[] args) {
        // Source and destination file paths (change paths as needed)
        String sourceFile = "C:\\Users\\Pintu Ghanchi\\Desktop\\P1\\Practice_Data\\demo.txt";
        String destinationFile = "C:\\Users\\Pintu Ghanchi\\Desktop\\P1\\Practice_Data\\demo1.txt";

        // Try-with-resources automatically closes the streams
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;

            // Read line by line from source and write to destination
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add new line in output file
            }

            System.out.println("✅ File copied successfully from demo.txt to demo1.txt!");

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
	
}
