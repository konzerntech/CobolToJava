/**
 * 
 */
package com.konzern.transformatore.convertors;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.konzern.transformatore.cobol.CobolConstants;
import com.konzern.transformatore.cobol.IdentificationDivision;

/**
 * @author konzerntech
 * @version 1.0
 *
 */
public class CodeIndentifier {

	private BufferedReader bufferedReader = null;
	private Map<String, List<String>> codeBlocks = null;
	
	private IdentificationDivision identificationDivision = null;

	public CodeIndentifier(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Map<String,List<String>> createJavaFile() throws IOException {
		codeBlocks = new HashMap<>();
		String line = null;
		List<String> elements = null;
		String key = null;
		while (null != (line = bufferedReader.readLine())) {
			if (CobolConstants.divisionIdentifier.contains(line)) {
				if (null != elements) {
					codeBlocks.put(key, elements);
					codeConstructor(key,elements);
				}
				key = line;
				elements = new ArrayList<>();
			} else {
				elements.add(line);
			}
		}

		return codeBlocks;
	}

	private void codeConstructor(String key, List<String> elements) {
		// TODO Auto-generated method stub
		switch (key) {
		case "IDENTIFICATION DIVISION.":
			 identificationDivision = new IdentificationDivision(key, elements);
			 identificationDivision.getConvertedCode();
			break;

		default:
			break;
		}
	}

}
