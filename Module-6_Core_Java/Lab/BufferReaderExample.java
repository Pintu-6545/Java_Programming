package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
	
	public static void main(String[] args) {
        // Specify file path (change this according to your system)
        String filePath = "C:\\Users\\Pintu Ghanchi\\Desktop\\P1\\Practice_Data\\src\\demo1.txt";

        // Using try-with-resources to automatically close the file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read file line by line until end of file (null)
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
