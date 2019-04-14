/**
 * 
 */
package com.konzern.transformatore.enums;

/**
 * @author konzernites
 * @version 1.0
 *
 */
public enum CobolDivision {
	
	IDENTIFICATION_DIVISION("IDENTIFICATION DIVISION."),
	DATA_DIVISION("DATA DIVISION."),
	PROCEDURE_DIVISION("PROCEDURE DIVISION."),
	ENVIRONMENT_DIVISION("ENVIRONMENT DIVISION.");
	
	private String division = null;
	
	private CobolDivision(String division) {
		this.division= division;
	}

	public String getDivision() {
		return division;
	}


}
