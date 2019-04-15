/**
 * 
 */
package com.konzern.transformatore.cobol;

import java.util.List;
import java.util.Map;

import com.konzern.transformatore.java.JavaPojo;

/**
 * @author Apple
 *
 */
public abstract class CobolDivision extends Cobol {
	
	private IdentificationDivision identificationDivision = null; 
	
	@SuppressWarnings("unused")
	private void codeConstructor(JavaPojo javaPojo, Map<String,List<String>> codeBlocks) {
		
		codeBlocks.forEach((key,elements)->{
			
			switch (key) {
			case "IDENTIFICATION DIVISION.":
				 identificationDivision = new IdentificationDivision(key, elements);
				 identificationDivision.setJavaPojo(javaPojo);
				 identificationDivision.getConvertedCode();
				break;
				

			default:
				break;
			}
		});
		
	
	}
	


}
