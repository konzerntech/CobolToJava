/**
 * CobolFTransformatorFileReaderileReader.Java
 * 
 * <p>The aim of this class is to read all cobol file
 * 
 * BufferedReader to read line by line
 * 
 * location : E:\PROXIMOTECH\cobol_to_java_convertor\input_files </p>
 */
package com.konzern.trasformatore.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Konzerntech
 * @since 2018-12-01
 * @version 1.0
 *
 */
public class TransformatorFileReader {
	
	private String location = null;
	private BufferedReader br = null;
	private FileReader fr = null;
	private String characterEncoding = null;
	
	public TransformatorFileReader(String location) {
		this.location = location;
	}
	
	public TransformatorFileReader(String location, String characterEncoding) {
		this.location = location;
		this.characterEncoding = characterEncoding;
	}
	
	public static BufferedReader readInputFiles(String location, String characterEncoding) {
		
		try(FileReader fr = new FileReader(location)){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
