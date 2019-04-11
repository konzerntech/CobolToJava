/**
 * Cobol.Java
 * 
 * An abstract class on the top of hierarchy
 */
package com.konzern.transformatore.cobol;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Konzernites
 * @version 1.0
 *
 */
public abstract class Cobol {
	
	public static  List<String> cobolDivisions = null;
	
	static {
		cobolDivisions = new ArrayList<>();
		cobolDivisions.add("IDENTIFICATION DIVISION.");
		cobolDivisions.add("DATA DIVISION.");
		cobolDivisions.add("PROCEDURE DIVISION.");
		cobolDivisions.add("ENVIRONMENT DIVISION.");
	}

}
