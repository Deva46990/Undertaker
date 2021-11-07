package org.gama;

import java.io.File;
import java.io.IOException;

public class Fileoperation {
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\\\google\\today.txt");
		boolean b = f.isFile();
		System.out.println(b);
		boolean d = f.isDirectory();
		System.out.println(d);
		boolean canRead = f.canRead();
		System.out.println(canRead);
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		



	}

}
