package com.eclature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("F:\\Somesh\\bugDubts.txt");
		
		FileOutputStream fos = new FileOutputStream(new java.io.File("F:\\Somesh\\xys.txt"));
		int c = -1;
		while((c = fis.read()) !=-1) {
			fos.write(c);
		}
			System.out.println("done");

	}

}
