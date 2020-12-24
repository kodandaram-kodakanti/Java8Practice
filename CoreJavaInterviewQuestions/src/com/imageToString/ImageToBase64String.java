package com.imageToString;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

public class ImageToBase64String {

	private static FileInputStream fileInputStreamReader;

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\test\\Desktop\\Windows_7.jpg");
		String encodstring = encodeFileToBase64Binary(f);
		System.out.println(encodstring);
	}

	private static String encodeFileToBase64Binary(File file) throws Exception {
		fileInputStreamReader = new FileInputStream(file);
		byte[] bytes = new byte[(int) file.length()];
		fileInputStreamReader.read(bytes);
		return new String(Base64.getEncoder().encodeToString(bytes));
	}

}
