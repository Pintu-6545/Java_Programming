package com.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
  public static void main(String[] args) throws IOException {
	
	  FileWriter f1 = new FileWriter("demo1.txt");
	  String s2="Java Object Oriented Programming Language";
	  f1.write(s2);
	  f1.flush();
	  f1.close();
	  System.out.println("File Written Successfully");
	  
	  FileReader r1 = new FileReader("demo1.txt");
	  int i;
	  while((i=r1.read())!=-1)
	  {
		  System.out.print((char)
				  i);
	  }
	  
}
}
