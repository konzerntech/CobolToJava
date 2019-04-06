/**
 * 
 */
package com.konzern.transformatore.cobol;

import java.util.List;

import com.konzern.transformatore.java.JavaNamingUtiltiy;

/**
 * @author konzernites
 * @version 1.0
 *
 */
public class IdentificationDivision {
	
	private String functionName = null;
	private List<String> codes = null;
	private JavaNamingUtiltiy namingUtility = null;
	
	public IdentificationDivision() {
	}

	private JavaNamingUtiltiy getNamingUtility() {
		if(null==namingUtility) {
			namingUtility = new JavaNamingUtiltiy();
		}
		return namingUtility;
	}
	
	public IdentificationDivision(String functionName , List<String> codes) {
		this.functionName = functionName;
		this.codes = codes;
	}

	public void getConvertedCode() {
		
		for(String code : codes) {
			if(code.contains("PROGRAM-ID")) {
				String name = code.replace("PROGRAM-ID.", "").replace(".", "");
				System.out.println(" public class "+getNamingUtility().createClassName(name));
				
			}
		}
		
	}

}
