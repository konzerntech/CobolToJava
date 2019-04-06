/**
 * TransformatoreFileReader.Java
 * 
 * <p>The aim of this class is to read all cobol file
 * 
 * Four main methods will be create, read, read&write, and close fileReader
 * 
 * BufferedReader to read line by line
 * 
 * location : E:\PROXIMOTECH\cobol_to_java_convertor\input_files </p>
 */
package com.konzern.transformatore.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.konzern.transformatore.utilsInf.TransformatoreFileReaderInf;

/**
 * @author Konzerntech
 * @since 2018-12-01
 * @version 1.0
 *
 */
public class TransformatoreFileReader implements TransformatoreFileReaderInf {

	private static Map<String, BufferedReader> fileInputs = null;

	static {
		fileInputs = new HashMap<>();
	}

	/**
	 * <p>
	 * To Read all cobol files in a particular directory
	 * 
	 * @param location
	 * @param characterEncoding
	 * @return Map<String, BufferedReader>
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Map<String, BufferedReader> creatInputFiles(String location, String characterEncoding)
			throws FileNotFoundException, IOException {

		File fileDirectory = new File(location);
		for (File filePath : fileDirectory.listFiles()) {
			BufferedReader br = null;
			FileReader fr = new FileReader(filePath.getAbsolutePath());
			br = new BufferedReader(fr);

			fileInputs.put(filePath.getName(), br);

		}
		return fileInputs;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Map<String, BufferedReader> i = creatInputFiles("E:\\PROXIMOTECH\\cobol_to_java_convertor\\input_files",
					"ASCII");
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
