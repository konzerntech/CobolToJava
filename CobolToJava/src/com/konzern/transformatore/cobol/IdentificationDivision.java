/**
 * IdentificationDivision.java
 * 
 * <p> This class corresponds to the Identification Division in COBOL <p>
 */
package com.konzern.transformatore.cobol;

import java.util.List;

import com.konzern.transformatore.cobolInf.CobolDivisionInf;
import com.konzern.transformatore.java.JavaNamingUtiltiy;
import com.konzern.transformatore.java.JavaPojo;

/**
 * @author konzernites
 * @version 1.0
 *
 */
public class IdentificationDivision extends CobolDivision implements CobolDivisionInf {

	private String functionName = null;
	private List<String> codes = null;
	private JavaNamingUtiltiy namingUtility = null;
	private JavaPojo javaPojo = null;

	public IdentificationDivision() {
	}

	private JavaNamingUtiltiy getNamingUtility() {
		if (null == namingUtility) {
			namingUtility = new JavaNamingUtiltiy();
		}
		return namingUtility;
	}

	public IdentificationDivision(String functionName, List<String> codes) {
		this.functionName = functionName;
		this.codes = codes;
	}

	public void getConvertedCode() {
		for (String code : codes) {
			if (code.contains("PROGRAM-ID")) {
				String className = getProgramId(code);
				javaPojo.setClassName(className);
			} else if (code.contains("AUTHOR")) {

			}
		}

	}

	/**
	 * <p>
	 * Rules for getting program Id from cobol code program Id = class Name in java
	 * </p>
	 * 
	 * @param cobolCode
	 * @return className in java
	 */
	private String getProgramId(String cobolCode) {
		String name = cobolCode.replace("PROGRAM-ID.", "").replace(".", "");
		System.out.println(" public class " + getNamingUtility().createClassName(name));
		return getNamingUtility().createClassName(name);
	}

	public void setJavaPojo(JavaPojo javaPojo) {
		this.javaPojo = javaPojo;
	}

	@Override
	public JavaPojo convertCobolToJava(String functionName, List<String> cobolCode) {

		if (null == javaPojo) {
			throw new IllegalArgumentException(); // change to user defined exception
		}
		cobolCode.forEach(cobolLine -> {
			if (null != cobolLine && !cobolLine.isEmpty()) {
				String[] cobolLex = cobolLine.split("\\s");
			}
		});
		return javaPojo;
	}

}
