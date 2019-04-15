/**
 * Cobol.Java
 * 
 * An abstract class on the top of hierarchy
 * 
 */
package com.konzern.transformatore.cobol;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.konzern.transformatore.enums.CobolDivision;

/**
 * @author Konzernites
 * @version 1.0
 *
 */
public abstract class Cobol {
	
	public static  List<String> cobolDivisions = null;
	
	private Map<String,List<String>> codeBlocks = null;
	
	static {
		cobolDivisions = new ArrayList<>();
		for(CobolDivision cobolDivison : CobolDivision.values()) {
			cobolDivisions.add(cobolDivison.getDivision());
		}
	}
	
	/**
	 * <p> To initialize the code block Map if necessary </p>
	 * 
	 * @return Map<String,List<String>>
	 */
	private  Map<String,List<String>> getCodeBlocks() {
		if(null==codeBlocks) {
			codeBlocks = new HashMap<>();
		}
		return codeBlocks;
	}


	/**
	 * <p> split the COBOL code based on the division </p>
	 * 
	 * @param bufferedReader
	 * @return codeBlocks
	 * @throws IOException, IllegalArgumentException
	 */
	public Map<String,List<String>> divisionIdentifier(BufferedReader bufferedReader) throws IOException {
		
		if(null==bufferedReader) {
			throw new IllegalArgumentException();
		}
		codeBlocks = getCodeBlocks();
		String line = null;
		List<String> elements = null;
		String key = null;
		while (null != (line = bufferedReader.readLine())) {
			if (cobolDivisions.contains(line)) {
				if (null != elements) {
					codeBlocks.put(key, elements);
				}
				key = line;
				elements = new ArrayList<>();
			} else {
				elements.add(line);
			}
		}

		return codeBlocks;
	}
	
}
