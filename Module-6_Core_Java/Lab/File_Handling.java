package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Handling {
  public static void main(String[] args) throws IOException {
	
	FileOutputStream f1 = new FileOutputStream("demo.txt");
	String s1="India and Russia Good Friendly Country";
	byte b[] = s1.getBytes();
	f1.write(b);
	f1.flush();
    f1.close();			
	System.out.println("File Successfully Write the data");
			
	FileInputStream f2 = new FileInputStream("demo.txt");
	int i;
	while((i=f2.read())!=-1)
	{
		System.out.print((char)i);
	}
			
			
			
}
}
